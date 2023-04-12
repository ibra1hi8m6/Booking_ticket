package first.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmed
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministativeEmployee extends Employee implements Management 
{

 private String EMail,Department;

  private ArrayList<Member> member= new ArrayList() ;
  File file = new File("members.txt");
 static Scanner scn = new Scanner(System.in);
 
 
    public AdministativeEmployee( String Name, String Dob, String Gender, int PhNum, int JobId, int Salary,String EMail, String Department) {
        super(Name, Dob, Gender, PhNum,JobId,Salary);
        this.EMail = EMail;
        this.Department = Department;
    }

    
    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    
 @Override
    public  void viewMembers() throws FileNotFoundException, IOException{
    BufferedReader input = new BufferedReader(new FileReader(file));
    if (!input.ready()){
        throw new IOException();
    }
    Scanner myReader = new Scanner(file);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
          }
    }




    
 @Override
    public void addMember() throws IOException{
     FileWriter fw = new FileWriter(file);
     Writer output = new BufferedWriter(fw);
        System.out.println("Please enter Number of members: ");
          int memnum = scn.nextInt();
          
          for(int j = 0; j<memnum; j++) {
         scn.nextLine();
         
        System.out.println("Please enter Member name: ");
          String memname = scn.nextLine();
          
        System.out.println("Please enter Member ID: ");
          int memID = scn.nextInt();
          
        System.out.println("Please enter Date Joined: ");
          String memdate = scn.next();
          
        System.out.println("Please enter Member Phone number: ");
          int memphone = scn.nextInt();
          
        System.out.println("Please enter Member DOB: ");
          String memdob = scn.next();
          
        System.out.println("Please enter Member Gender: ");
          String memgen = scn.next();
          
        member.add(new Member(memname,memdob,memgen,memphone,memID,memdate)); }
          for(int j =0;j<member.size();j++)
          {
          output.write(member.get(j).toString()+"\n");
          }
          output.close();
          
    }

    @Override
    public void Printinfo() {
        System.out.println("Name: "+getName()+"\nJob ID: "+getJobId()+"\nDepartment: "+getDepartment()+
                "\nSalary: "+getSalary()+"\nEmail: "+getEMail()+"\nPhone Number: "
                +getPhNum()+"\nGender: "+getGender()+"\nDate of Birth: "+getDob());
    }
 
}
