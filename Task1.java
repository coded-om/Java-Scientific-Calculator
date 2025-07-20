import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Task 1
        Scanner sc = new Scanner(System.in);
        int number;float number_flat;String word;String line;
        System.out.print("Enter number: ");
        number = sc.nextInt();
        System.out.print("Enter number_flat: ");
        number_flat = sc.nextFloat();
        System.out.print("Enter word: ");
        word = sc.next();
        System.out.println("Enter line: ");
        line = sc.nextLine();
        line = sc.nextLine();
        System.out.println(" All the value is :");
        System.out.println("numbr is --> "+ number + "\n the flat is ---> " + number_flat + "\nthe word is --->" + word + "\n the line is ---->" + line);
        
    }}
