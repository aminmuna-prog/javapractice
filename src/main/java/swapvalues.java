public class swapvalues {
    public static void main(String[] args) {
        swaptwoValues(10, 20);

    }
    static void swaptwoValues(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a is " + a + " and value of b is " + b);
    }
}
