package students;
import java.io.BufferedReader;
import java.io.FileReader;
public class CourseMaterial
{
	String f;
	public String getF()
	{
		return f;
	}
	public void setF(String f) 
	{
		this.f = f;
	}
	public void search(String code)throws Exception
	{
		int f=0;
		FileReader of=new FileReader("C:\\Users\\S vishnu kumar\\Desktop\\mini project final\\Course.csv");
		BufferedReader or=new BufferedReader(of);
		String g;
		while((g=or.readLine())!=null)
		{
			String w[]=g.split(",");
			if(w[0].equalsIgnoreCase(code))
			{
				f=1;
				setF("\nReference book: "+w[1]+"\nAuthor: "+w[2]+"\n");
			}
		}
		if(f==0)
		{
			setF("\nCourse not available\n");
		}
		or.close();
		of.close();
	}
}