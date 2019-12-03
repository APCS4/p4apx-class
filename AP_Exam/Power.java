package AP_Exam;
import java.util.Random;

public class Power extends Question{
	public Power()
    {
    	setupQuestion();
    }
	
	public void setupQuestion() {
		int rando = (int) Math.floor(Math.random()*1);
		
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
		default:
			System.out.print("elproblem");
		}
	}
	
	
}