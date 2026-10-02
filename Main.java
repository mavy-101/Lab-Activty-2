public class Main {

    public static void main(String[] args) {

        Vehicle firstCar = new Vehicle("Chevrolet", "Camaro", 2015);
        Vehicle secondCar = new Vehicle("Mazda", "RX-7", 1990);
        Vehicle thirdCar = new Vehicle("Subaru", "BRZ", 2023);


        System.out.println("=== FIRST CAR ===");
        firstCar.displayInfo();
        System.out.println("Age: " + firstCar.calculateAge());
        System.out.println("Vintage: " + firstCar.isVintage());

        System.out.println();

        System.out.println("=== SECOND CAR ===");
        secondCar.displayInfo();
        System.out.println("Age: " + secondCar.calculateAge());
        System.out.println("Vintage: " + secondCar.isVintage());

        System.out.println();

        System.out.println("=== THIRD CAR ===");
        thirdCar.displayInfo();
        System.out.println("Age: " + thirdCar.calculateAge());
        System.out.println("Vintage: " + thirdCar.isVintage());

        System.out.println("\n=== Getters ===");
        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Year: " + vehicle1.getYear());

        System.out.println("\n=== setYear(2000) ===");
        System.out.println("Return value: " + vehicle1.setYear(2000));
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println("\n=== setYear(1885) ===");
        System.out.println("Return value: " + vehicle1.setYear(1885));
        System.out.println("Stored year: " + vehicle1.getYear());

        System.out.println("\n=== setYear(2027) ===");
        System.out.println("Return value: " + vehicle1.setYear(2027));
        System.out.println("Stored year: " + vehicle1.getYear());

        System.out.println("\n=== Constructor with year 1885 ===");
        Vehicle invalidVehicle1 =
                new Vehicle("Test", "Invalid1885", 1885);

        System.out.println("Initial year: " + invalidVehicle1.getYear());

        System.out.println("\n=== Constructor with year 2027 ===");
        Vehicle invalidVehicle2 =
                new Vehicle("Test", "Invalid2027", 2027);

        System.out.println("Initial year: " + invalidVehicle2.getYear());
    }
}
