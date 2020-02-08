package AP_Exam;

import model_questions.QuestionMC;

public class APS_Recursion extends QuestionMC {
	public APS_Recursion() {
		setupQuestion(qNumber);
	}
	
	public APS_Recursion(int qNumber) {
		setupQuestion(qNumber);
	}
	
	protected void setupQuestionData(int qNumber) {
		if(qNumber == -1) {
			qNumber = rand.nextInt(2);
		}
		
		switch(qNumber) {
		case 0:
			question = "Consider the following recursive method.\r\n" + 
					"public int recur (int n)\r\n" + 
					"{\r\n" + 
					"if (n <= 10)\r\n" + 
					"    return n*2;\r\n" + 
					"else\r\n" + 
					"    return recur(recur(n / 3));\r\n" + 
					"}\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"What value is returned as a result of the call recur(27) ?";
			
			this.choiceA = "8";
			this.choiceB = "9";
			this.choiceC = "12";
			this.choiceD = "16";
			this.choiceE = "18";
			
			answerKey = 'D';
			answer = "16";
			break;
		case 1:
			question = "Consider the following recursive method.\r\n" + 
					"public static void whatsItDo(String str)\r\n" + 
					"{\r\n" + 
					"int len = str.length();\r\n" + 
					"if (len > 1)\r\n" + 
					"{\r\n" + 
					"    String temp = str.substring(0, len – 1);\r\n" + 
					"    whatsItDo(temp);\r\n" + 
					"    System.out.println(temp);\r\n" + 
					"}\r\n" + 
					"}\r\n" + 
					"What is printed as a result of the call whatsItDo(\"WATCH\") ?";
			
			this.choiceA = "WATC\r\n" + 
					"WAT\r\n" + 
					"WA\r\n" + 
					"W";
			this.choiceB = "WATCH\r\n" + 
					"WATC\r\n" + 
					"WAT\r\n" + 
					"WA";
			this.choiceC = "W\r\n" + 
					"WA\r\n" + 
					"WAT\r\n" + 
					"WATC";
			this.choiceD = "W\r\n" + 
					"WA\r\n" + 
					"WAT\r\n" + 
					"WATC\r\n" + 
					"WATCH";
			this.choiceE = "WATCH\r\n" + 
					"WATC\r\n" + 
					"WAT\r\n" + 
					"WA\r\n" + 
					"W\r\n" + 
					"WA\r\n" + 
					"WAT\r\n" + 
					"WATC\r\n" + 
					"WATCH";
			
			answerKey = 'C';
			answer = "W\r\n" + 
					"WA\r\n" + 
					"WAT\r\n" + 
					"WATC";
			break;
		}
	}
}
