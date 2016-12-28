/*java program to read the values from user like name,mobile number,mail and print all the details
conditions:1.name starts with N&length of name<15
           2.mobile length should be 10 digits
           3.email should contain @*/ 


import java.util.Scanner;
class Program
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the mail");
String mail=s.nextLine();
if(mail.contains("@"))
{
System.out.println("the mail is valid");
}
else
{
System.out.println("the mail is invalid");
}
System.out.println("enter the name");
String name=s.nextLine();
if((name.startsWith ("N"))&&(name.length()<15))
{
System.out.println("the name is valid");
}
else
{
System.out.println("the name is invalid");
}
System.out.println("enter mobile number");
String num=s.next();
if(num.length()==10)
{
System.out.println("the number is valid");
}
else
{
System.out.println("the number is not valid");
}
}
}
output:
enter the mail
mounikachevula6@gmail.com
the mail is valid
enter the name
mounika
the name is invalid
enter mobile number
9866672339
the number is valid






     Array Programs
/*print even values in given array*/
import java.util.Scanner;
class Even
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a array");
int array=s.nextInt();
int arr[]=new int[array];
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
for(int j=0;j<arr.length;j++)
{
if(arr[j]%2==0)
{
System.out.println(arr[j]);
}
}
}
}

output:
enter a array
5
1
2
3
4
6
2
4
6




/*java program to print even location*/
import java.util.Scanner;
class EvenLoc
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter array");
int array=s.nextInt();
int arr[]=new int[array];
System.out.println("Enter the values of array: ");
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
System.out.println("The even values are: ");
for(int j=0;j<arr.length;j++)
{
if(j%2==0)
{
System.out.println(arr[j]);
}
}
}
}


output:
enter array
5
enter the values of array:
3
4
5
6
7
the even values are:
3





/*java program to find mid location value*/
import java.util.Scanner;
class MidValue
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter array");
int array=s.nextInt();
int arr[]=new int[array];
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
if(arr.length%2==0)
{
System.out.println(arr[(arr.length/2)-1]+" " +arr[(arr.length/2)]);
}
else
{
System.out.println(arr[arr.length/2]);
}
}
}


output:
enter array
5

1
2
3
4
5

3



/*program for sum of all given values in given array*/
import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter array");
int array=s.nextInt();
int sum=0;
int arr[]=new int[array];
for(int j=0;j<arr.length;j++)
{
arr[j]=s.nextInt();
}
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
System.out.println(sum);
}
}

output:
enter array
5
1
2
3
4
5
15


 