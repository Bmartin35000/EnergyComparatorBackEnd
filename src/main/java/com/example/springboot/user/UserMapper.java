package com.example.springboot.user;

import org.springframework.stereotype.Component;


@Component
public class UserMapper {
    public UserDto toDto(UserEntity userEntity) {
        return new UserDto(userEntity.getId(), userEntity.getPassword(), userEntity.getAnnualConsumptionElectricity(), userEntity.getAnnualConsumptionGas());
    }

    public UserEntity fromDto(UserDto userDto) {
        return new UserEntity(userDto.getId(), userDto.getPassword(), userDto.getAnnualConsumptionElectricity(), userDto.getAnnualConsumptionGas());
    }
}
