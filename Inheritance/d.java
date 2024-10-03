//overiding
class parent {
    void fun(int a) 
    {
       System.out.println("parent fun");
    }
    void gun()
    {
        System.out.println("parent gun");
    }
    
}
class child extends parent{
    void fun(int a)
    {
        System.out.println("child fun");
    }
    void run()
    {
        System.out.println("child run");
    }
}
class demo{
    public static void main(String[] args) {
        parent p=new parent();
        p.fun(10);//parent fun
        p.gun();
        //p.run();//cE
        
        child c=new child();
        c.fun(20);//child fun
        c.gun();
        c.run();
        
        parent p2=new child();//upcasting
      //  child c2=new parent();//downcasting kuthech chalt nahi 
         p2.gun();
         p2.fun(10);
        // p2.run();//CE
    }
}
