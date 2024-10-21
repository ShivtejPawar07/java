/*a) Write a package for String operation which has two classes Con and Comp. Con class
has to concatenates two strings and comp class compares two strings. Also display
proper message on execution. */

import st.*;
// import st.Comp;

public class demo {
    public static void main(String[] args) {
        Con1 obj = new Con1("Sakshi", "Dube");
        obj.display();

        Comp obj1 = new Comp("Sakshi", "Dube");
        obj1.display();
    }
}

