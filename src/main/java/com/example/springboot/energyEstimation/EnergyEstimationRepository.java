package com.example.springboot.energyEstimation;

import com.example.springboot.energyEstimation.entity.EnergyEstimationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EnergyEstimationRepository extends CrudRepository<EnergyEstimationEntity, UUID> {
}
