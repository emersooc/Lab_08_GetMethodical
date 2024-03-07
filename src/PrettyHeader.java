import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String disMsg;

        disMsg = SafeInput.prettyHeader("Finished the Task");

        System.out.print(disMsg);
    }
}
