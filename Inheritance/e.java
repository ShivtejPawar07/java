
class parent {
    void fun() 
    {
       System.out.println("parent fun");
    }

    
}
class child extends parent{
    void fun()
    {
        System.out.println("child fun");
    }
   
}
class demo{
    public static void main(String[] args) {
        parent p=new parent();
        p.fun();//parent fun
        
        child c=new child();
        c.fun();//child fun
       
        
        parent p2=new child();//upcasting
      //  child c2=new parent();//downcasting kuthech chalt nahi 
         
         p2.fun();//child  fun
        
    }
}
 
