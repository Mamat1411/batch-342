package Day08;

public class Day08 {
    public static void main(String[] args) {
        Car firstCar = new Car();
        // firstCar.brand = "BMW";
        firstCar.setBrand("BMW");
        // firstCar.color = "Silver Blue Stripes";
        firstCar.setColor("Silver Blue Stripes");
        // firstCar.mileage = 0;
        firstCar.setMileage(0);
        // firstCar.releaseYear = "1999";
        firstCar.setReleaseYear("1999");
        // firstCar.transmission = "MT";
        firstCar.setTransmission("MT");
        // System.out.println(firstCar.brand);
        System.out.println(firstCar.getBrand());
        // System.out.println(firstCar.color);
        System.out.println(firstCar.getColor());
        // System.out.println(firstCar.mileage);
        System.out.println(firstCar.getMileage());
        // System.out.println(firstCar.releaseYear);
        System.out.println(firstCar.getReleaseYear());
        // System.out.println(firstCar.transmission);
        System.out.println(firstCar.getTransmission());
        // System.out.println(firstCar.topSpeed);
        System.out.println(firstCar.getTopSpeed());
        firstCar.drive();
        // System.out.println(firstCar.topSpeed);
        System.out.println(firstCar.getTopSpeed());
        // System.out.println(firstCar.mileage);
        System.out.println(firstCar.getMileage());
        firstCar.accelerate();
        firstCar.accelerate();
        // System.out.println(firstCar.topSpeed);
        System.out.println(firstCar.getTopSpeed());
        firstCar.brake();
        firstCar.brake();
        firstCar.brake();
        firstCar.brake();
        // System.out.println(firstCar.topSpeed);
        System.out.println(firstCar.getTopSpeed());

        Car secondCar = new Car("Porsche", "2014", "MT", 0, "Silver Black");
        System.out.println(secondCar.getBrand());
    }
}
