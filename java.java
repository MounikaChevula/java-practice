/*split method*/
import java.util.Scanner;
class Split
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a string");
String str=s.nextLine();
String arr[]=str.split(" ");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}
output:
enter a string
this is a java program
this
is
a
java
program







/*split method in revere*/
import java.util.Scanner;
class SplitRev
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter string");
String str=s.nextLine();
String arr[]=str.split(" ");
for(int i=arr.length-1;i>=0;i--)
{
System.out.println(arr[i]+" ");
}
}
}


output:
enter string
my name is mounika
mounika
is
name
my





/*java program to find array string length*/
import java.util.Scanner;
class StrLen
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a string");
String str=s.nextLine();
String arr[]=str.split(" ");
System.out.println(arr.length);
}
}

output:
enter a string
my name is mounika
4



/*java program using string buffer*/
import java.util.Scanner;
public class StrBuffer
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
	StringBuffer sb=new StringBuffer(str);
	System.out.println("enter string");
	String newstr=s.nextLine();
	sb.append(newstr);
	System.out.println(sb);
	
		
	}


}	
output:
enter string
my name
enter string
is mounika
my nameis mounika




/*java program using String Builder*/
import java.util.Scanner;
public class StrBuild 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		StringBuilder sb=new StringBuilder(str);
		System.out. println("enter a number");
		int number=s.nextInt();
		sb.append(number);
		System.out.println(sb);
	
		
	}

}
output:
enter a string
mounika
enter a number
123
mounika123





/*java program for counting array character length*/ 
import java.util.Scanner;
class ArrCharLen
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a string");
String str=s.nextLine();
String arr[]=str.split(" ");
int count = 0;
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length();j++)
{
count++;
}
}
System.out.println("number of characters are: "+ count);
}
}
output:
enter a string
hai this is niit
number of characters are: 13


/*java program to find array character length by using tochararray 
public class Tochararray {
public static void main(String args[])
{
	String str="this is niit";
	//char array[]=str.toCharArray();
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		count++;
		
	}
	System.out.println(count);
	
}
}
output:
12





/*overloading program with number of arguements*/

 class Overloading 
 {
public void sum (int a,int b)
			{
            int m=a+b;
         System.out.println(m);
            
		}
public void add(int a,int b,int c)
{
	int n=a+b+c;
	System.out.println(n);
}

public static void main(String args[])
{
	Overloading obj=new Overloading();
	obj.sum(12,13);
	obj.add(5,3,7);

	
}
 }

output:
25
15




/*Overloading program with different arguments*/

 class Overloading 
 {
public void sum (int a,float b)
			{
            float m=a+b;
         System.out.println(m);
            
		}
public void add(float a,int b)
{
	float n=a+b;
	System.out.println(n);
}

public static void main(String args[])
{
	Overloading obj=new Overloading();
	obj.sum(12,13);
	obj.add(5.0f,3);

	
}
 }

output:
25.0
8.0





/*over loading java program with type of arguements*/ 
 class Overloading 
 {
public void sum (float a,float b)
			{
            float m=a+b;
         System.out.println(m);
            
		}
public void add(int a,int b)
{
	int n=a+b;
	System.out.println(n);
}

public static void main(String args[])
{
	Overloading obj=new Overloading();
	obj.sum(12.4f,13);
	obj.add(5,3);

	
}
 }

output:
25.4
8




