class keys
{
	
	public void run(Engine key)
	{
		key.start();
		
	}

}



public class Main 
{

	public static void main(String[] args)
	{
		new keys().run(new Car());
	}
}