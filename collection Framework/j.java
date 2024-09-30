import java.util.*;
class Demo
{
    public static void main(String[] args)
    {    //Arraylist()
        Vector v1=new Vector();
        v1.add(10);
        v1.add(10);
        v1.add(20);
        v1.add(30);
        System.out.println(v1);
         //Arraylist(int cap)
        Vector list2=new Vector(20);
        list2.add(30);
        list2.add(50);
        list2.add(60);
        System.out.println(list2);



        Vector v3=new Vector(20,10);
        v3.add(30);
        v3.add(50);
        v3.add(60);
        System.out.println(v3);

        //Arraylist(collection c)
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add(20);
        ArrayList list3=new ArrayList<>(hs);
        System.out.println(list3);


        Vector v4=new Vector(hs);
        v4.add(30);
        v4.add(50);
        v4.add(60);
        System.out.println(v4);

        // methods of vector

        // 1 add element 
        v4.addElement(60);
        System.out.println(v4);
        //firstElement
        System.out.println(v4.firstElement());
        //last elemnt
        System.out.println(v4.lastElement());
        //element at
        System.out.println(v4.elementAt(2));
          //remove element at
        v4.removeElementAt(2);
        //removeElement
        System.out.println(v4.removeElement(30));
        //remove all Elements
        v4.removeAllElements();
        System.out.println(v4);






 }

}
