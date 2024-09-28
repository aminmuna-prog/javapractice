import java.util.Scanner;

//write a program to reverse the given Digits
public class reverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you want to reverse: " );
        int num = input.nextInt();
        int rev = 0;

        while (num != 0){
            rev = rev*10 + num%10;
            num /=10;
        }
        System.out.println(rev);
    }
}
