import java.util.Scanner;
class Q2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("plss enter the number");
long n=sc.nextLong();
long f=1;
for(long i=1;i<=n;i++)
{
f=f*i;
}
System.out.println(f);
}
}
           