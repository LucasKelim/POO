<?php

namespace App\Commands;

use App\Contracts\CommandInterface;
use App\Models\Person;

class PersonCommand implements CommandInterface
{
    public function run(): void
    {
        $person = new Person();

        $person->setName("Lucas Kelim Thiel");
        $person->setAge(12);
        $person->setWeight(40);
        $person->setHeight(1.4);

        echo $person;

        $person->age();

        echo PHP_EOL;

        echo $person;
    }
}
