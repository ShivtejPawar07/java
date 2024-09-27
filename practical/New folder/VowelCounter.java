import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        int vowelCount = countVowels(input);
        
        System.out.println("Number of vowels in the given string: " + vowelCount);
      
    }
    
    // Method to count the number of vowels in a string

    private static int countVowels(String str) 
    {
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        
        return count;
    }
}

