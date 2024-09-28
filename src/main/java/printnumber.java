import java.util.Scanner;

public class printnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enther the starting number: ");
        int startNumber = input.nextInt();
        System.out.println("Enter the ending number: ");
        int endingNumber = input.nextInt();
        while(startNumber <= endingNumber)
    {
            System.out.println(startNumber);
            startNumber++;
        }
    }
}
