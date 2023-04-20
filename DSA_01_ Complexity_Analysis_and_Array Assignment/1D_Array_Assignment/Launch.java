/**
 * Ans_One
 */
public class Launch {

    /* Ques: 1 */
    static void getEventIndexValueSum(int arr[], int n) {
        /*
         * Time Complexity: O(n);
         * Space Complexity: O(1);
         */
        int sum = 0;
        for(int i=0; i<arr.length; i+=2) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    /* Ques: 2 */
    static void ans2(int arr[]) {
        for(int elm: arr) {
            if(elm%2==0) {
                System.out.print(elm+" ");
            }
        }
        System.out.println();
    }

    /* Ques: 3 */
    static void getMaxValue(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for(int num: arr) {
            if(num > max) {
                max = num;
            }
        }
        System.out.println("Max value: "+max);
    }

    /* Ques: 4 */
    static void getSecondLargestValue(int arr[], int n) {
        int maxVal = Integer.MIN_VALUE;
        for(int num: arr) {
            if(num > maxVal) {
                maxVal = num;
            }
        }
        int secMaxVal = Integer.MIN_VALUE;
        for(int num: arr) {
            if(num > secMaxVal && num != maxVal) {
                secMaxVal = num;
            }
        }
        System.out.println("Second Max Value: "+secMaxVal);
    }
    public static void main(String[] args) {

        /*
        * Q1: Write a program to print the sum of all the elements present on even indices in the given array.

        int arr[] = {4,3,6,7,1};
        int arr[] = {3,20,4,6,9};
        Launch.getEventIndexValueSum(arr, arr.length);

        */
      
        
        /*
        * Q2: Write a program to traverse over the elements of the array using for each loop and print all  even elements.

         int arr[] = {34,21,54,65,43};
         Launch.ans2(arr);
        
        */

        /* 
        * Q3: Write a program to calculate the maximum element in the array.

         int arr[] = {34,21,54,65,43};
         Launch.getMaxValue(arr,arr.length);

        */
      
        /*
         * Q4: Write a program to find out the second largest element in a given array.
         
         int arr[] = {34,21,54,65,43};
         int arr[] = {4,3,6,7,1};
         Launch.getSecondLargestValue(arr, arr.length);

        */
       
        /*
         * Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than its just left and just right neighbor.
         
         */
       

    }
}