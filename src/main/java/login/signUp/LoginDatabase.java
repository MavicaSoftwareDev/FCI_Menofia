package login.signUp;

import com.example.FCI_Menofia.DBconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LoginDatabase {
static Connection connection;
String sqlCommand;
LoginDatabase(){
    try{

        connection= new DBconnector().getconnection();
        System.out.println("Connection with login Database Done ## ");
        Statement stmt=connection.createStatement();
        stmt.execute("Create table studentsdatabase.signupdata(FirstName text,LastName text,UserName text,Password text);");
        System.out.println("Sign up table created successfully ##");
    }catch (Exception e){
        System.out.println("Error while connecting with database in login page !!");
    }
}


}
