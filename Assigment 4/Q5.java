import java.util.Scanner;
class Q5
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("plss enter the year");
int n=sc.nextInt();
if(n%4==0 || n%400==0 && n%100!=0)
{
System.out.println("its leap year");
}
else
{
System.out.println("its not leap year");
}

}
}
