
class MyNumber
{
    private int num=0;
    MyNumber()
    {
        int num=0;
    }
    MyNumber(int num)
    {
        this.num=num;
    }
    boolean isPositive()
    {
        if(num>0)
        return true;
        else
        return false;
    }
    boolean isNegative()
    {
        if(num<0)
        return true;
        else
        return false;
    }
    boolean isEven()
    {
        if(num%2==0)
        return true;
        else
        return false;
    }
    boolean isOdd()
    {
        if(num%2!=0)
        return true;
        else
        return false;
    }
    boolean isZero()
    {
        if(num==0)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
       int data=Integer.parseInt(args[0]);
        MyNumber obj=new MyNumber(data);
        System.out.println(data+" is negative= "+obj.isNegative());
        System.out.println(data+" is positive ="+obj.isPositive());
        System.out.println(data+" is zero= "+obj.isZero());
        System.out.println(data+" is odd= "+obj.isOdd());
        System.out.println(data+" is even= "+obj.isEven());


    }
}