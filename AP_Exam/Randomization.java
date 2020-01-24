package AP_Exam;

import java.util.Random;
import java.util.ArrayList;

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
		Object[] oper = null;
		
		oper[0] = "+";
		oper[1] = "-";
		oper[2] = "/";
		oper[3] = "*";
		oper[4] = "%";
		
		int a = randoInt(4);
		
		
		return oper[a];
	}
	/*
	public static randoArray(n)  
=======
	
	public static ArrayList<Integer> randoArray(ArrayList<Integer> n)  
>>>>>>> branch 'master' of https://github.com/APCS4/p4apx-class.git
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		return list;
	}
	*/
}

