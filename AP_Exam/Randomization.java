package AP_Exam;

import java.lang.reflect.Array;
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
	
	public static int randoIntRange(int n, int m)
	{
		Integer i = n + rando.nextInt(m-n);
		return i;
	}
	
	public static Double randoDouble()
	{
		Double i = rando.nextDouble();
		return i;
	}
	
	public static Object randoOp()
	{
		Object[] oper;
		
		oper[0] = "+";
		oper[1] = "-";
		oper[2] = "/";
		oper[3] = "*";
		oper[4] = "%";
		
		int a = randoInt(4);
		
		
		return oper[a];
	}
	
	public static randoArray(n)  
	{
		ArrayList list = new ArrayList();
	}
}

