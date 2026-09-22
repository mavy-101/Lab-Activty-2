public class Main {
    public static void main(String[] args) {

        Vehicle firstCar = new Vehicle();
        firstCar.brand = "Chevrolet";
        firstCar.model = "Camaro";
        firstCar.year = 2015;

        Vehicle secondCar = new Vehicle();
        secondCar.brand = "Mazda";
        secondCar.model = "RX-7";
        secondCar.year = 1990;

        Vehicle thirdCar = new Vehicle();
        thirdCar.brand = "Subaru";
        thirdCar.model = "BRZ";
        thirdCar.year = 2023;

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
    }
}
