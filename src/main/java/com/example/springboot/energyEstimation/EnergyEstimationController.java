package com.example.springboot.energyEstimation;

import com.example.springboot.energyEstimation.dto.EnergyEstimationDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class EnergyEstimationController {
    private final EnergyEstimationService energyEstimationService;

    public EnergyEstimationController(EnergyEstimationService energyEstimationService) {
        this.energyEstimationService = energyEstimationService;
    }

    @GetMapping("/energyEstimations")
    public List<EnergyEstimationDto> getEnergyEstimations() {
        System.out.println("@GetMapping(\"/energyEstimations\")");
        return this.energyEstimationService.getEnergyEstimations();
    }

    @PostMapping("/energyEstimation")
    public void addEnergyEstimation(@RequestBody EnergyEstimationDto energyEstimationDto) {
        System.out.println("@PostMapping(\"/energyEstimation\")");
        this.energyEstimationService.addEnergyEstimation(energyEstimationDto);
    }

    @PutMapping("/energyEstimation")
    public void editEnergyEstimation(@RequestBody EnergyEstimationDto energyEstimationDto) {
        System.out.println("@PutMapping(\"/energyEstimation\")");
        this.energyEstimationService.editEnergyEstimation(energyEstimationDto);
    }

    @DeleteMapping("/energyEstimations")
    public void deleteEnergyEstimations() {
        System.out.println("@DeleteMapping(\"/energyEstimations\")");
        this.energyEstimationService.deleteEnergyEstimations();
    }

    @DeleteMapping("/energyEstimation/{id}")
    public void deleteEnergyEstimation(@PathVariable UUID id) {
        System.out.println("@DeleteMapping(\"/energyEstimation\")");
        this.energyEstimationService.deleteEnergyEstimation(id);
    }
}
