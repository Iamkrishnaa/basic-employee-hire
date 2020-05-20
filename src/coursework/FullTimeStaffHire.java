package coursework;

public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    //This constructor below initialize the attributes from acquired parameter and assign attribute value.
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour){
        super(vacancyNumber, designation, jobType);
        this.salary = salary;
        this.workingHour = workingHour;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
    }
    
    public int getSalary(){ //getter for salary
        return salary;
    }
    
    public int getWorkingHour(){ //getter for workingHour
        return workingHour;
    }
    
    public String getStaffName(){ //getter for staffName
        return staffName;
    }
    
    public String getJoiningDate(){ //getter of joiningDate
        return joiningDate;
    }
    
    public String getQualification(){ //getter for qualification
        return qualification;
    }
    
    public String getAppointedBy(){ //getter for appointedBy
        return appointedBy;
    }
    
    public boolean isJoined(){ //getter for joined
        return joined;
    }
    
    public void setSalary( int salary){ //setter for salary
        if(!isJoined()){
            this.salary = salary;
        } else{
            System.out.println("Developer is already appointed. So, setting salary is not possible.");
        }
    }
    
    public void setWorkingHour( int workingHour){ //setter for workingHour
        this.workingHour = workingHour;
    }
    
    //This method hire full time staff checking their joining status too.
    public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        /*
         The below will first check the joining status of staff. If the staff is already joined then it will show the detail of staff
         including name and joining date otherwise
         the attributes are assigned with parameter values.
        */
        if(isJoined()){
            System.out.println("Staff Name : " + getStaffName());
            System.out.println("Joining Date : " + getJoiningDate());
        } else {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        }
    }
    
    //the method below uses same signature as display method ain super class and prints required output
    public void display(){
        super.display();
        if(isJoined()){
            System.out.println("Staff name : " + getStaffName());
            System.out.println("Salary : " + getSalary());
            System.out.println("Working Hour: " + getWorkingHour());
            System.out.println("Joining Date : " + getJoiningDate());
            System.out.println("Qualification: " + getQualification());
            System.out.println("Appointed By : " + getAppointedBy());
        }
    }
}
