<?php

namespace App\Commands;

use App\Models\Television;

class TelevisionCommand
{
    public function run()
    {
        $television = new Television();

        $television->setMaxChannel(20);

        while (true) {
            echo $television;

            echo PHP_EOL;

            echo "Ações:" . PHP_EOL;
            echo "1 - Próximo canal" . PHP_EOL;
            echo "2 - Voltar canal" . PHP_EOL;
            echo "3 - Aumentar volume" . PHP_EOL;
            echo "4 - Diminuir volume" . PHP_EOL;
            echo "0 - Sair" . PHP_EOL;
            echo "Opção: ";

            $op = trim(fgets(STDIN));

            switch ($op) {
                case '1':
                    $television->nextChannel();
                    break;

                case '2':
                    $television->previusChannel();
                    break;

                case '3':
                    $television->volumeUp();
                    break;

                case '4':
                    $television->volumeDown();
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
}
