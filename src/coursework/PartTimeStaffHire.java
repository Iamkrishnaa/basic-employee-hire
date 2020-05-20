package coursework;

public class PartTimeStaffHire extends StaffHire{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    
    //This constructor below initialize the attributes from acquired parameter
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts){
        super(vacancyNumber, designation, jobType);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
        this.terminated = false;
    }
    
    public int getWorkingHour(){ //getter for workingHour
        return workingHour;
    }
    
    public int getWagesPerHour(){  //getter for wagesPerHour
        return wagesPerHour;
    }
    
    public String getStaffName(){ //getter for staffName
        return staffName;
    }
    
    public String getJoiningDate(){ //getter for joiningDate
        return joiningDate;
    }
    
    public String getQualification(){ //getter for qualification
        return qualification;
    }
    
    public String getAppointedBy(){ // getter for appointedBy
        return appointedBy;
    }
    
    public boolean isJoined(){ //getter for joined 
        return joined;
    }
    
    public boolean isTerminated(){  //getter for termination
        return terminated;
    }
    
    public void setShifts(String shifts){ //setter for shifts
        if (!isJoined()){
            this.shifts = shifts;
        }
    }
    
    //the below method hire parttime staff by checking their joining status
    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        /*
         The below will first check the joining status of staff. If the staff is already joined then it will show the detail of staff
         including name and joining date otherwise
         the attributes are assigned with parameter values.
        */
        if (isJoined()){
            System.out.println("Name of staff : " + getStaffName());
            System.out.println("Joining Date : " + getJoiningDate());
        } else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
            this.terminated = false;
        }
    }
    
    //the below method is used to terminate the staff
    public void terminateStaff(){
        /*
         The below will first check the termination status of staff. If the staff is already terminated then it will show the 
         message that staff is terminated already otherwise
         staffname, joining date, qualification, appointed by, are set as empty string and joined status is changed to false. Likewise terminated status as true.
        */
        if(isTerminated()){
            System.out.println("Staff already terminated");
        } else{
           this.staffName = "";
           this.joiningDate = "";
           this.qualification = "";
           this.appointedBy = "";
           this.joined = false;
           this.terminated = true;
        }
    }
    
    //the method below uses same signature as display method ain super class and prints required output
    public void display(){
        super.display();
        if (isJoined()){
            System.out.println("Staff Name : " + getStaffName());
            System.out.println("Wages Per Hour : " + getWagesPerHour());
            System.out.println("Working Hour : " + getWorkingHour());
            System.out.println("Joining Date : " + getJoiningDate());
            System.out.println("Qualification : " + getQualification());
            System.out.println("Appointed By : " + getAppointedBy());
            System.out.println("Income Per Day : " + (getWagesPerHour() * getWorkingHour()));
        }
    }
}