<?php

namespace App\Models\FuelType;

use App\Contracts\FuelTypeInterface;

class Diesel implements FuelTypeInterface
{
    public function __construct(
        private float $price = 0.01
    ) {
        $this->setPrice($price);
    }

    public function getName(): string
    {
        return "Diesel";
    }

    public function setPrice(float $price): void
    {
        if ($price > 0) {
            $this->price = $price;
        }
    }

    public function getPrice(): float
    {
        return $this->price;
    }
}
