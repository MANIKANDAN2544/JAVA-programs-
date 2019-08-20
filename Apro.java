import java.util.Scanner;
class Apro
{
public static void main(String[] ar)
{
Scanner sc=new Scanner(System.in);
int l,i;
l=sc.nextInt();
int[] arr=new int[l];
for(i=0;i<l;i++)
{
arr[i]=sc.nextInt();
}
for(int p=0;p<l;p++)
{
for(int q=p+1;q<l;q++)
{
if(arr[p]>arr[q])
{
int temp=arr[p];
arr[p]=arr[q];
arr[q]=temp;
}
}
}
for(int o=0;o<l;o++)
{
System.out.println(arr[o]);
}
}
}

6 3 5 9 1
arr[0]=6
arr[1]=3
arr[2]=5
arr[3]=9
arr[4]=1

 