package sy;
public class SYMarks
{
   public int comptot;
   public int mathtot;
   public int electot;
   public SYMarks(int c,int m,int e)
   {
          comptot=c;
          mathtot=m;
          electot=e;
   }
   public String toString()
   {
          return comptot+"\t"+mathtot+"\t"+electot;
   }
}