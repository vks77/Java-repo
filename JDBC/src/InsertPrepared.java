import java.sql.* ;

public class InsertPrepared {

	public static void main(String[] args) {
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Wysiwyg");
			
			PreparedStatement stmt = con.prepareStatement("insert into emp values (?,?,?)");
			
			stmt.setInt(1, 1001);   // 1 specifies the first parameter in the query.
			
			stmt.setString(2, "Asif");
			
			stmt.setInt(3, 35);
			
			int i = stmt.executeUpdate();
			
			System.out.println(i + " records inserted.");
			
			con.close();
		}
		catch(Exception e)	{
			System.out.println(e);
		}

	}

}
