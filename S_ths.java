class Salary extends Thread 
{
	public static synchronized void Withdraw()
	{
		String e_nm=Thread.currentThread().getName();
		try 
		{
			System.out.println("Employee Name:"+e_nm+"50000/-");
			Thread.sleep(1000);
		}
		catch(InterruptedException ioe){}
	}
	@Override
	public void run()
	{
		Withdraw();
	}
}
class S_ths
{
	public static void main(String[] args) 
	{
		Salary s1=new Salary();
		Salary s2=new Salary();
		Salary s3=new Salary();


		s1.setName("Rahul");
		s2.setName("Tamta");
		s3.setName("Hemangi");		

		s1.start();
		s2.start();		
		s3.start();
	}
}