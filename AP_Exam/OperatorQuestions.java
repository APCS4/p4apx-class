package AP_Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 * This class returns randomized Questions and Answer choices for operator questions.
 * All the possible answer choices are stored in a String array called "array," which 
 * is then converted into a String List called "randArr" so that the Collections.shuffle()
 * method can randomize the answer choices.
 * The AnswerChoiceIndex class is used to loop through the randomized answer choices
 * and return the integer index of the correct answer choice.
 * @author Daniel and Fox
 * @see AnswerChoiceIndex
 */
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
			this.answer = "logical AND short circuit";
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
			this.answer = "logical OR short circuit";
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
			this.answer = "boolean logical AND";
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
			this.answer = "boolean logical OR";
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
			this.answer = "boolean logical OR";
			break;
		}
	}
}
