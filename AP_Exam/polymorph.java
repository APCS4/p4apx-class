package AP_Exam;
import java.util.Random; 
/*
 * author Rhea, Mateo
 */

public class ArrayList extends Question {
	private String[] datatype = {"int", "float", "char"};
	private int[] multiplier = {10, 100, 1000};
        public ArrayList()
        {
        	Random rand = new Random();
        	double value = rand.nextDouble() * multiplier[rand.nextInt(multiplier.length)];
        	Integer index = rand.nextInt(datatype.length);
        	setupQuestion(datatype[index], value);
        }
        public static String mainTest ()
        {
    	Question q = new ArrayList();
        q.askQuestionConsole();
        return q.getCounterMsg();
    }

    public void setupQuestion(String dataTypeName, double number)
    {  
    	Random rand = new Random();
        int test = rand.nextInt(10); 
        // format question
        if (test == 0) {
        this.question = "Which method implies calling a method within itself?";
                    
        this.choiceA = "for loop";
        this.choiceB = "polymorphism";
        this.choiceC = "type casting"; 
        this.choiceD = "recursion";
        this.choiceE = "None of the above";
        answer = this.choiceD; 
        }
        else if (test ==1) {
        	this.question = "Which datatype is the best to use when you want to incorporate decimals?";
            this.choiceA = "int";
            this.choiceB = "boolean";
            this.choiceC = "double"; 
            this.choiceD = "All of the above";
            this.choiceE = "None of the above";
            answer = this.choiceC; 
        }
        else if (test ==2) {
        	this.question = "When you want the first value of an array called Pets, how do you write that?";
            this.choiceA = "Pets[0]";
            this.choiceB = "Pets[1]";
            this.choiceC = "Pets.first[]"; 
            this.choiceD = "All of the above";
            this.choiceE = "None of the above";
            answer = this.choiceA; 
        }
        else if (test ==3) {
        	this.question = "What is true about method overloading?";
            this.choiceA = "Different method names, same parameters";
            this.choiceB = "Same method names, same parameters";
            this.choiceC = "Different method names, different parameters"; 
            this.choiceD = "Same method names, different parameters";
            this.choiceE = "None of the above";
            answer = this.choiceD;
            
        }
        else if (test ==4) {
        	this.question = "What would the str.indexOf(7) be if str = 'AP Computer Science'?";
            this.choiceA = "P";
            this.choiceB = "u";
            this.choiceC = "Science"; 
            this.choiceD = "uter Science";
            this.choiceE = "Computer";
            answer = this.choiceD;
        }
        
        else if (test ==5 || test == 6) {
        	this.question = "Which of the following is the correct way to remove the value " + test + " from the list below? \n nums = [5,6,7,8,9,10]";
            this.choiceA = "nums.remove(5);";
            this.choiceB = "nums.remove(0);";
            this.choiceC = "nums.remove(1);"; 
            this.choiceD = "nums.remove(2);";
            this.choiceE = "None of the above";
            if (test == 5) {answer = this.choiceB;}
            if (test == 6) {answer = this.choiceC;}
       
        }