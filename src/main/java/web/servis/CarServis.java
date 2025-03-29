package web.servis;

import web.models.Car;

import java.util.List;

public interface CarServis {
    List<Car> getCar(int count);
    List<Car> getList();
}
