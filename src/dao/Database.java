package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database
{
	public Connection getConnection() throws Exception
	{
		
		String ip = "127.0.0.1";
		try
		{
			String connectionURL = "jdbc:mysql:"+ ip +":3306/identity@thecentredb";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "root");
			return connection;
		} catch (Exception e)
		{
			throw e;
		}
		
	}

}
