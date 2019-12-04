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
		/*
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
			//rando
			//this.question = ""
			break;
		case 3:
			
			break;
		*/
		default:
			System.out.print("elproblem");
		
		
		}
	}
	
	
}