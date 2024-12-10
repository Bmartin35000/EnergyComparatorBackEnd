package com.example.springboot.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "User")
public class UserEntity {

    @Id
    private String id;

    private String password;
    private int annualConsumptionElectricity;
    private int annualConsumptionGas;

    public UserEntity(String id, String password, int annualConsumptionElectricity, int annualConsumptionGas) {
        this.id = id;
        this.password = password;
        this.annualConsumptionElectricity = annualConsumptionElectricity;
        this.annualConsumptionGas = annualConsumptionGas;
    }

    public UserEntity() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAnnualConsumptionElectricity() {
        return annualConsumptionElectricity;
    }

    public void setAnnualConsumptionElectricity(int annualConsumptionElectricity) {
        this.annualConsumptionElectricity = annualConsumptionElectricity;
    }

    public int getAnnualConsumptionGas() {
        return annualConsumptionGas;
    }

    public void setAnnualConsumptionGas(int annualConsumptionGas) {
        this.annualConsumptionGas = annualConsumptionGas;
    }
}
