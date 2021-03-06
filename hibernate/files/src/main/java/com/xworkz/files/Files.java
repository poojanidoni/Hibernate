package com.xworkz.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Files {
	private int id;
	private String name;

	public void readData() {

		File file = new File("C:\\Users\\HP\\Desktop\\files\\Files.txt");
		try {
			Scanner data = new Scanner(file);
			while (data.hasNextLine()) {
				name = "";
				String line = data.nextLine();
				while (data.hasNextInt()) {
					id = data.nextInt();
				}
				if (!data.hasNextInt()) {
					name = " " + data.next();
				}
				// System.out.println(id + " "+name);
				saveData();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveData() {
		Connection con = null;
		PreparedStatement prep = null;

		String JDBC_URL = "jdbc:mysql://localhost:3306/newdata";
		String USERNAME = "root";
		String PASSWORD = "root";
		// void readData();

		try {
			con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			prep = con.prepareStatement("INSERT INTO FILES VALUES(?,?)");
			prep.setInt(1, id);
			prep.setString(2, name);
			prep.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
