package first.java;
//@author Ahmed


public abstract class Employee extends Human {
    private int JobId, Salary;


    public Employee(String Name, String Dob, String Gender, int PhNum,int JobId, int Salary) {
        super(Name, Dob, Gender, PhNum);
        this.JobId = JobId;
        this.Salary = Salary;
    }

    public int getJobId() {
        return JobId;
    }

    public void setJobId(int JobId) {
        this.JobId = JobId;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    
}
