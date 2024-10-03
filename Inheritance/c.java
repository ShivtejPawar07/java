class parent{
    int a=10;

}
class child extends parent{
    int a=20;
    void fun()
    {
        int a=30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    
    }
    public static void main(String[] args) {
      child c=new child();
      c.fun();
    }
}
