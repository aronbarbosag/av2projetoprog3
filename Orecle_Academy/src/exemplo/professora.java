package exemplo;

public class professora {
	public static void main(String args[]) 
	{
		estudante s1 = new estudante(123, "Mary Smith", "999-99-9999", 3.4);
		System.out.println(s1);
		estudante s2 = new estudante();
		s2.setStudentid(124);
		s2.setStudentName("Jhon Jacoby");
		s2.setSNN("123-45-6789");
		s2.setGPA(4.0);
		System.out.println(s2);
		System.out.println(s3);
		
	}	
}
