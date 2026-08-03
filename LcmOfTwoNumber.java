import java.util.Scanner;

public class LcmOfTwoNumber {
    static int gcd(int a , int b){
        while(b !=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int lcm(int a ,int b){
        return(a*b)/gcd(a,b);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();

        int result = lcm(num1, num2);

        System.out.println("lcm=" + lcm(num1,num2));

    }
}
