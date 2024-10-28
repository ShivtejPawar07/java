class demo{
    void add(){
        int a=10,b=20;
        System.out.println(a+b);
    } 
    void add(int x,int y){
        System.out.println("add="+(x+y));
    } 
    void add(double x,double y){
        System.out.println("add="+(x+y));
    } 
    public static void main(String[] args) {
        demo d=new demo();
        d.add();//30
        d.add(100,200);//300
        d.add(10.10,20.20);//30.30
    }
}