package SRP_Exercice;

public class BestCar {
	private ICarManager icarManager;

    public BestCar(ICarManager icarManager) {
        this.icarManager = icarManager;
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : icarManager.getAllCars()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }


}
