package Day08;

public class Day08 {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.brand = "BMW";
        firstCar.color = "Silver Blue Stripes";
        firstCar.mileage = 0;
        firstCar.releaseYear = "1999";
        firstCar.transmission = "MT";
        System.out.println(firstCar.brand);
        System.out.println(firstCar.color);
        System.out.println(firstCar.mileage);
        System.out.println(firstCar.releaseYear);
        System.out.println(firstCar.transmission);
        System.out.println(firstCar.topSpeed);
        firstCar.drive();
        System.out.println(firstCar.topSpeed);
        System.out.println(firstCar.mileage);
        firstCar.accelerate();
        firstCar.accelerate();
        System.out.println(firstCar.topSpeed);
        firstCar.brake();
        firstCar.brake();
        firstCar.brake();
        firstCar.brake();
        System.out.println(firstCar.topSpeed);
    }
}
