import java.util.Scanner;
abstract class Shape
{
double area,perimeter;
abstract void Area();
abstract void Perimeter();
void DisplayArea()
{
System.out.println("area :"+area);
}
void DisplayPerimeter()
{
System.out.println("perimeter :"+perimeter);
}
}
class Square extends Shape
{
float side;
Scanner sc=new Scanner(System.in);
void GetSide()
{
System.out.println("enter side");
side=sc.nextFloat();
}
void Area()
{
area= side*side;
}
void Perimeter()
{
perimeter= 4*side;
}
}
class Rectangle extends Shape
{
float l,b;
Scanner sc=new Scanner(System.in);
void GetLength()
{
System.out.println("enter length,breath");
l=sc.nextFloat();
b=sc.nextFloat();
}
void Area()
{
area= l*b;
}
void Perimeter()
{
perimeter= 2*(l+b);
}
}
class MainShape
{
public static void main(String[] args)
{
int a;
System.out.println("enter");
System.out.println("1.square");
System.out.println("2.rectangle");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
switch (a)
{
case 1:
Square ob1=new Square();
ob1.GetSide();
ob1.Area();
ob1.Perimeter();
ob1.DisplayArea();
ob1.DisplayPerimeter();
break;
case 2:
Rectangle ob2=new Rectangle();
ob2.GetLength();
ob2.Area();
ob2.Perimeter();
ob2.DisplayArea();
ob2.DisplayPerimeter();
break;
}
}
}