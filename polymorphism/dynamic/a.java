class parent{
    void display(){
        System.out.println("parent class");
    }
}
class child extends parent
{
    void display(){
        super.display();
        System.out.println("child class");
    }
}
class demo{
    public static void main(String[] args) {
       parent c=new child();
        c.display();
    }

}