package SRP_Exercice;
import java.util.List;

public interface ICarManager {
	Car getFromDatabase(final String carId);
	List<Car> getAllCars();

}

