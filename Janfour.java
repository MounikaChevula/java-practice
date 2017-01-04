Schema:
  Name          Age      Gender    Education     Country     City       State
1.mounika       21       female    B.tech        India       kadapa     A.P
2.harsha        22       male      B.tech        India       hyderabad  telangana
3.hameed        22       male      B.tech        India       banglore   karnataka
4.manisha       23       femlae    B.tech        India       chennai    tamilnadu


query:
1.identify the total number of boys who are appeared to board exam?
2.identify the total number of girls who are appeared to board exam?
 package javaPracties;
import java.util.Scanner;
public class Query3 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		String name[]=new String[size];
		String edu[]=new String[size];
		String gender[]=new String[size];
		for(int i=0;i<size;i++)
		{
		System.out.println("enter name");
			name[i]=s.next();
			System.out.println("enter education");
			edu[i]=s.next();
			System.out.println("enter gender");
			gender[i]=s.next();
			}
		int count=0;
		int decount=0;
		for(int j=0;j<size;j++)
		{
			if(gender[j].equals("male"))
			{
				count++;
			}
			if(gender[j].equals("female")&&gender[j].equals("status single"))
			{
				decount++;
				
			}
		}
	System.out.println("number of males appeared for exam:"+count);
	System.out.println("number of females whose status is single:"+decount);
}
}

output:
2
enter name
moni
enter education
12
enter gender
female
enter name
moni
enter education
12
enter gender
female
number of males appeared for exam:0
number of females whose status is single:2



Schema:
 movieid        moviename       releasedate        rating      duration
1.xxxxx         ssssss          2015               4            3
2.yyyyy         mmmmmm          2016               3            3
3.zzzzz         pppppp          2017               5            3
4.jjjjj         iiiiii          2015               3            3

Query:
Write a pseudocode to accept movie details and store all the details in array variables
1.Display total movies released btw 2016&2017? 
2.Display total movies having duration after 3hrs?
3.Display total movies having rating btw 4&5?


program:
package javaPracties;
import java.util.Scanner;
public class Movie {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int rel[]=new int[size];
        int dur[]=new int[size];
        double rate[]=new double[size];
       for(int i=0;i<size;i++)
		{
    	   System.out.println("enter the movie released date: ");
			rel[i]=s.nextInt();
			 System.out.println("enter the movie duration: ");
			dur[i]=s.nextInt();
			 System.out.println("enter the movie ratings: ");
			rate[i]=s.nextDouble();
		}
		int count=0,count1=0,count2=0;
		for(int j=0;j<size;j++)
		{
			if(rel[j]>=2016&&rel[j]<=2017)
			{
				count++;
			}
			}
		System.out.println("the movie released date is:"+count);
	for(int m=0;m<size;m++)
	{
		if(dur[m]==3)
		{
			count1++;
		}
		}
	System.out.println("the movie duration is:"+count1);
	for(int n=0;n<size;n++)
	{
	if(rate[n]>3&&rate[n]<=5)
	{
		count2++;
	}
	n++;
	}
	System.out.println("the movie rating is:"+count2);
	}
}


output:
2
enter the movie released date: 
2015
enter the movie duration: 
3
enter the movie ratings: 
5
enter the movie released date: 
2016
enter the movie duration: 
3
enter the movie ratings: 
5
the movie released date is:1
the movie duration is:2
the movie rating is:2
