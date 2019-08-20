import java.util.Scanner;
class GenericDemo<T>
{
public T sub;
public void GetValue(T hey)
{
sub=hey;
}
public T ReturnValue()
{
return sub;
}
public static void main(String[] args)
{
GenericDemo<Integer> obj1=new GenericDemo<Integer>();
obj1.GetValue(10);
System.out.println(obj1.ReturnValue());
GenericDemo<String> obj2=new GenericDemo<String>();
obj2.GetValue("JAVA");
System.out.println(obj2.ReturnValue());
}
}

