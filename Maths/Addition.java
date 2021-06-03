import java.util.Scanner;

public class Addition{

    public static int sum(int x, int y){
        return x + y;
    }
    
    public static float sum(float x, float y){
        return x + y;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1, num2;
        
        System.out.print("Enter first number: ");
        num1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        num2 = scanner.nextFloat();

        System.out.print("\n" + num1 + " + " + num2 + " = " + sum((int) num1, (int) num2));

        scanner.close();

    }



}