package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private static int CAR_ID = 1;
    List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(CAR_ID++, "Geely", 2021));
        cars.add(new Car(CAR_ID++, "Honda", 2022));
        cars.add(new Car(CAR_ID++, "Toyota", 2023));
        cars.add(new Car(CAR_ID++, "Mazda", 2024));
        cars.add(new Car(CAR_ID++, "Lada", 2025));
    }

    public List<Car> getCars() {
        return cars;
    }
}
