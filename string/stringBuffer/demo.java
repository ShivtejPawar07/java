class demo
 {
    public static void main(String[] args) 
    {    //empty constructor
        StringBuffer s=new StringBuffer();
        System.out.println(s.capacity());//initial :16
        //2nd
        StringBuffer s1=new StringBuffer("shivtej");
        System.out.println(s1.capacity()); //initial +16
        //3rd
        StringBuffer s2=new StringBuffer(10);
        System.out.println(s2.capacity());

        //append
        s.append("pawar");
        System.out.println(s);
        System.out.println(s.capacity());
        s.append("sangamner");
        System.out.println(s);
        System.out.println(s.capacity());
        s.append("ahemadnagar");
        System.out.println(s);
        System.out.println(s.capacity());
        //current cap *2 + 2 
        //16*2+2 =34
        

        System.out.println("second case ");
        //when we create a string alredy 
        //initial 16+5:shivtej+pawar+sangamner+ahemadnagar
        // 16+5+4+9+11=44
        s1.append("pawar");
        System.out.println(s1);
        System.out.println(s1.capacity());
        s1.append("sangamner");
        System.out.println(s1);
        System.out.println(s1.capacity());
        s1.append("ahemadnagar");
        System.out.println(s1);
        System.out.println(s1.capacity());



        System.out.println(s1.insert(2,"jhfhfhhf"));
        System.out.println(s1.reverse());


        System.out.println(s1.delete(2, 8));


        System.out.println(s1.deleteCharAt(2));


        StringBuffer sb4=new StringBuffer();
        System.out.println(sb4.capacity());
        sb4.append("shivtej");
        System.out.println("shivtej");
        System.out.println(sb4.capacity());
        sb4.trimToSize();
        System.out.println("shivtej");
        System.out.println(sb4.capacity());
        sb4.append("shivtej");
        System.out.println(sb4.capacity());


        StringBuffer sb5=new StringBuffer();
        sb5.ensureCapacity(30);
        System.out.println(sb5.capacity());

        sb4.setLength(3);
        System.out.println(sb4);






        }
}

