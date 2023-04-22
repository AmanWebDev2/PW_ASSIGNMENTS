import java.util.Scanner;

public class Answer_Four {

    public static int[][] create2DArray() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();
            int[][] array = new int[rows][cols];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            return array;
        }
    }    
    public static void main(String[] args) {
        int arr[][] = create2DArray();
        int largestValue = Integer.MIN_VALUE;

        for(int a[]: arr) {
            for(int elem: a) {
                if(elem > largestValue) {
                    largestValue = elem;
                }
            }
        }
        System.out.println("largest value: "+largestValue);
    }
}
