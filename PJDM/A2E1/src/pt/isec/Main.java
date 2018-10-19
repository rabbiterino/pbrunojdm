package pt.isec;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int v;

        do
        {
            System.out.print("Value: ");

            if (scanner.hasNextInt())
            {
                v = scanner.nextInt();

                if (v > 0)
                {
                    sum += v;
                    n++;
                }
            }
            else
            {
                v = 0;
            }
        } while (v > 0);

        if (n > 0)
        {
            System.out.println("\nSum: " + sum);
            System.out.println("Avg: " + (double)sum/(double)n);
        }

        scanner.close();
    }
}
