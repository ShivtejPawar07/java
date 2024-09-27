/*write a java program to accept a string and count how many times to given substring occur in a string */
import java.util.*;
 class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  string:");
        String str = sc.nextLine();

        System.out.println("Enter the substring:");
        String substr = sc.nextLine();

        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(substr, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += substr.length();
            }
        }

        System.out.println("The substring occurs in the string " + count + " times.");
    }
}
