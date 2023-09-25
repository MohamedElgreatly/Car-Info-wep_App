package com.example.Car_Builder_store.CarBuilder;

import com.example.Car_Builder_store.Model.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class carBuilder extends DBConnection {
    private Car car;

    public carBuilder() {
        car = new Car();
    }

    public void buildColor(String color) {
        car.setColor(color);
    }

    public void buildFactory(String name) {
        car.setFactoryName(name);
    }

    public void buildCountry(String country) {
        car.setCountry(country);
    }

    public void buildPrice(float price) {
        car.setPrice(price);
    }

    public void buildWeight(float weight) {
        car.setWeight(weight);
    }

    public void buildHeight(float height) {
        car.setHeight(height);
    }

    public void buildDistance(float dist) {
        car.setDistance_Km(dist);
    }

    public Car buildCar()
    {
        return car ;
    }
    public String storeCar() throws SQLException {
        Statement st =DBConnection.connect();
        st.executeUpdate("insert into carproperties values("+"\'"+car.getCountry()+"\'"+","+"\'"+car.getFactoryName()+"\'"+
                ","+car.getPrice()+","+car.getWeight()+","+car.getHeight()+","+car.getDistance_Km()+","+
                "\'"+car.getColor()+"\'"+",null)");
        return "car saved successfully";
    }

    public ArrayList<Car> returnCars() throws SQLException {
        Statement st =DBConnection.connect();
        ResultSet res=st.executeQuery("select * from carproperties");
        ArrayList<Car> Arr=new ArrayList<>();
        while(res.next()){

            Arr.add(new Car(res.getString(1),res.getString(2),
                    res.getFloat(3),res.getFloat(4),
                    res.getFloat(5),res.getFloat(6),
                    res.getString(7)));
        }
        return Arr;
    }
}
