package model_databases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import AP_Exam.FinalArrayList;
/**
 * 
 * @author 1849871
 * Contains methods for creating database which holds text-based questions
 * Includes addQuestion, getQuestion, and displayQuestion methods
 */
public class questionDB {
	public static Connection con;
	public static boolean hasData = false;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			System.out.println("questionDB main method");
			try {
				fillDB.addArrayList();
				fillDB.addBoolean();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			displayQuestions();
			/*try {
				ResultSet res = displayQuestion();
				System.out.println(res.next());
				while(res.next()) {
					System.out.print(res.getRow() + res.getString("question") + "\n\tA. " + res.getString("choice1") + "\n\tB. " + res.getString("choice2") + "\n\tC. " + res.getString("choice3") + "\n\tD. " + res.getString("choice4") + "\n\tE. " + res.getString("choice5") + "\n\tAnswer: " + res.getString("answer") + "\n");
				} 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}*/
		}
		
	public questionDB() {
		
	}
	
	/**
	 * displays questions in console
	 * 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	private static void displayQuestions() throws SQLException, ClassNotFoundException {
		if(con == null) {
			connect();
		}
		
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery("SELECT question, choice1, choice2, choice3, choice4, choice5, answer FROM questionDB");
		while(res.next()) {
			System.out.print(res.getRow() + "\n" + res.getString("question") + "\n\tA. " + res.getString("choice1") + "\n\tB. " + res.getString("choice2") + "\n\tC. " + res.getString("choice3") + "\n\tD. " + res.getString("choice4") + "\n\tE. " + res.getString("choice5") + "\n\tAnswer: " + res.getString("answer") + "\n");
		}
	}
	
	public static void connect() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		con = DriverManager.getConnection("JDBC:SQLite:questionDB.db");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("drop table if exists questionDB");
		initialize();
	}
		private static void initialize() throws SQLException {
			Statement stmt = con.createStatement();
			System.out.println("Building questionDB.db");
			Statement stmt2 = con.createStatement();
			stmt2.execute("CREATE TABLE questionDB"
					+ "(id integer AUTO_INCREMENT," 
					+ "question varchar(255),"
					+ "choice1 varchar(255),"
					+ "choice2 varchar(255),"
					+ "choice3 varchar(255),"
					+ "choice4 varchar(255),"
					+ "choice5 varchar(255),"
					+ "answer varchar(255))");
	}
		
	public void addQuestion(String question, String choice1, String choice2, String choice3, String choice4, String choice5, String answer) throws ClassNotFoundException, SQLException {
		if(con == null) {
			connect();
		}
		
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO questionDB(id, question, choice1, choice2, choice3, choice4, choice5, answer) values(0,?,?,?,?,?,?,?);");
		//pstmt.setString(1, id);
		pstmt.setString(1, question);
		pstmt.setString(2, choice1);
		pstmt.setString(3, choice2);
		pstmt.setString(4, choice3);
		pstmt.setString(5, choice4);
		pstmt.setString(6, choice5);
		pstmt.setString(7, answer);
		pstmt.execute();
	}
	
	public ResultSet getQuestion() throws ClassNotFoundException, SQLException {
		if(con == null) {
			connect();
		}
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT question, choice1, choice2, choice3, choice4, choice5, answer FROM questionDB");
		return rs;
	}
}
