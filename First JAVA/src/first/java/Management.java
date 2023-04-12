package first.java;


import java.io.FileNotFoundException;
import java.io.IOException;

public interface Management  {
 public void addMember() throws IOException;
 public  void viewMembers() throws FileNotFoundException, IOException;
}
