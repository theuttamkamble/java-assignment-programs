public class NumberIsPalimdromeOrNot {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int temp = num;
        
        while(num != 0) {
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        } 
System.out.println(rev);
        if(temp == rev) {
            System.out.println("number is palindrome.");
        } else {
            System.out.println("number is not palindrome");
        }
    }
}
