package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Audi", "A6", 1987));
        cars.add(new Car("Lada", "Vesta", 2008));
        cars.add(new Car("Toyota", "Land Cruiser", 2019));
        cars.add(new Car("BMW", "318", 1991));
        cars.add(new Car("Kia", "K5", 2021));
    }

    @Override
    public List<Car> getAFewCar(Integer few) {
        List<Car> result = new ArrayList<>();
        if (few == null || few > cars.size()) {
            few = cars.size();
        }
        for (int i = 0; i < few; i++) {
            result.add(cars.get(i));
        }
        return result;
    }
}
