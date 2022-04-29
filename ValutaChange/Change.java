import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How much would you like to convert? (In DK) ");
            int userInput = scanner.nextInt();

            System.out.println("What currency would you like to convert into?");
            System.out.println("1. Euroes");
            System.out.println("2. Dollars");
            int userChoice = scanner.nextInt();

            switch (userChoice){
                case 1:
                    System.out.println(Valuta.toEuroes(userInput)+" Euroes");
                    break;
                case 2:
                    System.out.println(Valuta.toDollars(userInput)+" Dollars");
                    break;
            }
        }
        catch (Exception e){
            System.out.println("Error Invalid Input");
        }
    }
}
