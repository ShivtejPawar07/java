import  java.util.*;
class Demo
{

   public static void main(String[] args)
   {
        ArrayList al=new ArrayList<>();
        System.out.println(al.add(10));//true 
        System.out.println(al.add(10));//true


        HashSet hs=new HashSet();
        System.out.println(hs.add(al));//true 
        System.out.println(hs.contains(al));//true
        System.out.println(hs.contains(10));//false
        System.out.println(hs.contains(20));//false 
        //its check the value is present or not 
        //if present retuens true otherwise returns false 
        //because add method return type is boolean 
        //public boolean contains(Object obj)
        //{

        //}//its return true or false
 }
}

