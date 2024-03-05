public class practice
{
	private int id;
	private String name;
	static String university="COMSATS";
	public practice(int id,String name)
	{
		setid(id);
		setname(name);
		System.out.println("A two argument constructor.");
	}
	public void setid(int id)
	{
	if(id>0)
	{
		this.id=id;
	}
	else
	{
		System.out.println("Invalid input!");
	}
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void display()
	{
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("UNIVERSITY:"+university);
	}
}