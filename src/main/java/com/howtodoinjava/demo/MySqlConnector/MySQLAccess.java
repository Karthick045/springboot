package com.howtodoinjava.demo.MySqlConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class MySQLAccess {

	public static void main(String[] args) throws SQLException {
		try {
			String url = "jdbc:mysql://localhost:3306/dev_kar";
			String username = "karthik";
			String password = "Menakaramu@045";
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement preSt =connection.prepareStatement("INSERT into user_details(user_id,user_name,user_password) values (?,?,?)");
			preSt.setString(1, "DEV");
			preSt.setString(2, "karthik");
			preSt.setString(3, "Menakaramu@045");
			preSt.execute();
			preSt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
