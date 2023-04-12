package first.java;

/**
 *
 * @author ahmed
 */
public class Facility {
    private int Size,Capacity,NumofEmployee; //parameters of Size,Capacity,And number of employees
    private String Name; // parameter for Name of facility

    //full argument constructor
    public Facility(String Name,int Size, int Capacity, int NumofEmployee) {
        this.Name= Name;
        this.Size = Size;
        this.Capacity = Capacity;
        this.NumofEmployee = NumofEmployee;
    }

    public void setName(String Name) {
        this.Name = Name; // set facility Name
    }

    public void setSize(int Size) {
        this.Size = Size; // set facility size
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity; // set facility capacity
    }

    public void setNumofEmployee(int NumofEmployee) {
        this.NumofEmployee = NumofEmployee; // set number of employees in facility
    }

    public String getName() {
        return Name; // get facility Name
    }

    public int getSize() {
        return Size; // get facility size
    }

    public int getCapacity() {
        return Capacity; // get facility capacity
    }

    public int getNumofEmployee() {
        return NumofEmployee; // get number of employees in facility
    }
    
    //Print all information about Facility
    public void printinfo() {
        System.out.println("Facility: "+Name.toUpperCase()+"\nSize= " + Size + "m^2\nCapacity= " 
                + Capacity + "\nNumofEmployee= " + NumofEmployee);
    }
    
    
}
