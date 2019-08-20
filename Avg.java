import java.util.Scanner;
class Avg
{
public static void main(String[] args)
{
int []arr=new int[10];
float avg;
int sum=0;
int i;
Scanner sc=new Scanner(System.in);
for(i=0;i<10;i++)
{
arr[i]=sc.nextInt();
sum=sum+arr[i];
}
System.out.println(sum);
avg=(sum/i);
System.out.println(avg);
}
}

