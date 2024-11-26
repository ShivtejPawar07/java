import java.util.*;
class cricket{
    String name;
    int inning;
    int not;
    int total;
    float avg;
    cricket(String name,int inning,int not,int total)
    {
      this.name=name;
      this.inning=inning;
      this.not=not;
      this.total=total;
    }
    static void avg(cricket c){
      if(c.inning==c.not)
      {
        c.avg=c.total;
      }
      else{
        c.avg=(float)c.total/c.inning-c.not;
      }
    }
    static void sort(cricket c[])
    {
      for(int i=0;i<c.length;i++){
        for(int j=0;j<c.length;j++)
        {
          if(c[i].avg>c[j].avg)
          {
            cricket temp=c[i];
            c[i]=c[j];
            c[j]=temp;
          }
        }

      }
    }
    void display()
    {
      System.out.println(name+"\t"+inning+"\t"+not+"\t"+total+"\t"+avg+"\t");
    }
}
class demo{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("how many elemnt");
    int n=sc.nextInt();
    cricket []c=new cricket[n];
    for(int i=0;i<n;i++)
    {
       System.out.println("enter name inning not total");
       sc.nextLine();
       String name=sc.nextLine();
       int inning=sc.nextInt();
       int not=sc.nextInt();
       int total=sc.nextInt();
       c[i]=new cricket(name,inning,not,total);
       cricket.avg(c[i]);
    }
    System.out.println("name\tinning\tnot\ttotal\tbat\t");

    for(int i=0;i<n;i++)
    {
      c[i].display();
    }
   cricket.sort(c);
    System.out.println("name\tinning\tnot\ttotal\tbat\t");

    for(int i=0;i<n;i++)
    {
      c[i].display();
    }
  }
}