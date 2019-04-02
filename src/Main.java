import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //customer address objects
        Address customer1Address = new Address("Korhal street 10", "Oslo", "TarKossia","2048");
        Address customer2Address = new Address("Farm road 1", "Village on Shiloh", "Shiloh","1337");

        //objects for project start and end dates
        LocalDate project1StartDate = LocalDate.of(2020,12,24);
        LocalDate project2StartDate = LocalDate.of(2020,9,20);
        LocalDate project1EndDate = LocalDate.of(2025,1,27);
        LocalDate project2EndDate = LocalDate.of(2021,10,15);

        //project objects
        Project newHouse = new Project("New house", "Sarah Kerrigan", customer1Address, project1StartDate, project1EndDate);
        Project outdoorLighting = new Project("Outdoor motion lighting", "Jim Raynor", customer2Address, project2StartDate, project2EndDate);

        //worker address objects
        Address plumber1Address = new Address("Slottsplassen 1", "Oslo", "Norway","2048");
        Address electricianAddress = new Address("Prinsens gate 20","PO box 1337", "Trondheim", "Norway","2048");
        Address carpenterAddress = new Address("Slottsplassen 1", "Oslo", "Norway","2048");

        //Worker objects
        Plumber plumber = new Plumber("Arcturus", "Mengsk", plumber1Address, 587, 30, 45);
        Electrician electrician = new Electrician("Matt", "Horner", electricianAddress, 884, 45, 20);
        Carpenter carpenter = new Carpenter("Tychus", "Findlay", carpenterAddress, 445, 10, 30);


        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(plumber);
        workers.add(electrician);
        workers.add(carpenter);

        carpenter.setLumberCost(1200);
        plumber.setPlumbingCosts(2500);
        electrician.setWiringCosts(5000);

        newHouse.addWorkers(workers);
        newHouse.setOverheadPercent(.18);

        System.out.printf(newHouse.toString(), newHouse.getName(), newHouse.getTotalCost(), newHouse.getOverhead());
    }
}
