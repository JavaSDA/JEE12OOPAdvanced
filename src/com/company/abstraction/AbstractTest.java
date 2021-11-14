package com.company.abstraction;

public class AbstractTest {
    public static void main(String[] args) {
        class Car extends VehicleTwo{
            @Override
            public void startEngine() {
                System.out.println("Engine Started by Car");
            }

            @Override
            public void stopEngine() {
                System.out.println("Engine Stopped by Car");
                doThis();
            }
        }

        class MotorBike extends VehicleTwo {
            @Override
            public void startEngine() {
                System.out.println("Engine Started by MotorBike");
                System.out.println(super.noOfTires);
            }

            @Override
            public void stopEngine() {
                System.out.println("Engine Stopped by MotorBike");
                doThis();

            }
        }



        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        MotorBike mBike = new MotorBike();
        mBike.startEngine();
    }
}
