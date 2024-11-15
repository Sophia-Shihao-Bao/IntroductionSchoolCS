import java.util.Scanner;

/**
 * @author : jzagabe
 * @Description :
 * @created : 2024-10-04, Friday
 **/
public class Parking
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine(); // permettre d'avoir un saut de ligne
        String a=sc.nextLine();
        String b=sc.nextLine();
        int compteur=0;
        for (int i = 0; i < n; i++)
        {
            if((a.charAt(i)=='C')&&(b.charAt(i)=='C'))
                compteur++;
        }
        System.out.println(compteur);
        
    }
}
