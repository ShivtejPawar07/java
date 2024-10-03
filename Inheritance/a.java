class parent{
    parent()
    {
        System.out.println("parent default constructor");
    }
    parent(int a)
    {
        System.out.println("parent paremeterized constructor");
    }
}
class child extends parent{
    child()
    {
        System.out.println("child default constructor");
    }
    child(int a)
    {
        System.out.println("child paremeterized constructor");
    }
}
class demo{
 public static void main(String[] args) {
    child c=new child();
 }
}