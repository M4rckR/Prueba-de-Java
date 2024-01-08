package Mario.Code;

import java.util.Scanner;

public class Mario
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number_tests = scanner.nextInt();

        for (int i = 0; i < number_tests; i++)
        {
            int number = scanner.nextInt();
            mario(number);
        }
    }

    public static void mario(int number)
    {
        //TODO
    }
}