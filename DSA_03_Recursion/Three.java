public class Three {
    static int findMax(int arr[], int n) {
        if(n==1) return arr[0];
        return Math.max(arr[n-1],findMax(arr, n-1));
    }
    public static void main(String[] args) {
        int arr[] = {13,1,-3,22,5};
        int n = arr.length;
        System.out.println(findMax(arr, n));
    }
}
