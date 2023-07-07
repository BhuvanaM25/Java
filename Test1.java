import java.util.*;
class Test1
{
    public static void main(String[] args)
    {
        Rectangle t = new Rectangle(2, 3);
        System.out.println("area: "+t.area());
        System.out.print("perimeter: "+ t.perimeter());
    }
}
class Rectangle
{
    int l,b;
    public Rectangle(int length,int breadth)
    {
        l=length;
        b=breadth;
    }
    public float area()
    {
        return (float)(l*b);
    }
    public float perimeter()
    {
        return l+b;
    }
}

 