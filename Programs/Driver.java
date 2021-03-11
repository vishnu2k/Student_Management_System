package students;
import java.io.*;
import java.util.*;
public class Driver
{
	public static void main(String[] args) throws Exception
	{
		Scanner ob1=new Scanner(System.in);
		FileReader o=new FileReader("C:\\Users\\S vishnu kumar\\Desktop\\mini project final\\user.csv");
		BufferedReader ob=new BufferedReader(o);
		String g,u,p,name="";
		int f=0;
		System.out.print("UserName :  ");
		u=ob1.next();
		System.out.print("Password :  ");
		p=ob1.next();
		System.out.println("\n");
		while((g=ob.readLine())!=null)
		{
			String s[]=g.split(",");
			if(s[2].equalsIgnoreCase(u)==true && s[1].equals(p))
			{
				f=1;
				name=s[0];
				System.out.printf("Welcome  "+s[0]+" !");
				break;
			}
		}
		if(f==0)
		{
			System.out.println("Sorry Try again\n");
			Driver.main(new String [] {});
		}
		Student s1=new Student(name,u); 
		int k=1;
		Scanner b=new Scanner(System.in);
		while(k==1)
		{
			System.out.println("\n\nEnter 1 for Applying pass");
			System.out.println("Enter 2 for Request status");
			System.out.println("Enter 3 for Request transport timings");
			System.out.println("Enter 4 for Course material");
			System.out.println("Enter 5 for Borrow Book");
			System.out.println("Enter 6 to Logout");
			System.out.print("\nEnter your choice:");
			int ch=b.nextInt();
			if(ch==1)
			{	
				System.out.print("\nEnter year:");
				int y=b.nextInt();
				System.out.print("Enter month:");
				int m=b.nextInt();
				System.out.print("Enter day:");
				int day=b.nextInt();
				GatePassSystem g1=new GatePassSystem();
				g1.setStatus(y,m,day);
				s1.setPassStatus(g1.getStatus());
				System.out.print(s1.getPassStatus());
			}
			else if(ch==2)
			{
				DisplayStatus l=new DisplayStatus();
				l.reqStatus(name);
			    s1.setDetails("\n"+l.getStatus());
			    System.out.println(s1.getDetails());
			}
			else if(ch==3)
			{
				String s2,e1,l1;
				System.out.print("Enter starting point: ");
				s2=b.next();
				System.out.print("Enter destination: ");
				e1=b.next();
				System.out.print("Enter mode of transport: ");
				l1=b.next();
				System.out.println("\n");
				TransportSystem dl=new TransportSystem();
				dl.Results(s2,e1,l1);
				s1.setTransport(dl.getH());
				System.out.println(s1.getTransport());
			}
			else if(ch==4)
			{
				CourseMaterial cm=new CourseMaterial();
				System.out.print("Enter Course code: ");
				String k1=b.next();
				cm.search(k1);
				s1.setCourse(cm.getF());
				System.out.println(s1.getCourse());
			}
			else if(ch==5)
			{
				System.out.println("\nLibrary Database:\n");
				FileReader of=new FileReader("C:\\Users\\S vishnu kumar\\Desktop\\mini project final\\Library.csv");
				BufferedReader or=new BufferedReader(of);
				String g1;
				System.out.println("Book Id\t\tBook Title\t\t\t\t\t\t\tTopic\t\t\tAuthor\t\tAvailable");
				System.out.println("*******\t\t*********\t\t\t\t\t\t\t******\t\t\t******\t\t********\n\n");
				while((g1=or.readLine())!=null)
				{
					String s[]=g1.split(",");
					for(int i=0;i<s.length;i++)
						System.out.print(s[i]+"\t\t\t");
					System.out.println();
				}
				System.out.println("\n");
				System.out.print("Enter Id of Book:");
				String s=b.next();
				or.close();
				of.close();
				LibrarySystem l1=new LibrarySystem();
				l1.borrowBook(s);
				s1.setBookStatus(l1.getBookStatus());
				System.out.println(s1.getBookStatus());
				if(s1.getBookStatus().equalsIgnoreCase("Book not Available")==false)
				{
					Librarian l2=new Librarian();
					System.out.print("\nEnter bill number: ");
					int n1=b.nextInt();
					l2.borrow(l1.getBillNo(),n1);
					System.out.println(l2.getBorsta());
					if(l2.getBorsta().equals("Borrowed"))
					{
						s1.setBookStatus("Borrwed "+l1.getBook().trim()+" book from library");
					}
				}
			}
			else if(ch==6)
			{
				System.out.println("\nStatus of "+name);
				System.out.println("********************");
				s1.displaystatus();
				System.out.println("Thank you");
				System.exit(0);
			}
		}
		b.close();
		ob.close();
		o.close();
		ob1.close();
	}
}