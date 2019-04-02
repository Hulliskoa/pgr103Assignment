import java.time.LocalDate;
import java.util.ArrayList;

public class Project implements Comparable{
    public ArrayList<Worker> workers = new ArrayList<>();
    private String projectName, customerName;
    private Address projectAddress;
    private double overheadPercent = .10, overheadAmount;
    private LocalDate startDate, endDate;

    public Project(String projectName, String customerName, Address projectAddress, LocalDate startDate, LocalDate endDate) {
        this(projectName, customerName, projectAddress);
        this.startDate = startDate;
        this.endDate = endDate;
        System.out.println("Project created with date..");
    }
    public Project(String projectName, String customerName, Address projectAddress){
        this.projectName = projectName;
        this.customerName = customerName;
        this. projectAddress = projectAddress;
        System.out.println("Project created without date..");
    }

    public void addWorkers(ArrayList<Worker> workers){
        this.workers = workers;
    }

    public String getName() {
        return projectName;
    }
    public double getOverhead() {
        return overheadAmount;
    }
    public double getTotalCost(){
        return calculateProjectCost();
    }
    public void setOverheadPercent(double overheadPercent) {
        this.overheadPercent = overheadPercent;
    }

    public double calculateProjectCost(){
        double totalCost = 0;
        for(Worker w:workers){
            totalCost += w.calculatePay();
        }
        overheadAmount = overheadPercent * totalCost;
        totalCost += overheadAmount;
        return totalCost;
    }

    @Override
    public int compareTo(Object o){
        if( o instanceof Project){
            if(((Project) o).startDate.isAfter(this.startDate))
                return -1;
        }
        return 1;
    }

    @Override
    public String toString(){
        String projectDetails;
        projectDetails = "Project name: %s" + "\nStart Date: "
                + startDate + "\nCustomer: "
                + customerName + "\nAddress: "
                + projectAddress.toString() + "\n"
                + "==================================\n";
        for(Worker w:workers){
            projectDetails += w.toString() + "\n\n";
        }
        projectDetails += "Project Total: NOK %.2f\n";
        projectDetails += "Contractor Overhead: NOK %.2f\n";
        return projectDetails;

    }
}
