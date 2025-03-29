package web.servis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServisImp implements CarServis {

    public CarDao carDao;

    @Autowired
    public CarServisImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCar(int count) {
        return (count >= 5) ? carDao.getCars() : carDao.getCars().stream().limit(count).toList();
    }

    @Override
    public List<Car> getList() {
        return carDao.getCars();
    }
}
