import java.time.LocalDate;

public class Project {
    private String projectName, customer;
    private Address projectAddress;
    private double overheadPercent;
    private LocalDate startDate, endDate;

    Project(String projectName, String customer, Address projectAddress){
        this.projectName = projectName;
        this.customer = customer;
        this. projectAddress = projectAddress;
        System.out.println("Project created..");
    }
    Project(String projectName, String customer, Address projectAddress, LocalDate startDate, LocalDate endDate){
        this(projectName, customer, projectAddress);
        this.startDate = startDate;
        this.endDate = endDate;
        System.out.println("Project created with date..");
    }

    public String getName() {
        return projectName;
    }

    public double getOverhead() {
        return overheadPercent;
    }

    public getTotalCost(){

    }

    public void setOverheadPercent(double overheadPercent) {
        this.overheadPercent = overheadPercent;
    }

    public void calculateProjectCost(){

    }
}
