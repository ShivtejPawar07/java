class MyNumber{
  private int n;
  MyNumber()
  { 
      n=0;
  }
  MyNumber(int n)
  {
        this.n=n;
  }
boolean isNegative()
 {
    if(n<0)
     return true ;
     else
     return false;
 }
 boolean isPositive()
 {
    if(n<0)
     return true ;
     else
     return false;
 }
 public static void main(String[] args) {
   int data=Integer.parseInt(args[0]);
    MyNumber m=new MyNumber(data);
    System.out.println(data+"negative= "+m.isNegative());
 }
}