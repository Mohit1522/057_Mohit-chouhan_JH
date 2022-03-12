class pattern16
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=i;j<5;j++)
{
System.out.print(" ");
}
if(i>0 && i<3)
{
	for(j=1;j<=i;j++)
	{
System.out.print("* ");
	}
}
if(i>2 && i<4)
{
System.out.print("* *");
}
if(i>3 && i<5)
{
System.out.print("*  *");
}
if(i>4 && i<6)
{
System.out.print("*****");
}
System.out.println();
}
}
}