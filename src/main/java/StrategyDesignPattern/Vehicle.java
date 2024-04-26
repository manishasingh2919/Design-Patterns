package StrategyDesignPattern;

//1.Strategy Design Pattern : when in a parent child class structure the child are sharing some feature
// which is not present in the parent class, Then we can create an interface of that feature that can be
// passed in the constructor of the parent class.

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy= driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
