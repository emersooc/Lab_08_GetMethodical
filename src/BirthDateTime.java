import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthYear;
        int birthMonth;
        int birthDay;
        int birthHour;
        int birthMin;

        birthYear = SafeInput.getRangedInt(in, "What year were you born", 1950, 2015);

        birthMonth = SafeInput.getRangedInt(in, "What month were you born(1, 2, 3, ...)", 1, 12);

        if (birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8 || birthMonth == 10 || birthMonth == 12)
        {
            birthDay = SafeInput.getRangedInt(in, "What day were you born", 1, 31);
        }
        else if (birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || birthMonth == 11)
        {
            birthDay = SafeInput.getRangedInt(in, "What day were you born", 1, 30);
        }
        else if (birthYear % 4 == 0)
        {
            birthDay = SafeInput.getRangedInt(in, "What day were you born", 1, 29);
        }
        else
        {
            birthDay = SafeInput.getRangedInt(in, "What day were you born", 1, 28);
        }

        birthHour = SafeInput.getRangedInt(in, "What hour were you born in 24 hour time", 1, 24);

        birthMin = SafeInput.getRangedInt(in, "What minute were you born", 1, 59);

        System.out.println("Your birthday is " +birthMonth+ "/" +birthDay+ "/" +birthYear+ " at " +birthHour+ ":" +birthMin);
    }
}
