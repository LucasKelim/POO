<?php

namespace App\Models;

class Television
{
    public function __construct(
        private int $channel = 0,
        private int $volume = 0,
        private int $maxChannel = 0,
        private int $maxVolume = 10
    ) {
        $this->setMaxChannel($maxChannel);
        $this->setMaxVolume($maxChannel);
        $this->setChannel($channel);
        $this->setVolume($volume);
    }

    public function setChannel(int $channel): void
    {
        if ($this->validateChannel($channel)) {
            $this->channel = $channel;
        }
    }

    public function getChannel(): int
    {
        return $this->channel;
    }

    public function setVolume(int $volume): void
    {
        if ($this->validateVolume($volume)) {
            $this->volume = $volume;
        }
    }

    public function getVolume(): int
    {
        return $this->volume;
    }

    public function setMaxChannel(int $maxChannel): void
    {
        if ($maxChannel >= 0) {
            $this->maxChannel = $maxChannel;
        }
    }

    public function setMaxVolume(int $maxVolume): void
    {
        if ($maxVolume > 0) {
            $this->maxVolume = $maxVolume;
        }
    }

    public function selectChannel(int $channel): void
    {
        if ($this->validateChannel($channel)) {
            $this->channel = $channel;
        }
    }

    public function nextChannel(): void
    {
        $this->channel++;
        if (!$this->validateChannel($this->channel)) {
            $this->channel = 0;
        }
    }

    public function previusChannel(): void
    {
        $this->channel--;
        if (!$this->validateChannel($this->channel)) {
            $this->channel = $this->maxChannel;
        }
    }

    public function volumeUp(): void
    {
        if ($this->validateVolume($this->volume + 1)) {
            $this->volume++;
        }
    }

    public function volumeDown(): void
    {
        if ($this->validateVolume($this->volume - 1)) {
            $this->volume--;
        }
    }

    public function validateChannel(int $channel): bool
    {
        return $channel >= 0 && $channel <= $this->maxChannel;
    }

    public function validateVolume(int $volume): bool
    {
        return $volume >= 0 && $volume <= $this->maxVolume;
    }

    public function __toString(): string
    {
        return sprintf(
            "Channel: %d\nVolume: %d\nMax Channel: %d\nMax Volume: %d\n",
            $this->channel,
            $this->volume,
            $this->maxChannel,
            $this->maxVolume
        );
    }
}
