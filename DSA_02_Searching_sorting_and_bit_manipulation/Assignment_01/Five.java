package DSA_02_Searching_sorting_and_bit_manipulation.Assignment_01;
/*
 Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
    A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer
    with itself.
 */
public class Five {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        while(start<=end) {
            int mid = start+(end-start)/2;
            int val = mid*mid;
            if(val == num) {
                return true;
            }else if(val < num) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return false;
    }
}
