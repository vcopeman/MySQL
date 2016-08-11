package com.tests.mysqlmavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.mysql.cj.api.jdbc.Statement;

public class connecttomysqlclass 
    
{
	@Test
	public void connecttodb() throws SQLException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.thetrainline.com");
    String dbUrl = "jdbc:mysql://localhost:3306/test";
    
    //Give username and password
    String username = "root";
    String password = "root";
    
    //Query to be executed
    String q = "Select * from testdata";
    Connection conn = DriverManager.getConnection(dbUrl, username, password);
    
    //Create a statement
    Statement s = (Statement) conn.createStatement();
    ResultSet rs = s.executeQuery(q);
    while(rs.next())
    {
    	//driver.findElement()
    	
    }
    
	}
      
}
