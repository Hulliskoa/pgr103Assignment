import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //customer address objects
        Address customer1Address = new Address("Korhal street 10", "Oslo", "TarKossia","2048");
        Address customer2Address = new Address("Farm road 1", "Village on Shiloh", "Shiloh","1337");

        //objects for start and end dates
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
        Electrician electrician = new Electrician("Arcturus", "Mengsk", electricianAddress, 587, 30, 45);
        Carpenter carpenter = new Carpenter("Arcturus", "Mengsk", carpenterAddress, 587, 30, 45);
    }
}
