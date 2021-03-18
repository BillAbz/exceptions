package exceptions;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("add a number:");
            int num = Integer.parseInt(keyboard.next());
            System.out.println("add another number:");
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d=%d",num, den,div);
            System.out.println(" ");
            keyboard.close();
//        } catch (NumberFormatException nfe){     // OPDRACHT 2
//
//            System.out.println("Invalid number");


//        } catch (ArithmeticException ae){        // OPDRACHT 3
//            System.out.println("Division by 0");


        } catch (NumberFormatException | ArithmeticException t){   // OPDRACHT 4
            System.out.println("Invalid number or Division by 0");


        } finally {   // OPDRACHT 5
            System.out.println("The end");
        }


    }


}
