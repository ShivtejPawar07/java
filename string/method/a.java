public class a {
    public static void main(String[] args) {
        String s1="Shivtej";
        String s2="Pawar";

        //char charAt(int index);
        System.out.println(s1.charAt(3));

        //int compareTo(String another string);
        System.out.println(s1.compareTo(s2));

        //String concat(String str)
        System.out.println(s1.concat(s2));

        //int hashcode
        System.out.println(s1.hashCode());
    
        //boolean equals()
        System.out.println(s1.equals(s2));
        
        //int indexOf(int ch)
        System.out.println(s1.indexOf('S'));

        //int indexOf(int String)
        System.out.println(s1.indexOf("Shivtej"));

        //int lastIndexOf(int ch)
        System.out.println(s1.lastIndexOf("t"));

        //int length()
        System.out.println(s1.length());

        //string substring()
        System.out.println(s1.substring(0, 4));
       
       

        //String toString
        System.out.println(s1.toString());

        //String toUpperCase()
        System.out.println(s1.toUpperCase());

        System.out.println(s1.toLowerCase());

        //String trim()
        System.out.println(s1.trim());
       
        String str = "apple,banana,cherry";
        
        // Split by comma
        String[] fruits = str.split(",");
        
        // Print the resulting array
        for (String fruit : fruits) {
            System.out.println(fruit);
          
            //String valueOf()
         int a=10;
            String b=String.valueOf(a);
            System.out.println(b);

            //StringBuffer
            //append
            StringBuffer sb1=new StringBuffer(s1);
            sb1.append("pawar");
            sb1.append(07);
            System.out.println(sb1);

             //String insert()
        StringBuffer sb=new StringBuffer(s1);
        sb.insert(7,"shiv");
        System.out.println(sb);



        //reverse
        sb.reverse();
        System.out.println(sb);

        //replace
        sb.replace(7, 11, "shiv");
        System.out.println(sb);

        //capacity
        System.out.println(sb.capacity());
        

  }


   
    }
}
