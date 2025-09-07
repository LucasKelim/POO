<?php

require __DIR__ . '/vendor/autoload.php';

use App\Commands\BankCommand;
use App\Commands\PersonCommand;
use App\Commands\TelevisionCommand;
use App\Commands\FuelPumpCommand;

while (true) {
    echo "Escolha uma opção:\n";
    echo "1 - Person\n";
    echo "2 - Bank\n";
    echo "3 - Television\n";
    echo "4 - FuelPump\n";
    echo "0 - Sair\n";
    echo "Opção: ";

    $op = trim(fgets(STDIN));

    $cmd = null;
    switch ($op) {
        case '1':
            $cmd = new PersonCommand();
            break;

        case '2':
            $cmd = new BankCommand();
            break;

        case '3':
            $cmd = new TelevisionCommand();
            break;

        case '4':
            $cmd = new FuelPumpCommand();
            break;

        case '0':
            echo "Saindo...\n";
            exit;

        default:
            echo "Opção inválida!\n";
    }

    if ($cmd != null) {
        echo PHP_EOL;
        $cmd->run();
        exit;
    }
}
