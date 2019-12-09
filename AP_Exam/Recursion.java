package AP_Exam;

import java.util.Random;

public class Recursion extends Question
{

	private String[] ansq = new String[5];
	private char[] ansc = {'A', 'B', 'C', 'D', 'E'};
	private int correct;
	private String ans;
	
	public Recursion()
	{
		QuestionSetUp();
	}
	
	public void QuestionSetUp()
	{
		int bruh = (int)(Math.random() * 4 + 1);
		switch (bruh)
		{
			case 1:
				ans = "248832";
				
				this.question = "Consider the following code:\r\n" + 
				                "\r\n" + 
				                "\r\n" + 
				                "public static void main(String[] args)\r\n" + 
				                "{\r\n" + 
				                "   System.out.println(equation(8));\r\n" + 
				                "}\r\n" + 
				                "\r\n" + 
				                "public static int equation(int a)\r\n" + 
				                "{\r\n" + 
				                "   if(a <= 5)\r\n" + 
				                "      return 12;\r\n" + 
				                "   return equation(a-2) * equation(a-1);\r\n" + 
				                "}\r\n" + 
				                "\r\n" + 
				                "\r\n" + 
				                "What is the output for the code above?";
				
				ansq[0] = "144";
				ansq[1] = "48";
				ansq[2] = "1728";
				ansq[3] = "248832";
				ansq[4] = "104";
				
				shuffle();
				answers();
				break;
			case 2:
				ans = "public long factorial(long a)\r\n" + 
					  "{\r\n" + 
					  "     if(a <= 1)\r\n" + 
					  "         return 1;\r\n" + 
					  "\r\n" + 
					  "     return a * factorial(a-1);\r\n" + 
					  "}";
				
				this.question = "Which of the following is a recursive factorial function?  \r\n" + 
						        "\r\n" + 
						        "Recall that an example of a factorial is: \r\n" + 
						        "\r\n" + 
						        "5!=5*4*3*2*1";
				
				ansq[0] = "public long factorial(long a)\r\n" + 
						  "{\r\n" + 
						  "    return a * factorial(a-1) * factorial(a-2);\r\n" + 
						  "}";
				ansq[1] = "public long factorial(long a)\r\n" + 
						  "{\r\n" + 
						  "    long ret = 1;\r\n" + 
						  "\r\n" + 
						  "    for(int i = 2; i < a; i++)\r\n" + 
						  "        ret *= i;\r\n" + 
						  "\r\n" + 
						  "    return ret;\r\n" +
						  "}";
				ansq[2] = "public long factorial(long a)\r\n" + 
						  "{\r\n" + 
						  "     if(a <= 1)\r\n" + 
						  "         return 1;\r\n" + 
						  "\r\n" + 
						  "     return a * factorial(a-1);\r\n" + 
						  "}";
				ansq[3] = "public long factorial(long a)\r\n" + 
						  "{\r\n" + 
						  "    a * a-1 * a-2 * a-3 * a-4;\r\n" + 
						  "}";
				ansq[4] = "None of these";
				
				shuffle();
				answers();
				break;
			case 3:
				ans = "tHISISMYFAVORITEyAYFORPROGRAMMING";
				
				this.question = "Consider the following code:\r\n" + 
						        "\r\n" + 
						        " \r\n" + 
						        "\r\n" + 
						        "public static void main(String[] args)\r\n" + 
						        "{\r\n" + 
						        "     System.out.println(foo(\"This is my favorite: Yay for programming!!!\"));\r\n" +
						        "\r\n" + 
						        "public static String foo(String s)\r\n" + 
						        "{\r\n" + 
						        "    if(!s.equals(\"\"))\r\n" + 
						        "    {\r\n" + 
						        "        char c = s.charAt(0);\r\n" + 
						        "\r\n" + 
						        "        if(c >= 'A' && c <= 'Z')\r\n" + 
						        "            return Character.toLowerCase(c) + foo(s.substring(1));\r\n" + 
						        "    	 else\r\n" +
						        " 	     	 if (c >= 'a' && c <= 'z')\r\n" + 
						        "                return Character.toUpperCase(c) + foo(s.substring(1));\r\n" + 
						        "\r\n" + 
						        "        return foo(s.substring(1));\r\n" +
						        "    }\r\n" + 
						        "\r\n" + 
						        "    return \"\";\r\n" + 
						        "\r\n" + 
						        "}\r\n" + 
						        "\r\n" + 
						        "What is the output for the main function above?";
				
				ansq[0] = "ThIs iS mY fAvOriTe: YaY fOr PrOgRaMmIng!!!";
				ansq[1] = "tHIS IS MY FAVORITE: yAY FOR PROGRAMMING!!!";
				ansq[2] = "tHIS IS MYFAVORITE";
				ansq[3] = "tHISISMYFAVORITEyAYFORPROGRAMMING";
				ansq[4] = "ThIs iS mY fAvOriTe";
				
				shuffle();
				answers();
				break;
			case 4:
				ans = "24";
				
				this.question = "public static int foo(int a, int b)\r\n" + 
								"{\r\n" + 
								"    if(b <= 1 || b <= a)\r\n" + 
								"        return 1;\r\n" + 
								"\r\n" + 
								"    return (b - a) * foo(a,b-1);\r\n" + 
								"\r\n" + 
								"}\r\n" + 
								"\r\n" + 
								"Based on the code above, what is the value of the following function call:\r\n" +
								"foo(5,9);";
				
				ansq[0] = "36";
				ansq[1] = "24";
				ansq[2] = "32";
				ansq[3] = "18";
				ansq[4] = "16";
				
				shuffle();
				answers();
				break;
			case 5:
				ans = "Error, infinite loop";
				
				this.question = "public void draw()\r\n" +
								"{\r\n" + 
								"  recurs(11);\r\n" + 
								"}\r\n" + 
								"void recurs(int count)\r\n" + 
								"{\r\n" +
								"    if (count == 0)\r\n" + 
								"        return;\r\n" + 
								"    else\r\n" + 
								"    {\r\n" +
								"        System.out.print(count + \" \");\r\n" + 
								"        int recount = count - 2;\r\n" + 
								"        recurs(recount);\r\n" + 
								"        return;\r\n" + 
								"    }\r\n" + 
								"}";
				
				ansq[0] = "11 9 7 5 3 1 -1";
				ansq[1] = "9 7 5 3 1";
				ansq[2] = "9 7 5 3 1 -1";
				ansq[3] = "11 9 7 5 3 1";
				ansq[4] = "Error, infinite loop";
				
				shuffle();
				answers();
				break;
		}
		
		
	}
	public int shuffle()
	{
		int num = ansq.length;
		
		for(int i = 0; i < num; i++)
		{
			int s = i + (int)(Math.random() * num);
			
			String temp = ansq[s];
			ansq[s] = ansq[i];
			ansq[i] = temp;
			
			if (ans == ansq[i]) 
				correct = i;
		}
		
		return correct;
	}
	
	private void answers()
	{
		this.choiceA = ansq[0];
		this.choiceB = ansq[1];
		this.choiceC = ansq[2];
		this.choiceD = ansq[3];
		this.choiceE = ansq[4];
		this.answer = ansq[correct];
		this.answerKey = ansc[correct];
	}
}
