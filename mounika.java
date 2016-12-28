/*string concate*/
public class Concat {
        public static void main(String args[]){
               String str1 = "Hello";
                String str2 = " World";
                String str3 = str1 + str2;
                System.out.println(str3);
}
}
output:
Hello World






/*string length*/

 class Length
{
public static void main(String args[])
{
String str1=("hii gud morning");
System.out.println("String length:");
System.out.println(str1.length());
}
}
output:
string length:
15




/*Converting String lowercase to UpperCase*/
class UpperCase
{
public static void main(String args[])
{
String str=("hii gudmrng");
System.out.println(str);
String Upper=str.toUpperCase();
System.out.println(Upper);
}
}
output:
hii gudmrng
HII GUDMRNG


/*
class LowerCase
{
public static void main(String args[])
{
String str=("HII GUDMRNG");
System.out.println(str);
String Lower=str.toLowerCase();
System.out.println(Lower);
}
}
output:
HII GUDMRNG
hii gudmrng



/*UsingcharAt()*/
class ExampleChar
{
public static void main(String args[])
{
String str="hii gdmrng";
for(int i=0;i<str.length();i++)
{
System.out.println(str.charAt(i));
}
}
}
output:
h
i
i

g
d
m
r
n
g

