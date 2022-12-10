package models;

public class Car implements DTOInterface {
    private String make;
    private String model;
    private int year;
    private String color;
    private String vin;
    private int id;

    public Car(String make, String model, int year, String color, int id, String vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.id = id;
        this.vin = vin;
    }

    public Car() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
    //car to string
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", vin='" + vin + '\'' +
                ", id=" + id +
                '}';
    }
}
