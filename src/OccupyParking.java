/**
 * @author : sophia
 * @Description :
 * @created : 2024-09-27,星期五
 **/
import java.util.Scanner;
public class OccupyParking {
    public static void main(String[] arguments) {
        Scanner number = new Scanner(System.in);
        int numberI = number.nextInt(); /** add list? **/
        number.nextLine();
        String yesterday = number.nextLine();
        String today = number.nextLine();
        int count = 0;
        for (int i = 0; i < numberI; i++) {
            if (yesterday.charAt(i) == 'C' && today.charAt(i) == 'C') {
                count++;
            }
        }
        System.out.println(count);
    }
}
