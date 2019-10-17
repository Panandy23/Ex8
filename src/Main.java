import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int i;
        int n =5;
        double liczba_wylosowana = 0;
        double sum = 0;
        double min;
        double max;



        Random random = new Random();
        min = Math.round(100*(random.nextDouble()));
        max = min;
               

        for (i = 0; i < n; i++) {

            liczba_wylosowana = Math.round(100 * (random.nextDouble()));

            System.out.print(liczba_wylosowana + ", ");

            if (max < liczba_wylosowana) {max = liczba_wylosowana;}

            if (liczba_wylosowana < min) {min = liczba_wylosowana;}

            sum = sum + liczba_wylosowana;

        }
        System.out.println();
        System.out.println("Max to: " + max);
        System.out.println("Min to: " + min);
        System.out.println("Srednia to: " + sum/n);


    }
}
