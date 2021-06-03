import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        System.out.print("Enter username: ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();

        sc.close();
        
        System.out.println("Hello, " + userName);
    }
}
