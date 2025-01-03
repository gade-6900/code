public class Car {
    // Class attributes
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    // Method to drive the car
    public void drive() {
        if (currentFuelInLiters > 0) {
            System.out.println("The car is driving.");
            currentFuelInLiters--; // Decrease fuel by 1 liter
        } else {
            System.out.println("Not enough fuel to drive.");
        }
    }

    // Method to add fuel
    public void addFuel(float fuel) {
        if (fuel > 0) {
            currentFuelInLiters += fuel;
            System.out.println(fuel + " liters of fuel added. Current fuel: " + currentFuelInLiters + " liters.");
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.noOfWheels = 4;
        myCar.color = "Red";
        myCar.maxSpeed = 180.5f;
        myCar.currentFuelInLiters = 10.0f;
        myCar.noOfSeats = 5;

        System.out.println("Car details:");
        System.out.println("Wheels: " + myCar.noOfWheels);
        System.out.println("Color: " + myCar.color);
        System.out.println("Max Speed: " + myCar.maxSpeed + " km/h");
        System.out.println("Fuel: " + myCar.currentFuelInLiters + " liters");
        System.out.println("Seats: " + myCar.noOfSeats);

        // Test driving and refueling
        myCar.drive();
        myCar.addFuel(5.0f);
        myCar.drive();
    }
}

    