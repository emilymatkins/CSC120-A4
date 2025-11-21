
import java.util.ArrayList;

public class Car implements CarRequirements {

    private ArrayList<Passenger> passenger;
    private int capacity;

    /**
     * Constucts a Car with given capacity of passengers
     *
     * @param capacity the maximum number of passengers the car can hold
     */
    public Car(int capacity) {
        this.capacity = capacity;
        this.passenger = new ArrayList<>(capacity);
    }

    /**
     * Returns the maximum capacity of the car
     *
     * @return int capacity
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Calculates the seats remaining in the car
     *
     * @return int seats remaining
     */
    public int seatsRemaining() {
        return capacity - passenger.size();
    }

    /**
     * Adds passenger to the car
     *
     * @param p the passenger to add
     * @return boolean of task completion
     */
    public Boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0 && !passenger.contains(p)) {
            passenger.add(p);
            return true;
        }
        return false;
    }

    /**
     * Removes passenger from the car
     *
     * @param p the passenger to remove
     * @return boolean of task completion
     */
    public Boolean removePassenger(Passenger p) {
        if (passenger.contains(p)) {
            passenger.remove(p);
            return true;
        }
        return false;
    }

    /**
     * Prints manifest for the car
     */
    public void printManifest() {
        if (passenger.isEmpty()) {
            System.out.println("This car is EMPTY");
        } else {
            System.out.println("Passenger Manifest:");
            for (Passenger p : passenger) {
                System.out.println(p.getName());
            }

        }
    }

    @Override
    public String toString(){
        return "Car{Capacity:" + capacity + ", seatRemaining:" + seatsRemaining() + "}";
    }

}
