class Demo {
    static int a = fun();

    static {
        System.out.println("In static block");
    }

    static int fun() {
        System.out.println("In static method");
        return 10; // Returning an integer as required for `a`
    }
}

 class main {
    public static void main(String[] args) throws Exception {
       
            Class.forName("Demo");
        
    }
}
