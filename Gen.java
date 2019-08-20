class Gen<X,Y>
{
public X ass;
public Y hey;
public void Getvalue(X a,Y b)
{
ass=a;
hey=b;
}
public X display1()
{
return ass;
}
public Y display2()
{
return hey;
}
public static void main(String[] args)
{
Gen<Integer,String> cgd=new Gen<Integer,String>();
cgd.Getvalue(10,"java");
System.out.println(cgd.display1());
System.out.println(cgd.display2());
Gen<String,Integer> cg=new Gen<>();
cg.Getvalue("java",10);
System.out.println(cg.display1());
System.out.println(cg.display2());
}
}