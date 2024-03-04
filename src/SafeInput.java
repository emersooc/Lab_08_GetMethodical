import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; //sets length to zero

        do
        {
            System.out.print("\n" +prompt+ ":"); //prompt will output here
            retString = pipe.nextLine();
        }
        while(retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {

    }
}