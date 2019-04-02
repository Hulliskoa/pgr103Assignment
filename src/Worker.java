public class Worker {
    private String fName, lName;
    private Address address;
    private int idNumber;
    private double hoursWorked, hourlyRate;

    Worker(){
        System.out.println("Worker hired");
    }

    Worker(String fName, String lName, Address address, int idNumber, double hours, double rate){
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.idNumber = idNumber;
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void doWork(){

    }

    public void calculatePay(){

    }

    @Override
    public String toString(){
    return "Worker named: " + fName + " " + lName + ". With hourly rate: " + hourlyRate;
    }
}

class Carpenter extends Worker{
    private double lumberCost;

    public Carpenter(String fName, String lName, Address address, int idNumber, double hours, double rate){
        super(fName, lName, address, idNumber, hours, rate);
    }

    public void setLumberCost(double lumberCost) {
        this.lumberCost = lumberCost;
    }
}

class Electrician extends Worker{
    private double wiringCosts;

    public Electrician(String fName, String lName, Address address, int idNumber, double hours, double rate){
        super(fName, lName, address, idNumber, hours, rate);
    }

    public void setWiringCosts(double wiringCosts) {
        this.wiringCosts = wiringCosts;
    }
}

class Plumber extends Worker{
    private double plumbingCosts;

    public Plumber(String fName, String lName, Address address, int idNumber, double hours, double rate){
        super(fName, lName, address, idNumber, hours, rate);
    }



}
