package AP_Exam;

import model_questions.QuestionMC;

public class APS_ArrayLists extends QuestionMC {
	public APS_ArrayLists() {
		setupQuestion(qNumber);
	}
	
	public APS_ArrayLists(int qNumber) {
		setupQuestion(qNumber);
	}
	
	protected void setupQuestionData(int qNumber) {
		if(qNumber == -1) {
			qNumber = rand.nextInt(4);
		}
		
		switch(qNumber) {
		case 0:
			question = "Consider the following code segment.\r\n" + 
					"ArrayList<String> list = new ArrayList<String>();\r\n" + 
					"list.add(\"P\"); list.add(\"Q\"); list.add(\"R\"); list.set(2, \"s\"); list.add(2, \"T\"); list.add(\"u\"); System.out.println(list);\r\n" + 
					"What is printed as a result of executing the code segment?";
			
			this.choiceA = "[P, Q, R, s, T]";
			this.choiceB = "[P, Q, s, T, u]";
			this.choiceC = "[P, Q, T, s, u]";
			this.choiceD = "[P, T, Q, s, u]";
			this.choiceE = "[P, T, s, R, u]";
			
			answerKey = 'C';
			answer = "[P, Q, T, s, u]";
			break;
		case 1:
			question = "Consider the following instance variable and method.\r\n" + 
					"private ArrayList<Integer> nums;\r\n" + 
					"/** Precondition: nums.size > 0 */\r\n" + 
					"public void numQuest() {\r\n" + 
					"int k = 0;\r\n" + 
					"Integer zero = new Integer(0);\r\n" + 
					"while (k < nums.size()) {\r\n" + 
					"if (nums.get(k).equals(zero)) nums.remove(k);\r\n" + 
					"k++; }\r\n" + 
					"}\r\n" + 
					"Assume that ArrayList nums initially contains the following Integer values.\r\n" + 
					"[0, 0, 4, 2, 5, 0, 3, 0]\r\n" + 
					"What will ArrayList nums contain as a result of executing numQuest?";
			
			this.choiceA = "[0, 0, 4, 2, 5, 0, 3, 0]";
			this.choiceB = "[4, 2, 5 , 3]";
			this.choiceC = "[0, 0,0,0,4,2,5,3]";
			this.choiceD = "[3, 5,2,4,0,0,0,0]";
			this.choiceE = "[0,4,2,5,3]";
			
			answerKey = 'E';
			answer = "[0,4,2,5,3]";
			break;
		case 2:
			question = "Consider the following method.\r\n" + 
					"public ArrayList<Integer> mystery(int n)\r\n" + 
					"{\r\n" + 
					"ArrayList<Integer> seq = new ArrayList<Integer>();\r\n" + 
					"for (int k = 1; k <= n; k++)\r\n" + 
					"seq.add(new Integer(k * k + 3));\r\n" + 
					"return seq;\r\n" + 
					"}\r\n" + 
					"Which of the following is printed as a result of executing the following statement?\r\n" + 
					"System.out.println(mystery(6));";
			
			this.choiceA = "[3, 4, 7, 12, 19, 28]";
			this.choiceB = "[3, 4, 7, 12, 19, 28, 39]";
			this.choiceC = "[4, 7, 12, 19, 28, 39]";
			this.choiceD = "[39, 28, 19, 12, 7, 4]";
			this.choiceE = "[39, 28, 19, 12, 7, 4, 3]";
			
			answerKey = 'C';
			answer = "[4, 7, 12, 19, 28, 39]";
			break;
		case 3:
			question = "Assume that myList is an ArrayList that has been correctly constructed and populated with objects.\r\n" + 
					"Which of the following expressions produces a valid random index for myList ?";
			
			this.choiceA = "(int)( Math.random() * myList.size() ) - 1";
			this.choiceB = "(int)( Math.random() * myList.size() )";
			this.choiceC = "(int)( Math.random() * myList.size() ) + 1";
			this.choiceD = "(int)( Math.random() * (myList.size() + 1) )";
			this.choiceE = "Math.random(myList.size())";
		
			answerKey = 'B';
			answer = "(int)( Math.random() * myList.size() )";
			break;
		}
	}
}
