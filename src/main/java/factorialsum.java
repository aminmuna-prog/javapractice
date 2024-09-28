import java.util.Scanner;

public class factorialsum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number you want factorial: ");
        int fact = input.nextInt();
        int result = 1;
        for(int i = 1; i <= fact; i ++){
            result *=i;
        }
        System.out.println(result);


    }
}
