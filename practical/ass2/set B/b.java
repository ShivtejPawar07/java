import java.util.Scanner;

class CricketPlayer{
  String name;
  int inning;
  int notout;
  int total;
  float avg;
  void accept(String name,int inning,int notout,int total)
  {
   this.name= name;
   this.inning=inning;
 this.notout=notout;
   this.total=total;
  
  }
  static void avg(CricketPlayer c)
  {  
    c.avg =c.total / (c.inning - c.notout);
  }
   static void sort(CricketPlayer c[])
  {
    for(int i=0;i<c.length;i++)
    {
        for(int j=i+1;j<c.length;j++)
        {
            if(c[i].avg<c[j].avg)
            {
                CricketPlayer temp=c[i];
                c[j]=c[i];
                c[i]=temp;
            }
        }
    }
  }
  void display()
  {
    System.out.println(name+"\t"+inning+"\t"+notout+"\t"+total+"\t"+avg);
  }

}
class demo
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("how many no");
    int n=sc.nextInt();
    CricketPlayer c[]=new CricketPlayer[n];
    for(int i=0;i<n;i++)
    {
       System.out.println("enter name\t"+(i+1)+"\tinning\tnotout\ttotal");
       sc.nextLine();
       String name=sc.nextLine();
       int inning =sc.nextInt();
       int notout=sc.nextInt();
      int total=sc.nextInt();
      c[i]=new CricketPlayer();
      c[i].accept(name,inning,notout,total);
      CricketPlayer.avg(c[i]);
    }
    System.out.println("***cricket info***");
    System.out.println("name\tinning\tnotout\ttotal\tbat");
    for(int i=0;i<n;i++)
    {
      
      c[i].display();
    }
    CricketPlayer.sort(c);
    System.out.println("***cricket info***");
    System.out.println("name\tinning\tnotout\ttotal\tbat");
    for(int i=0;i<n;i++)
    {
      c[i].display();
    }
  }
}
  

