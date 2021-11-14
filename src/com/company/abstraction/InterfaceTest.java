package com.company.abstraction;

public class InterfaceTest {
    public static void main(String[] args) {
        class Car implements Vehicle{
            @Override
            public void startEngine() {
                System.out.println("Engine Started by Car");
            }

            @Override
            public void stopEngine() {
                System.out.println("Engine Stopped by Car");
            }
        }

        class MotorBike implements Vehicle {
            @Override
            public void startEngine() {
                System.out.println("Engine Started by MotorBike");
            }

            @Override
            public void stopEngine() {
                System.out.println("Engine Stopped by MotorBike");
            }
        }



        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        MotorBike mBike = new MotorBike();
        mBike.startEngine();
    }
}
