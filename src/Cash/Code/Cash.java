package Cash.Code;

import java.util.Scanner;

public class Cash
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number_tests = scanner.nextInt();

        for (int i = 0; i < number_tests; i++)
        {
            int number = scanner.nextInt();
            greedyAlgorithm(number);
        }
    }

    public static void greedyAlgorithm(int cents)
    {

        // Calculate the number of quarters to give the customer
        int quarters = calculate_quarters(cents);
        cents = cents - quarters * 25;

        // Calculate the number of dimes to give the customer
        int dimes = calculate_dimes(cents);
        cents = cents - dimes * 10;

        // Calculate the number of nickels to give the customer
        int nickels = calculate_nickels(cents);
        cents = cents - nickels * 5;

        // Calculate the number of pennies to give the customer
        int pennies = calculate_pennies(cents);
        cents = cents - pennies * 1;

        // Sum coins
        int coins = quarters + dimes + nickels + pennies;

        // Print total number of coins to give the customer
        System.out.println(coins);

    }

    static int calculate_quarters(int cents)
    {
        // TODO
        return 0;
    }

    static int calculate_dimes(int cents)
    {
        // TODO
        return 0;
    }

    static int calculate_nickels(int cents)
    {
        // TODO
        return 0;
    }

    static int calculate_pennies(int cents)
    {
        // TODO
        return 0;
    }
}
