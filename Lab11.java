import java.util.Scanner;
public class Lab11
{
    public static double task(double a, double b)
    {
        return (a/(Math.pow(b,2)-2))+(b/(Math.pow(a,2)+2))+Math.pow(a*b,3);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("1. Input real numbers:");
        System.out.print("a: ");
        double a1 = in.nextDouble();
        System.out.print("b: ");
        double b1 = in.nextDouble();
        System.out.println("Real result: " + task(a1, b1));

        System.out.println("2. Input whole numbers:");
        System.out.print("a: ");
        int a2 = in.nextInt();
        System.out.print("b: ");
        int b2 = in.nextInt();
        System.out.println("Real result: " + task(a2, b2));

        System.out.println("3. Input real numbers:");
        System.out.print("a: ");
        double a3 = in.nextDouble();
        System.out.print("b: ");
        double b3 = in.nextDouble();
        System.out.println("Whole result: " + Math.round(task(a3, b3)));
        in.close();
    }
}