package ty;
public class TYMarks
{
  public int theory;
   public int practical;
   public TYMarks(int t,int p)
   {
          theory=t;
          practical=p;
   }
   public String toString()
   {
          return theory+"\t"+practical;
   }
}