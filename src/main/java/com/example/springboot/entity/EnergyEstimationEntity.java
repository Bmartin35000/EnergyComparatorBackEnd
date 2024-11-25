package com.example.springboot.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(schema = "public", name = "EnergyEstimation")
public class EnergyEstimationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String energySupplier;
    private String offerName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private EnergyEstimationTypedEntity energy;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private EnergyEstimationTypedEntity gas;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEnergySupplier() {
        return energySupplier;
    }

    public void setEnergySupplier(String energySupplier) {
        this.energySupplier = energySupplier;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public EnergyEstimationTypedEntity getEnergy() {
        return energy;
    }

    public void setEnergy(EnergyEstimationTypedEntity energy) {
        this.energy = energy;
    }

    public EnergyEstimationTypedEntity getGas() {
        return gas;
    }

    public void setGas(EnergyEstimationTypedEntity gas) {
        this.gas = gas;
    }
}
