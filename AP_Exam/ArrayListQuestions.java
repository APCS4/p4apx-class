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
		 * choiceD
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
			addMethod();
			break;
		case 1:
			removeMethod();
			break;
		case 2:
			containsMethod();
			break;
		case 3:
			setMethod();
			break;
		case 4:
			cloneMethod();
			break;
		default:
			break;
		}
	}

	private void cloneMethod() 
	{
		// TODO Auto-generated method stub
		
	}

	private void setMethod() 
	{
		// TODO Auto-generated method stub
		
	}

	private void containsMethod() 
	{
		// TODO Auto-generated method stub
		
	}

	private void removeMethod() 
	{
		// TODO Auto-generated method stub
		
	}

	private void addMethod() 
	{
		
	}
}

