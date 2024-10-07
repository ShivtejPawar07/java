
package st;

public class Comp {
   String str1;
     String str2;

    public Comp(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public void compare() {
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("The strings are equal.");
        } else if (result < 0) {
            System.out.println("The first string is less than the second string.");
        } else {
            System.out.println("The first string is greater than the second string.");
        }
        
    }
}
