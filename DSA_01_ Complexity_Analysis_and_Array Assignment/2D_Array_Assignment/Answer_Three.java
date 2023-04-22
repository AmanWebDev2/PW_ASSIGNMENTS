import java.util.Scanner;

public class Answer_Three {
    static int[][] createSquareMatrix() {
        try (
            Scanner scan = new Scanner(System.in);
        ) {
            System.out.print("Enter number of rows or column of a square matrix: ");
            int n = scan.nextInt();
            int arr[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }
            return arr;
        }
    }
    public static void main(String[] args) {
        int arr[][] = createSquareMatrix();
        int n = arr.length;
        System.out.println("both diagonals: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j || i+j==n-1) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
