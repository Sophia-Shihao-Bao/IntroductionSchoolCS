import java.util.Scanner;

/**
 * @author : jzagabe
 * @Description :
 * @created : 2024-10-16, Wednesday
 **/
public class HappySad {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int happyCount = 0;
        int sadCount = 0;
        for (int i = 0; i < input.length() - 2; i++)
        {
            if (input.substring(i, i + 3).equals(":-)"))
            {
                happyCount++;
            } else
            if (input.substring(i, i + 3).equals(":-("))
            {
                sadCount++;
            }
        }

        if (happyCount == 0 && sadCount == 0)
        {
            System.out.println("none");
        }
        else if (happyCount == sadCount)
        {
            System.out.println("unsure");
        }
        else if (happyCount > sadCount)
        {
            System.out.println("happy");
        }
        else
        {
            System.out.println("sad");
        }
    }
}