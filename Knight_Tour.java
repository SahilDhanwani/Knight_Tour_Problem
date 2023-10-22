import java.util.*;

public class Knight_Tour {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the size of chess board : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n < 5) {
            System.out.println("Answer not Possible");
            sc.close();
            return;
        }
        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = -1;
            }
        }

        System.out.print("Enter the first position of Knight : ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (method(a, b, arr, n, 1) == 1)
            print_arr(arr, n);
        else
            System.out.println("Answer Not Possible");
        sc.close();
    }

    static int method(int a, int b, int[][] arr, int n, int move) {

        if (a >= n || b >= n || a < 0 || b < 0)
            return 0;

        if (arr[a][b] == -1) {

            // print_arr(arr, n);

            if (move == n * n) {
                arr[a][b] = move;
                return 1;
            }
            arr[a][b] = move;

            if (method(a + 1, b + 2, arr, n, move + 1) == 1)
                return 1;
            if (method(a - 1, b + 2, arr, n, move + 1) == 1)
                return 1;
            if (method(a - 2, b + 1, arr, n, move + 1) == 1)
                return 1;
            if (method(a - 2, b - 1, arr, n, move + 1) == 1)
                return 1;
            if (method(a + 1, b - 2, arr, n, move + 1) == 1)
                return 1;
            if (method(a - 1, b - 2, arr, n, move + 1) == 1)
                return 1;
            if (method(a + 2, b + 1, arr, n, move + 1) == 1)
                return 1;
            if (method(a + 2, b - 1, arr, n, move + 1) == 1)
                return 1;

            arr[a][b] = -1;
        }

        return 0;
    }

    static void print_arr(int[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
