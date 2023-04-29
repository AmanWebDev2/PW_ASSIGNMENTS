package DSA_02_Searching_sorting_and_bit_manipulation.Assignment_03_Number_system;
/*
 * Q3. Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.
    Input 8, Even
    3, False
 */
public class Ans3 {
    public static void main(String[] args) {
        int n = 143;
        if(isOdd(n)) {
            System.out.println("Odd");
        }else {
            System.out.println("Even");
        }
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
