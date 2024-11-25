package com.example.springboot;

import com.example.springboot.dto.EnergyEstimationDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/energyEstimations")
    public void deleteEnergyEstimations() {
        System.out.println("@DeleteMapping(\"/energyEstimations\")");
        this.energyEstimationService.deleteEnergyEstimations();
    }
}
