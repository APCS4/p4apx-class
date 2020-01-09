import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class testModeSwitch extends testModeCaller
{
	//int calls[];
	int numberFull;
	
	public testModeSwitch()
	{
		//Calls array
		 calls = new int[13];
		//Fills array with 0, represents 0 calls to each type of question
		
		
		numberFull=0;
		
		Random rand = new Random();
	}
	
	public void questionsPicker()
	{
		for (int i= 0; i<13; i++)
		{
			calls[i]=0;
		}
		
		
		for (int i= 0; i<13; i++)
		{
			if (calls[i]==3)
				numberFull ++;
		}

		int question; 
		if (numberFull!=13)
		{
			
			testQuestionAnswer.setText("");
 
        chA.setSelected(false);
		chB.setSelected(false);
		chC.setSelected(false); 
		chD.setSelected(false);
		chE.setSelected(false); 
		
		
		question = rand.nextInt(13); 
		while(calls[question]==3)
		{
		question = rand.nextInt(13); 
		}
		//increment value in calls and call methods
		switch(question)
		{
		case 0: 
		calls[0]+=1;
		AP_Exam.Question a = new AP_Exam.MathQuestions();
		   TestQ.setText(a.getQuestion());
		chA.setText(a.getChoiceA());
		chB.setText(a.getChoiceB());
		chC.setText(a.getChoiceC());
		chD.setText(a.getChoiceD());
		chE.setText(a.getChoiceE());
		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(a.getAnswer());
		}
		});
		
		break; 
		case 1: 
		calls[1]+=1;
		AP_Exam.encapsulationQuestions b = new AP_Exam.encapsulationQuestions();
		  TestQ.setText(b.getQuestion());
		chA.setText(b.getChoiceA());
		chB.setText(b.getChoiceB());
		chC.setText(b.getChoiceC());
		chD.setText(b.getChoiceD());
		chE.setText(b.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(b.getAnswer());

		}
		});
	
		break;
		case 2:
		calls[2]+=1;
		AP_Exam.Question c = new AP_Exam.DataTypeQuestions();
		   TestQ.setText(c.getQuestion());
		chA.setText(c.getChoiceA());
		chB.setText(c.getChoiceB());
		chC.setText(c.getChoiceC());
		chD.setText(c.getChoiceD());
		chE.setText(c.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(c.getAnswer());
		}
		});
	
		break; 
		 
		case 3: 
		calls[3]+=1;
		AP_Exam.Question d = new AP_Exam.BinaryMathQuestions();
		   TestQ.setText(d.getQuestion());
		chA.setText(d.getChoiceA());
		chB.setText(d.getChoiceB());
		chC.setText(d.getChoiceC());
		chD.setText(d.getChoiceD());
		chE.setText(d.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(d.getAnswer());
		}
		});
	
		break;
		case 4: 
		calls[question]+=1;
		AP_Exam.Question x = new AP_Exam.CA();
		TestQ.setText(x.getQuestion());
		chA.setText(x.getChoiceA());
		chB.setText(x.getChoiceB());
		chC.setText(x.getChoiceC());
		chD.setText(x.getChoiceD());
		chE.setText(x.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(x.getAnswer());
		}
		});
	
		break; 
		case 5: 
		calls[question]+=1;
		AP_Exam.Question f = new AP_Exam.MVCQuestion();
		TestQ.setText(f.getQuestion());
		chA.setText(f.getChoiceA());
		chB.setText(f.getChoiceB());
		chC.setText(f.getChoiceC());
		chD.setText(f.getChoiceD());
		chE.setText(f.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(f.getAnswer());
		}
		});
		
		break; 
		case 6: 
		calls[question]+=1;
		AP_Exam.Question g = new AP_Exam.OperatorQuestions();
		TestQ.setText(g.getQuestion());
		chA.setText(g.getChoiceA());
		chB.setText(g.getChoiceB());
		chC.setText(g.getChoiceC());
		chD.setText(g.getChoiceD());
		chE.setText(g.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(g.getAnswer());
		}
		});
		
		break;
		case 7:
		calls[question]+=1;
		int listPicker = rand.nextInt(2);
		if(listPicker==0)
		{
		AP_Exam.Question k = new AP_Exam.ArrayListQuestions();
		   TestQ.setText(k.getQuestion());
		chA.setText(k.getChoiceA());
		chB.setText(k.getChoiceB());
		chC.setText(k.getChoiceC());
		chD.setText(k.getChoiceD());
		chE.setText(k.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(k.getAnswer());
		}
		});
		}
		else
		{

		AP_Exam.Question p = new AP_Exam.ListQuestions2();
		TestQ.setText(p.getQuestion());
		chA.setText(p.getChoiceA());
		chB.setText(p.getChoiceB());
		chC.setText(p.getChoiceC());
		chD.setText(p.getChoiceD());
		chE.setText(p.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(p.getAnswer());
		}
		});
		}
		 
		break; 
		case 8: 
		calls[question]+=1;
		AP_Exam.Question m = new AP_Exam.BackgroundInfoQuestions();
		TestQ.setText(m.getQuestion());
		chA.setText(m.getChoiceA());
		chB.setText(m.getChoiceB());
		chC.setText(m.getChoiceC());
		chD.setText(m.getChoiceD());
		chE.setText(m.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(m.getAnswer());
		}
		});
	
		break; 
		case 9: 
		calls[question]+=1;
		AP_Exam.Question n = new AP_Exam.PowSqrt();
		TestQ.setText(n.getQuestion());
		chA.setText(n.getChoiceA());
		chB.setText(n.getChoiceB());
		chC.setText(n.getChoiceC());
		chD.setText(n.getChoiceD());
		chE.setText(n.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(n.getAnswer());
		}
		});
		
		break; 
		case 10: 
		calls[question]+= 1;
		AP_Exam.Question o = new AP_Exam.Recursion();
		TestQ.setText(o.getQuestion());
		chA.setText(o.getChoiceA());
		chB.setText(o.getChoiceB());
		chC.setText(o.getChoiceC());
		chD.setText(o.getChoiceD());
		chE.setText(o.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(o.getAnswer());
		}
		});
	
		break; 
		case 11: 
		calls[question]+= 1;
		AP_Exam.Question q = new AP_Exam.PolymorphismQuestions();
		TestQ.setText(q.getQuestion());
		chA.setText(q.getChoiceA());
		chB.setText(q.getChoiceB());
		chC.setText(q.getChoiceC());
		chD.setText(q.getChoiceD());
		chE.setText(q.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(q.getAnswer());
		}
		});
		
		break; 
		case 12: 
		calls[question]+= 1;
		AP_Exam.Question r = new AP_Exam.Polymorph();
		TestQ.setText(r.getQuestion());
		chA.setText(r.getChoiceA());
		chB.setText(r.getChoiceB());
		chC.setText(r.getChoiceC());
		chD.setText(r.getChoiceD());
		chE.setText(r.getChoiceE());

		Submit.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

		testQuestionAnswer.setText(r.getAnswer());
		}
		});
		
		break; 
		}
		}
		//add else option later to display message that says "test finished"
		}

	}
	


