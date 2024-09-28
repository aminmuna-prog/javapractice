import java.util.Scanner;

public class printreversenum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int reverseNum = input.nextInt();
        System.out.println("Enter the number you want to stop: ");
        int endNum = input.nextInt();
        while(reverseNum >= endNum){
            System.out.println(reverseNum);
            reverseNum --;
        }
    }
}
