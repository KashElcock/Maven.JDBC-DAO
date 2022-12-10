package daos;

import models.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO implements DAOInterface<Car> {
    @Override
    public Car findById(int id) {
        // Establish a connection to the database
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Create a statement to execute the SQL query
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        // Execute the query and get the result set
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM car WHERE id = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Extract the data from the result set
        Car car = null;
        try {
            if (rs.next()) {
                int carId = rs.getInt("id");
                String make = rs.getString("make");
                String model = rs.getString("model");
                int year = rs.getInt("year");
                String color = rs.getString("color");
                String vin = rs.getString("vin");
                car = new Car(make, model, year, color, carId, vin);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // Close the resources
        try {
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);


        }
        return car;
    }

    @Override
    public Car[] findAll() {
        // Establish a connection to the database
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Create a statement to execute the SQL query
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        // Execute the query and get the result set
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM car");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Extract the data from the result set
        Car car = null;
        try {
            if (rs.next()) {
                int carId = rs.getInt("id");
                String make = rs.getString("make");
                String model = rs.getString("model");
                int year = rs.getInt("year");
                String color = rs.getString("color");
                String vin = rs.getString("vin");
                car = new Car(make, model, year, color, carId, vin);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // Close the resources
        try {
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);


        }
       return null;
    }

    @Override
    public Car update(Car t) {
        return null;
    }

    @Override
    public Car create(Car t) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
