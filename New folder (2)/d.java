

import  java.util.*;
class Demo
{

   public static void main(String[] args)
   {
       


        HashSet hs=new HashSet();
        hs.add("AAA"); 
        hs.add("BBB"); 
        hs.add("CCC"); 
        hs.add("DDD"); 
       


        ArrayList al=new ArrayList<>();
        al.add("AAA"); 
        al.add("BBB");
        al.add("XXX");
        al.add("ZZZ");
        System.out.println(al.containsAll(hs));//false
       //sagale asel trr true ek jarr nasel trr false 
        //because add method return type is boolean 
        //public boolean containsAll(Object obj)
        //{

        //}//its return true or false
 }
}

