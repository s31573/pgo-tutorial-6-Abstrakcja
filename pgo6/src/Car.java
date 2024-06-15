public class Car extends Vehicle{


    double milesDriven, fuelConsumed;

    Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    double calculateFuelEfficiency() {
        return milesDriven/fuelConsumed;
    }
}
