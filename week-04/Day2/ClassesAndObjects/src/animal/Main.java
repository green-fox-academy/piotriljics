package animal;

public class Main {
    public static void main(String[] args) {

        Animal rabbit = new Animal();
        rabbit.eat();
        rabbit.drink();
        rabbit.play();
        rabbit.play();
        System.out.println(rabbit.toString());
    }
}
