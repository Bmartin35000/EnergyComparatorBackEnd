package com.example.springboot.energyEstimation.dto;

public class EnergyPriceDto {
    private float monthlyPrice;
    private float annualPrice;

    // Keep it, it's used by spring boot
    public EnergyPriceDto() {
    }

    public EnergyPriceDto(float monthlyPrice, float annualPrice) {
        this.monthlyPrice = monthlyPrice;
        this.annualPrice = annualPrice;
    }

    public float getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(float monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public float getAnnualPrice() {
        return annualPrice;
    }

    public void setAnnualPrice(float annualPrice) {
        this.annualPrice = annualPrice;
    }
}
