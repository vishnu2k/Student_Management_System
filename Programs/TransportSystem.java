package students;
import java.io.BufferedReader;
import java.io.FileReader;
public class TransportSystem 
{
	private String h;
	public String getH()
	{
		return h;
	}
	public void setH(String h)
	{
		this.h = h;
	}
	public void Results(String s,String e,String l)throws Exception
	{
		FileReader ox=new FileReader("C:\\Users\\S vishnu kumar\\Desktop\\mini project final\\Bus Route.csv");
		BufferedReader oy=new BufferedReader(ox);
		String v,d="";
		int tra=1;
		while((v=oy.readLine())!=null)
		{
			String w[]=v.split(",");
			if(w[0].trim().equalsIgnoreCase(s) && w[1].trim().equalsIgnoreCase(e) && w[2].trim().equalsIgnoreCase(l))
			{
				d=d+l+Integer.toString(tra++)+" - "+w[5]+" : "+w[4]+"  "+w[3]+"\n";
			}
		}
		oy.close();
		ox.close();
		if(d=="")
			setH("NO Transport available");
		else
			setH(d);
	}
}
