import java.util.Comparator;
import java.util.TreeSet;

class Demo{
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("sss");
        StringBuffer sb2=new StringBuffer("hh");
        StringBuffer sb3=new StringBuffer("i");
        StringBuffer sb4=new StringBuffer("vvvv");


        TreeSet ts=new TreeSet(new MyComparator());

        ts.add(sb1);
        ts.add(sb2);
        ts.add(sb3);
        ts.add(sb4);
       
        System.out.println(ts);
        
         

    }
}
class MyComparator implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
    StringBuffer sb1=(StringBuffer) obj1;
    StringBuffer sb2=(StringBuffer) obj2;

    if(sb1.length()==sb2.length())
    {
        return 0;
    }
    else if(sb1.length()>sb2.length())
    {
        return 1;
    }
    else{
        return -1;
    }

  }

}
//output =>[i, hh, sss, vvvv]