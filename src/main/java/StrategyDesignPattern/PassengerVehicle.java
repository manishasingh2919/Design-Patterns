package StrategyDesignPattern;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
//    @Override
//    public void drive() {
//        System.out.println("Normal drive feature");
//    }
}
