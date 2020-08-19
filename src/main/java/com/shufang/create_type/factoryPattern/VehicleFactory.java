package com.shufang.create_type.factoryPattern;

public class VehicleFactory {
    Vehicle vehicle;

    public Vehicle getAVehicle(int type) {

        if (1 == type) {
            vehicle = new Car();
        } else if (2 == type) {
            vehicle = new Motor();
        } else {
            vehicle = new AirPlane();
        }

        return this.vehicle;
    }
}
