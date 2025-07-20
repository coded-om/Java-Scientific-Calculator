import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number one: ");
        double number =  sc.nextDouble();
        System.out.println("square root is "+Math.sqrt(number));
        System.out.println("raised to the power "+Math.pow(number,3));
        System.out.println("trigonometric sine "+ Math.sin(Math.toRadians(number)));
        System.out.println("trigonometric cosine "+ Math.cos(Math.toRadians(number)));
        System.out.println("trigonometric cosine "+ Math.tan(Math.toRadians(number)));
        System.out.println("radians " + Math.toRadians(number));
        System.out.println("Dgree " + Math.toDegrees(number));
        System.out.println("Log   " + Math.log(number));
        System.out.println("Log 10  " + Math.log10(number));
        System.out.println("absloot  " + Math.abs(number));
        System.out.println("round  " + Math.round(number));
        System.out.println("ceil  " + Math.ceil(number));
        System.out.println("floor  " + Math.floor(number));
        System.out.print("Enter the number two: ");
        double number2 =  sc.nextDouble();
        System.out.println("min " + Math.min(number,number2));
        System.out.println("max " + Math.max(number,number2));





    }
}
