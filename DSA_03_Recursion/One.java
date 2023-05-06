/**
 * Answers
 */
public class One {

    static int sumDigit(int n) {
        int sum = 0;
        int lastDigit = n%10;
        if(n==0) return sum;
        n = n/10;
        sum = lastDigit + sumDigit(n);
        return sum;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumDigit(n));
    }
}