// import java.io.*;
// class Cricket{
//    String name;
//    int inning;
//    int tofnotout;
//    int totalruns;
//    float batavg;
//    public Cricket(){
//          name=null;
//          inning=0;
//          tofnotout=0;
//          totalruns=0;
//          batavg=0;
//      }
//    public void get()throws IOException{
//          BufferedReader br=new BufferedReader(new InputstreamReader(System.in));
//          System.out.println("Enter the Name of Batsman: ");
//          name=br.readLine();
//          System.out.println("Enter the Number of Innings: ");
//          inning=Integer.parseln(br.readLine());
//          System.out.println("Enter the Number of Times not out: ");
//          tofnotout=Integer.parseln(br.readLine());
//          System.out.println("Enter the Number of Total Runs: ");
//          totalruns=Integer.parseln(br.readLine());
//       }
//          public void put(){
//           System.out.println("Name: "+name);
//            System.out.println("Number of Innings: "+inning);
//            System.out.println("Number of Times notout: "+notout);
//             System.out.println("Number of Total Runs: "+totalruns);
//              System.out.println("Bat Average: "+batavg);
//       }
//        static void avg(int n, Cricket c[]){
//           try{
//               for(int i=0; i<n; i++){
//               c[i].batavg=c[i].tatalruns/c[i][i].inning;
//               }
//          }catch(ArithematicException e){
//              System.out.println("Invalid Arg");
//            }
//         }
//         static void sort(int n, Cricket c[]){
//         String temp1;
//         int temp2;
//         int temp3;
//         int temp4;
//         float temp5;
//         for(int i=0; i<n; i++){
//           for(int j=i+1; j<n; j++){
//             if(c[i].batavg < c[j].batavg){
//             temp1=c[i].name;
//             c[i].name=c[j].name;
//             c[j].name=temp1;
            
//             temp2=c[i].inning;
//             c[i].inning=c[j].innig;
//             c[j].inning=temp2;
            
//             temp3=c[i].tofnotout;
//             c[i].tofnotout=c[j].tofnotout;
//             c[j].tofnotout=temp3;
            
//             temp4=c[i].totalruns;
//             c[i].totalruns=c[j].totalruns;
//             c[j].totalruns=temp4;
            
//             temp5=c[i].batavg;
//             c[i].batavg=c[j].batavg;
//             c[j].batavg=temp5;
//          }
//        }
//      }
//    }  
//  }
// class cricket{
//            public static void main (String arg [])throws IOException{
//            BufferedReader br=new BufferedReader(new InputstreamReader(System.in));  
//            System.out.println("Enter the limit: ");
         
//            int n=Intger.parseln(br.readLine());
//            Cricket c[]=new Cricket[n];
//            for(int i=0; i<n; i++){
//            c[i]=new Cricket();
//            c[i].get();
//             }
//          Cricket.avg(n.c);
//          Cricket.sort(n.c);
//           for(int i=0; i<n; i++){
//           c[i].put();
//           }
//  }
// }

import java.io.*;

class Cricket {
    String name;
    int inning;
    int tofnotout;
    int totalruns;
    float batavg;

    public Cricket() {
        name = null;
        inning = 0;
        tofnotout = 0;
        totalruns = 0;
        batavg = 0;
    }

    public void get() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Name of Batsman: ");
        name = br.readLine();
        System.out.println("Enter the Number of Innings: ");
        inning = Integer.parseInt(br.readLine());
        System.out.println("Enter the Number of Times not out: ");
        tofnotout = Integer.parseInt(br.readLine());
        System.out.println("Enter the Number of Total Runs: ");
        totalruns = Integer.parseInt(br.readLine());
    }

    public void put() {
        System.out.println("Name: " + name);
        System.out.println("Number of Innings: " + inning);
        System.out.println("Number of Times not out: " + tofnotout);
        System.out.println("Number of Total Runs: " + totalruns);
        System.out.println("Batting Average: " + batavg);
    }

    static void avg(int n, Cricket[] c) {
        try {
            for (int i = 0; i < n; i++) {
                if (c[i].inning - c[i].tofnotout != 0) {
                    c[i].batavg = (float) c[i].totalruns / (c[i].inning - c[i].tofnotout);
                } else {
                    c[i].batavg = 0;
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Invalid Argument: " + e.getMessage());
        }
    }

    static void sort(int n, Cricket[] c) {
        String temp1;
        int temp2;
        int temp3;
        int temp4;
        float temp5;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i].batavg < c[j].batavg) {
                    temp1 = c[i].name;
                    c[i].name = c[j].name;
                    c[j].name = temp1;

                    temp2 = c[i].inning;
                    c[i].inning = c[j].inning;
                    c[j].inning = temp2;

                    temp3 = c[i].tofnotout;
                    c[i].tofnotout = c[j].tofnotout;
                    c[j].tofnotout = temp3;

                    temp4 = c[i].totalruns;
                    c[i].totalruns = c[j].totalruns;
                    c[j].totalruns = temp4;

                    temp5 = c[i].batavg;
                    c[i].batavg = c[j].batavg;
                    c[j].batavg = temp5;
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the limit: ");

        int n = Integer.parseInt(br.readLine());
        Cricket[] c = new Cricket[n];
        for (int i = 0; i < n; i++) {
            c[i] = new Cricket();
            c[i].get();
        }
        Cricket.avg(n, c);
        Cricket.sort(n, c);
        for (int i = 0; i < n; i++) {
            c[i].put();
        }
    }
}


