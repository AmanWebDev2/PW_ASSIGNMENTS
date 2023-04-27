package DSA_02_Searching_sorting_and_bit_manipulation.Assignment_02_Sorting_Array;

import java.util.Arrays;

/*
 * Q1. Write a program to sort an array in descending order using bubble sort.
    Input Array {3,5,1,6,0}
 */
public class Sort {
    public static void main(String[] args) {
        int arr[] =  {3,5,1,6,0};

        /* One */
        // AnsOne(arr);
        // System.out.println(Arrays.toString(arr));
        
        /* Two */
        // AnsTwo(arr);
        // System.out.println(Arrays.toString(arr));

        /* Three */
        AnsThree(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void AnsOne(int arr[]) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] > arr[j-1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }

    static void AnsTwo(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[min_index]) {
                    min_index = j;
                }
            }
            if(min_index!=i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
    }

    static void AnsThree(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j >0 && arr[j] > arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
