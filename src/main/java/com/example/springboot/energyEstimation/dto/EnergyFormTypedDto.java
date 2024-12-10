package com.example.springboot.energyEstimation.dto;

public class EnergyFormTypedDto {
    private EnergyTypeEnumDto type;
    private EnergyResultDto total;

    public EnergyTypeEnumDto getType() {
        return type;
    }

    public void setType(EnergyTypeEnumDto type) {
        this.type = type;
    }

    public EnergyResultDto getTotal() {
        return total;
    }

    public void setTotal(EnergyResultDto total) {
        this.total = total;
    }
}
