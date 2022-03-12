class pattern15
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
	if(i>0&&i<3)
	{
for(int j=1;j<=i;j++)
{
System.out.print("* ");
}
}

if(i>2&&i<4)
	{
for(int j=1;j<=1;j++)
{
System.out.print("*  *");
}
}
if(i>3&&i<5)
	{
for(int j=1;j<=1;j++)
{
System.out.print("*   *");
}
}
if(i>4&&i<6)
	{
for(int j=1;j<=1;j++)
{
System.out.print("******");
}
}
System.out.println();
}
}
}