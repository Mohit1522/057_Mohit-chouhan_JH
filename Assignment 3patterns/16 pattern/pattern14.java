class pattern14
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<i;j++)
{
System.out.print(" ");
}
for(int j=i;j<=5;j++)
{
System.out.print("* ");
}
System.out.println();
}

for(int i=1;i<=5;i++)
	if(i>1)
	{
{
for(int j=5;j>i;j--)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
	}
}
}