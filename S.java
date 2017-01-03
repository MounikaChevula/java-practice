Schema:


  name          age        city     salary      country      department     
1.mounika       21         kadapa   50000       India        HR
2.harsha        21         hyd      55000       India        FIN
3.hameed        21         hyd      40000       India        OPER
4.gandi         21         hyd      35000       India        ACC

Query1:
     find the number of whose salary is greater than 30000?   

package javaPracties;

import java.util.Scanner;
public class Details 
{
	public static void main(String aa[])
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int j=0;j<size;j++)
		{
			arr[j]=s.nextInt();
		}
		
        int i=0;
        int count=0;
        while(i<size)
        {
        	if(arr[i]>=30000)

        {
        count=count+1;		
        }
        	i++;
        }
		System.out.println("the number of persons salary got>30000:"+ count);
	}

}



output:2
35000
20000
the number of persons salary got>30000:1







Schema:
        name          age        salary          department
       1.mounika      21         500000          HR
       2.sai          20         600000          FIN
       3.janu         25         250000          ope
       4.chandu       20         450000          acc



Query2:
       count employee in each department whose sal is >50000?


import java.util.Scanner;
 class Employee {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int[size];
	String[] dep=new String[size];
	int[] sal=new int[size];
for(int i=0;i<size;i++)
{
	System.out.println("enter a department");
	  dep[i]=s.nextLine();
	System.out.println("enter salary");
	  sal[i]=s.nextInt();
}
int i=0;
int count=0;
while(i<size)
{
	if(dep[i]==("hr")&&sal[i]>50000)
	{
		count++;
	}
	i++;
}
int j=0;
int count1=0;
while(j<size)
{
	if(dep[i]==("fin")&&sal[i]>50000)
	{
		count1++;
	}
	j++;
}
	int m=0;
	int count2=0;
	while(m<size)
	{
		if(dep[i]=="oper"&&sal[i]>50000)
		{
			count2++;
		}
		m++;
	}
		int n=0;
		int count3=0;
		while(n<size)
		{
			if(dep[i]=="acc"&&sal[i]>50000)
			{
				count3++;
			}
			n++;
}
		System.out.println("the num of people in hr department sal>50000 are:"+count);
		System.out.println("the num of people in fin department sal>50000 are:"+count1);
		System.out.println("the num of people in oper department sal>50000 are:"+count2);
		System.out.println("the num of people in acc department sal>50000 are:"+count3);
}
			}		

output:
size of record:3
enter the department:
acc
enter the salary
51000
enter the department:
fin
enter the salary
25000
enter the department:
hr
enter the salary
60000
	
the num of people in hr department sal>50000 are:1
the num of people in fin department sal>50000 are:0
the num of people in oper department sal>50000 are:0
the num of people in acc department sal>50000 are:1


query3:
sum of digits for a given  number

import java.util.Scanner;
 public class SumOfDigits 
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int n;
System.out.print("Enter  integer: ");
n = in.nextInt();
int sum = 0;
while (n != 0)
{
sum += n % 10;
n /= 10;
}
System.out.println("Sum of digits: " + sum);
}
}
output:
Enter a  integer: 56
Sum of digits: 11
