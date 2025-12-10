class Car {

    // Initializing variables - containers for storing data values
    String model;
    int year;
    String color;

    // Parameterized constructor
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method
    public void displayInfo() {
        System.out.println("Car Details: " + year + " " + model);
    }
}

public class Code1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota",2024, "Silver");
        car.displayInfo();  
    }
}