<?php

namespace App\Models;

class Bank
{
    public function __construct(
        private int $numberAccount = 0,
        private string $name = "",
        private float $balance = 0,
    ) {
        $this->setNumberAccount($numberAccount);
        $this->setName($name);
        $this->setBalance($balance);
    }

    public function setNumberAccount(int $numberAccount): void
    {
        if ($this->validadeNumberAccount($numberAccount)) {
            $this->numberAccount = $numberAccount;
        }
    }

    public function getNumberAccount(): int
    {
        return $this->numberAccount;
    }

    public function setName(string $name): void
    {
        if ($this->validadeName($name)) {
            $this->name = $name;
        }
    }

    public function getName(): string
    {
        return $this->name;
    }

    public function setBalance(float $balance): void
    {
        if ($this->validadeBalance($balance)) {
            $this->balance = $balance;
        }
    }

    public function getBalance(): float
    {
        return $this->balance;
    }

    public function deposit(float $amount): bool
    {
        if (!$this->validadeAmount($amount)) {
            echo "Valor inválido!\n";
            return false;
        }

        $this->balance += $amount;
        echo "Depósito de R$ {$this->real($amount)}. Novo saldo: R$ {$this->real($this->balance)}\n";
        return true;
    }

    public function withdraw(float $amount): bool
    {
        if (!$this->validadeAmount($amount)) {
            echo "Valor inválido!\n";
            return false;
        }

        if ($amount > $this->balance) {
            echo "Saldo insuficiente!\n";
            return false;
        }

        $this->balance -= $amount;
        echo "Saque de R$ {$this->real($amount)}. Novo saldo: R$ {$this->real($this->balance)}\n";
        return true;
    }

    public function changeName(string $newName): bool
    {
        if (!$this->validadeName($newName)) {
            echo "Nome precisar ter mais que 3 caracteres!\n";
            return false;
        }

        $this->name = $newName;
        echo "Nome trocado para {$this->name}\n";
        return true;
    }

    public function validadeNumberAccount(int $numberAccount): bool
    {
        return $numberAccount > 0;
    }

    public function validadeName(string $name): bool
    {
        return strlen($name) >= 3;
    }

    public function validadeBalance(float $balance): bool
    {
        return $balance >= 0;
    }

    public function validadeAmount(float $amount): bool
    {
        return $amount > 0;
    }

    public function real(float $amount): string
    {
        return number_format($amount, 2, ',', '.');
    }

    public function __toString(): string
    {
        return sprintf(
            "Account Number: %d \nName: %s \nBalance: R$ %s\n",
            $this->numberAccount,
            $this->name,
            $this->real($this->balance)
        );
    }
}
