class Bus extends Thread
{
	int seat=1,passenger;
	Bus(int passenger)
	{
		this.passenger=passenger;
	}

	
	@Override
	public synchronized void run()
	{
		String nm=Thread.currentThread().getName();
		if(seat>=passenger)
		{
			System.out.println(nm+" Your Ticket Booked...");
			seat=seat-passenger;
		}
		else 
		{
			System.out.println("Sorry Ticket is Not Available...:->"+nm);
		}

	}
}
class Ths
{
	public static void main(String[] args) 
	{
		Bus b=new Bus(1);

		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		Thread t3=new Thread(b);

		t1.setName("Jigo");
		t2.setName("Jay");
		t3.setName("Dhara");

		t1.start();
		t2.start();
		t3.start();
		
	}
}