package web.service;

import web.model.Cars;
import web.dao.CarsDaoImpl;

import java.util.List;

public class CarsServiceImpl implements CarsService {

    private final CarsDaoImpl carsDao = new CarsDaoImpl();

    public List<Cars> getCarsByCount(Integer count) {
        List<Cars> cars = carsDao.carsList();
        int toIndex = count != null && count < cars.size() ? count : cars.size();
        return cars.subList(0, toIndex);
    }

    public List<Cars> getCarsList() {
        return carsDao.carsList();
    }
}
