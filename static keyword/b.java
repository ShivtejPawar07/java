class Demo{
    int a;
    static int b=10;
}
class Main{
    public static void main(String[] args) throws Exception {
        Demo obj=new Demo();
        System.out.println(obj.a);
        System.out.println(Demo.b);
        System.out.println(new Demo().b);
    }
}