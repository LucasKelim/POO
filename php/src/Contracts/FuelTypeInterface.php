<?php

namespace App\Contracts;

interface FuelTypeInterface
{
    public function getName(): string;
    public function setPrice(float $price): void;
    public function getPrice(): float;
}
