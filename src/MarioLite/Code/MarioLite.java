package MarioLite.Code;

import java.util.Scanner;

public class MarioLite
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number_tests = scanner.nextInt();

        for (int i = 0; i < number_tests; i++)
        {
            int number = scanner.nextInt();
            marioLite(number);
        }
    }

    public static void marioLite(int number)
    {
        //TODO
    }
}