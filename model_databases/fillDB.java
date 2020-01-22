package model_databases;

import java.sql.SQLException;

import AP_Exam.FinalArrayList;
import AP_Exam.FinalBooleanQuestions;
import model_questions.QuestionMC;

public class fillDB {
	static questionDB db = new questionDB();
	
	public fillDB() {
		
	}
	
	public static void addArrayList() throws ClassNotFoundException, SQLException {
		QuestionMC q;
		for(int a = 0; a < 10; a++) {
			q = new FinalArrayList(a);
			db.addQuestion(q.getQuestion(), q.getChoiceA(), q.getChoiceB(), q.getChoiceC(), q.getChoiceD(), q.getChoiceE(), q.getAnswer());
		}
	}
	
	public static void addBoolean() throws ClassNotFoundException, SQLException {
		QuestionMC q;
		for(int a = 0; a < 8; a++) {
			q = new FinalBooleanQuestions(a);
			db.addQuestion(q.getQuestion(), q.getChoiceA(), q.getChoiceB(), q.getChoiceC(), q.getChoiceD(), q.getChoiceE(), q.getAnswer());
		}
	}
}
