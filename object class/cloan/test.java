class address 
{  int a=1,b=2,c=3;
   
    
}
class student implements Cloneable
{
    int rollNO=7;
    String name="shivtej";
    address add=new address();
    public student clone() throws CloneNotSupportedException
    {
       return (student)super.clone();
    }
}
class test
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        student s1=new student();
        student s2=s1.clone();
        System.out.println(s1.rollNO);
        System.out.println(s1.name);
        System.out.println(s1.add.a);
        System.out.println(s1.add.b);
        System.out.println(s1.add.c);

        System.out.println(s2.rollNO);
        System.out.println(s2.name);
        System.out.println(s2.add.a);
        System.out.println(s2.add.b);
        System.out.println(s2.add.c);
        System.out.println();
        

        s1.rollNO=50;
        System.out.println(s1.rollNO);
        System.out.println(s1.name);
        System.out.println(s1.add.a);
        System.out.println(s1.add.b);
        System.out.println(s1.add.c);

        System.out.println(s2.rollNO);
        System.out.println(s2.name);
        System.out.println(s2.add.a);
        System.out.println(s2.add.b);
        System.out.println(s2.add.c);
    }
}

