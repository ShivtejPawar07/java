import java.io.*;

class demo {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1]);

            int ch;
            while ((ch = fin.read()) != -1) {
                char c = (char) ch;
                if (Character.isLowerCase(c)) {
                    c = Character.toUpperCase(c);
                } else if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                } else if (Character.isDigit(c)) {
                    c = '*'; 
                }
                fout.write(c);
            }

            fin.close();
            fout.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
