import java.util.Scanner;

public class palinDromeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int numb = input.nextInt();
        int org_num = numb;
        int rev = 0;
        while (numb!=0){
            rev = rev*10 + numb%10;
            numb /=10;
        }
        System.out.println("Reverse number is: " + rev);
        if(org_num == rev){
            System.out.println(org_num  +  " is palindrome number");
        }
        else{
            System.out.println(org_num  + " is not palindrome number");
        }
    }
}
