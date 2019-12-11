package best;

public class Objectclass {
	static int lastroll=100;
	int rollno;
	Objectclass()
	{
		rollno=lastroll;
		lastroll++;
	}
	public int hashCode()
	{
		return rollno;
	}
	public static void main(String args[])
	{
		Objectclass s=new Objectclass();
		System.out.println(s);
		System.out.println(s.toString());
		Object ob=new String ("FACE");
		Class c=ob.getClass();
		System.out.println("Class of object: "+c.getName());
		s=null;
		//System.gc();
	}
	protected void finalize()
	{
		System.out.println("Finilize method called");
	}
}

		


