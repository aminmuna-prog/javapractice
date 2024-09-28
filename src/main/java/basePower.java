import java.util.Scanner;

//Write a program to find the value of one number raised to the power of another
public class basePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base number: ");
        int base = input.nextInt();
        System.out.println("Enter power number: ");
        int power = input.nextInt();
        int result = 1;
        for(int i = 1; i<=power; i++){
            result *= base;
        }
        System.out.println(result);


    }
}
