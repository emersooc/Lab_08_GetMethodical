import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double itemCost;
        double totalCost = 0;
        boolean answer;

        do
        {
            itemCost = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);

            answer = SafeInput.getYNConfirm(in, "Do you have another item[Y/N]");

            totalCost = itemCost + totalCost;
        }
        while(answer);

        System.out.printf("Your total is $%.2f", totalCost);
    }
}
