import java.util.Scanner;

// a command-line scientific calculator in a single Java class.
public class ScientificCalculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenue();
    }

    public static void displayMenue(){
        boolean condition = true;
        while (condition) {
            System.out.print(
                    """
                            \n###Calc Sysytem###
                            chose type of operation:
                            1.baseic operations
                            2.scientific operations
                            0.to Exit the program :)
                            Enter the number : 
                            """
            );
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.flush();
                basicArithmetic();
            }else if(choice == 2){
                System.out.flush();
                scientificOperations();
            } else if (choice == 0) {
                System.out.flush();
                System.out.println("Bye!");
                System.exit(0);
            }
        }
    }

    public static void basicArithmetic() {
        boolean condition = true;

        while (condition) {
            System.out.println("""
                \nBasic Arithmetic Calculator:
                1. Add (+)
                2. Subtract (-)
                3. Multiply (*)
                4. Divide (/)
                0. Back to Menu
                """);

            System.out.print("Choose an operation: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
                double result = num1 + num2;
                System.out.printf("Result: %.3f + %.3f = %.3f\n", num1, num2, result);
            } else if (choice == 2) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
                double result = num1 - num2;
                System.out.printf("Result: %.3f - %.3f = %.3f\n", num1, num2, result);
            } else if (choice == 3) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
                double result = num1 * num2;
                System.out.printf("Result: %.3f * %.3f = %.3f\n", num1, num2, result);
            } else if (choice == 4) {
                System.out.print("Enter numerator: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter denominator: ");
                double num2 = sc.nextDouble();
                if (num2 != 0) {
                    double result = num1 / num2;
                    System.out.printf("Result: %.3f / %.3f = %.3f\n", num1, num2, result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            } else if (choice == 0) {
                System.out.println("Returning to main menu");
                condition = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static void scientificOperations() {
        Scanner sc = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            System.out.println("""
                \nScientific Operations:
                1. Power (x^y)
                2. Sine (sin(x))
                3. Cosine (cos(x))
                4. Tangent (tan(x))
                5. Natural Logarithm (ln x)
                6. Logarithm Base 10 (log10 x)
                7. Absolute Value
                8. Round (to nearest long)
                9. Ceiling (round up)
                10. Floor (round down)
                11. Minimum of two numbers
                12. Maximum of two numbers
                0. Back to Menu
                """);

            System.out.print("Choose an operation: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter base number: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                }
                case 2 -> {
                    System.out.print("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
                    System.out.println("Sine: " + Math.sin(Math.toRadians(angle)));
                }
                case 3 -> {
                    System.out.print("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
                    System.out.println("Cosine: " + Math.cos(Math.toRadians(angle)));
                }
                case 4 -> {
                    System.out.print("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
                    System.out.println("Tangent: " + Math.tan(Math.toRadians(angle)));
                }
                case 5 -> {
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    if (num > 0)
                        System.out.println("Natural Logarithm: " + Math.log(num));
                    else
                        System.out.println("Error: ln(x) is undefined for x <= 0.");
                }
                case 6 -> {
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    if (num > 0)
                        System.out.println("Log base 10: " + Math.log10(num));
                    else
                        System.out.println("Error: log10(x) is undefined for x <= 0.");
                }
                case 7 -> {
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    System.out.println("Absolute Value: " + Math.abs(num));
                }
                case 8 -> {
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    System.out.println("Rounded: " + Math.round(num));
                }
                case 9 -> {
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    System.out.println("Ceiling: " + Math.ceil(num));
                }
                case 10 -> {
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    System.out.println("Floor: " + Math.floor(num));
                }
                case 11 -> {
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Minimum: " + Math.min(num1, num2));
                }
                case 12 -> {
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Maximum: " + Math.max(num1, num2));
                }
                case 0 -> {
                    condition = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
