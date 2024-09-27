//Display first n even numbers.
 class demo{
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        for(int i=0;i<=num;i++)
        {
              if(i%2==0)
              {
                System.out.println(i);
              }

        }
    }
    
}
