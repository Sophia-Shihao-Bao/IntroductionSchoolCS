import java.util.Scanner;
public class NextInLine {
    public static void main(String[] arguments) {
        Scanner youngestChild = new Scanner(System.in);
        System.out.println("What is the age of the youngest child?");
        int youngestChildI = youngestChild.nextInt();
        Scanner middleChild = new Scanner(System.in);
        System.out.println("What is the age of the middle child?");
        int middleChildI = middleChild.nextInt();
        int diffence = middleChildI-youngestChildI;
        int oldestChild = middleChildI+diffence;
        System.out.println("Oldest child is "+oldestChild);
    }
}
