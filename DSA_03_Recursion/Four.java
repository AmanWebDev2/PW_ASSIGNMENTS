public class Four {
    static int findSum(int arr[], int n) {
        int sum = 0;
        if(n == 1) return arr[0];
        sum  = arr[n-1] + findSum(arr, n-1);
        return sum;        
    }
    public static void main(String[] args) {
        int arr[] = {92,23,15,-20,10};
        System.out.println(findSum(arr, arr.length));   
    }
}
