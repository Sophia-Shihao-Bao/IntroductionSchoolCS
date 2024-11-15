import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : sophia
 * @Description :
 * @created : 2024-11-14,星期四
 **/
public class theLittleIdiotsOfOurClass {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students?");
        int nbr = sc.nextInt();
        String []noms=new String[nbr]; // for names
        int []notes=new int[nbr]; //array for marks
        for (int i = 0; i < nbr; i++) {
            System.out.println("Name of students");
            noms[i] = sc.nextLine();
            System.out.println("Notes of students");
            notes[i] = sc.nextInt();
            sc.nextLine();
        }
        //affichage
        for (int i = 0; i < nbr; i++) {
            System.out.print(noms[i]+"\t : ");
            System.out.println(notes[i]);
        }
    }
}
