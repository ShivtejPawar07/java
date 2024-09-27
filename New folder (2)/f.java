import  java.util.*;
class Demo
{

   public static void main(String[] args)
   {
        ArrayList al=new ArrayList<>();
        System.out.println(al.isEmpty());//checks if it is empty ot not//true
        // public boolean isEmpty()
        // {
        // }
        al.add("AAA"); 
        al.add("BBB");
        al.add("XXX");
        al.add("ZZZ");
        System.out.println(al.isEmpty());//false
       Object[] obj=  al.toArray();
         for(Object elemnt:obj)
        System.out.println((String)elemnt);

        for(int i=0;i<obj.length;i++)
        System.out.println(obj[i]);
        //convert objects into array
//this method use to convet somethng into array
//    public object[] toArray()
//{

//}

  System.out.println(al.size());//retruns size 
//   public int size()
//   {

//   }
    al.clear();//clear all elements 
    // public void clear()
    // {

   // }    
}
}

