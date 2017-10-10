# project
assignment

package hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Entry 
{

   void enter()
   {
	   
	   Scanner s1=new Scanner(System.in);
	   System.out.println("Enter 1 to Confirms a Customer Entered into Hotel");
	   int e=s1.nextInt();
	   System.out.println("Enter 2 to allocate a table to Customer and Show him Menu ");
	   int f=s1.nextInt();
	   if(f==2)
	   {
		   System.out.println("Here Code Will Work As a Barer and it Will Allocates a Table to Customer and HandOvers a menulist to the Customer");
		   Map m1=new HashMap();
		   m1.put(1,"tea");
		   m1.put(2,"Coffie");
		   m1.put(3,"Idly");
		   m1.put(4,"Dosa");
		   m1.put(5,"Puri");
		   m1.put(6,"OnionRoast");
		   m1.put(7,"Plane");
		   m1.put(8,"Vada");
		   m1.put(9,"Upma");
		   m1.put(10,"masalaDosa");
		   Set set=m1.entrySet();
		   Iterator itr=set.iterator();
		   while(itr.hasNext())
		   {   
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+":"+entry.getValue());  
		   }  
           
		   System.out.println("Now Customer Entered Number of Items He Want");
		   int n=s1.nextInt();
		   if(n==1)
		   {
			   System.out.println("Customer Wants Only One Item");
			   
			   System.out.println("Now Enter the Key U Want from the List");
			   int k=s1.nextInt();
			  System.out.println("Customer Ordered Items are : "+m1.get(k));
			  
			  System.out.println("Customer Ordered List Sent to Kitchen");
		   }
		   if(n==2)
		   {
			   System.out.println("Customer Wants Two Items");
			   
			   System.out.println("Now Enter the Key U Want from the List");
			   int k=s1.nextInt();
			   int k1=s1.nextInt();
			   
			   String item1=(String) m1.get(k);
			   String item2=(String) m1.get(k1);
			   List l1=new ArrayList();
			   l1.add(item1);
			   l1.add(item2);
			   System.out.println("Customer Ordered Items are : "+l1);		
			   
			   System.out.println("Customer Ordered List Sent to Kitchen");
		   }
		   if(n==3)
		   {
               System.out.println("Customer Wants Three Items");
			   
			   System.out.println("Now Enter the Key U Want from the List");
			   int k1=s1.nextInt();
			   int k2=s1.nextInt();
			   int k3=s1.nextInt();
			   
			   String item1=(String) m1.get(k1);
			   String item2=(String) m1.get(k2);
			   String item3=(String) m1.get(k3);
			   List l1=new ArrayList();
			   l1.add(item1);
			   l1.add(item2);
			   l1.add(item3);
			   System.out.println("Customer Ordered Items are : "+l1);	
			   
			   System.out.println("Customer Ordered List Sent to Kitchen");
		   }
		   if(n==4)
		   {
               System.out.println("Customer Wants Four Items");
			   
			   System.out.println("Now Enter the Key U Want from the List");
			   int k1=s1.nextInt();
			   int k2=s1.nextInt();
			   int k3=s1.nextInt();
			   int k4=s1.nextInt();
			   
			   String item1=(String) m1.get(k1);
			   String item2=(String) m1.get(k2);
			   String item3=(String) m1.get(k3);
			   String item4=(String) m1.get(k4);
			   List l1=new ArrayList();
			   l1.add(item1);
			   l1.add(item2);
			   l1.add(item3);
			   l1.add(item4);
			   System.out.println("Customer Ordered Items are : "+l1);	
			   
			   System.out.println("Customer Ordered List Sent to Kitchen");
		   }
		   if(n==5)
		   {
               System.out.println("Customer Wants Five Items");
			   
			   System.out.println("Now Enter the Key U Want from the List");
			   int k1=s1.nextInt();
			   int k2=s1.nextInt();
			   int k3=s1.nextInt();
			   int k4=s1.nextInt();
			   int k5=s1.nextInt();
			   
			   String item1=(String) m1.get(k1);
			   String item2=(String) m1.get(k2);
			   String item3=(String) m1.get(k3);
			   String item4=(String) m1.get(k4);
			   String item5=(String) m1.get(k5);
			   List l1=new ArrayList();
			   l1.add(item1);
			   l1.add(item2);
			   l1.add(item3);
			   l1.add(item4);
			   l1.add(item5);
			   System.out.println("Customer Ordered Items are : "+l1);		
			  
			   System.out.println("Customer Ordered List Sent to Kitchen");
		   }
	   }
   }
	public static void main(String[] args) 
	{
	   Entry e=new Entry();
	   e.enter();
	}
   
   
}

