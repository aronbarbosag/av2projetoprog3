package exemplo;
import java.util.Scanner;

public class estudante {
	private int studentID;
	private String nome;
	private String ssn;
	private double qpa;
	public final int SCHCODE = 34958;
	public  estudante(int x, String n, String s, double g ) 
	{
		studentID = 0;
		nome = "";
		ssn = "";
		qpa = 0.0;
	}//fim
	public int getStudentId() {
		return studentID;
	}
	public void setStudentid(int studentID) {
		this.studentID = studentID;
	}
}
