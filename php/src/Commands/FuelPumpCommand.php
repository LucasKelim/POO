<?php

namespace App\Commands;

use App\Contracts\CommandInterface;
use App\Contracts\FuelTypeInterface;
use App\Models\FuelPump;
use App\Models\FuelType\Diesel;
use App\Models\FuelType\Ethanol;
use App\Models\FuelType\Gasoline;

class FuelPumpCommand implements CommandInterface
{
    public function run(): void
    {
        $fuelType = $this->selectFyelType();

        $fuelPump = new FuelPump($fuelType, 500);

        while (true) {
            echo $fuelPump;

            echo PHP_EOL . PHP_EOL;

            echo "Ações:" . PHP_EOL;
            echo "1 - Abastecer por valor" . PHP_EOL;
            echo "2 - Abastecer por litro" . PHP_EOL;
            echo "3 - Alterar valor do combustível" . PHP_EOL;
            echo "4 - Alterar tipo de combustível" . PHP_EOL;
            echo "5 - Alterar quantidade de combustível" . PHP_EOL;
            echo "0 - Sair" . PHP_EOL;
            echo "Opção: ";

            $op = trim(fgets(STDIN));

            switch ($op) {
                case '1':
                    echo "Valor: R$ ";
                    $value = (float) trim(fgets(STDIN));
                    $fuelPump->refuelByValue($value);
                    break;

                case '2':
                    echo "Listros: ";
                    $liters = (float) trim(fgets(STDIN));
                    $fuelPump->refuelByLiters($liters);
                    break;

                case '3':
                    echo "Novo preço: R$ ";
                    $newPrice = (float) trim(fgets(STDIN));
                    $fuelPump->changeFuelPrice($newPrice);
                    break;

                case '4':
                    $newFuelType = $this->selectFyelType();
                    $fuelPump->changeFuelType($newFuelType);
                    break;

                case '5':
                    echo "Nova quantidade de combustível: ";
                    $newFuelQuantity = (float) trim(fgets(STDIN));
                    $fuelPump->changeFuelQuantity($newFuelQuantity);
                    break;

                case '0':
                    exit;

                default:
                    echo "Opção inválida\n";
                    break;
            }

            echo PHP_EOL;
        }
    }

    private function selectFyelType(): FuelTypeInterface
    {
        $fuelType = null;
        while (true) {
            echo PHP_EOL;
            echo "Escolha o tipo de combustível: " . PHP_EOL;
            echo "1 - Gasolina" . PHP_EOL;
            echo "2 - Etanol" . PHP_EOL;
            echo "3 - Diesel" . PHP_EOL;
            echo "Opção: ";

            $op = trim(fgets(STDIN));

            $fuelType = match ($op) {
                "1" => new Gasoline(6.17),
                "2" => new Ethanol(4.19),
                "3" => new Diesel(6.06),
                default => null
            };

            echo PHP_EOL;

            if ($fuelType != null) {
                return $fuelType;
            }

            echo "Opção inválida" . PHP_EOL;
        }
    }
}
