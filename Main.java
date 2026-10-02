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
    }
}
