/*BankApplication program for deposite,withdrawl&balance enquiry*/
import java.util.Scanner;
class BankApplication
{
Scanner s=new Scanner(System.in);
float bal =20000.0f;
public void Setdetails()
{
System.out.println("1:deposit");
System.out.println("2:withdraw");
System.out.println("3:balance enquiry");
int n=s.nextInt();
switch(n)
{
case 1:
{
deposite();
break;
}
case 2:
{
withdraw();
break;
}
case 3:
{
enquiry();
break;
}
default:
{
System.out.println("invalid entry");
 }
}
}
public void deposite()
{
System.out.println("enter deposite amount");
float amt=s.nextInt();
if((amt%100==0)&&(amt>100)&&(amt<=20000))
{
 bal=bal+amt;
System.out.println("the available bal is:"+bal);
}
else if(amt>20000)
{
System.out.println("enter your pan number");
}
/*else
{
System.out.println("invalid entry");
}*/
}
public void withdraw()
{
System.out.println("enter withdrawl");
float wamt=s.nextInt();
if((wamt<bal)&&(wamt%100==0)&&(wamt<=20000))
{
bal=bal-wamt;
System.out.println("available bal is:"+bal);
}
else
{
System.out.println("invalid entry");
}
}
public void enquiry()
{
System.out.println("available bal is:"+bal);
}
public static void main(String args[])
{
BankApplication obj=new BankApplication();
obj.Setdetails();
}
}

output:
1:deposit
2:withdraw
3:balance enquiry
1
enter deposite amount
2000
the available bal is:22000.0

C:\Users\MRuser\Desktop>java BankApplication
1:deposit
2:withdraw
3:balance enquiry
2
enter withdrawl
2000
available bal is:18000.0

C:\Users\MRuser\Desktop>java BankApplication
1:deposit
2:withdraw
3:balance enquiry
3
available bal is:20000.0



