package DSA_02_Searching_sorting_and_bit_manipulation.Assignment_01;

/*
 Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element is not found in the array, report that as well.
 */
public class Four {
    public static void main(String[] args) {
        int nums[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        int firstOcc = findOccurence(nums, target, true);
        if(firstOcc != -1) {
            int lastOcc = findOccurence(nums, target, false);
            System.out.println("Target "+target+" occurs "+(lastOcc-firstOcc+1));
        }else {
            System.out.println("Target "+target+" occurs 0 times");
        }
  
    }

    static int findOccurence(int arr[],int target, boolean firstOcc) {
        int start = 0;
        int end = arr.length-1;
        int occ = -1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target < arr[mid]) {
                end = mid-1;
            }else if(target > arr[mid]) {
                start = mid+1;
            }else {
                occ = mid;
                if(firstOcc) {
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return occ;

    }
}
