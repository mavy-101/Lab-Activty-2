public class Main {

    public static void printDetails(Vehicle vehicle){
       vehicle.displayInfo();
    }
    
    public static void main (String[] args) {
       
       System.out.println("=== 1. Parent Reference ===");
         Vehicle vehicle = new Car("Ford", "Mustang", 2023, 2);
         vehicle.displayInfo();
         
         System.out.println();
         
         vehicle = new Truck("Volvo", "FH16", 2022, 10);
         
         vehicle = new Motorcycle("Kawasaki", "Ninja 400", 2024, "399cc, liquid-cooled, 4-stroke parallel twin");
         vehicle.displayInfo();
         
         System.out.println("=== 2. Method Parameter ===");
         Car car = new Car("Hyundai", "Tucson", 2021, 4);
         Motorcycle motor = new Motorcycle("Suzuki", "Burgman Street", 2025, "124cc, 4-stroke, single-cylinder, air-cooled");
         Truck truck = new Truck("Scania", "R500", 2023, 8);
         
         printDetails(truck);
         
         System.out.println("\n=== 3. Polymorphic Array ===");
         
         Vehicle[] vehicles = {
             new Car("Tesla", "Model Y", 2024, 4),
             new Motorcycle("Ducati", "Panigale V2", 2023, "955cc Superquadro L-twin, desmodromic distribution"),
             new Truck("MAN", "TGX", 2021, 6)
         };
         
         for(Vehicle currentVehicle : vehicles){
             printDetails(currentVehicle);
             System.out.println();
         }
    }
}
     
      



