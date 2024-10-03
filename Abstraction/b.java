abstract class shape {
  abstract void cal_area();
    
}
class circle extends shape{
    void cal_area()
    {

    }
}
class rectangle extends shape{
    void cal_area()
    {
        
    }
}
class demo{
    public static void main(String[] args) {
        shape s=new shape();
        s.cal_area();
    }
}
