class demo4 implements Cloneable
{ int a,b;
    demo4(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        demo4 d1=new demo4(10, 20);
        // demo4 d2=d1 ;
        demo4 d2=(demo4)d1.clone();
        System.out.println(d1==d2);
        d1.a=50;
        System.out.println(d1.a);
        System.out.println(d2.a);
        d1.a=20;
        System.out.println(d1.a);
        System.out.println(d2.a);

}
}