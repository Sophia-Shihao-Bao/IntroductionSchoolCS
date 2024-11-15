/**
 * @author : sophia
 * @Description :
 * @created : 2024-11-15,星期五
 **/
public class doubleArrays {
    public static void main(String[] args){
        //initialize
        int[][] num = new int [3][4];//3 rows, 4 columns
        //insert values
        int x = 1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = x+=10;
            }
        }

        //affiche
        System.out.println("2D array");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}