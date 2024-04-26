package StrategyDesignPattern;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }
//    @Override
//    public void drive() {
//        System.out.println("Special drive feature");
//    }
}
