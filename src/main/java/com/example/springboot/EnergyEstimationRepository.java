package com.example.springboot;

import com.example.springboot.entity.EnergyEstimationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EnergyEstimationRepository extends CrudRepository<EnergyEstimationEntity, UUID> {
}
