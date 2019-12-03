package AP_Exam;
import java.util.ArrayList; 

public class ArrayListQuestions extends Question
{
	public ArrayList<String> methods = new ArrayList<String>();
	private int questionType;

	public ArrayListQuestions() 
	{
		/*
		 * question
		 * answer
		 * choiceA
		 * choiceB
		 * choiceC
		 * choiceDqasd
		 * choiceE
		 */
		
		loadMethods();
		questionType = (int) Math.floor(Math.random()*methods.size());
		setupQuestion(questionType);
	}
	
	private void loadMethods() 
	{
		methods.add("list.add(\"Ethan\");");
		methods.add("list.remove(3);");
		methods.add("list.contains(\"Ethan\");");
		methods.add("list.set(3,\"Ethan\");");
		methods.add("list.clone()");
	}

	public void setupQuestion(int questionNum)
	{
		question = "What does the method " + methods.get(questionNum) + " do?";
		
		switch (questionNum)
		{
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
	}
}

