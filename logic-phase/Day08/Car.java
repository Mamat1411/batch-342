package Day08;

public class Car implements Vehicle{
    private String brand;
    private String releaseYear;
    private String transmission;
    private Integer topSpeed;
    private String color;
    private Integer mileage;

    public Car(){

    }

    public Car(String brand, String releaseYear, String transmission, Integer topSpeed, String color){
        this.brand = brand;
        this.releaseYear = releaseYear;
        this.transmission = transmission;
        this.topSpeed = topSpeed;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    @Override
    public Integer drive() {
        mileage += 5;
        return mileage;
    }

    @Override
    public Integer accelerate() {
        topSpeed += 40;
        return topSpeed;
    }

    @Override
    public Integer brake() {
        topSpeed -= 20;
        return topSpeed;
    }

    @Override
    public Integer stop() {
        topSpeed = 0;
        return topSpeed;
    }
}
