import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        String org_string = str;
        String rev = "";
        int strLen = str.length();
        for(int i = strLen-1; i>=0; i --){
            rev += str.charAt(i);
        }
        System.out.println("your reverse string: " + rev);
        if (org_string.equals(rev)){
            System.out.println(str + " is palindrome");
        }
        else{
            System.out.println(str + " is not palindrome");
        }
    }
}
