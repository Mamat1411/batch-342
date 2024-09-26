package Day08;

public class Car {
    public String brand;
    public String releaseYear;
    public String transmission;
    public Integer topSpeed;
    public String color;
    public Integer mileage;

    public Car(){

    }

    public Car(String brand, String releaseYear, String transmission, Integer topSpeed, String color){
        this.brand = brand;
        this.releaseYear = releaseYear;
        this.transmission = transmission;
        this.topSpeed = topSpeed;
        this.color = color;
    }

    public Integer drive(){
        mileage += 5;
        topSpeed = 60;
        return mileage;
    }

    public Integer accelerate(){
        topSpeed += 40;
        return topSpeed;
    }

    public Integer brake(){
        topSpeed -= 10;
        return topSpeed;
    }

    public Integer stop(){
        topSpeed = 0;
        return topSpeed;
    }
}
