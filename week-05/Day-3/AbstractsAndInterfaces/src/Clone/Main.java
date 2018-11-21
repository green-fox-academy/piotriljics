package Clone;

public class Main {
    public static void main(String[] args) {
        Student John = new Student("John",20,"male","BME");
        try {
            Student JohnClone = (Student) John.clone();
            JohnClone.setName("johnTheClone");
            JohnClone.introduce();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
