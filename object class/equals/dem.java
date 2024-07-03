class demo
{
    int a,b;
    demo(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
   
    public boolean equals(Object obj)
{ 
     if (this==obj)
     return true;
     else if(obj instanceof demo);
     
    demo dref=(demo)obj;
    return
    this.a==dref.a &&
    this.b==dref.b;
     
    
    

}
}
   
