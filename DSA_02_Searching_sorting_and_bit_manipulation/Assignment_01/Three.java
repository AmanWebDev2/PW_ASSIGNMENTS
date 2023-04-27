package DSA_02_Searching_sorting_and_bit_manipulation.Assignment_01;

/*
 * Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
 */
public class Three {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0 ,0 ,1, 1, 1,1, 1, 1};  
        // int arr[] = {0, 0, 0 ,0 ,0 ,1, 1};
        // int arr[] = {0,0,0,0,0};
        System.out.println(countOnes(arr));
    }

    static int countOnes(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        int count = 0;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid] == 1) {
                count+= (end - mid+1);
                end = mid-1;
            }else if(arr[mid] == 0) {
                start = mid+1;
            }
        }
        return count;
    }
}
