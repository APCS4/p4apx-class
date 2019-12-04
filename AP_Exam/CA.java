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
			this.question = "What does the Model part of MVC control.";
			this.choiceA = "The \"brain\" of the program, uses data + user input to complete purpose.";
			this.choiceB = "The long-term stored information of a program. (Database)";
			this.choiceC = "The GUI; how the user interacts with the program.";
			this.choiceD = "The efficiency that the program runs at.";
			this.choiceE = "All of the above.";
			this.answerKey = 'B';
			break;
		case 4:
			this.question = "What is the purpose of MVC?";
			this.choiceA = "Make code modular so you can modify parts without breaking the entirety of the program.";
			this.choiceB = "Ensures that code is organized and purposeful.";
			this.choiceC = "Ensures the proper breakdown of a problem.";
			this.choiceD = "To make coding more confusing and difficult.";
			this.choiceE = "A, B, C, but not D";
			this.answerKey = 'E';
			break;
		default:
			System.out.print("ERROR");
		}
	}
}