package web.dao;

import web.model.Cars;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;

public class CarsDaoImpl implements CarsDao {
    public List<Cars> carsList() {
        List<Cars> carsList = new ArrayList<>();
        carsList.add(new Cars ("Volvo","1998","X444OM"));
        carsList.add(new Cars("Lada","2003","E845AH"));
        carsList.add(new Cars("UAZ","2015","C123BH"));
        carsList.add(new Cars("Lexus","2008","K524AC"));
        carsList.add(new Cars("Hyundai","2010","P741AM"));
        return carsList;
    }
}
