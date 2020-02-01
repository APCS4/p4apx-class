package model_databases;

import java.sql.SQLException;

import AP_Exam.*;
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
	
	public static void addCodeAnalysis() throws ClassNotFoundException, SQLException {
		QuestionMC q;
		for(int a = 0; a < 12; a++) {
			q = new FinalCodeAnalysis(a);
			db.addQuestion(q.getQuestion(), q.getChoiceA(), q.getChoiceB(), q.getChoiceC(), q.getChoiceD(), q.getChoiceE(), q.getAnswer());
		}
	}
	
	public static void addInfoQuestion() throws ClassNotFoundException, SQLException {
		QuestionMC q;
		for(int a = 0; a < 16; a++) {
			q = new finalInfoQuestions(a);
			db.addQuestion(q.getQuestion(), q.getChoiceA(), q.getChoiceB(), q.getChoiceC(), q.getChoiceD(), q.getChoiceE(), q.getAnswer());
		}
	}
	
	public static void addLoop() throws ClassNotFoundException, SQLException {
		QuestionMC q;
		for(int a = 0; a < 8; a++) {
			q = new FinalLoopQuestion(a);
			db.addQuestion(q.getQuestion(), q.getChoiceA(), q.getChoiceB(), q.getChoiceC(), q.getChoiceD(), q.getChoiceE(), q.getAnswer());
		}
	}
	
	public static void addMath() throws ClassNotFoundException, SQLException {
		QuestionMC q;
		for(int a = 0; a < 4; a++) {
			q = new FinalMath(a);
			db.addQuestion(q.getQuestion(), q.getChoiceA(), q.getChoiceB(), q.getChoiceC(), q.getChoiceD(), q.getChoiceE(), q.getAnswer());
		}
	}
	
	public static void addPolymorph() throws ClassNotFoundException, SQLException {
		QuestionMC q;
		for(int a = 0; a < 9; a++) {
			q = new FinalPolymorphQuestions(a);
			db.addQuestion(q.getQuestion(), q.getChoiceA(), q.getChoiceB(), q.getChoiceC(), q.getChoiceD(), q.getChoiceE(), q.getAnswer());
		}
	}
	
	public static void addRecursion() throws ClassNotFoundException, SQLException {
		QuestionMC q;
		for(int a = 1; a < 10; a++) {
			q = new FinalRecursion(a);
			db.addQuestion(q.getQuestion(), q.getChoiceA(), q.getChoiceB(), q.getChoiceC(), q.getChoiceD(), q.getChoiceE(), q.getAnswer());
		}
	}
}
