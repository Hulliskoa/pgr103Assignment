public class Worker {
    public String fName, lName;
    public Address address;
    public int idNumber;
    public double hoursWorked, hourlyRate;

    Worker(){
        System.out.println("Worker hired..");
    }

    Worker(String fName, String lName, Address address, int idNumber, double hours, double rate){
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.idNumber = idNumber;
        this.hoursWorked = hours;
        this.hourlyRate = rate;
        System.out.println(getClass().getName() + " hired..");
    }

    public void setHoursWorked(double hoursWorked) {

        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {

        this.hourlyRate = hourlyRate;
    }

    public String doWork(){
        return "Worker";
    }

    public double calculatePay(){
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString(){
    return fName + " " + lName + "\n Compensation: NOK " + calculatePay();
    }
}

class Carpenter extends Worker{
    private double lumberCost;

    public Carpenter(String fName, String lName, Address address, int idNumber, double hours, double rate){
        super(fName, lName, address, idNumber, hours, rate);
    }
    public String doWork(){
        return "Complete carpentry work";
    }

    public void setLumberCost(double lumberCost) {
        this.lumberCost = lumberCost;
    }

    public double calculatePay(){
        return hoursWorked * hourlyRate + lumberCost;
    }
    @Override
    public String toString(){
        return "Carpenter: " + super.toString() + "\n" + doWork();
    }
}

class Electrician extends Worker{
    private double wiringCosts;

    public Electrician(String fName, String lName, Address address, int idNumber, double hours, double rate){
        super(fName, lName, address, idNumber, hours, rate);
    }

    public String doWork(){
        return "Install wiring and electrical components";
    }

    public void setWiringCosts(double wiringCosts) {

        this.wiringCosts = wiringCosts;
    }

    public double calculatePay(){
        return hoursWorked * hourlyRate + wiringCosts;
    }

    @Override
    public String toString(){
        return "Electrician: " + super.toString() + "\n" + doWork();
    }
}



class Plumber extends Worker{
    private double plumbingCost;

    public Plumber(String fName, String lName, Address address, int idNumber, double hours, double rate){
        super(fName, lName, address, idNumber, hours, rate);
    }

    public void setPlumbingCosts(double plumbingCosts){
        this.plumbingCost = plumbingCosts;
    }
    public String doWork(){
        return "Install plumbing";
    }

    public double calculatePay(){
        return hoursWorked * hourlyRate + plumbingCost;
    }

    @Override
    public String toString(){
        return "Plumber: " + super.toString() + "\n" + doWork();
    }



}
