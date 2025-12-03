import java.util.Scanner;
public class Lab13
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input matrix A size n (<=20): ");
        int n = in.nextInt();
        if (n <= 0 || n > 20)
        {
            System.out.println("Matrix size incorrect.");
            in.close();
            return;
        }
        int[][] A = new int[n][n];
        System.out.println("Input matrix A elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
            {
                A[i][j] = in.nextInt();
            }
        }
        int Column = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++)
        {
            int sum = 0;
            for (int i = 0; i < n; i++)
            {
                sum += Math.abs(A[i][j]);
            }
            if (sum > maxSum)
            {
                maxSum = sum;
                Column = j;
            }
        }

        int minVal = A[0][Column];
        for (int i = 1; i < n; i++)
        {
            if (A[i][Column] < minVal)
            {
                minVal = A[i][Column];
            }
        }
        System.out.println("Column with the biggest sum of modules: " + (Column + 1));
        System.out.println("Minimal element in that column: " + minVal);
        in.close();
    }
}