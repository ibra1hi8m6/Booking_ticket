package first.java;

/**
 *
 * @author ahmed
 */
public class TrainingEmployee extends Employee{

private String Facility,WorkingDays;

    public TrainingEmployee(String Name, String Dob, String Gender, int PhNum, int JobId, int Salary,String Facility, String WorkingDays ) {
        super(Name, Dob, Gender, PhNum,JobId, Salary);
        this.Facility = Facility;
        this.WorkingDays = WorkingDays;
    }

    public String getFacility() {
        return Facility;
    }

    public void setFacility(String Facility) {
        this.Facility = Facility;
    }
    
    public String getWorkingDays() {
        return WorkingDays;
    }

    public void setWorkingDays(String WorkingDays) {
        this.WorkingDays = WorkingDays;
    }

    @Override
    public void Printinfo() {
        System.out.println("Name: "+getName()+"\nJob ID: "+getJobId()+"\nFacility: "+getFacility()+
                "\nSalary: "+getSalary()+"\nWorking days: "+getWorkingDays()+"\nPhone Number: "+getPhNum()+"\nGender: "+getGender()+"\nDate of Birth: "+getDob());
    }


}
