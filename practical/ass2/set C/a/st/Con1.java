
package st;

public class Con1 {
   String str1;
   String str2;

    public Con1(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String concatenate() {
        String str3 = str1 + str2;
        System.out.println("Concatenating=> "+ str3 );
        return str3;
    }
}
