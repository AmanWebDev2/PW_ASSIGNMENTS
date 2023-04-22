import java.util.Arrays;
import java.util.Scanner;

public class Answer_One {

    void display(int arr[][]) {
        for(var num: arr) {
            System.out.println(Arrays.toString(num));
        }
    }
  
    static void ans(int arr[][], int m, int n) {
        // 1. number of positive numbers
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;
        int numbersOfZeroes = 0;
         for (int a[] : arr) {
                for(int elem: a) {
                    if(elem >0 ) {
                        positiveNumbers+=1;
                    }
                    if(elem < 0) {
                        negativeNumbers+=1;
                    }
                    if(elem%2==0) {
                        evenNumbers+=1;
                    }else{
                        oddNumbers+=1;
                    }
                    if(elem == 0) {
                        numbersOfZeroes+=1;
                    }
                }
         }
         System.out.println("number of positive numbers: "+positiveNumbers);
         System.out.println("number of negative numbers: "+negativeNumbers);
         System.out.println("number of odd numbers: "+oddNumbers);
         System.out.println("number of even numbers: "+evenNumbers);
         System.out.println("number of 0: "+numbersOfZeroes);
    }
   
    public static void main(String[] args) {
        int m, n;
        try (
            Scanner scan = new Scanner(System.in);
        ) {
            System.out.println("Enter number of rows: ");
            m = scan.nextInt();
            System.out.println("Enter number of columns: ");
            n = scan.nextInt();
            int arr[][] = new int[m][n];

            //input
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

        ans(arr, m, n);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }    
}
