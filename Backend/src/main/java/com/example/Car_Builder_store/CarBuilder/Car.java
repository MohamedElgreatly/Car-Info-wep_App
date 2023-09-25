package com.example.Car_Builder_store.CarBuilder;

public class Car {
    private String country;
    private String factoryName;
    private float price;
    private float weight;
    private float height;
    private float distance_Km;
    private String color;



    public  Car(){}
    public  Car(String country,String factoryName,float price
    ,float weight,float height,float distance_Km,String color)
    {
     this.country=country;
     this.color=color;
     this.price=price;
     this.factoryName=factoryName;
     this.height=height;
     this.weight=weight;
     this.distance_Km=distance_Km;
    }
    public String getCountry() {
        return country;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public float getDistance_Km() {
        return distance_Km;
    }

    public String getColor() {
        return color;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setDistance_Km(float distance_Km) {
        this.distance_Km = distance_Km;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
