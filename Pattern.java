import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
String str;
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
int l=str.length();
int x=0;
char arr[][]=new char[l][l];
for(int i=0;i<l;i++)
{
arr[i][i]=str.charAt(i);
}
for(int j=l-1;j>=0;j--)
{
arr[j][x]=str.charAt(j);
x++;
}
for(int k=0;k<=l-1;k++)
{
for(int q=0;q<=l-1;q++)
{
System.out.print(arr[k][q]);
}
System.out.println();
}
}
}