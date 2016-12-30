/*List program in collection*/

import java.util.*;
public class CollList {
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add("mounika");
		al.add(123);
		al.add(true);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

output:
mounika
123
true







/*java program using hashset*/
import java.util.*;
public class Collset {
	public static void main(String args[])
	{
	 HashSet hs=new HashSet();
		hs.add("mounika");
		hs.add("bujji");
		hs.add(123);
		hs.add(true);
		hs.add(123);
		hs.add("bujji");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
output:
bujji
mounika
true
123
