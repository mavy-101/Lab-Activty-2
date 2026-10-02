```java
public class Vehicle {
    String brand;
    String model;
    int year;

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public int calculateAge() {
        int age = 2026 - year;
        return age;
    }

    public boolean isVintage() {
        int age = calculateAge();

        if (age > 25) {
            return true;
        } else {
            return false;
        }
    }
}
```
