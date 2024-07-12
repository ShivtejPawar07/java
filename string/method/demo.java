class demo
{
  public static void main(String[] args) {
    String s1=new String();
        s1="shivtej";
        System.out.println(s1);
        System.out.println();

        String s2=new String("shivtej");
        System.out.println(s2);

String st1="shivtej";
        String st2=new String("shivtej");
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));

        System.out.println("length");
        System.out.println(s1.length());

        
        s1.concat(s2);
        System.out.println(s1);
        s1=s1.concat(s2);
        System.out.println(s1);

        System.out.println(s1+"pawar");
       System.out.println( s1.charAt(3));

       System.out.println(s1.indexOf('s'));
       System.out.println(s1.indexOf("tej"));
       System.out.println(s1.indexOf("vte",1));
       System.out.println(s1.indexOf('v',1));


       System.out.println(s1.lastIndexOf('v'));
       System.out.println(s1.lastIndexOf("tej"));
       System.out.println(s1.lastIndexOf("tej",2));
       System.out.println(s1.lastIndexOf('v'));

       System.out.println(s1.equals(s2));
       System.out.println(st1.equals(st2));

       System.out.println(s1.equalsIgnoreCase(s2));
       System.out.println(st1.equalsIgnoreCase(st2));


       System.out.println(st1.toUpperCase());
       System.out.println(st1.toLowerCase());

       System.out.println(st1.compareTo(st2));
       System.out.println(s1.compareTo(s2));
       System.out.println(s1.compareToIgnoreCase(s2));
       System.out.println(st1.compareToIgnoreCase(st2));

       System.out.println(s1.isEmpty());
       System.out.println(s1.startsWith("s"));
       System.out.println(s1.startsWith("v"));

       System.out.println(s1.endsWith("s"));
       System.out.println(s1.endsWith("j"));

       String sn="      maha    rstra";
       System.out.println(sn.trim());
 
       System.out.println(sn.substring(7,15));

      System.out.println(s1.replace(st2, sn));
      System.out.println(s1.replace(s1,sn));

     


  }
}