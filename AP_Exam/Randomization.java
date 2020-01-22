package AP_Exam;

import java.util.Random;

public class Randomization {

	static Random rando = new Random();
	
	public Randomization()
	{
		Random rando = new Random();
	}
	
	public static int randoInt(int m)
	{
		Integer i = rando.nextInt(m);
		return i;
	}
	
	public static Double randoDouble()
	{
		Double i = rando.nextDouble();
		return i;
	}
	
	public static randoArray(i)
	{
		ArrayList list = new ArrayList();
	}
}

