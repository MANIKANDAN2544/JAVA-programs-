import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	String a;
int count=0,sum=0,p=0,q=0;
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
char[] b=a.toCharArray(); 
for(char c : b)
{
count++;
}
char[] z=new char[count];
for(int x=0;x<count;x++)
{
for(int y=0;y<count;y++)
{
if(a.charAt(x)==b[y])
{
sum++;
}
}
if(sum>1)
{
z[p]=a.charAt(x);
q++;
}
p++;
sum=0;
}
if(q>1)
{
System.out.println("the repeating words in the string are");
for(int v=0;v<=q;v++)
{
System.out.println(z[v]);
}
}
else
{
System.out.println("no repeating words");
}

	}
}
