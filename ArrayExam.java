import java.util.Scanner;
class ArrayExam
{
public static void main(String[] args)
{
int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the array size");
i=sc.nextInt();
int[] a1=new int[i];
System.out.println("enter the values");
for(int a=0;a<i;a++)
{
a1[a]=sc.nextInt();
}
int largest=a1[0];
for(int b=1;b<i;b++)
{
if(largest<a1[b])
{
largest=a1[b];
}
}
int secondlargest=a1[0];
for(int c=1;c<i;c++)
{
if(secondlargest<a1[c] && a1[c]!=largest)
{
secondlargest=a1[c];
}
}
System.out.println("second largest"+secondlargest);
}
}


