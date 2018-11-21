package Clone;

public class Student extends Person implements Cloneable {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        super("Jane Doe", 30, "female");
        previousOrganization = "The School of Life";
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays = skippedDays + numberOfDays;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

   /* @Override
    public Student clonable(Student student, String name) {
        Student student2 = student;
        this.name = name;
        return student2;
    }*/

}