package com.example.springboot;

import com.example.springboot.dto.EnergyEstimationDto;
import com.example.springboot.entity.EnergyEstimationEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EnergyEstimationService {
    private final EnergyEstimationRepository energyEstimationRepository;
    private final EnergyEstimationMapper energyEstimationMapper;

    public EnergyEstimationService(EnergyEstimationRepository energyEstimationRepository, EnergyEstimationMapper energyEstimationService) {
        this.energyEstimationRepository = energyEstimationRepository;
        this.energyEstimationMapper = energyEstimationService;
    }

    public List<EnergyEstimationDto> getEnergyEstimations() {
        List<EnergyEstimationEntity> entities = (List<EnergyEstimationEntity>) this.energyEstimationRepository.findAll();
        return entities.stream().map(this.energyEstimationMapper::toDto).toList();
    }

    public void addEnergyEstimation(EnergyEstimationDto energyEstimationDto) {
        this.energyEstimationRepository.save(this.energyEstimationMapper.fromDto(energyEstimationDto));
    }

    public void deleteEnergyEstimations() {
        this.energyEstimationRepository.deleteAll();
    }

    public void deleteEnergyEstimation(UUID id) {
        this.energyEstimationRepository.deleteById(id);
    }

    public void editEnergyEstimation(EnergyEstimationDto energyEstimationDto) {
        this.energyEstimationRepository.save(this.energyEstimationMapper.fromDto(energyEstimationDto));
    }
}
