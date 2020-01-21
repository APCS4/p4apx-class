import java.util.*;
import java.lang.*;
import AP_Exam.*;
import model_questions.QuestionMC;

/*
* @author Abhinav Palacharla
* @param not applicable
* @version 1.0.0
* @return not applicable
*/

public class ForLoopBackend extends QuestionMC
{
	private int iterations1;
	private int iterations2;
	private int iterations3;
	private String word;
	private String questionPrompt;
	private int correctAnswer;
	private int userAnswer;
	private boolean isCorrect;
	private Scanner s = new Scanner(System.in);
	Random r = new Random();
	Map<String, Integer> m = new HashMap<>(); //hashmap to store options

	public ForLoopBackend()
	{
		System.out.println("enter a word for the for loops to print");
		this.word = this.s.nextLine();

		this.test();
	}

	public void test()
	{
		//this.buildQuestion();
		//System.out.println(questionPrompt);
		//this.generateOptions();
		this.polySetupQuestion();
		this.recieveAnswer();
		this.checkAnswer();
		
		if(isCorrect == true)
		{
			System.out.println("you are correct");
		}
		else
		{
			System.out.println("you are wrong");
		}
	}
	
	public void poly()
	{
		//method to do all poly work
		this.question = this.questionPrompt;
		this.choiceA = String.format("%d", this.m.get("A")); //get values from hashmap, input as string format
		this.choiceB = String.format("%d", this.m.get("B"));
		this.choiceC = String.format("%d", this.m.get("C"));
		this.choiceD = String.format("%d", this.m.get("D"));
		this.choiceE = String.format("%d", this.m.get("E"));
		this.answerKey = 'E';
		this.answer = String.format("You are Correct, %d is the answer", this.answer);
	}

	public void polySetupQuestion()
	{
		super.setupQuestion();
	}

	public void generateOptions()
	{
		this.m.put("A", r.nextInt(this.correctAnswer)); //use key to store letter option, input values into hashmap
		this.m.put("B", r.nextInt(this.correctAnswer));
		this.m.put("C", r.nextInt(this.correctAnswer));
		this.m.put("D", r.nextInt(this.correctAnswer));
		this.m.put("E", this.correctAnswer);

		//System.out.println(m); //testing hashmap
	}


	public void buildQuestion()
	{
		String questionExp = "How many Times will this program print out: " + this.word + "\n";

		//this.iterations1 = (int) (10 * Math.random());
		//this.iterations2 = (int) (10 * Math.random());
		//this.iterations3 = (int) (10 * Math.random());

		//make sure random number is not 0
		this.iterations1 = (int) r.nextInt(9) + 1;
		this.iterations2 = (int) r.nextInt(9) + 1;
		this.iterations3 = (int) r.nextInt(9) + 1;

		int correctAns = this.iterations1 * this.iterations2 * this.iterations3;
		//generate strings to concatanate later
		String loop1 = String.format("for(int i = 0; i < %d; i++) \n{\n", this.iterations1);
		String printWord1 = String.format("System.out.println(\"%s\");\n", this.word);
		String loop2 = String.format("	for(int i = 0; i < %d; i++ \n{\n", this.iterations2);
		String printWord2 = String.format("	System.out.println(\"%s\");\n", this.word);
		String loop3 = String.format("		for(int i = 0; i < %d; i++ \n{\n", this.iterations3);
		String printWord3 = String.format("		System.out.println(\"%s\");\n", this.word);
		String endBrace1 = String.format("		}");
		String endBrace2 = String.format("	}");
		String endBrace3 = String.format("}");

		//form question by concatinating strings
		String questionBody = String.format(loop1 + printWord1 + loop2 + printWord2 + loop3 + printWord3 + "\n" + endBrace1 + "\n" + endBrace2 + "\n" + endBrace3);

		this.questionPrompt = questionExp + questionBody;
		this.correctAnswer = correctAns;
	}

	public void recieveAnswer()
	{
		//read answer from user
		System.out.println("enter you answer: ");
		this.userAnswer = this.s.nextInt();
	}

	public void checkAnswer()
	{
		//verify if answer is correct
		if(this.userAnswer == this.correctAnswer)
		{
			isCorrect = true;
		}
		else
		{
			isCorrect = false;
		}
	}
	/*
	public static void main(String[] args) 
	{
		ForLoopBackend test = new ForLoopBackend();
	}
	*/

	@Override
	protected void setupQuestionData()
	{
		this.buildQuestion();
		System.out.println(questionPrompt);
		this.generateOptions();
	}
}