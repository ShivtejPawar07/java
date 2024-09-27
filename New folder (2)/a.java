class Demo
{
    public static void main(String[] args)
    {
        java.util.ArrayList list=new java.util.ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);//here they overcome size  limitation drawback 

        // list.add(10);
        // list.add(10);//here duplicate elelemts are st
        
        
    

        java.util.HashSet list1=new java.util.HashSet();
        list1.add(10);
        list1.add(10);
        list1.add(20);
        list1.add(30);

        System.out.println(list1);//duplicate elements not found//for unique elements

        java.util.HashSet list2=new java.util.HashSet();
        list2.add(20);
        list2.add(50);
        list2.add(15);
        list2.add(2);

        System.out.println(list2);


        java.util.ArrayList list3=new java.util.ArrayList<>();
        list3.add(20);
        list3.add(50);
        list3.add(15);
        list3.add(2);

        System.out.println(list3);


        java.util.TreeSet list4=new java.util.TreeSet<>();
        list4.add(20);
        list4.add(50);
        list4.add(15);
        list4.add(2);

        System.out.println(list4);//print in sorted order


        java.util.ArrayList list5=new java.util.ArrayList<>();
        list5.add(20);
        list5.add(50.6);
        list5.add(new Demo());
        list5.add("Shivtej");

        System.out.println(list5);//for heterogenus data
 }
}
