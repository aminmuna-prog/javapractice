//7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = in.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(num1 + " X " + i + " = " + num1*i);
        }

    }
}
