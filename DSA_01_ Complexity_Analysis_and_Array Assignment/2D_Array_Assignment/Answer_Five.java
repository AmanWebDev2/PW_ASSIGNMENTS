import java.util.Scanner;

public class Answer_Five {
    public static int[][] create2DArray() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows or columns of a square matrix(odd): ");
            int m = scanner.nextInt();
            int[][] array = new int[m][m];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            return array;
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = create2DArray();
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(i == m/2 || j==m/2) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
}
