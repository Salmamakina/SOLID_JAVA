package SRP_Exercice;

public class CarNames {
	private ICarManager icarManager;

    public CarNames(ICarManager icarManager) {
        this.icarManager = icarManager;
    }

    public String getCarNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : icarManager.getAllCars()) {
            sb.append(car.getBrand())
              .append(" ")
              .append(car.getModel())
              .append(", ");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "";
    }


}
