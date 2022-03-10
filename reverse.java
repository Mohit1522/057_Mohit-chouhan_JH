import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int r= sc.nextInt();
while (r > 0)
{
int z =r%10;
System.out.print(z);
r= r/10;
}

}
}