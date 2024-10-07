/*c) Write a java program to accept 5 numbers using command line arguments sort and
display them. */
 class demo {
    public static void main(String[] args) {
      int a[]=new int[5];
      
      for(int i=0;i<args.length;i++)
      {
         a[i]=Integer.parseInt(args[i]);
      }
      System.out.println("array");
      for(int i=0;i<args.length;i++)
      {
        System.out.println(a[i]);
      }
      int temp=0;
      for(int i=0;i<args.length;i++)
      {
        for(int j=i+1;j<args.length;j++)
      {
        if(a[i]<a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
      }
      System.out.println("sorted array");
      for(int i=0;i<args.length;i++)
      {
        System.out.println(a[i]);
      }

     

    }
    
}
