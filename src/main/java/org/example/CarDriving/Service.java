package org.example.CarDriving;

import java.util.ArrayList;
import java.util.List;
public class Service {
    public Car getCar(){
        AC ac=new AC();
        ac.airfilters="yes";
        ac.type="centerAc";

        Lights lights=new Lights();
        lights.backLight="yes";
        lights.frontLight="yes";
        lights.signalLight="yes";

        Break breaks=new Break();
        breaks.handBreak="yes";
        breaks.legBreak="yes";

        FuelTanker fuelTanker=new FuelTanker();
        fuelTanker.fuelCapacity="50l";

        Door door=new Door();
        Door door1=new Door();
        Door door2=new Door();
        Door door3=new Door();
        List<Door> doorList = new ArrayList<>();
        doorList.add(door);
        doorList.add(door1);
        doorList.add(door2);
        doorList.add(door3);

        Wheel wheel=new Wheel();
        Wheel wheel1=new Wheel();
        Wheel wheel2=new Wheel();
        Wheel wheel3=new Wheel();
        List<Wheel>wheelList=new ArrayList<>();
        wheelList.add(wheel);
        wheelList.add(wheel1);
        wheelList.add(wheel2);
        wheelList.add(wheel3);

        Seats seats=new Seats();
        Seats seats1=new Seats();
        Seats seats2=new Seats();
        Seats seats3=new Seats();
        List<Seats>seatsList=new ArrayList<>();
        seatsList.add(seats);
        seatsList.add(seats1);
        seatsList.add(seats2);
        seatsList.add(seats3);

        Car car=new Car();
        car.ac=ac;
        car.breaks=breaks;
        car.lights=lights;
        car.fuelTanker=fuelTanker;
        car.doorlist=doorList;
        car.seatsList=seatsList;
        car.wheelList=wheelList;

        System.out.println(car);

        return car;



    }
}
