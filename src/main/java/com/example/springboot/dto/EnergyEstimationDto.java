package com.example.springboot.dto;

public class EnergyEstimationDto {
    private EnergyFormTypedDto electricity;
    private EnergyFormTypedDto gas;
    private String energySupplier;
    private String offerName;

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getEnergySupplier() {
        return energySupplier;
    }

    public void setEnergySupplier(String energySupplier) {
        this.energySupplier = energySupplier;
    }

    public EnergyFormTypedDto getGas() {
        return gas;
    }

    public void setGas(EnergyFormTypedDto gas) {
        this.gas = gas;
    }

    public EnergyFormTypedDto getElectricity() {
        return electricity;
    }

    public void setElectricity(EnergyFormTypedDto electricity) {
        this.electricity = electricity;
    }
}
