<?php

namespace App\Models;

class Person
{
    private string $name = "";
    private int $age = 0;
    private float $weight = 0;
    private float $height = 0;

    public function setName(string $name): void
    {
        if (strlen($name) >= 3) {
            $this->name = $name;
        }
    }

    public function getName(): string
    {
        return $this->name;
    }

    public function setAge(int $age): void
    {
        if ($age >= 0) {
            $this->age = $age;
        }
    }

    public function getAge(): int
    {
        return $this->age;
    }

    public function setWeight(float $weight): void
    {
        if ($weight > 0) {
            $this->weight = $weight;
        }
    }

    public function getWeight(): float
    {
        return $this->weight;
    }

    public function setHeight(float $height): void
    {
        if ($height > 0) {
            $this->height = $height;
        }
    }

    public function getHeight(): float
    {
        return $this->height;
    }

    public function age()
    {
        $this->age++;
        if ($this->age < 21) {
            $this->grow(0.5);
        }
    }

    public function gainWeight(float $amount): void
    {
        $this->weight += $amount;
    }

    public function loseWeight(float $amount): void
    {
        $this->weight -= $amount;
    }

    public function grow(float $amount): void
    {
        $this->height += $amount;
    }

    public function __toString(): string
    {
        return sprintf(
            "Name: %s \nAge: %d \nWeight: %.1fkg \nHeight: %.1fcm\n",
            $this->name,
            $this->age,
            $this->weight,
            $this->height
        );
    }
}
