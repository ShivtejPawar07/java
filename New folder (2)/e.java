import  java.util.*;
 class Demo
 {

    public static void main(String[] args)
    {
         ArrayList al=new ArrayList<>();
         System.out.println(al.add(10));//true 
         System.out.println(al.add(10));//true


         HashSet hs=new HashSet();
         System.out.println(hs.add(10));//true 
         System.out.println(hs.add(10));//false
         //because add method return type is boolean 
         //public boolean add(Object obj)
         //{

         //}//its return true or false
}
}
