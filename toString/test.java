class demo{
    int a;
    int b;
    int c;

    demo(int a,int b,int c)
    {
         this.a=a;
         this.b=b;
         this.c=c;



    }
    public String toString() {
        return  this.a+" "+this.b+" "+this.c;
      }
}
    
    class test
    {
    public static void main(String[] args)
    {
        demo d1=new demo(10,20,30);
        System.out.println(d1);
        demo d2=new demo(10,20,30);
        System.out.println(d2);
        demo d3=new demo(10,20,30);
        System.out.println(d3);
    }
}
    

