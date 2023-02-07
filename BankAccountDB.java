import java.util.HashMap;
import java.util.Scanner;

public class BankAccountDB {
private static HashMap<String, Double> accounts = new HashMap<>();

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

while (true) {
System.out.println("Welcome.");
System.out.println("Please choose an option: [n]ew account, [d]isplay balance, [q]uit:");
String option = input.nextLine();

if (option.equals("n")) {
    System.out.println("Enter a name and a starting balance, separated by a space");
    String nameAndBalance = input.nextLine();
    String[] nameAndBalanceArray = nameAndBalance.split(" ");
    String name = nameAndBalanceArray[0];
    double balance = Double.parseDouble(nameAndBalanceArray[1]);
    accounts.put(name, balance);
    System.out.println("New account created for " + name + " with starting balance of $" + balance + ".");
    } 

else if (option.equals("d")) {
    System.out.println("Please enter the name to see the balance:");

    String name = input.nextLine();
    double balance = accounts.get(name);
    System.out.println("Balance for " + name + " is $" + balance + ".");
   
    }

else if (option.equals("q")) {
    System.out.println("Thank you for using Alec's Banking Service.");
    break;
    }

else {
    System.out.println("Invalid option! Select again.");
    }
    }
    input.close();
    }
}