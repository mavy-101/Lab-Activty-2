public class Motorcycle extends Vehicle implements Serviceable {
    private int engineCC;

    public Motorcycle(String brand, String model, int year, int engineCC) {
        super(brand, model, year);
        this.engineCC = engineCC;
    }

    @Override
    public void startEngine() {
        System.out.println(getBrand() + " " + getModel() + " (Motorcycle): engine starts with a kick/electric start.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Engine: " + engineCC + " cc");
    }

    @Override
    public void move() {
        System.out.println("A motorcycle moves forward.");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle: inspect tires and brakes.");
    }
}