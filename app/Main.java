package app;

import contracts.Serviceable;
import devices.Printer;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import vehicles.Vehicle;

public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Mazda", "CX-5", 2019, 4);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja 400", 2022, 399);
        Truck truck = new Truck("Hino", "500 Series", 2020, 15.0);
        Printer printer = new Printer();

        Serviceable[] serviceables = {
            car,
            motorcycle,
            truck,
            printer
        };

        System.out.println("=== Serviceable Objects ===");

        for (Serviceable item : serviceables) {
            performService(item);
        }

        System.out.println();

        Vehicle[] vehicles = {
            car,
            motorcycle,
            truck
        };

        System.out.println("=== Vehicle Information and Movement ===");

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.move();

            System.out.println();
        }
    }
}