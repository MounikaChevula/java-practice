                      IOStreams
                     

query:
     java program to create a file in specified path

program
package iostreams;
import java.io.*;
public class practice1 {
public static void main(String args[])
{
	try
	{
		File f=new File("F:\\a.txt");
				f.createNewFile();
		if(f.exists()){
			System.out.println("success");
		}                                               
		
		else
		{
			System.out.println("not success");
		}
		}
	
catch(Exception e)
	{
	e.getStackTrace();
}
}
}

output:
success



Query 2:
       java program to create a  directory in specific path        

program:
package iostreams;
import java.io.*;
public class practice1 {
public static void main(String args[])
{
	try
	{
		File f=new File("F:\\b.doc");
				f.createNewFile();
		if(f.exists()){
			System.out.println("success");
		}                                               
		
		else
		{
			System.out.println("not success");
		}
		}
	
catch(Exception e)
	{
	e.getStackTrace();
}
}
}

output:
successs




query 3:
       java program to create a directory in specified path

program:
package iostreams;
import java.io.*;
public class practice1 {
public static void main(String args[])
{
	try
	{
		File f=new File("F:\\dir2");
				f.mkdir();
		if(f.exists()){
			System.out.println("success");
		}                                               
		
		else
		{
			System.out.println("not success");
		}
		}
	
catch(Exception e)
	{
	e.getStackTrace();
}
}
}

output:
success




query:
     Write  data into specific file using FileWriter class

Program:
package iostreams;
import java.io.*;
public class practice2 {
public static void main(String args[])
{
	try{
	FileWriter fw=new FileWriter("F:\\a.txt");
	fw.write(123);
	fw.write("mounika");
	fw.flush();
	}
	catch(Exception e)
	{
	e.getStackTrace();		
}
}
}

output:
{mounika
 


Query:
Write  data into specific file using FileReader class

program
package iostreams;
import java.io.*;
public class practice3 {
public static void main(String args[])
{
	try
{
FileReader fr=new FileReader("f:\\a.txt");
int i;
while((i=fr.read())!=-1)
{
	System.out.print((char)i);
}
}
	catch(Exception e)
	{
		e.getStackTrace();
	}
}
}

output:
{mounika


Query :
      java programming to write a data into specific file using BufferedWriter classes

program
package iostreams;
import java.io.*;
public class practice4 {
public static void main(String args[])
{
	try{
		 File f=new File("f:\\d.txt");
		FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("hii my name is mounika");
	bw.write(143);
	bw.flush();
}
	catch(Exception e)
	{
		e.getStackTrace();
	}
}
}

output:
hii my name is mounika?


Query:

java programming to write a data into specific file using BufferedReader classes


program:
package iostreams;
import java.io.*;
public class practice5 {
public static void main(String args[])
{
	try
	{
        FileReader rf=new FileReader("f:\\a.txt");
		BufferedReader br=new BufferedReader(rf);
		int c;
		while((c=br.read())!=-1)
		{
			char e = (char)c;
			System.out.print(e);
	}
	}
		catch(Exception e)
		{
			e.getStackTrace();
		}
}
}

output:
{mounika helloooooooooooooooo



Query:
     program to write data into file using printWriter class

program:
package iostreams;
import java.io.*;
public class practice6 {
	public static void main(String args[])
	{
		try{
			File f=new File("f:\\e.txt");
		PrintWriter pw=new PrintWriter(f);
		pw.write("good");
		pw.write("morning");
		pw.write(123);
		pw.flush();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		

}
}

output:
goodmorning{


Query:
     java program to write a data into file using FileOutputStream class
program:
package iostreams;
import java.io.*;
public class practice7 {
public static void main(String args[])
{
	try{
		String str="harsha";
		char []d=str.toCharArray();
		byte[] c=new byte[d.length];
		for(int i=0;i<d.length;i++)
		{
			c[i]=(byte)d[i];
			System.out.println(c[i]);
		}

		File f=new File("f:\\g.txt");
	FileOutputStream fos=new FileOutputStream(f);
	fos.write(123);
	fos.flush();
	}
	catch(Exception e)
	{
	e.getStackTrace();	
	}
	
}
}

output:
104
97
114
115
104
97
123

Query:
java program to write a data into file using FileInputStream class

program:
package iostreams;
import java.io.*;
public class fileinputreader {
public static void main(String args[])
{
	try
	{
	FileInputStream fi=new FileInputStream("f:\\a.txt");
	int i;
	while((i=fi.read())!=-1)
	{
		System.out.print((char)i);
	}
	}
	catch(Exception e)
	{
		e.getStackTrace();
	}
	
	
	
}
}
output:
hi thi niit dsfnsk kksdksfkdsfsdf,s  


Query:
     java program to read data from single file and write data in single file using ByteStreams
program:

package iostreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class sfwd2ofwd {
public static void main(String []args) throws IOException
{
	FileInputStream fis = new FileInputStream("f:/text.txt");
	FileOutputStream fos = new FileOutputStream("f:/g.txt");
	int c;
	while((c=fis.read())!=-1)
	{
		fos.write(c);
	
	}
	fos.flush();
	fos.close();
	
	fis.close();
}
}
output:
hello niit

Query:
     java program to read data from single file and write data in single file using ByteStreams
program:
package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sf2mf {
public static void main(String []args) throws IOException
{
	FileInputStream fis = new FileInputStream("e:/mounika.txt");
	FileOutputStream fos = new FileOutputStream("e:/harsha/mounika1.txt");
	FileOutputStream fos2 = new FileOutputStream("e:/harsha.txt");
	int c;
	while((c=fis.read())!=-1)
	{
		fos.write(c);
		fos2.write(c);
	}
	fos.flush();
	fos2.flush();
	fos.close();
	fos2.close();
	fis.close();
}
}
output:
     hii my friend
     hii my friend


Query:


package iostreams;
java program to read data from single file and write data in single file using ByteStreams

program:
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sf2mf {
public static void main(String []args) throws IOException
{
	FileInputStream fis = new FileInputStream("e:/mounika.txt");
	FileOutputStream fos = new FileOutputStream("e:/harsha/mounika1.txt");
	FileOutputStream fos2 = new FileOutputStream("e:/harsha.txt");
	int c;
	while((c=fis.read())!=-1)
	{
		fos.write(c);
		fos2.write(c);
	}
	fos.flush();
	fos2.flush();
	fos.close();
	fos2.close();
	fis.close();
}
}

output:
      monika moni


Query:
     java program to read image and write image in specific path

program:
 package iostreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Image {
public static void main(String args[])throws IOException
{
	FileInputStream fis = new FileInputStream("e:/mounika.jpg");
	FileOutputStream fos = new FileOutputStream("e:/harsha/mounika1.jpg");
	int c;
	while((c=fis.read())!=-1)
	{
		fos.write(c);
	}
	fos.flush();
	fos.close();
	fis.close();
}
}


Query:
java program to read image and write image in specific file

program:
    package iostreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Image {
public static void main(String args[])throws IOException
{
	FileInputStream fis = new FileInputStream("e:/mounika.jpg");
	FileOutputStream fos = new FileOutputStream("e:/harsha/mounika1.txt");
	int c;
	while((c=fis.read())!=-1)
	{
		fos.write(c);
	}
	fos.flush();
	fos.close();
	fis.close();
}
}
