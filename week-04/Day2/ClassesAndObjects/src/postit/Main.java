package postit;

public class Main {
    public static void main(String[] args) {

        PostIt orange = new PostIt();
        orange.setBackground = "orange";
        orange.textColor = "blue";
        orange.text = "Idea 1";

        System.out.println(orange.toString());

        PostIt pink = new PostIt();
        pink.setBackground = "pink";
        pink.textColor = "black";
        pink.text = "Awesome";

        System.out.println(pink.toString());

        PostIt yellow = new PostIt();
        yellow.setBackground = "yellow";
        yellow.textColor = "green";
        yellow.text = "Superb!";

        System.out.println(yellow.toString());
    }
}
