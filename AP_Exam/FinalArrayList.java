package AP_Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import model_questions.Question;
import model_questions.QuestionMC;
import Util.ConsoleMethods;
import model_linkedlists.CircleQueue;

/**
 * Final arraylist class
 * 
 * @author P4 Modeling
 */
public class FinalArrayList extends QuestionMC {
	public static boolean TextBased = true;
	public static boolean RandomBased = true;
	
	public FinalArrayList() {
		setupQuestion(qNumber);
	}
	
	public FinalArrayList(int qNumber) {
		choiceArray.clear();
		setupQuestion(qNumber);
	}
	
	public static void main (String[] args) {
		Question q = new FinalArrayList();
		ConsoleMethods.println( "" + q );
	}

	@Override
	protected void setupQuestionData() {
        ConsoleMethods.println("ArrayList class setupQuestionData method");
		
		
        int limit = RandomBased ? TextBased ? rand.nextInt(15): rand.nextInt(5) + 10: TextBased ? rand.nextInt(11): -1;
		// format question
		switch (limit) {
		case 0:
			choiceEfixed = true;
			
			choiceArray.addAll(Arrays.asList("nums.length", "nums.length - 1", "nums.size()", "nums.size() - 1", "None of the above"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Which index is the last element in a list called nums at?";
			
			answerKey = getAns(choiceArray, "nums.size() - 1");
			answer = choiceArray.get(answerKey - 65);
			
			break;
		case 1:
			choiceEfixed = true; choiceDfixed = true;
			
			choiceArray.addAll(Arrays.asList("An array has faster access to its elements than a list does.", "An array knows its length, but a list doesn't know its length.",
											 "An ArrayList can allocate more space than it needs.", "All of the above", "None of the above"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Which of the following is a reason to use an array instead of an ArrayList?";

			answerKey = getAns(choiceArray, "An ArrayList can allocate more space than it needs.");
			answer = choiceArray.get(answerKey - 65);
			
			break;
		case 2:
			choiceEfixed = true; choiceDfixed = true;
			
			choiceArray.addAll(Arrays.asList("An ArrayList can grow or shrink as needed, while an array is always the same size.", "You can use a for-each loop on an ArrayList, but not in an array.",
											 "You can store objects in an ArrayList, but not in an array.", "All of the above", "None of the above"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Which of the following is a reason to use an ArrayList instead of an array";

			answerKey = getAns(choiceArray, "An ArrayList can grow or shrink as needed, while an array is always the same size.");
			answer = choiceArray.get(answerKey - 65);
			
			break;
		case 3:
			choiceEfixed = false; choiceDfixed = false;
			
			choiceArray.addAll(Arrays.asList("nums[0]", "nums[1]", "nums.first()", "nums.get(0)", "nums.get(1)"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Which of the following is the correct way to get the first value in a list called nums?";

			answerKey = getAns(choiceArray, "nums.get(0)");
			answer = choiceArray.get(answerKey - 65);
			
			break;
		case 4:
			choiceEfixed = false; choiceDfixed = false;
			choiceArray.addAll(Arrays.asList("nums[1] = 5;", "nums[2] = 5;", "nums.set(5,1);", "nums.set(1,5);", "nums.set(2,5);"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Which of the following is the correct way to set the second value in a list called nums to 5?";

			answerKey = getAns(choiceArray, "nums.set(1,5);");
			answer = choiceArray.get(answerKey -  65);
			
			break;
		case 5:
			choiceEfixed = false; choiceDfixed = false;
			choiceArray.addAll(Arrays.asList("[P, Q, R, s, T]", "[P, Q, s, T, u]", "[P, Q, T, s, u]", "[P, T, Q, s, u]", "[P, T, s, R, u]"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Consider the following code segment.\n"
					+ "ArrayList<String> list 5 new ArrayList<String>();\n"
					+ "list.add(\"P\");\n"
					+ "list.add(\"Q\");\n"
					+ "list.add(\"R\");\n"
					+ "list.set(2, \"s\");\n"
					+ "list.add(2, \"T\");\n"
					+ "list.add(\"u\");\n"
					+ "System.out.println(list);\n"
					+ "What is printed as a result of executing the code segment?";

			answerKey = getAns(choiceArray, "[P, Q, T, s, u]");
			answer = choiceArray.get(answerKey -  65);
			
			break;
		case 6:
			choiceEfixed = true; choiceDfixed = false;
			choiceArray.addAll(Arrays.asList("[1,2,3,4,5]", "[1,2,4,5,6]", "[1,2,5,4,6]", "[1,5,2,4,6]", "None of the above"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "List<Integer> list1 = new ArrayList<Integer>();\n" + 
							"list1.add(new Integer(1));\n"+ 
							"list1.add(new Integer(2));\n" + 
							"list1.add(new Integer(3));\n"+ 
							"list1.set(2, new Integer(4));\n" + 
							"list1.add(2, new Integer(5));\n"+ 
							"list1.add(new Integer(6));\n" + 
							"System.out.println(list1);";

			answerKey = getAns(choiceArray, "[1,2,5,4,6]");
			answer = choiceArray.get(answerKey -  65);
			
			break;
		case 7:
			choiceEfixed = false; choiceDfixed = false;
			
			choiceArray.addAll(Arrays.asList("[1,2,5,4,6,3]", "[6,5,4,3,2,1]", "[1,2,3,4,5,6]", "[1,4,2,6,3]", "[1,2,4,6,3]"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "List<Integer> aList = new ArrayList<Integer>();\n" + 
							"aList.add(new Integer(1));\n"+ 
							"aList.add(new Integer(2));\n" + 
							"aList.add(1, new Integer(5));\n"+ 
							"aList.set(1, new Integer(4));\n" + 
							"aList.add(new Integer(6));\n"+ 
							"aList.add(new Integer(3));\n" + 
							"System.out.println(list);";
			answerKey = getAns(choiceArray, "[1,4,2,6,3]");
			answer = choiceArray.get(answerKey - 65);
			
			break;
		case 8:
			choiceEfixed = true; choiceDfixed = false;
			
			choiceArray.addAll(Arrays.asList("[pig, chicken, unicorn, dog]", "[dog, unicorn]", "[dog, unicorn, chicken]", "[dog, chicken, unicorn]", "None of the above"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			//format question
			this.question = String.format(
			"ArrayList<String> animals = new ArrayList<String>() \n"
			+ "animals.add(\"pig\");\n" 
			+ "animals.add(\"chicken\");\n" 
			+ "animals.add(1, \"unicorn\");\n" 
			+ "animals.remove(0);\n" 
			+ "animals.set(0, \"dog\"); \n"
			+ "System.out.println(animals); \n "
			);

	        this.answerKey = getAns(choiceArray, "[dog, unicorn]");
	        this.answer = "[dog, unicorn]";
	        break;
		case 9: 
			//getting random numbers to fill array
			int[] num = IntStream.generate(() -> new Random().nextInt(10)).limit(6).toArray();		

			question = String.format("What is the value stored in list when:\n"
										+ "ArrayList<Integer> list = new ArrayList<Integer>();\n"
										+ "list.add(%d); \n"
										+ "list.add(%d); \n"
										+ "list.add(%d); \n"
										+ "list.add(%d); \n"
										+ "list.remove(2); \n"
										+ "list.add(%d); \n"
										+ "list.add(%d); \n"
										+ "list.remove(1); \n"
										+ "list.set(1, %d);", num[0], num[1], num[2], num[3], num[4], num[5], num[5]);
			
			//correct answer
			answer =  String.format("[%d, %d, %d, %d, %d]", num[0], num[5], num[3], num[4], num[5]);
			//%d is the format() format for an integer to print
			
			Set<String> choiceSet = new HashSet<String>();
			choiceSet.add(answer);
			
			while(choiceSet.size() < 5) {
				choiceSet.add(String.format("[%d, %d, %d, %d, %d]", num[rand.nextInt(6)], num[rand.nextInt(6)], num[rand.nextInt(6)], num[rand.nextInt(6)], num[rand.nextInt(6)]));
			}
			
			for(String s: choiceSet) {
				choiceArray.add(s);
			}
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			answerKey = getAns(choiceArray, answer);
			break;
		case 10: 
			randomBased1();
			break;
		case 11:
			randomBased2();
			break;
		case 12:
			randomBased3();
			break;
		case 13:
			randomBased4();
			break;
		case 14: 
			randomBased5();
			break;
		} 
	}
	
	protected void setupQuestionData(int qNumber) {
        ConsoleMethods.println("ArrayList class setupQuestionData method");
		if(qNumber == -1) {
			qNumber = rand.nextInt(14);
		}
		// format question
		switch (qNumber) {
		case 0:
			choiceEfixed = true;
			choiceArray.addAll(Arrays.asList("nums.length", "nums.length - 1", "nums.size()", "nums.size() - 1", "None of the above"));
			System.out.println(choiceArray);
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			question = "Which index is the last element in a list called nums at?";
			
			answerKey = getAns(choiceArray, "nums.size() - 1");
			answer = choiceArray.get(answerKey - 65);
			
			break;
		case 1:
			choiceEfixed = true; choiceDfixed = true;
			
			choiceArray.addAll(Arrays.asList("An array has faster access to its elements than a list does.", "An array knows its length, but a list doesn't know its length.",
											 "An ArrayList can allocate more space than it needs.", "All of the above", "None of the above"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Which of the following is a reason to use an array instead of an ArrayList?";

			answerKey = getAns(choiceArray, "An ArrayList can allocate more space than it needs.");
			answer = choiceArray.get(answerKey - 65);
			
			break;
		case 2:
			choiceEfixed = true; choiceDfixed = true;
			
			choiceArray.addAll(Arrays.asList("An ArrayList can grow or shrink as needed, while an array is always the same size.", "You can use a for-each loop on an ArrayList, but not in an array.",
											 "You can store objects in an ArrayList, but not in an array.", "All of the above", "None of the above"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Which of the following is a reason to use an ArrayList instead of an array";

			answerKey = getAns(choiceArray, "An ArrayList can grow or shrink as needed, while an array is always the same size.");
			answer = choiceArray.get(answerKey - 65);
			
			break;
		case 3:
			choiceEfixed = false; choiceDfixed = false;
			
			choiceArray.addAll(Arrays.asList("nums[0]", "nums[1]", "nums.first()", "nums.get(0)", "nums.get(1)"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Which of the following is the correct way to get the first value in a list called nums?";

			answerKey = getAns(choiceArray, "nums.get(0)");
			answer = choiceArray.get(answerKey - 65);
			
			break;
		case 4:
			choiceEfixed = false; choiceDfixed = false;
			choiceArray.addAll(Arrays.asList("nums[1] = 5;", "nums[2] = 5;", "nums.set(5,1);", "nums.set(1,5);", "nums.set(2,5);"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Which of the following is the correct way to set the second value in a list called nums to 5?";

			answerKey = getAns(choiceArray, "nums.set(1,5);");
			answer = choiceArray.get(answerKey -  65);
			
			break;
		case 5:
			choiceEfixed = false; choiceDfixed = false;
			choiceArray.addAll(Arrays.asList("[P, Q, R, s, T]", "[P, Q, s, T, u]", "[P, Q, T, s, u]", "[P, T, Q, s, u]", "[P, T, s, R, u]"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "Consider the following code segment.\n"
					+ "ArrayList<String> list 5 new ArrayList<String>();\n"
					+ "list.add(\"P\");\n"
					+ "list.add(\"Q\");\n"
					+ "list.add(\"R\");\n"
					+ "list.set(2, \"s\");\n"
					+ "list.add(2, \"T\");\n"
					+ "list.add(\"u\");\n"
					+ "System.out.println(list);\n"
					+ "What is printed as a result of executing the code segment?";

			answerKey = getAns(choiceArray, "[P, Q, T, s, u]");
			answer = choiceArray.get(answerKey -  65);
			
			break;
		case 6:
			choiceEfixed = true; choiceDfixed = false;
			choiceArray.addAll(Arrays.asList("[1,2,3,4,5]", "[1,2,4,5,6]", "[1,2,5,4,6]", "[1,5,2,4,6]", "None of the above"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "List<Integer> list1 = new ArrayList<Integer>();\n" + 
							"list1.add(new Integer(1));\n"+ 
							"list1.add(new Integer(2));\n" + 
							"list1.add(new Integer(3));\n"+ 
							"list1.set(2, new Integer(4));\n" + 
							"list1.add(2, new Integer(5));\n"+ 
							"list1.add(new Integer(6));\n" + 
							"System.out.println(list1);";

			answerKey = getAns(choiceArray, "[1,2,5,4,6]");
			answer = choiceArray.get(answerKey -  65);
			
			break;
		case 7:
			choiceEfixed = false; choiceDfixed = false;
			
			choiceArray.addAll(Arrays.asList("[1,2,5,4,6,3]", "[6,5,4,3,2,1]", "[1,2,3,4,5,6]", "[1,4,2,6,3]", "[1,2,4,6,3]"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			this.question = "List<Integer> aList = new ArrayList<Integer>();\n" + 
							"aList.add(new Integer(1));\n"+ 
							"aList.add(new Integer(2));\n" + 
							"aList.add(1, new Integer(5));\n"+ 
							"aList.set(1, new Integer(4));\n" + 
							"aList.add(new Integer(6));\n"+ 
							"aList.add(new Integer(3));\n" + 
							"System.out.println(list);";
			answerKey = getAns(choiceArray, "[1,4,2,6,3]");
			answer = choiceArray.get(answerKey - 65);
			
			break;
		case 8:
			choiceEfixed = true; choiceDfixed = false;
			
			choiceArray.addAll(Arrays.asList("[pig, chicken, unicorn, dog]", "[dog, unicorn]", "[dog, unicorn, chicken]", "[dog, chicken, unicorn]", "None of the above"));
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			//format question
			this.question = String.format(
			"ArrayList<String> animals = new ArrayList<String>() \n"
			+ "animals.add(\"pig\");\n" 
			+ "animals.add(\"chicken\");\n" 
			+ "animals.add(1, \"unicorn\");\n" 
			+ "animals.remove(0);\n" 
			+ "animals.set(0, \"dog\"); \n"
			+ "System.out.println(animals); \n "
			);

	        this.answerKey = getAns(choiceArray, "[dog, unicorn]");
	        this.answer = "[dog, unicorn]";
	        break;
		case 9: 
			//getting random numbers to fill array
			int[] num = IntStream.generate(() -> new Random().nextInt(10)).limit(6).toArray();		

			question = String.format("What is the value stored in list when:\n"
										+ "ArrayList<Integer> list = new ArrayList<Integer>();\n"
										+ "list.add(%d); \n"
										+ "list.add(%d); \n"
										+ "list.add(%d); \n"
										+ "list.add(%d); \n"
										+ "list.remove(2); \n"
										+ "list.add(%d); \n"
										+ "list.add(%d); \n"
										+ "list.remove(1); \n"
										+ "list.set(1, %d);", num[0], num[1], num[2], num[3], num[4], num[5], num[5]);
			
			//correct answer
			answer =  String.format("[%d, %d, %d, %d, %d]", num[0], num[5], num[3], num[4], num[5]);
			//%d is the format() format for an integer to print
			
			Set<String> choiceSet = new HashSet<String>();
			choiceSet.add(answer);
			
			while(choiceSet.size() < 5) {
				choiceSet.add(String.format("[%d, %d, %d, %d, %d]", num[rand.nextInt(6)], num[rand.nextInt(6)], num[rand.nextInt(6)], num[rand.nextInt(6)], num[rand.nextInt(6)]));
			}
			
			for(String s: choiceSet) {
				choiceArray.add(s);
			}
			randomizeChoiceArray(choiceArray);
			loadChoices();
			
			answerKey = getAns(choiceArray, answer);
			break;
		case 10: 
			randomBased1();
			break;
		case 11:
			randomBased2();
			break;
		case 12:
			randomBased3();
			break;
		case 13:
			randomBased4();
			break;
		case 14: 
			randomBased5();
			break;
		} 
	}
	
	private void randomBased1() {
		int a = rand.nextInt(2);
		int n = rand.nextInt(3)+1;
		/**
	     * This question is aimed to test the addition of an arrayList and the "remove" statement in arrayList
	     * @param q,w,e,r are all randomized numbers that can be operated in the arrayList 
	     */
		int q= rand.nextInt(2);
	    int w = rand.nextInt(3)+1;
	    int e = rand.nextInt(4)+4;
	    int r = rand.nextInt(5)+9;
	   //initialize the array
	     java.util.ArrayList<Integer> alt = new java.util.ArrayList<Integer>();
		this.question = String.format("What's the result of sum after the following operation"+
				"ArrayList<Integer> alt = new ArrayList<Integer>(); \n"+ 
				"alt.add("+q+");"+"\n"+ 
				"alt.add("+w+");"+"\n"+ 
				"alt.add("+e+");"+"\n"+ 
				"alt.add("+r+");"+"\n"+ 
				"alt.remove("+n+");"+"\n"+ 
				"int sum = 0; \n"+ 
				"for(int i = 0; i < alt.size(); i++)\r\n" + 
				"sum += m.get(i);");
		//set up array
		alt.add(q);
		alt.add(w);
		alt.add(e);
		alt.add(r);
		int sum = 0;
		for(int i = 0; i < alt.size(); i++)
		    sum += alt.get(i);
		//convert integer to String and set it as answer
		this.answer = "The answer is: " + Integer.toString(sum);
		String chA = Integer.toString(q+w+e+r);
		String chB = Integer.toString(q+w+r);
		String chC = Integer.toString(q+e+r);
		String chD = Integer.toString(w+e+r);
		String chE = Integer.toString(1+q+e+r);
		//initialize the answer options
		choiceArray.addAll(Arrays.asList(chA, chB, chC, chD, chE));
		randomizeChoiceArray(choiceArray);
		loadChoices();
		/**
		 * @param switcher using a switch statement to assign the correct answer to the answer options
		 * This code can successfully randomize the answer options
		 */
		answerKey = getAns(choiceArray, Integer.toString(sum));    
	}
	
	/**
     * 
     */
	private void randomBased2() {
		int a = rand.nextInt(2);
		int n = rand.nextInt(3)+1;
		//set up the element that we want to randomly change in the arrayList
		
		//setting up the arrayList
		java.util.ArrayList<String> alt = new java.util.ArrayList<String>();
		alt.add("Q");
		alt.add("W");
		alt.add("E");
		alt.add("R");
		//Randomizing the element
		alt.set(n, "T");
		//setting up the answer choice by converting the arraylist to array then to a string)
		String[] ans = alt.toArray(new String[0]);
		String answerop = Arrays.toString(ans);
		this.answer = answerop;
		//The arraylsit is shuffled and then set up as an answer option, the rest answer options are randomized and setup that way as well
		Set<String> choiceSet = new HashSet<String>();
		choiceSet.add(answerop);
		while(choiceSet.size() < 5) {
			Collections.shuffle(alt);
			String[] shuffledArray = alt.toArray(new String[0]);
			choiceSet.add(Arrays.deepToString(shuffledArray));
		}

		/**
		 *In the following is where we randomize the answer options
		 *in the process the correct answer "answeroop" will over write the randomized array in the answer option
		 */
		for(String s: choiceSet) {
			choiceArray.add(s);
		}
		randomizeChoiceArray(choiceArray);
		loadChoices();
		answerKey = getAns(choiceArray, answerop);

		//printing the question
		this.question = String.format("What's the result of the following action:"+
		"ArrayList<String> alt = new ArrayList<String>();"	+
				"alt.add(\"Q\");\r\n" +
				"alt.add(\"W\");\n"+
				"alt.add(\"E\");\r\n" +
				"alt.add(\"R\");\n"+
				"alt.set("+n+",\"T\");");
	}
	
	private void randomBased3() {
		int removeVal = rand.nextInt(5) + 5;
		int[] num = {5,6,7,8,9};
		String ans = "";
		
		question = "Which of the following is the correct way to remove the value " + removeVal
					  + " from the list below? \n nums = [5,6,7,8,9]";
		
		for(int n = 0; n < num.length; n++)
		{
			if((n + 5) == removeVal) {
				ans = "nums.remove(" + n + ");";
				choiceArray.add(ans);
			}
			else {
				choiceArray.add("nums.remove(" + n + ");");
			}
		}
		loadChoices();
		answerKey = getAns(choiceArray, ans);
		answer = choiceArray.get(answerKey - 65);
	}

	private void randomBased4() {
		java.util.ArrayList<String> methods = new java.util.ArrayList<String>(Arrays.asList(new String[] {"list.add(\"Ethan\")","list.remove(2)","list.contains(\"Ethan\")","list.set(2,\"Ethan\")","list.get(1)"}));		String[] names = {"Andrei","Edgar","Jared","Ethan"};
		java.util.ArrayList<String> name = new java.util.ArrayList<String>(Arrays.asList(new String[] {"Andrei","Edgar","Jared","Ethan"}));
		
		int methodIndex = rand.nextInt(5);
		
		question = String.format("What does %s do to list %s", methods.get(methodIndex), name.toString());
		
		java.util.ArrayList<String> answer1 = new java.util.ArrayList<String>(name);
		java.util.ArrayList<String> answer2 = new java.util.ArrayList<String>(name);
		java.util.ArrayList<String> answer4 = new java.util.ArrayList<String>(name);
		
		answer1.add("Ethan");
		choiceArray.add(answer1.toString());

		answer2.remove(2);
		choiceArray.add(answer2.toString());
		
		choiceArray.add(Boolean.toString(name.contains("Ethan")));
		
		answer4.set(2, "Ethan");
		choiceArray.add(answer4.toString());
		
		choiceArray.add(name.get(1));
		
		loadChoices();
		
		answer = choiceArray.get(methodIndex);
		answerKey = (char)('A' + methodIndex);
		
		
		
		
	}
	
	private void randomBased5() {
		int[] array = IntStream.generate(() -> new Random().nextInt(30)).limit(5).toArray();
		int index = rand.nextInt(array.length);
		question = "Given: int[] array = " + Arrays.toString(array)+ ", what is the value of array[" +
                index +
                "]?"; 
		
        for( int i = 0; i < 5; i++ ) {
        	choiceArray.add(Integer.toString(array[i]));
        }
        
        loadChoices();
        answer = choiceArray.get(index);
        answerKey = getAns(choiceArray, Integer.toString(array[index]));
	}
}

