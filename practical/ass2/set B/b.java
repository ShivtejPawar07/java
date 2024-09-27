import java.util.*;
class CricketPlayer{
    String name;
    int inning;
    int notout;
    float total;
    float bat_avg;
    void accept(String name,int inning, int notout,float total)
    {
        this.name= name;
   this.inning=inning;
 this.notout=notout;
   this.total=total;
   avg();
    }
    static void avg()
    {
        bat_avg=total/(inning-notout);
    }
   
    void display()
    {
        System.out.println(name+"\t"+inning+"\t"+notout+"\t"+total+"\t"+bat_avg);
    }
}
class demo{
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
        }
        System.out.println("***cricket info***");
        System.out.println("name\tinning\tnotout\ttotal\tbat");
        for(int i=0;i<n;i++)
        {
          c[i].display();
        }
       

    }
}
