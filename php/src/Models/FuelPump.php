<?php

namespace App\Models;

use App\Contracts\FuelTypeInterface;

class FuelPump
{
    public function __construct(
        private FuelTypeInterface $fuelType,
        private float $fuelQuantity = 0
    ) {
        $this->setFuelType($fuelType);
        $this->setFuelQuantity($fuelQuantity);
    }

    public function setFuelType(FuelTypeInterface $fuelType): void
    {
        $this->fuelType = $fuelType;
    }

    public function setFuelQuantity(float $fuelQuantity): void
    {
        if ($fuelQuantity >= 0) {
            $this->fuelQuantity = $fuelQuantity;
        }
    }

    public function getFuelQuantity(): float
    {
        return $this->fuelQuantity;
    }

    public function getFuelName(): string
    {
        return $this->fuelType->getName();
    }

    public function getFuelPrice(): float
    {
        return $this->fuelType->getPrice();
    }

    public function refuelByValue(float $value): bool
    {
        if (!$this->validateAmount($value)) {
            echo "Valor inválido!" . PHP_EOL;
            return false;
        }

        $liters = round($value / $this->getFuelPrice(), 2);

        if ($liters > $this->fuelQuantity) {
            echo "Combustível insuficiente!" . PHP_EOL;
            return false;
        }

        $this->fuelQuantity -= $liters;
        echo "$liters L abastecidos." . PHP_EOL;
        return true;
    }

    public function refuelByLiters(float $liters): bool
    {
        if (!$this->validateAmount($liters)) {
            echo "Valor inválido!" . PHP_EOL;
            return false;
        }

        if ($liters > $this->fuelQuantity) {
            echo "Combustível insuficiente!" . PHP_EOL;
            return false;
        }

        $this->fuelQuantity -= $liters;
        echo "$liters L abastecidos." . PHP_EOL;
        return true;
    }

    public function changeFuelPrice(float $newPrice): void
    {
        if ($this->validateAmount($newPrice)) {
            $this->fuelType->setPrice($newPrice);
            echo "Você alterou o valor do combustível {$this->getFuelName()} para $newPrice" . PHP_EOL;
        }
    }

    public function changeFuelType(FuelTypeInterface $newFuelType): void
    {
        $this->setFuelType($newFuelType);
        echo "Você alterou o tipo de combustível para {$newFuelType->getName()}" . PHP_EOL;
    }

    public function changeFuelQuantity(float $newFuelQuantity): void
    {
        $this->setFuelQuantity($newFuelQuantity);
        echo "Você alterou a quantidade de combustível para $newFuelQuantity L" . PHP_EOL;
    }

    private function validateAmount(float $amount): bool
    {
        return $amount > 0;
    }

    public function __toString(): string
    {
        return sprintf(
            "Fuel type: %s\nFuel price: R$ %.2f\nFuel quantity: %.2f L",
            $this->getFuelName(),
            $this->getFuelPrice(),
            $this->fuelQuantity
        );
    }
}
