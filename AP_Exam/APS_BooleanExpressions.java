package AP_Exam;

import model_questions.QuestionMC;

public class APS_BooleanExpressions extends QuestionMC {
	public APS_BooleanExpressions() {
		setupQuestion(qNumber);
	}
	
	public APS_BooleanExpressions(int qNumber) {
		setupQuestion(qNumber);
	}
	
	protected void setupQuestionData(int qNumber) {
		if(qNumber == -1) {
			qNumber = rand.nextInt(4);
		}
		
		switch(qNumber) {
		case 0: 
			question = "Consider the following code segment.\r\n" + 
					"for (int k = 0; k < 20; k = k + 2) {\r\n" + 
					"if (k % 3 == 1) System.out.print(k + \" \");\r\n" + 
					"}\r\n" + 
					"What is printed as a result of executing the code segment?\r\n";
			 
			this.choiceA = "4 16";
			this.choiceB = "4 10 16";
			this.choiceC = "0 6 12 18";
			this.choiceD = "1 4 7 10 13 16 19";
			this.choiceE = "0 2 4 6 8 10 12 14 16 18";
			
			answerKey = 'B';
			answer = "4 10 16";
			break;
		case 1:
			question = "//precondition:  x >=0\r\n" + 
					"public void mystery (int x)\r\n" + 
					"{\r\n" + 
					"   System.out.print(x % 10);\r\n" + 
					"\r\n" + 
					"   if ((x / 10) != 0)\r\n" + 
					"   {\r\n" + 
					"      mystery(x / 10);\r\n" + 
					"   }\r\n" + 
					"   System.out.print(x % 10);\r\n" + 
					"}";
			
			this.choiceA = "1441";
			this.choiceB = "43211234";
			this.choiceC = "3443";
			this.choiceD = "12344321";
			this.choiceE = "Many digits are printed due to infinite recursion";
			
			answerKey = 'B';
			answer = "43211234";
			break;
		case 2:
			question = "Consider the following output.\r\n" + 
					"11111 \r\n" + 
					"2222 \r\n" + 
					"333\r\n" + 
					"44\r\n" + 
					"5\r\n" + 
					"Which of the following code segments will produce this output?\r\n";
			
			this.choiceA = "for (int j = 1; j <= 5; j++) \r\n" + 
					"{\r\n" + 
					"for (int k = 1; k <= 5; k++)\r\n" + 
					" {\r\n" + 
					"System.out.print(j + \" \");\r\n" + 
					" }\r\n" + 
					" System.out.println();\r\n" + 
					"}\r\n";
			this.choiceB = "for (int j = 1; j <=5 ; j++) {\r\n" + 
					"for (int k = 1; k <=  j; k++) {\r\n" + 
					"System.out.print(j + \" \"); }\r\n" + 
					" System.out.println();\r\n" + 
					"}\r\n";
			this.choiceC = "for (int j = 1; j <= 5; j++) {\r\n" + 
					"for (int k = 5; k >= 1; k--) \r\n" + 
					"{\r\n" + 
					"System.out.print(j + \" \"); \r\n" + 
					"}\r\n" + 
					" System.out.println();\r\n" + 
					"}\r\n";
			this.choiceD = "for (int j =  1; j <= 5; j++) {\r\n" + 
					"for (int k = 5; k >= j; k--) {\r\n" + 
					"System.out.print(j + \" \"); \r\n" + 
					"}\r\n" + 
					" System.out.println();\r\n" + 
					"}\r\n";
			this.choiceE = "for (int j = 1; j <= 5; j++) {\r\n" + 
					"for (int k =  j; k <= 5; k++) \r\n" + 
					"{\r\n" + 
					"System.out.print(k + \" \");\r\n" + 
					" }\r\n" + 
					"System.out.println();\r\n" + 
					"}\r\n";
			
			answerKey = 'D';
			answer = "for (int j =  1; j <= 5; j++) {\r\n" + 
					"for (int k = 5; k >= j; k--) {\r\n" + 
					"System.out.print(j + \" \"); \r\n" + 
					"}\r\n" + 
					" System.out.println();\r\n" + 
					"}\r\n";
			break;
		case 3: 
			question = "Consider the following code segment.\r\n" + 
					"    int[] oldArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};\r\n" + 
					"    int[][] newArray = new int[3][3];\r\n" + 
					"\r\n" + 
					"    int row = 0;\r\n" + 
					"    int col = 0;\r\n" + 
					"    for (int value : oldArray)\r\n" + 
					"    {\r\n" + 
					"        newArray[row][col] = value;\r\n" + 
					"        row++;\r\n" + 
					"        if ((row % 3) == 0)\r\n" + 
					"    {\r\n" + 
					"        col++;\r\n" + 
					"        row = 0;\r\n" + 
					"    }\r\n" + 
					"}\r\n" + 
					"System.out.println(newArray[0][2]);\r\n" + 
					"\r\n" + 
					"What is printed as a result of executing the code segment?\r\n";
		
			this.choiceA = "3";
			this.choiceB = "4";
			this.choiceC = "5";
			this.choiceD = "7";
			this.choiceE = "8";
			
			answerKey = 'D';
			answer = "7";
			break;
		}
	}
}
