import java.util.HashMap;
import java.util.Scanner;

public class backup {
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


}

if (option.equals("n")) {
    System.out.println("Please enter the name to see the balance:");
    String nameAndBalance = input.nextLine();
    String[] nameAndBalanceArray = nameAndBalance.split(" ");
    
    
    }
    
    
if (option.equals("d")) {
    System.out.println("Thank you.");
    String nameAndBalance = input.nextLine();
    String[] nameAndBalanceArray = nameAndBalance.split(" ");
    
    
    }









}