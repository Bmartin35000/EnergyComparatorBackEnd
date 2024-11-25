package com.example.springboot.dto;

public class EnergyResultDto {
    private EnergyPriceDto subscription;
    private EnergyPriceDto kilowatt;

    public EnergyPriceDto getSubscription() {
        return subscription;
    }

    public void setSubscription(EnergyPriceDto subscription) {
        this.subscription = subscription;
    }

    public EnergyPriceDto getKilowatt() {
        return kilowatt;
    }

    public void setKilowatt(EnergyPriceDto kilowatt) {
        this.kilowatt = kilowatt;
    }
}
