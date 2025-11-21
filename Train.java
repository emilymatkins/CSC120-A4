
import com.sun.jdi.PathSearchingVirtualMachine;
import java.util.ArrayList;

public class Train implements TrainRequirements {

    private ArrayList<Car> cars;
    private Engine engine;

    /**
     * Constucts a Train with an engine and a set number of cars.
     *
     * @param fuelType the type of fuel
     * @param currentFuel the current fuel level
     * @param maxFuel the maximum fuel level
     * @param nCars the number of cars
     * @param passengerCapacity the passenger capacity
     */
    public Train(FuelType fuelType, double currentFuel, double maxFuel, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, currentFuel, maxFuel);
        this.cars = new ArrayList<>(nCars);
        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * Returns the engine of the train
     *
     * @return Engine of the train
     */
    public Engine getEngine() {
        return this.engine;
    }

    /**
     * Returns the ith car
     *
     * @param int i the number in the index
     * @return int ith car in the index
     */
    public Car getCar(int i) {
        return cars.get(i);
    }

    /**
     * Calculates the total passenger capacity of the entire train
     *
     * @return int total passenger capacity
     */
    public int getMaxCapacity() {
        int total = 0;
        for (Car c : cars) {
            total += c.getCapacity();
        }
        return total;
    }

    /**
     * Calculates the total number of seats remaining across all cars
     *
     * @return int total seats remaining
     */
    public int seatsRemaining() {
        int total = 0;
        for (Car c : cars) {
            total += c.seatsRemaining();
        }
        return total;
    }

    /**
     * Prints manifest for all cars in the train
     */
    public void printManifest() {
        for (Car c : cars) {
            c.printManifest();
        }
    }

    public static void main(String[] args) {
        Train trainViv = new Train(FuelType.INTERNAL_COMBUSTION, 50, 100, 3, 50 );
        Passenger Evelyn = new Passenger("Evelyn");
        Passenger Amanda = new Passenger("Amanda");
        trainViv.getCar(0).addPassenger(Evelyn);
        trainViv.getCar(1).addPassenger(Amanda);
        System.out.println(trainViv.getEngine());
        System.out.println(trainViv.getCar(0));
        System.out.println(trainViv.getMaxCapacity());
        System.out.println(trainViv.seatsRemaining());
        trainViv.printManifest();
    }
}
