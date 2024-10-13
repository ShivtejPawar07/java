import java.util.*;
class CricketPlayer{
    String name;
    int inning;
    int notout;
    float total;
    float bat_avg;
    CricketPlayer(String name,int inning, int notout,float total)
    {
        this.name= name;
   this.inning=inning;
 this.notout=notout;
   this.total=total;
    }
  static void avg(CricketPlayer c){
    bat_avg=total/(inning-notout);
  }
  void display()
  {

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
          c[i]=new CricketPlayer(name,inning,notout,total);
          
        }
        System.out.println("***cricket info***");
        System.out.println("name\tinning\tnotout\ttotal\tbat");
        for(int i=0;i<n;i++)
        {
          c[i].display();
        }
        cCricketPlayer
      
    }
}
