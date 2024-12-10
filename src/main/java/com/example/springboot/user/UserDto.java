package com.example.springboot.user;

public class UserDto {
    private String id;
    private String password;
    private int annualConsumptionElectricity;
    private int annualConsumptionGas;

    public UserDto(String id, String password, int annualConsumptionElectricity, int annualConsumptionGas) {
        this.id = id;
        this.password = password;
        this.annualConsumptionElectricity = annualConsumptionElectricity;
        this.annualConsumptionGas = annualConsumptionGas;
    }

    // do not delete, it is used with spring
    public UserDto() {

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
