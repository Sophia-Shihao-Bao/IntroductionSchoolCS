import java.util.Scanner;
public class WhatIsN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input==10 ||input==9 ||input==1) {
            System.out.println(1);
        } else if (input==8||input==7||input==2||input==3) {
            System.out.println(2);
        } else if (input==6||input==5||input==4) {
            System.out.println(3);
        } else {
            System.out.println("invalid response");
        }
        sc.close();
    }
}
