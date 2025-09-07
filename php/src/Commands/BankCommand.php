<?php

namespace App\Commands;

use App\Contracts\CommandInterface;
use App\Models\Bank;

class BankCommand implements CommandInterface
{
    public function run(): void
    {
        $bank = new Bank(1, "Lucas Kelim Thiel", 1000.00);

        echo $bank;

        echo PHP_EOL;

        $bank->deposit(1000.00);

        echo PHP_EOL;

        $bank->withdraw(100.00);

        echo PHP_EOL;

        $bank->changeName("Lucas Kelim");

        echo PHP_EOL;

        echo $bank;
    }
}
