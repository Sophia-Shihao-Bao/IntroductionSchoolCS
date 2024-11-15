/**
 * @author : jzagabe
 * @Description :
 * @created : 2024-10-16, Wednesday
 **/
import java.util.Scanner;

public class Decompress
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder resultat = new StringBuilder();  // pour accumuler les resultats
        // Nombre de fois
        int k = scanner.nextInt();
        // ==== recupérer les inputs=====
        for (int i = 0; i < k; i++)
        {
            int nbr = scanner.nextInt();
            char signe = scanner.next().charAt(0);
            for (int j = 0; j < nbr; j++) {
                resultat.append(signe);  // ajouter nbr fois
            }
            resultat.append("\n");  // ajouter un retour de charriot
        }
        // ==== Faire les outputs: affichages
        System.out.println(resultat.toString());
    }
}
