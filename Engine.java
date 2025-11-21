
public class Engine implements EngineRequirements {

    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;

    /**
     * Constucts an Engine with fuel type, current fuel level and maximum fuel level
     * @param fuelType the fuel type
     * @param currentFuel the current fuel level
     * @param maxFuel the maximum feul level
     */
    public Engine(FuelType fuelType, double currentFuel, double maxFuel) {
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    /**
     * Returns the engine fuel type
     * @return FuelType of engine
     */
    public FuelType getFuelType() {
        return this.fuelType;
    }

    /**
     * Returns the maximum fuel level of engine
     * @return double maximum fuel level
     */
    public double getMaxFuel() {
        return this.maxFuel;
    }

    /**
     * Returns current fuel level of engine
     * @return double current fuel level
     */
    public double getCurrentFuel() {
        return this.currentFuel;
    }

    /**
     * Refuels the current fuel level to the maximum fuel level
     */
    public void refuel() {
        this.currentFuel = maxFuel;
    }


    /**
     * Runs the engine by comsuming fuel
     * @return boolean completion of task
     */
    public Boolean go() {
        if (currentFuel > 0) {
            this.currentFuel--;
            System.out.println("Remaining fuel level:" + currentFuel);
            return true;
        } else {
            System.out.println("Remaining fuel level:" + currentFuel);
            return false;
            
        }
        
    }

        @Override
    public String toString(){
        return "Engine{ fuelType: " + 
        fuelType + ", currentFuel:" + currentFuel + ", maxFuel:" + maxFuel + "}" ;
    }


    public static void main(String[] args) {
        Engine trainEmily = new Engine(FuelType.ELECTRIC, 10.0, 100.0);
        Engine trainEvelyn = new Engine(FuelType.INTERNAL_COMBUSTION, 100, 200);
        while (trainEmily.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Emily is out of fuel.");
        System.out.println(trainEmily.getCurrentFuel());
        trainEmily.refuel();
        System.out.println(trainEvelyn.getMaxFuel());
        System.out.println(trainEvelyn.getFuelType());
    }

}
