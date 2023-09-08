package com.company.retail;
public class Car {
    String model;
    String color;
    float fuel_tank_capacity;

    public Car() {

    }
    public Car(float full_tank) {
        this.fuel_tank_capacity = full_tank;
    }

    public Car(float full_tank, float current_amount) {
        this.fuel_tank_capacity = full_tank - current_amount;
    }

    public float CalculateFuel(float fuel_price) {
        return this.fuel_tank_capacity * fuel_price;
 
    }

    public void setColor(String cl) {
        this.color = cl;
    }

    public String GetColor() {
        return this.color;
    }

    public void SetFuelCapacity(float fuel_amount) {
        this.fuel_tank_capacity = fuel_amount;
    }

    public float GetFuelCapacity() {
        return this.fuel_tank_capacity;
    }

    public void SetModel(String model) {
        this.model = model;
    }

    public String GetModel() {
        return this.model;
    }
}
