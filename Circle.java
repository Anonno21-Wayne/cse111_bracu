public class Circle extends Shape{
  public int radius;
  public Circle(){
    super.name="Circle";
 super.color="Red";
  }
  public void area(){
    double totalArea=3.1416*radius*radius;
    System.out.println("Area of Red Circle: "+totalArea);
  }
}
    
  