
public class Passenger implements PassengerRequirements {

    private String name;

    /**
     * Constructs a Passenger
     *
     * @param name the name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Geets the name of the passenger
     *
     * @return String name of passenger
     */
    public String getName() {
        return this.name;
    }

    /**
     * Attempts to board passenger onto car
     *
     * @param c the car passenger attempts to board
     */
    public void boardCar(Car c) {
        boolean board = c.addPassenger(this);

        if (!board) {
            System.out.println("Passenger could not board car.");
        }
    }

    /**
     * Attempts to remove passenger from car
     *
     * @param c the car passenger attempts to leave
     */
    public void getOffCar(Car c) {
        boolean getOff = c.removePassenger(this);
        if (!getOff) {
            System.out.println("Passenger was not in car.");
        }
    }

    public static void main(String[] args) {
        Passenger Emily = new Passenger("Emily");
        System.out.println(Emily.getName());
        
    }
}
