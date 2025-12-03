import java.util.Scanner;
public class Lab12
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input array size n (<=200): ");
        int n = in.nextInt();
        if (n <= 0 || n > 200)
        {
            System.out.println("Array size incorrect.");
            in.close();
            return;
        }
        int[]A = new int[n];
        System.out.println("Input array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        System.out.print("Input array shift value k: ");
        int k = in.nextInt();
        k = k % n;
        if (k < 0) k += n;
        int[]B = new int[n];
        for (int i = 0; i < n; i++)
        {
            B[(i + k) % n] = A[i];
        }
        System.out.println("Final array:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(B[i] + " ");
        }
        in.close();
    }
}