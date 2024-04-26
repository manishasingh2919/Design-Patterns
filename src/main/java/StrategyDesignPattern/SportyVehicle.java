package StrategyDesignPattern;

public class SportyVehicle extends Vehicle{
    SportyVehicle(){
        super(new SpecialDriveStrategy());
    }
//    @Override
//    public void drive() {
//        System.out.println("Special drive feature");
//    }
}
