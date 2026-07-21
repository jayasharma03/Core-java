import java.util.Scanner;

public class Return1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = readNumber();
        int second = readNumber();
        
        int sum =  first + second;
        System.out.println("sum of the numbers is:" + sum);
        
    }
    
     public static int readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number =  sc.nextInt();
        return number;


     }
}
