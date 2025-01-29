import java.util.*;
class Demo{
  static public void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("how many num");
     int n=sc.nextInt();
     ArrayList<Integer>al=new ArrayList<>(n);
     System.out.println("num=>");
     for(int i=0;i<n;i++)
     {
        al.add(sc.nextInt());
     }
     System.out.println(al);
     ListIterator<Integer> litr=al.listIterator();

     System.out.println("even elemnts:");
    //  while(litr.hasNext()) { 
    //    int num=litr.next();
    //    if(num%2==0){
     //        System.out.println(num);
      //}
    //}

           for (Integer num : al) {
            if (num % 2 == 0) { // Check if the number is even
                System.out.println(num);
            }
        }
   
     
  }

}