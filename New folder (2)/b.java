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
        System.out.println(hs);

         //we made hashset then add into arryalist
        ArrayList al=new ArrayList<>();
        System.out.println(al.addAll(hs));//true
        System.out.println(al.addAll(hs));//true
        System.out.println(al);
        
        HashSet hs1=new HashSet();
        hs1.add("AAA");
        System.err.println(hs1.addAll(al));//true because we add it one time
        System.out.println(hs1);
        System.out.println(hs1.addAll(al));
        //false ->beause we alredy add one time and 
        //its does not take duplicate value
       
        
        //public boolean addAll(Object obj)
        //{

        //}//its return true or false


        //new scenario
        ArrayList al2=new ArrayList<>();
        al2.add("AAA");
        al2.add("XXX");
        System.out.println(hs1.addAll(al2));//true
        //sagale element jarr add zale trr true 
        //nahitar false 
  }
}

