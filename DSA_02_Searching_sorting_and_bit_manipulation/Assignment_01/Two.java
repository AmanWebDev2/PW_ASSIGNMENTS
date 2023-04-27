package DSA_02_Searching_sorting_and_bit_manipulation.Assignment_01;

/*
    * Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
    not present return -1.
    Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
    Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
 */
public class Two {

    static int lastOccurrence(int arr[],int target) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target < arr[mid]) {
                end = mid-1;
            }else if(target > arr[mid]) {
                start = mid+1;
            }else {
                result = mid;
                start = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // int []arr = {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
        // int target = 4;
        int arr[] = {2, 2, 2, 6, 6, 18, 29, 30, 30, 30};
        int target = 15;
        System.out.println(lastOccurrence(arr, target));
    }
}
