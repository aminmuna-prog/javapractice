public class factorialNum {
    public static void main(String[] args) {
       int total = factorial(6);
        System.out.println(total);

    }
    static int factorial(int m){
        int result = 1;
        for(int i = 2; i <=m; i++)
            result *=i;
            return result;

    }
}
