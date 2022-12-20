public class Plane {

    private String name;
    private double Weight_of_cargo;
    private int Range_of_flight;
    private double Fuel_consumption; //витрати палива тонн на годину
    private int Maximum_flight_altitude; //максимальна висота польоту
    private int Cruising_speed; //крейсерська швидкість
    private int Crew;


    public Plane(double Weight_of_cargo, int Range_of_flight, double Fuel_consumption,
                 int Maximum_flight_altitude, int Cruising_speed, int Crew) {
        this.Weight_of_cargo = Weight_of_cargo;
        this.Range_of_flight = Range_of_flight;
        this.Fuel_consumption = Fuel_consumption;
        this.Maximum_flight_altitude = Maximum_flight_altitude;
        this.Cruising_speed = Cruising_speed;
        this.Crew = Crew;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight_of_cargo() {
        return this.Weight_of_cargo;
    }

    public int getRange_of_flight() {
        return this.Range_of_flight;
    }

    public double getFuel_consumption() {
        return this.Fuel_consumption;
    }

    public int getMaximum_flight_altitude() {
        return this.Maximum_flight_altitude;
    }

    public int getCruising_speed() {
        return this.Cruising_speed;
    }

    public int getCrew() {return this.Crew;}
}

