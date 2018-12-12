import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int [] arrayBook = {1, 2, 3};
        priceCalculator(arrayBook);
    }

    public static double priceCalculator(int [] books){
        double price = 0;
        double currentPrice = 0;
        int counter = 0;
        int max = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i] > max)
                max = books[i];
        }
        while(max > 0){
            for (int i = 0; i <books.length ; i++) {
                if (counter == 0 && books[i] != 0){
                    currentPrice += 8;
                    counter++;
                    books[i]--;
                }
                else if(books[i] != 0){
                    currentPrice += 8;
                    counter++;
                    books[i]--;
                }
            }
            max--;
            if (counter == 2 || counter == 3){
                price = price + currentPrice - (currentPrice * (counter * 0.05 -0.05));
            }
            else if(counter == 4 || counter == 5){
                price = price + currentPrice - (currentPrice * (counter * 0.05));
            } else {
                price = price + currentPrice;
            }
            counter = 0;
            currentPrice = 0;
        }
        return price - (price * (counter * 0.05));
        }

}
