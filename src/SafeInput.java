import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; //sets to empty string

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
        boolean done = false; //boolean to control while loop
        int retInt = 0; //sets to zero

        do
        {
            System.out.print("\n" +prompt+ ":"); //prompt here

            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                done = true;
            }
        }
        while(!done);

        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false; //boolean to control while loop
        int retDouble = 0; //sets to zero

        do
        {
            System.out.print("\n" +prompt+ ":"); //prompt here

            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextInt();
                done = true;
            }
        }
        while(!done);

        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false; //boolean to control while loop
        int retRangedInt = 0; //sets to zero

        do
        {
            System.out.print("\n" +prompt+ ":"); //prompt here

            if (pipe.hasNextInt())
            {
                retRangedInt = pipe.nextInt();

                if (retRangedInt >= low && retRangedInt <= high)
                {
                    done = true;
                }
            }
        }
        while(!done);

        return retRangedInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false; //boolean to control while loop
        int retRangedDouble = 0; //sets to zero

        do
        {
            System.out.print("\n" +prompt+ ":"); //prompt here

            if (pipe.hasNextInt())
            {
                retRangedDouble = pipe.nextInt();

                if (retRangedDouble >= low && retRangedDouble <= high)
                {
                    done = true;
                }
            }
        }
        while(!done);

        return retRangedDouble;
    }
}