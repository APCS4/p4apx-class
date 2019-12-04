package AP_Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OperatorQuestions extends Question{
	public OperatorQuestions()
    {
    	setupQuestion();
    }
	
	public void setupQuestion() {
		AnswerChoiceIndex indexClass = new AnswerChoiceIndex();
		Random rand = new Random();
		String[] array = new String[]{"logical AND short circuit", "logical OR short circuit", "boolean logical AND", "boolean logical OR", "None of them"};
		List<String> randArr = Arrays.asList(array);
		int randomQuestion = rand.nextInt(5);
		switch(randomQuestion){
		case 0:
			this.question = "What does && stand for?";
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index0 = indexClass.returnIndex(randArr, "logical AND short circuit");
			char Ans0 = indexClass.returnAns(Index0);
			
			this.answerKey = Ans0;
			break;
		case 1:
			this.question = "What does || stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index1 = indexClass.returnIndex(randArr, "logical OR short circuit");
			char Ans1 = indexClass.returnAns(Index1);
			
			this.answerKey = Ans1;
			break;
		case 2:
			this.question = "What does & stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index2 = indexClass.returnIndex(randArr, "boolean logical AND");
			char Ans2 = indexClass.returnAns(Index2);
			
			this.answerKey = Ans2;
			break;
			
		case 3:
			this.question = "What does | stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index3 = indexClass.returnIndex(randArr, "boolean logical OR");
			char Ans3 = indexClass.returnAns(Index3);
			
			this.answerKey = Ans3;
			break;
		case 4:
			this.question = "What does ^ stand for?";
			
			Collections.shuffle(randArr);
			this.choiceA = randArr.get(0);
			this.choiceB = randArr.get(1);
			this.choiceC = randArr.get(2);
			this.choiceD = randArr.get(3);
			this.choiceE = randArr.get(4);
			
			int Index4 = indexClass.returnIndex(randArr, "None of them");
			char Ans4 = indexClass.returnAns(Index4);
			
			this.answerKey = Ans4;
			break;
		}
	}
}
