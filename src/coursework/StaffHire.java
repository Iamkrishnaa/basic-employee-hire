package coursework;

public class StaffHire{ //declaring staffhire class
    private int vacancyNumber;
    private String designation;
    private String jobType;
    
    //This constructor below initialize the attributes from acquired parameter and assign to attribute
    public StaffHire(int vacancyNumber, String designation, String jobType){
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
    }
    
    public int getVacancyNumber(){ //getter for vacancy number returns vacancyNumber
        return vacancyNumber;
    }
    
    public void setVacancyNumber( int vacancyNumber){ //setter for vacancy number
        this.vacancyNumber = vacancyNumber;
    }
    
    public String getDesignation(){ //getter for designation
        return designation;
    }
    
    public void setDesignation( String designation){ //setter for designation
        this.designation = designation;
    }
    
    public String getJobType(){ //getter for job type
        return jobType;
    }
    
    public void setJobType(String jobType){ //setter for jobtype
        this.jobType = jobType;
    }
    
    public void display(){  //this method provide output of all attributes.
        System.out.println("Vacancy Number : " + getVacancyNumber());
        System.out.println("Designation : " + getDesignation());
        System.out.println("Job Type : " + getJobType());
    }
}
