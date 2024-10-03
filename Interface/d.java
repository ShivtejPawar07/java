// interface demo{
//  /*     void fun()//CE
//     {

//     }*/
// static void fun()
//     {

//     }
//   /*  default void fun()
//     {

//     }*/
    

// }
/**
 * d
 */
 interface demo {
 default void fun(){
    System.out.println("inter face demo fun dafault fun");
 }
    
}
class test implements demo{

}
class abstractiondemo{
    public static void main(String[] args) {
        test t=new test();
        t.fun();
        demo d=new test();
        d.fun();

    }
}