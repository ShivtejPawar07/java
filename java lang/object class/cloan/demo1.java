 public class demo1 implements Cloneable
  {
    int a,b;
    demo1(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
 
    
}
class test
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        demo1 d1=new demo1(10, 20);
        // demo4 d2=d1 ;
        demo1 d2=(demo1)d1.clone();
        System.out.println(d1==d2);
        d1.a=50;
        System.out.println(d1.a);
        System.out.println(d2.a);
        d1.a=20;
        System.out.println(d1.a);
        System.out.println(d2.a);

}
}
