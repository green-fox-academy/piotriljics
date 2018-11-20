package GreenFoxOrganization;

public class Sponsor extends Person {
   private String company;
   private int hiredStudents;

   public Sponsor(String name, int age, String gender, String company){
       super(name, age, gender);
       this.hiredStudents = 0;
       this.company = company;
   }

   public Sponsor(){
       super("Jane Doe",30,"female");
       company = "Google";
   }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents +" students so far.");
    }
    public void hire(){
        hiredStudents++;
    }
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
}
