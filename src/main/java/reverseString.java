public class reverseString {
    public static void main(String[] args) {
        String str ="ABCD";
        String rev = "";
        int stringLength = str.length();
        for(int i = stringLength-1; i>=0; i--){
            rev =rev+str.charAt(i);

        }
        System.out.println(rev);
    }
}
