public class exercise13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int actualTime = currentHours * 3600 + currentMinutes * 60 + currentSeconds;
        int fullTime = 24 * 3600;
        int remainingTime = fullTime - actualTime;
        System.out.println(remainingTime);
    }
}
