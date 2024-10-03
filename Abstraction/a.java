class shape{
    void area()
    {

    }
}
class rectangle extends shape{
    void area()
    {

    }
}
class square extends shape{
    void area()
    {

    }
}
class triangle extends shape{


}
class circle extends shape{


}
class demo{
    public static void main(String[] args) {
        shape []s=new shape[4];
        s[0]=new rectangle();
        s[1]=new square();
        s[2]=new triangle();
        s[3]=new circle();

        for(int i=0;i<4;i++)
        {
            s[i].area();
        }

    }
}