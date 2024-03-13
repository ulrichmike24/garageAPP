package io.tutorial.spring.garageApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "car")
public class Car {

    public enum Color{
        RED,
        BLUE,
        GREEN,
        YELLOW,
    }

    @Id
    private long id;
    private String model;
    private String brand;

    @Column(name = "released_year")
    private int year;
    private Color color;

    public Car() {
        this.model = "model";
        this.id = 546151;
        this.brand = "brand";
        this.year = 2666;
        this.color = Color.BLUE;
    }

    public Car(long id,String model, String brand, int year, Color color) {
        super();
        this.model = model;
        this.id =id;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setColor(Color color) {
        this.color = color;


    }
}
