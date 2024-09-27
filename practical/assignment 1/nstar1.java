// Display n stars (*).
// e.g. Accept number from command line argument as n=5
// output: * * * * *
 
 class demo{
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        for(int i=0;i<num;i++)
         System.out.print("* ");        
    }
    
}
