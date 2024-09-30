import java.util.TreeSet;
class Demo{
    public static void main(String[] args) {
        
        StringBuffer sb1=new StringBuffer("aaaa");
        StringBuffer sb2=new StringBuffer("eee");
        StringBuffer sb3=new StringBuffer("bbb");
        StringBuffer sb4=new StringBuffer("ccc");
        StringBuffer sb5=new StringBuffer("ddd");

TreeSet ts=new TreeSet(new MyComparater());
ts.add(sb1);
ts.add(sb2);
ts.add(sb3);
ts.add(sb4);
ts.add(sb5);
    }
}
class MyComparater implements java.util.MyComparater;
{
    public int compareTo(Object obj1,Object obj2)
    {
        StringBuffer sb1=(StringBuffer)obj1;
        StringBuffer sb2=(StringBuffer)obj2;

        if(sb1.length==sb1.length)
        return 0;
        else if(sb1.length==sb1.length)
        return 1;
        else
        return -1;

    }
}
