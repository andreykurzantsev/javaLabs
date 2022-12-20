import java.util.Arrays;
import java.util.Comparator;

public class Company {
    private String Name;
    private Plane[] park;

    public static void FillPark(Plane[] park) {
        park[0] = new An124();
        park[1] = new An2();
        park[2] = new An22();
        park[3] = new An225();
    }
    public int countWeight(){
        int sumOfWeight = 0;
        for (int i = 0; i < park.length; i++) {
            sumOfWeight+=park[i].getWeight_of_cargo();
        }
        return sumOfWeight;
    }
    public int countOfCrew(){
        int countOfCrew = 0;
        for (int i = 0; i < park.length; i++) {
            countOfCrew +=park[i].getCrew();
        }
        return countOfCrew;
    }
    public void sortByFlightAltitude() {
        Comparator<Plane> CompareByFlight = Comparator.comparing(Plane::getMaximum_flight_altitude);
        Arrays.sort(park, CompareByFlight);
    }

    public static void showPlaneInfo(Plane plane) {
        System.out.println("Назва: " + plane.getName());
        System.out.println("Вантажопідйомність: " + plane.getWeight_of_cargo());
        System.out.println("Споживання палива: " + plane.getFuel_consumption());
        System.out.println("Максимальна дальність польоту: " + plane.getMaximum_flight_altitude());
        System.out.println("Крейсерська швидкість: " + plane.getCruising_speed());
        System.out.println("Дальність польоту: " + plane.getRange_of_flight());
        System.out.println();
    }

    public void showAllPlanes() {
        for (int i = 0; i < park.length; i++) {
            showPlaneInfo(park[i]);
        }
    }

    public void getPlaneInFuelConsumptionRange(double down, double up) {
        for (int i = 0; i < park.length; i++) {
            if (park[i].getFuel_consumption() > down & park[i].getFuel_consumption() < up) {
                showPlaneInfo(park[i]);
            }
        }
    }

    public Company(String name, int countOfPlanes) {
        this.Name = name;
        this.park = new Plane[countOfPlanes];
        FillPark(park);
    }
}
