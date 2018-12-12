package FooBarQix;

public class Main {
    public static void main(String[] args) {
    fooBarQix(13);
    }

    public static String fooBarQix(int num) {
        String message = "";
        if (num % 3 == 0) {
            message +="foo";
        }
        if (Integer.toString(num).contains("3")){
            message +="foo";
        }
        if (num % 5 == 0) {
            message +="bar";
        }
        if (num % 7 == 0) {
            message +="qix";
        }
        if(num % 3 != 0 && num % 5 != 0 && num % 7 != 0){
            return Integer.toString(num);
        }
          return message;
    }
}
