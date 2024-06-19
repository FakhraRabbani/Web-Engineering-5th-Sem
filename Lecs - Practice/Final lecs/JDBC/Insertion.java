import java.sql.*;
import java.util.*;

public class Insertion{

	public static void main(String args[]) throws Exception{
		//Driver Load
		Class.forName("com.mysql.jdbc.Driver"); //MySql Driver

		String url = "jdbc:mysql://localhost/bitf21m510";
		//Create connection
		Connection con = DriverManager.getConnection(url, "root", "root");

		//Statement Object
		Statement st = con.createStatement();

		//Scanner Object
		Scanner in = new Scanner(System.in);

		String u_name;
		System.out.println("Enter user name:");
		u_name = in.nextLine();

		String roll_no;
		System.out.println("Enter roll no:");
		roll_no = in.nextLine();

		int phone;
		System.out.println("Enter phone no:");
		phone = in.nextInt();

		//Query
		//String query="insert into info(username,password,address,phone,city) values('"+u_name+"', '"+pass+"', '"+address+"', "+phone+" , '"+city+"' )";

 
		String query = "INSERT INTO STUDENT_INFO(NAME,ROLLNO,PHONE) VALUES('"+u_name+"', '"+roll_no+"', "+phone+" )";

		int rs = st.executeUpdate(query);

		System.out.println("No of rows affected: " + rs);

		if(rs > 0){
			System.out.println("Record successfully entered");
		}else{
			System.out.println("Record not entered");
		}

		con.close();

		//SQL Execution

	}
}