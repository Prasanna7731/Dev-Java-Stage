package AbstractionDemo3;
import static java.lang.System.*;
abstract class Shape
{ abstract double area();
}
class Triangle extends Shape
{ double base,height;
Triangle(double base,double height)
{this.base=base;
this.height=height;
}
public double area()
{ double area=(0.5)*(base*height);
return area;
}
}
public class AbstractionDemo3 
{ public static void main(String args[])
{ Shape s;
Triangle triangle=new Triangle(5,13);
//upcasting
s=triangle;
double a=triangle.area();
out.println("Area:\t"+triangle.base);
out.println("Area:\t"+triangle.height);
out.println("Area:\t"+triangle.area());
}
}




