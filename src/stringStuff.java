/**
 * @author : sophia
 * @Description :
 * @created : 2024-10-02,星期三
 **/
public class stringStuff {
    public static void main(String[] arguments) {
        String a = "Bonjour";
        String b = "Hello";
        String c = a.concat(b);
        String d = a+b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(c.length());
        System.out.println(c.charAt(1)); /* print out the second letter */
        System.out.println(c.substring(3,6)); /* substring out letters 3-5 */

        if (a == b) {
            System.out.println("Yay!");
        } else {
            System.out.println("Nooooo");
        }
    }
}
