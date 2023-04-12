import java.util.Locale;
import java.util.Scanner;

public class EX04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int number;
        int hours;
        double salary;
        double salh;

        number = scanner.nextInt();
        hours = scanner.nextInt();
        salh = scanner.nextDouble();

        salary = hours * salh;

        System.out.println("Number = " +number);
        System.out.printf("SALARY = U$ %.2f%n", salary);


        scanner.close();



    }
}
