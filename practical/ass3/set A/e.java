interface Operation{
  double area();
  double volume();
  double pi=3.142;

}
class cylinder implements Operation{
  double r;
  double h;
  cylinder(double r,double h)
  {
     this.r=r;
     this.h=h;
  }
  public double area()
  {
      return 2*pi*r*(r+h);

  }
  public double volume()
  {
    return pi*r*r*h;
  }

}
class demo{
  public static void main(String[] args) {
    cylinder c=new cylinder(2,1);
    System.out.println("area="+c.area());
    System.out.println("volume="+c.volume());
  }

}