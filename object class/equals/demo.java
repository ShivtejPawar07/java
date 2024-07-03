class demo
{
    int a,b;
    demo(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public boolean equals(Object obj)
    {  if(this==obj)
        {
            return true;
        }
        else if(obj instanceof demo)
        {
            demo dref=(demo)obj;
            return
            this.a==dref.a && this.b==dref.b;   
        }
        else
        {
            return false;
        }          
    }


    public static void main(String[] args) {
        demo d1=new demo(10,20);
        demo d2=new demo(10,20);
        System.out.println(d1.equals(d2));
        System.out.println(d1==d2);
        Integer iref1=1000;
        Integer iref2=1000;
        System.out.println(iref1==iref2);
    }
}
