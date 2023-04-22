import java.util.Scanner;

public class Answer_Two {
    static void printElementAboveSecondaryDiagonal(int arr[][], int n) {
        System.out.println("elements are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j <= n/2) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter square matrix row or column:");
        try (
            Scanner scan =new Scanner(System.in);
        ) {
            n = scan.nextInt();
            int arr[][] = new int [n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scan.nextInt();
                }
            };

            printElementAboveSecondaryDiagonal(arr,n);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
