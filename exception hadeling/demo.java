class demo {

    public static void main(String[] args) {
        // int a=Integer.parseInt(args[0]);
        // int[] arr=new int[a];
        try
        {   
            int a=Integer.parseInt(args[0]);
            try
            {
            int[] arr=new int[a];
            }
            catch(NegativeArraySizeException nae)
            { 
            System.out.println("array index is negative");
             nae.printStackTrace();
            }
        }
        catch(NumberFormatException e2)
       {
        System.out.println("enter an integer ");
       }
       catch(ArrayIndexOutOfBoundsException e3)
       {
        System.out.println("array index not found ");
       }
       catch(Exception e)
       {
         e.printStackTrace();
       }
    //    int[] arr=new int[a];
    }
}