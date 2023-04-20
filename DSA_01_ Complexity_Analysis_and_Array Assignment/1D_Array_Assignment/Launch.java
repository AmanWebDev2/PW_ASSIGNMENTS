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

    /*
     
     */

    static void ans2(int arr[]) {
        for(int elm: arr) {
            if(elm%2==0) {
                System.out.print(elm+" ");
            }
        }
        System.out.println();
     }
    public static void main(String[] args) {
        // int arr[] = {4,3,6,7,1};
        // int arr[] = {3,20,4,6,9};
        // Launch.getEventIndexValueSum(arr, arr.length);

        /*
         Q2: Write a program to traverse over the elements of the array using for each loop and print all even elements.
        */
        int arr[] = {34,21,54,65,43};
        Launch.ans2(arr);

    }
}