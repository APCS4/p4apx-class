package AP_Exam;

import model_questions.QuestionMC;

public class APS_Iteration extends QuestionMC {
	public APS_Iteration() {
		setupQuestion(qNumber);
	}
	
	public APS_Iteration(int qNumber) {
		setupQuestion(qNumber);
	}
	
	protected void setupQuestionData(int qNumber) {
		if(qNumber == -1) {
			qNumber = rand.nextInt(3);
		}
		
		switch(qNumber) {
		case 0:
			question = "Consider the following code segment.\n" + 
					"    int x = 7;\n" + 
					"    int y = 3;\n" + 
					"\n" + 
					"    if ((x < 10) && (y < 0))\n" + 
					"      System.out.println(\"Value is: \" + x * y);\n" + 
					"    else\n" + 
					"      System.out.println(\"Value is: \" + x / y);\n" + 
					"\n" + 
					"What is printed as a result of executing the code segment?\n";
			
			this.choiceA = "21";
			this.choiceB = "2.33333333";
			this.choiceC = "2";
			this.choiceD = "0";
			this.choiceE = "1";
			
			answerKey = 'C';
			answer = "2";
			break;
		case 1:
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
		case 2: 
			question = "Consider the following method.\n" + 
					"public void mystery(int[] data)\n" + 
					"{\n" + 
					"    for (int k = 0; k < data.length - 1; k++)\n" + 
					"    data[k + 1] = data[k] + data[k + 1];\n" + 
					"}\n" + 
					"The following code segment appears in another method in the same class.\n" + 
					"    int[] values = {5, 2, 1, 3, 8};\n" + 
					"    mystery(values);\n" + 
					"    for (int v : values)\n" + 
					"      System.out.print(v + \" \");\n" + 
					"    System.out.println();\n" + 
					"\n" + 
					"What is printed as a result of executing the code segment?";
			
			this.choiceA = "5 2 1 3 8";
			this.choiceB = "5 7 3 4 11";
			this.choiceC = "5 7 8 11 19";
			this.choiceD = "7 3 4 11 8";
			this.choiceE = "Nothing is printed because an ArrayIndexOutOfBoundsException is thrown during the execution of method mystery.";
			
			answerKey = 'A';
			answer = "5 2 1 3 8";
			break;
		case 3:
			question = "Consider the following code segment.\n" + 
					"    int sum = 0;\n" + 
					"    int k = 1;\n" + 
					"    while (sum < 12 || k < 4)\n" + 
					"    sum += k;\n" + 
					"\n" + 
					"System.out.println(sum);\n" + 
					"\n" + 
					"What is printed as a result of executing the code segment?";
			
			this.choiceA = "6";
			this.choiceB = "10";
			this.choiceC = "12";
			this.choiceD = "15";
			this.choiceE = "Nothing is printed due to an infinite loop";
			
			answerKey = 'E';
			answer = "Nothing is printed due to an infinite loop";
			break;
		}
	}
}
