package AP_Exam;
import java.util.Random;
public class CA extends Question{
	public CA()
    {
    	setupQuestion();
    }
	public void setupQuestion() {
		int random = (int) Math.floor(Math.random()*5);
		switch(random){
		case 0:
			this.question = "Refer to the following code:\nswitch(ans)\n{\n     case 1:\n          ans = 11;\n          break;\n     case 2:\n          ans = 78;\n          break;\n}\n\nIf ans is 1, what is it after the switch case?";
			this.choiceA = "1";
			this.choiceB = "11";
			this.choiceC = "78";
			this.choiceD = "67";
			this.choiceE = "89";
			this.answerKey = 'B';
			break;
		case 1:
			this.question = "Refer to the following code:\ndouble x = 10 * Math.random() + 3;\nSystem.out.println(x);\n\nWhat is the range of possible outputs?";
			this.choiceA = "(0,1)";
			this.choiceB = "[0,1)";
			this.choiceC = "[3,10)";
			this.choiceD = "(3,13)";
			this.choiceE = "[3,13)";
			this.answerKey = 'E';
			break;
		case 2:
			this.question = "int[][]  A  =  {{1,0,3},{7,-3,6},{2,-9,-1}};\nWhat int is in the 2nd row, 3rd column?";
			this.choiceA = "6";
			this.choiceB = "-9";
			this.choiceC = "-3";
			this.choiceD = "7";
			this.choiceE = "325";
			this.answerKey = 'A';
			break;
		case 3:
			this.question = "int[][]  A  =  {{1,0,3}, {7,-3,6}, {2,-9,-1}};\nWhat int is in the 3rd row, 1st column?";
			this.choiceA = "-9";
			this.choiceB = "2";
			this.choiceC = "3";
			this.choiceD = "6";
			this.choiceE = "0";
			this.answerKey = 'B';
			break;
		case 4:
			this.question = "What is the code to write a matrix of the form: \n3    4    8    9 \n6  -1    4  10 ?";
			this.choiceA = "int[][]  A  =  {{3,4,8,9},{6,-1,4,10}};";
			this.choiceB = "int[][]  B  =  {{3,-1},{4,-1},{8,4},{9,10}};";
			this.choiceC = "int[][]  C  =  {{6,-1,4,10},{3,4,8,9}};";
			this.choiceD = "int[][]  D  =  {{3,4,8,9\\n6,-1,4,10}};";
			this.choiceE = "None of the above";
			this.answerKey = 'A';
			break;
		default:
			System.out.print("ERROR");
		}
	}
}