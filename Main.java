public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Hyundai", "Elantra", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja 400", 2023, 399);
        Truck truck = new Truck("Mitsubishi", "Fuso Fighter", 2021, 8.5);
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