package AP_Exam;

import model_questions.QuestionMC;

public class APS_Arrays extends QuestionMC {
	public APS_Arrays() {
		setupQuestion(qNumber);
	}
	
	public APS_Arrays(int qNumber) {
		setupQuestion(qNumber);
	}
	
	protected void setupQuestionData(int qNumber) {
		if(qNumber == -1) {
			qNumber = rand.nextInt(3);
		}
	
		switch(qNumber) {
		case 0: 
			question = "Assume that an array of integer values had been declared as follows and has been initialized. \r\n" + 
					"\r\n" + 
					"int [] arr = new int [10];\r\n" + 
					"\r\n" + 
					"Which of the following code segments correctly interchanges the value of arr[0] and arr[5]?";
			
			this.choiceA = "Arr[0] = 5;\r\n" + 
						   "Arr[5] = 0;";
			this.choiceB  = "Arr[0] = arr[5];\r\n" + 
					 		"Arr[5] = arr[0] ;";
			this.choiceC = "int k = arr[5];\r\n" + 
						   "arr[0] = arr[5];\r\n" + 
						   "arr[5] = k;";
			this.choiceD = "Int k = arr[0];\r\n" + 
					       "arr[0] = arr[5];\r\n" + 
					       "arr[5] = k;";
			this.choiceE = "Int k = arr[5];\r\n" + 
					       "arr[5] = arr[0];\r\n" + 
					       "arr[0] = arr[5];";
			
			answerKey = 'D';
			answer = "Int k = arr[0];\r\n" + 
				      "arr[0] = arr[5];\r\n" + 
				      "arr[5] = k;";
			break;
		case 1:
			question = "Consider the following code segment.\r\n" + 
					"int[] arr = {1, 2, 3, 4, 5, 6, 7};\r\n" + 
					"for (int k = 3; k < arr.length - 1; k++)\r\n" + 
					"arr[k] = arr[k + 1];\r\n" + 
					"Which of the following represents the contents of arr as a result of executing the code segment?";
			
			this.choiceA = "{1, 2, 3, 4, 5, 6, 7}";
			this.choiceB = "{1, 2, 3, 5, 6, 7}";
			this.choiceC = "{1, 2, 3, 5, 6, 7, 7}";
			this.choiceD = "{1, 2, 3, 5, 6, 7, 8}";
			this.choiceE = "{2, 3, 4, 5, 6, 7, 7}";
			
			answerKey = 'C';
			answer = "{1, 2, 3, 5, 6, 7, 7}";
		case 2:
			question = "Assume that the array arr has been defined and initialized as follows.\r\n" + 
					"\r\n" + 
					"int[] arr = /* initial values for the array */ ;\r\n" + 
					"\r\n" + 
					"Which of the following will correctly print all of the odd integers contained in arr but none of the even\r\n" + 
					"integers contained in arr ?\r\n" + 
					"";
			
			this.choiceA = "for (int x : arr)\r\n" + 
					"if (x % 2 != 0)\r\n" + 
					"System.out.println(x);";
			this.choiceB = "for (int k = 1; k < arr.length; k++)\r\n" + 
					"if (arr[k] % 2 != 0)\r\n" + 
					"System.out.println(arr[k]);";
			this.choiceC = "for (int x : arr)\r\n" + 
					"if (x % 2 != 0)\r\n" + 
					"System.out.println(arr[x]);";
			this.choiceD = "for (int k = 0; k < arr.length; k++)\r\n" + 
					"if (arr[k] % 2 != 0)\r\n" + 
					"System.out.println(k);";
			this.choiceE = "for (int x : arr)\r\n" + 
					"if (arr[x] % 2 != 0)\r\n" + 
					"System.out.println(arr[x]);";
		
			answerKey = 'A';
			answer = "for (int x : arr)\r\n" + 
					"if (x % 2 != 0)\r\n" + 
					"System.out.println(x);";
		}
	}
}
