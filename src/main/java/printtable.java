import java.util.Scanner;

public class printtable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want table: ");
        int tableNum = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(tableNum + " X " + i + " = "+  (tableNum*i));
        }
    }
}
