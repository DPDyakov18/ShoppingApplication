package ClothingStoreDB;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Connecting {
	private String url="jdbc:sqlserver://SD2320\\sqlexpress;databaseName=ClothingProject;integratedSecurity=true";
	private Connection conn;
	
	
	public void Connecting() throws SQLException {
		System.out.println("Connecting...");
		conn=DriverManager.getConnection(url);
		System.out.println("Connected!");
	}

	public void CloseConnection() throws SQLException {
		conn.close();
	}
	public void ShowCustomers() throws SQLException {
		String query1 = "INSERT INTO Product VALUES ('test','1','test')";
		Statement stmt = conn.createStatement();
		
		
		ResultSet rs = stmt.executeQuery(query1);
		
		while (rs.next()) {
			System.out.println(rs.getString("first_name"));
		}
	}
}
