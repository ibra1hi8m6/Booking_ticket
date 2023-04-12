package first.java;

//@author ahmed
public abstract class Human {
    private String Name, Dob, Gender ;
    private int PhNum ;


    public Human(String Name, String Dob, String Gender, int PhNum) {
        this.Name = Name;
        this.Dob = Dob;
        this.Gender = Gender;
        this.PhNum = PhNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getPhNum() {
        return PhNum;
    }

    public void setPhNum(int PhNum) {
        this.PhNum = PhNum;
    }
    
    public abstract void Printinfo();
   
}

