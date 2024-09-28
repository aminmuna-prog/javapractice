import java.util.Scanner;

public class reversetable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number you want table: ");
        int revTable = input.nextInt();
        for(int i = 10; i >= 1; i--){
            System.out.println( revTable + " X " + i + " = " + (revTable*i));
        }
    }
}
