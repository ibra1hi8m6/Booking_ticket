package first.java;

/**
 *
 * @author ahmed
 */
public class Member extends Human
{
    private int ClubId ;
   private String DateJoined;
   
    public Member(String Name, String Dob, String Gender, int PhNum,int ClubId, String DateJoined) {
        super(Name, Dob, Gender, PhNum);
        this.ClubId = ClubId;
        this.DateJoined = DateJoined;
    }

    public int getClubId() {
        return ClubId;
    }

    public void setClubId(int ClubId) {
        this.ClubId = ClubId;
    }

    public String getDateJoined() {
        return DateJoined;
    }

    public void setDateJoined(String DateJoined) {
        this.DateJoined = DateJoined;
    }

    @Override
    public void Printinfo() {
        System.out.println("Member Name: "+getName()+"\nClub ID: "+getClubId()+"\nDate Joined: "+getDateJoined()+
                "\nPhone Number: "+getPhNum()+"\nGender: "+getGender()+"\nDate of Birth: "+getDob());
    }

    @Override
    public String toString() {
        return "=============================\nMember Name: "+getName()+"\nClub ID: "+getClubId()+"\nDate Joined: "+getDateJoined()+
                "\nPhone Number: "+getPhNum()+"\nGender: "+getGender()+"\nDate of Birth: "+getDob()+"\n=============================\n";
    }
   
   
}
