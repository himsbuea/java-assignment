import java.util.Scanner;

public class Calc{

    public static int sum(int x, int y){
        return x + y;
    }
    
    public static float sum(float x, float y){
        return x + y;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = 0, num2 = 0;
        String op = "+";
        System.out.print("Calc: ");
        num1 = scanner.nextFloat();
        op = scanner.next();
        num2 = scanner.nextFloat();
        
        if (op.contains("+")) {
            System.out.print("\n" + num1 + " + " + num2 + " = " + sum(num1, num2));
        }

        if (op.contains("-")) {
            System.out.print("\n" + num1 + " + " + num2 + " = " + ( num1 - num2 ));
        }


        

        scanner.close();

    }



}