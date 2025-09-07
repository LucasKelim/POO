<?php

namespace App\Contracts;

interface CommandInterface
{
    public function run(): void;
}
