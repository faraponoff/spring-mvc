package web.service;

import web.model.Cars;

import java.util.List;

public interface CarsService {
    List<Cars> getCarsByCount(Integer count);
    List<Cars> getCarsList();
}
