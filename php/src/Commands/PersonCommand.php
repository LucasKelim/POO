<?php

namespace App\Commands;

use App\Models\Person;

class PersonCommand
{
    public function run()
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
