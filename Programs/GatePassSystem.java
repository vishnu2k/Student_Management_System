package students;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class GatePassSystem 
{
	private String status;
	public String getStatus()
	{
		return status;
	}
	public void setStatus(int y1,int m1,int d1)throws Exception
	{
		Calendar calendar = Calendar.getInstance(); 
		int y=calendar.get(Calendar.YEAR);
		int m=calendar.get(Calendar.MONTH)+1;
		int d=calendar.get(Calendar.DATE);
		if(((m==m1-1 && y==y1) || (m==m1 && d1>d && y1==y)||(m<m1 && y1==y)) && (d1>0 && d1<31 && m1>0 && m1<=12 && y1>=2019))
		{
			FileReader o=new FileReader("C:\\Users\\S vishnu kumar\\Desktop\\mini project final\\holidays.csv");
			BufferedReader ob=new BufferedReader(o);
			String g="";
			boolean sta=false;
			int f=0,j=0;
			while(j!=m1 && (g=ob.readLine())!=null)
				j++;	
			String s[]=g.split(",");
			for(int i=1;i<s.length;i++)
			{
				if(Integer.parseInt(s[i])==d1)
				{
					f=1;
					break;
				}
			}
			if(f==1)
			{
				Warden ob1=new Warden();
			     sta=ob1.approvePass();
			     System.out.println(ob1.toString());
			}
			if(f==0)
			{
				Faculty ob2=new Faculty();
				sta=ob2.approvePass();
				System.out.println(ob2.toString());
			}
			ob.close();
			o.close();
			if(sta==true)
				status="\nPass Approved\n";
		}
		else
			status="\nPass not Approved\n";
	}
}