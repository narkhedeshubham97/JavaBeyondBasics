package ExerciseJDBCAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApi {

	static Connection con = null;
	static String url = "jdbc:mysql://localhost:3306/Studentdata";
	static String username = "root";
	static String password = "root";
	static int status = 0;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
			String q = "create table Student(Name varchar(24),RollNumber int, CourseName varchar(24), Score int)";

			Statement st = con.createStatement();
			// status=st.executeUpdate(q);

			String q1 = "INSERT INTO `Studentdata`.`Student`(`Name`,`RollNumber`,`CourseName`,`Score`)VALUES('Shubham',101,'java',80),('Pratik',102,'C#',85),('Ram',103,'java',75),('Shyam',104,'Angular',75),('Amit',105,'java',80)";

			PreparedStatement st1 = con.prepareStatement(q1);
			int status1 = st1.executeUpdate();

			String q2 = "select * from Student where CourseName='java' and Score>=60";
			ResultSet set = st.executeQuery(q2);

			while (set.next()) {
				System.out.println("Name: " + set.getString(1) + "\t" + "Rollnumber : " + set.getInt(2) + "\t"
						+ "Course: " + set.getString(3) + "\t" + "Score : " + set.getInt(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
