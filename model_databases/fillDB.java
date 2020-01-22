package model_databases;

import java.sql.SQLException;

import AP_Exam.FinalArrayList;
import model_questions.QuestionMC;

public class fillDB {
	static questionDB db = new questionDB();
	
	public fillDB() {
		
	}
	
	public static void fillArrayList() throws ClassNotFoundException, SQLException {
		QuestionMC q;
		for(int a = 0; a < 10; a++) {
			q = new FinalArrayList(a);
			System.out.println("choice a: " + q.getChoiceA() + "\nchoice b: " + q.getChoiceB());
			
			db.addQuestion(q.getQuestion(), q.getChoiceA(), q.getChoiceB(), q.getChoiceC(), q.getChoiceD(), q.getChoiceE(), q.getAnswer());
		}
	}
}
