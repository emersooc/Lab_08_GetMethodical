import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; //sets to empty string

        do
        {
            System.out.print("\n" +prompt+ ": "); //prompt will output here
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
            System.out.print("\n" +prompt+ ": "); //prompt here

            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                done = true;
            }
            else
            {
                pipe.next();
            }
        }
        while(!done);

        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false; //boolean to control while loop
        double retDouble = 0; //sets to zero

        do
        {
            System.out.print("\n" +prompt+ ": "); //prompt here

            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                done = true;
            }
            else
            {
                pipe.next();
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
            System.out.print("\n" +prompt+ ": "); //prompt here

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
        double retRangedDouble = 0; //sets to zero

        do
        {
            System.out.print("\n" +prompt+ ": "); //prompt here

            if (pipe.hasNextDouble())
            {
                retRangedDouble = pipe.nextDouble();

                if (retRangedDouble >= low && retRangedDouble <= high)
                {
                    done = true;
                }
            }
        }
        while(!done);

        return retRangedDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean done = false; //boolean to control while loop
        boolean retYNConfirm = false;
        String YNAnswer = "";

        do
        {
            System.out.print("\n" +prompt+ ": "); //prompt here

            if (pipe.hasNextLine())
            {
                YNAnswer = pipe.nextLine();

                if (YNAnswer.equalsIgnoreCase("Y"))
                {
                    retYNConfirm = true;

                    done = true;
                }
                else if (YNAnswer.equalsIgnoreCase("N"))
                {
                    done = true;
                }
            }
        }
        while(!done);

        return retYNConfirm;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean done = false; //boolean to control while loop
        String retRegExString = ""; //empty string

        do
        {
            System.out.print("\n" +prompt+ ": "); //prompt here

            retRegExString = pipe.nextLine(); //sets eventual return string to input

            if (retRegExString.matches(regEx))
            {
                done = true; //ends while loop
            }
        }
        while(!done);

        return retRegExString;
    }
}