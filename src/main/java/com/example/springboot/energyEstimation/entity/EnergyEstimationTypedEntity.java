package com.example.springboot.energyEstimation.entity;

import com.example.springboot.energyEstimation.dto.EnergyTypeEnumDto;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(schema = "public", name = "EnergyEstimationTyped")
public class EnergyEstimationTypedEntity {
    private EnergyTypeEnumDto type;
    private float subscriptionMonthlyPrice;
    private float subscriptionAnnualPrice;
    private float kilowattMonthlyPrice;
    private float kilowattAnnualPrice;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    public EnergyTypeEnumDto getType() {
        return type;
    }

    public void setType(EnergyTypeEnumDto type) {
        this.type = type;
    }

    public float getSubscriptionMonthlyPrice() {
        return subscriptionMonthlyPrice;
    }

    public void setSubscriptionMonthlyPrice(float subscriptionMonthlyPrice) {
        this.subscriptionMonthlyPrice = subscriptionMonthlyPrice;
    }

    public float getSubscriptionAnnualPrice() {
        return subscriptionAnnualPrice;
    }

    public void setSubscriptionAnnualPrice(float subscriptionAnnualPrice) {
        this.subscriptionAnnualPrice = subscriptionAnnualPrice;
    }

    public float getKilowattMonthlyPrice() {
        return kilowattMonthlyPrice;
    }

    public void setKilowattMonthlyPrice(float kilowattMonthlyPrice) {
        this.kilowattMonthlyPrice = kilowattMonthlyPrice;
    }

    public float getKilowattAnnualPrice() {
        return kilowattAnnualPrice;
    }

    public void setKilowattAnnualPrice(float kilowattAnnualPrice) {
        this.kilowattAnnualPrice = kilowattAnnualPrice;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

