import java.util.Scanner;

public class counNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int number = input.nextInt();
        int count = 0;
        while (number>0){
            number = number/10;
            count ++;
        }
        System.out.println(count);
    }
}
