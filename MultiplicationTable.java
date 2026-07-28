import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        printMultiplicationTable(num);

    }

    public static void printMultiplicationTable(int num){
        int i = 1;
        while(i <= 10){
            System.out.println(num + "x" + i + "=" + (num * i));
        }
    }
}
        
