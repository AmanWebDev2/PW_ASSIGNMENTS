package DSA_02_Searching_sorting_and_bit_manipulation.Assignment_01;

import java.util.Scanner;

/**
 * One
    * Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
    else print “Element not found in array”. Input the size of array, array from user and the element X from user.
    Use Linear Search to find the element.
 */
public class One {

    static void start() {
        int size;
        int X;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number of element you want to add: ");
            size = scan.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter the element of the array");
            for (int i = 0; i < size; i++) {
                arr[i]=scan.nextInt();
            }
            System.out.println("Enter element to be searched in an array: ");
            X = scan.nextInt();
            searchElement(arr,X);
        }
    }

    static void  searchElement(int arr[],int X) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == X) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            System.out.println("Element found at index: "+index);
        }else {
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        start();
    }
}