import java.util.Scanner;
public class SpeedFines {
    public static void main(String[] arguments) {
        Scanner speedLimit = new Scanner(System.in);
        System.out.println("What is the speed limit?");
        int speedLimitI = speedLimit.nextInt();
        Scanner speed = new Scanner(System.in);
        System.out.println("What is your speed?");
        int speedI = speed.nextInt();
        if(speedI < speedLimitI) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (speedI > speedLimitI) {
            if (speedI - speedLimitI < 21) {
                System.out.println("You are speeding and your fine is $100");
            } else if ((speedI - speedLimitI < 30) && (speedLimitI-speedI>20)) {
                System.out.println("You are speeding and your fine is $270");
            } else {
                System.out.println("You are speeding and your fine is $500");
            }
        } else {
            System.out.println("null input");
        }
    }
}
