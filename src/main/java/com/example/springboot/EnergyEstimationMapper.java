package com.example.springboot;

import com.example.springboot.dto.*;
import com.example.springboot.entity.EnergyEstimationEntity;
import com.example.springboot.entity.EnergyEstimationTypedEntity;
import org.springframework.stereotype.Component;


@Component
public class EnergyEstimationMapper {
    public EnergyEstimationDto toDto(EnergyEstimationEntity energyEstimationEntity) {
        EnergyPriceDto energyPriceDtoEnergyKilowatt =
                new EnergyPriceDto(energyEstimationEntity.getEnergy().getKilowattMonthlyPrice(), energyEstimationEntity.getEnergy().getKilowattAnnualPrice());
        EnergyPriceDto energyPriceDtoEnergySubscription =
                new EnergyPriceDto(energyEstimationEntity.getEnergy().getSubscriptionMonthlyPrice(), energyEstimationEntity.getEnergy().getSubscriptionAnnualPrice());
        EnergyPriceDto energyPriceDtoGasKilowatt =
                new EnergyPriceDto(energyEstimationEntity.getGas().getKilowattMonthlyPrice(), energyEstimationEntity.getGas().getKilowattAnnualPrice());
        EnergyPriceDto energyPriceDtoGasSubscription =
                new EnergyPriceDto(energyEstimationEntity.getGas().getSubscriptionMonthlyPrice(), energyEstimationEntity.getGas().getSubscriptionAnnualPrice());


        EnergyResultDto energyResultDtoEnergy = new EnergyResultDto();
        energyResultDtoEnergy.setKilowatt(energyPriceDtoEnergyKilowatt);
        energyResultDtoEnergy.setSubscription(energyPriceDtoEnergySubscription);

        EnergyResultDto energyResultDtoGas = new EnergyResultDto();
        energyResultDtoGas.setKilowatt(energyPriceDtoGasKilowatt);
        energyResultDtoGas.setSubscription(energyPriceDtoGasSubscription);

        EnergyFormTypedDto energyFormTypedDtoEnergy = new EnergyFormTypedDto();
        energyFormTypedDtoEnergy.setType(EnergyTypeEnumDto.Electricity);
        energyFormTypedDtoEnergy.setTotal(energyResultDtoEnergy);

        EnergyFormTypedDto energyFormTypedDtoGas = new EnergyFormTypedDto();
        energyFormTypedDtoGas.setType(EnergyTypeEnumDto.Gas);
        energyFormTypedDtoGas.setTotal(energyResultDtoGas);

        EnergyEstimationDto energyEstimationDto = new EnergyEstimationDto();
        energyEstimationDto.setOfferName(energyEstimationEntity.getOfferName());
        energyEstimationDto.setEnergySupplier(energyEstimationEntity.getEnergySupplier());
        energyEstimationDto.setElectricity(energyFormTypedDtoEnergy);
        energyEstimationDto.setGas(energyFormTypedDtoGas);

        return energyEstimationDto;
    }

    public EnergyEstimationEntity fromDto(EnergyEstimationDto energyEstimationDto) {
        EnergyEstimationEntity energyEstimationEntity = new EnergyEstimationEntity();
        energyEstimationEntity.setEnergySupplier(energyEstimationDto.getEnergySupplier());
        energyEstimationEntity.setOfferName(energyEstimationDto.getOfferName());

        EnergyEstimationTypedEntity gasEntity = new EnergyEstimationTypedEntity();
        gasEntity.setType(EnergyTypeEnumDto.Gas);
        gasEntity.setKilowattMonthlyPrice(energyEstimationDto.getGas().getTotal().getKilowatt().getMonthlyPrice());
        gasEntity.setKilowattAnnualPrice(energyEstimationDto.getGas().getTotal().getKilowatt().getAnnualPrice());
        gasEntity.setSubscriptionMonthlyPrice(energyEstimationDto.getGas().getTotal().getSubscription().getMonthlyPrice());
        gasEntity.setSubscriptionAnnualPrice(energyEstimationDto.getGas().getTotal().getSubscription().getAnnualPrice());
        energyEstimationEntity.setGas(gasEntity);

        EnergyEstimationTypedEntity energyEntity = new EnergyEstimationTypedEntity();
        energyEntity.setType(EnergyTypeEnumDto.Electricity);
        energyEntity.setKilowattMonthlyPrice(energyEstimationDto.getElectricity().getTotal().getKilowatt().getMonthlyPrice());
        energyEntity.setKilowattAnnualPrice(energyEstimationDto.getElectricity().getTotal().getKilowatt().getAnnualPrice());
        energyEntity.setSubscriptionMonthlyPrice(energyEstimationDto.getElectricity().getTotal().getSubscription().getMonthlyPrice());
        energyEntity.setSubscriptionAnnualPrice(energyEstimationDto.getElectricity().getTotal().getSubscription().getAnnualPrice());
        energyEstimationEntity.setEnergy(energyEntity);

        return energyEstimationEntity;
    }
}
