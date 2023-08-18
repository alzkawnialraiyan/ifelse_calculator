import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //simple calculator using if-else
        System.out.println("Enter two numbers");
        System.out.println("Firs number:");
        double x = read.nextDouble();
        System.out.println("Second number:");
        double y = read.nextDouble();
        System.out.println("Choose operation from + , - , * , /");
        String operation = read.next();

        if (operation .equals("+")){
            System.out.println(x + y);
        }else if (operation .equals("-")){
            System.out.println(x-y);
        }else if (operation .equals("*")){
            System.out.println(x*y);
        } else if (operation .equals("/")) {
            System.out.println(x/y);
        }
    }
}