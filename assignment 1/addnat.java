
//11.Display addition of first n numbers.

 class h {
    public static void main(String[] args) {
        int sum=0;
       int num=Integer.parseInt(args[0]);
       
        for(int i=1;i<=num;i++)
        {
        sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
