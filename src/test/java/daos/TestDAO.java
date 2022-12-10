package daos;

import models.Car;
import org.junit.Test;

public class TestDAO {
    @Test
    //testfindcarbyid
    public void testFindCarById() {
        DAO carDAO = new DAO();
        Car car = carDAO.findById(5);
        System.out.println(car.toString());
    }
    //testfindbycolor
//    @Test
//    public void testFindByColor() {
//        DAO carDAO = new DAO();
//        Car[] cars = carDAO.findByColor("red");
//        for (Car car : cars) {
//            System.out.println(car.toString());
//        }
//    }
    //testfindallcars
//    @Test
//    public void testFindAllCars() {
//        DAO carDAO = new DAO();
//        Car[] cars = carDAO.findAll();
//        for (Car car : cars) {
//            System.out.println(car.toString());
//        }
//    }

}
