package AP_Exam;

import model_questions.QuestionMC;

public class APS_Objects extends QuestionMC {
	public APS_Objects() {
		setupQuestion(qNumber);
	}
	
	public APS_Objects(int qNumber) {
		setupQuestion(qNumber);
	}
	
	protected void setupQuestion(int qNumber) {
		if(qNumber == -1) {
			qNumber = rand.nextInt(2);
		}
		
		switch(qNumber) {
		case 0:
			question = "Consider the following declarations.\r\n" + 
					"public interface Comparable {\r\n" + 
					"int compareTo(Object other); }\r\n" + 
					"public class SomeClass implements Comparable {\r\n" + 
					"// ... other methods not shown }\r\n" + 
					"Which of the following method signatures of compareTo will satisfy the Comparable interface requirement?\r\n" + 
					"  I. public int compareTo(Object other)\r\n" +
					" II. public int compareTo(SomeClass other)\r\n" + 
					"III. public boolean compareTo(Object other)\r\n";
		
			this.choiceA = "I only";
			this.choiceB = "II only";
			this.choiceC = "III only";
			this.choiceD = "I and II only";
			this.choiceE = "I, II, and III";
			
			answerKey = 'A';
			answer = "I only";
			break;
		case 1:
			question = "Consider the following method that is intended to modify its parameter nameList by replacing all occurrences of name with newValue,\r\n" + 
					"\r\n" + 
					"Public void replace(ArrayList <String> nameList, String name, String new Value)\r\n" + 
					"\r\n" + 
					"{\r\n" + 
					"for (int j = 0; j < nameList.size(); j++)\r\n" + 
					" if (/ *expression */){\r\n" + 
					"nameList.set(j, newValue);\r\n" + 
					"}\r\n" + 
					"} \r\n" + 
					"\r\n" + 
					"Which of the following can be used to replace /*expression*/ so that replace will work as intended?\r\n";
			
			this.choiceA = "nameList.get(j).equals(name)";
			this.choiceB = "nameList.get(j) == name";
			this.choiceC = "nameList.remove(j)";
			this.choiceD = "nameList[j] == name";
			this.choiceE = "nameList[j]. equals(name)";
			
			answerKey = 'A';
			answer = "nameList.get(j).equals(name)";
			break;
		}
	}
}
