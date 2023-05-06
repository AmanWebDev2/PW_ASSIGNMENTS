import java.util.Scanner;

public class Five {
    static int armstrong(int n,int digit) {
        if(n==0) return 0;
        int result = 0;
        int lastDigit = n%10;
        n = n/10;
        result = armstrong(n, digit) + (int)Math.pow(lastDigit, digit);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int digits = (int)(Math.log(n)/Math.log(10)) +1;
        int result = armstrong(n, digits);
        if(result == n) {
            System.out.println("Armstrong");
        }else {
            System.out.println("Not an armstrong");
        }   
    }
}
