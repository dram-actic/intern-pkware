package com.JdbcExample;

import java.sql.*;

public class PostgresConnect{
	static String driverClassName = "org.postgresql.Driver";
	static String url = "jdbc:postgresql://localhost:5432/pkware-intern";
	static String userName = "postgres";
	static String password = "admin";
	static String query = "insert into interns_data.interns(id, fname, lname, age) values (201, 'Sankalp', 'Sharma', 24)"; 
	
	private static Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			//Load Driver Class
			Class.forName(driverClassName);
			
			//Obtain Connection
			conn = DriverManager.getConnection(url, userName, password);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) throws Exception {
		Connection connect = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		int count = 0;
		try {
			connect = getConnection();
			if(connect == null)
				throw new Exception("Connection not Established");
			
			stmt = connect.createStatement();
			//count = stmt.executeUpdate(query);
			rs = stmt.executeQuery("select id, fname from interns_data.interns");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
			if(connect != null)
				rs.close();
		}
		//Execute the query
		System.out.println("No. of rows affected= "+count);
	}

}
