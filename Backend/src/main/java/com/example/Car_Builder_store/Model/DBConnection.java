package com.example.Car_Builder_store.Model;



import com.example.Car_Builder_store.CarBuilder.Car;

import java.sql.*;

public class DBConnection {
    public static Statement connect() {
        String url = "jdbc:mysql://localhost:3306/car";
        String username = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, "");
            Statement statement = con.createStatement();
            return statement;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
        Car car =new Car("alex","loso",20
    ,30,15,40,"red");
        Statement st =DBConnection.connect();
        st.executeUpdate("insert into carproperties values("+"\'"+car.getCountry()+"\'"+","+"\'"+car.getFactoryName()+"\'"+
                ","+car.getPrice()+","+car.getWeight()+","+car.getHeight()+","+car.getDistance_Km()+","+
                "\'"+car.getColor()+"\'"+",null)");
//        st.executeQuery("select * from carproperties");
    }
}