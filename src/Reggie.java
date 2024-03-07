import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String sSN;
        String mNum;
        String menu;

        sSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");

        System.out.println("Your SSN is " +sSN);

        mNum = SafeInput.getRegExString(in, "Enter your M-Number", "^(M|m)\\d{8}$");

        System.out.println("Your M-Number is " +mNum);

        menu = SafeInput.getRegExString(in, "Choose a menu option", "^[Open|Save|View|Quit]$");

        System.out.println("You chose " +menu);
    }
}
