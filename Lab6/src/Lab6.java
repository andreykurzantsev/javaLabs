public class Lab6 {
    public static void main(String[] args) {
        Company Antonov = new Company("Antonov", 4);
        System.out.print("Штат пілотів компанії: ");
        int sumCrew = Antonov.countOfCrew();

        System.out.println(sumCrew);
        System.out.print("Максимальна вантажопідйомність компанії: ");
        int sumWeight = Antonov.countWeight();

        System.out.println(sumWeight);
        System.out.println("Всі літаки в компанії:");
        Antonov.showAllPlanes();
        Antonov.sortByFlightAltitude();
        System.out.println("Відсортовані за зростанням дальності польоту:");
        Antonov.showAllPlanes();
        System.out.println("Літаки, що споживають вказаний об'єм палива:");
        Antonov.getPlaneInFuelConsumptionRange(9, 11);
    }
}
