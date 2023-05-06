public class Two {
    static int findAlternateSignSum(int n) {
        if(n==1) return 1;
        if(n%2==0) return findAlternateSignSum(n-1)-n;
        return findAlternateSignSum(n-1)+n;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(findAlternateSignSum(n));
    }
}
