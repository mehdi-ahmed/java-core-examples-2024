package com.mytutorials.javacore.java17.records;

public class CarRecordMain {

    public static void main(String[] args) {

        // Creating Car Records
        Car carRecord1 = new Car("Toyota", "Camry", 2023);

        Car carRecord2 = new Car("Tesla", "Model S", 2024);

        Car carRecord3 = new Car("Toyota", "Camry", 2023);

        // Accessing Record values
        String brand = carRecord1.make();
        String model = carRecord1.model();
        int year = carRecord1.year();

        // brand =Toyota, model = Camry, year = 2023
        System.out.println("brand =" + brand + ", model = " + model + ", year = " + year);

        // Exploring generated methods

        // equals()
        System.out.println("Car 1 and Car 2 are they they equal ? = " + carRecord1.equals(carRecord2)); // false
        System.out.println("Car 1 and Car 3 are they they equal ? = " + carRecord1.equals(carRecord3)); // true

        // hashCode
        System.out.println("hashCodeRecord = " + carRecord1.hashCode()); // 1382157839

        //toString()
        System.out.println("Car Record 1 = " + carRecord1); // toString() is redundant
        // Car Record 1 = Car[make=Toyota, model=Camry, year=2023]


        // Updating Car1 Record Values
        Car updatedCarRecord1 = new Car(carRecord1.make(), carRecord1.model(), 2024);
        System.out.println("updatedCarRecord1 = " + updatedCarRecord1);
        // updatedCarRecord1 = Car[make=Toyota, model=Camry, year=2024]

        // The original Car1 Record remains unchanged
        System.out.println("carRecord1 = " + carRecord1); // carRecord1 = Car[make=Toyota, model=Camry, year=2023]
    }
}
