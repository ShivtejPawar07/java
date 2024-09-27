import java.io.FileInputStream;
import java.io.IOException;

class demo {
    public static void main(String[] args) {
        try {
            
            FileInputStream fin = new FileInputStream(args[0]);
            int ch;

            // Read the file content into a character array
            String content="";
            while ((ch = fin.read()) != -1) {
                content += (char) ch;
            }

            fin.close();
            System.out.println("Original content:");
            System.out.println(content);

            // Display the original content in uppercase
            System.out.println("Original content in UPPERCASE:");
            System.out.println(content.toUpperCase());

            // Display the content in reverse order
            System.out.println("Content in reverse order:");
            for (int i = content.length() - 1; i >= 0; i--) {
                System.out.print(content.charAt(i));
            }
          

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
