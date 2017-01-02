/*java program using switch*/
import java.util.Scanner;
class M
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int num=s.nextInt();
for(int i=1;i<=7;i++)
switch(i)
{
case 1:if(num==1)
{
System.out.println("sunday");
}
else
{
break;
}
case 2:if(num==2)
{
System.out.println(" monday");
}
else
{
break;
}
case 3:if(num==3)
{
System.out.println("tuesday");
}
else
{
break;
}
case 4:if(num==4)
{
System.out.println("wensday");
}
else
{
break;
}
case 5:if(num==5)
{
System.out.println("thursday");
}
else
{
break;
}
case 6:if(num==6)
{
System.out.println("friday");
}
else
{
break;
}
case 7:if(num==7)
{
System.out.println("saturday");
}
else
{
break;
}
default:
{
System.out.println("hhhh");
break;
}
}
}
}
output:
enter the number
2
monday


/*java program using if condition*/
import java.util.Scanner;
class I
{
public static void main(String args[])
{
int c,d;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int a=s.nextInt();
System.out.println("enter b number");
int b=s.nextInt();
if(a+b==10)
{
System.out.println("c");
}
else
{
System.out.println("d");
}
}
}
output:
enter a number
6
enter b number
4
c

C:\java saving>java If
enter a number
2
enter b number
3
d



/*java program for finding who are eligible for vote*/ 
import java.util.Scanner;
public class Age {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
			
			int size = s.nextInt();
			int arr[]=new int[size];
		System.out.println("enter the age");
		for(int j=0;j<size;j++)
		{
			arr[j]=s.nextInt();
		}
		int count=0;
		for(int i = 0;i<size;i++)
		{
			if(arr[i]>=18)
			{
				count++;
			}
		}
			
			
		System.out.println(count);
}}
output:
enter the size
3
12
18
19
2






/*java program to find how many members are males&females*/

import java.util.Scanner;
public class Population {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String arr[]=new String[10];
		for(int i=0;i<=9;i++)
		{
			System.out.println("enter the gender");
	      arr[i]=s.next();	
		}
		int count=0;
		int ecount=0;
		for(int j=0;j<=9;j++)
			
		{
			if(arr[j].equals("male"))
			{
				count++;

			}
			else
			{
				ecount++;
			}
					
		
	}
		System.out.println(count);
		System.out.println(ecount);
}

}
output:
enter the gender
male
enter the gender
female
enter the gender
male
enter the gender
male
enter the gender
female
enter the gender
male
enter the gender
female
enter the gender
male
enter the gender
female
enter the gender
female
5
5