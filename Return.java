import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        greet();
        System.out.println("welcome to calculator\n");
        System.out.println("enter the first number");
        int n1 = sc.nextInt();
        System.out.println("enter second number");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println("sum of the numbers is:" + sum);



        
    }
    public static void greet(){
        System.out.println("welcome to calculator\n");
    }
    
}
