package AP_Exam;
import java.util.Random;

public class Power extends Question{
	public Power()
    {
    	setupQuestion();
    }
	
	public void setupQuestion() {
		int rando = (int) Math.floor(Math.random()*1);
		int zero =2;
		switch(rando){
		case 0:
			this.question = "What Iteration is a controlled by a programmer variable choice";
			this.choiceA = "Do While";
			this.choiceB = "Switch Case";
			this.choiceC = "For";
			this.choiceD = "If,Else,For";
			this.choiceE = "Thats done by the user";
			this.answerKey = 'C';
			break;
		
		case 1:
			this.question = "What is the correct format for writing a for loop?";
			this.choiceA = "for; ";
			this.choiceB = "for (int i = 1; i<=6; i++)";
			this.choiceC = "for {int i = 1: i<=6:} () ";
			this.choiceD = "for: a=1, b=2, i++";
			this.choiceE = "for--a=3[b=2][c=5], i++";
			this.answerKey = 'B';
			break;
			
		case 2:
			
			this.question = "Which of the following is most closely associated with iterations?";
			this.choiceA = "loops such as for loops";
			this.choiceB = "Recursion";
			this.choiceC = "Instance Initialization Blocks";
			this.choiceD = "Public Static Void";
			this.choiceE = "if else statements";
			this.answerKey = 'A';
			break;
		case 3:
		
			this.question = "Which of the following is most closely associated with iterations?";
			this.choiceA = "loops such as for loops";
			this.choiceB = "Recursion";
			this.choiceC = "Instance Initialization Blocks";
			this.choiceD = "Public Static Void";
			this.choiceE = "if else statements";
			this.answerKey = 'A';
			break;
		case 4:
		
			this.question = "Consider the following code segment:\n for (int p = 1; p <= 100; k++)\n' + 'if ((p % 4) == 0)\n' + 'System.out.println(p);'";
			this.choiceA = "for(intp=1;p<=25;p++)\n' + 'System.out.println(p);'";
			this.choiceB = "for(intp=1;p<=100;p=p+4)\n System.out.println(p);";
			this.choiceC = "for(intp=1;p<=100;p--)\n System.out.println(p % 9);";
			this.choiceD = "for(intp=4;p<=25;p=19*p)\n System.out.println(p);";
			this.choiceE = "for(intp=4;p<=100;p=p+4)\n System.out.println(p);";
			this.answerKey = 'E';
			break;
		
		default:
			System.out.print("elproblem");
		
		
		}
	}
	
	
}