class demo
{    
    

    public static void main(String [] args)
    {   System.out.println("1");
        String s1=new String();
        s1="shivtej";
        System.out.println(s1);
        System.out.println();

        System.out.println("2");
        String s2=new String("shivtej");
        System.out.println("s2 "+s2);
        String s3=new String(s2);
        System.out.println("s3 "+s3);
        System.out.println();

        System.out.println("3");
        StringBuffer Sb1=new StringBuffer("shivtej");
        String s4=new String(Sb1);
        System.out.println("s4 "+s4);
        System.out.println();

        System.out.println("4");
        StringBuilder sb2=new StringBuilder("shivtej");
        String s5=new String(sb2);
        System.out.println("s5 "+s5);

        System.out.println("5");
        char[] crr={'s','h','i','v','t','e','j'};
        String s6=new String(crr);
        System.out.println("s6 "+s6);

        //slice
        char[] crr2={'a','h','m','d','n','a','g','a','r'};
        String s7=new String(crr2,4,4);
        System.out.println(s7);

        byte[] brr={65,66,67};
        String s8=new String(brr);
        System.out.println(s8);
        
        
        byte[] brr2={97,98,99,100,101,102,103,104};
        String s9=new String(brr2, 3, 5);
        System.out.println(s9);

      

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



    


}

}
