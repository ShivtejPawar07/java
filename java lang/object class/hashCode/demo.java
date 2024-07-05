class demo 
{  int a=10,b=20;
   
  public int hashCode()
  {
   return this.a+this.b;
  }

    public static void main(String[] args) 
    {  
        demo d=new demo();
        System.out.println(d.hashCode());
        System.out.println(d.hashCode());
        demo d2=new demo();
        System.out.println(d2.hashCode());
        Integer iref1=new Integer(10);
        Integer iref2=new Integer(10);
        System.out.println(iref1.hashCode());
        System.out.println(iref2.hashCode());
        String s1=new String("sangamner");
        String s2=new String("sangamner");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Integer iref3=10;
        Integer iref4=10;
        String s3="sangamner";
        String s4="sangamner";
        System.out.println(iref3.hashCode());
        System.out.println(iref4.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());


        System.out.println();
        System.out.println(System.identityHashCode(d));


        
       
        
    }
}
