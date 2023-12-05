import java.sql.*;
import java.io.*;

public class DataMain{

    // JDBC driver name and database URL
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost/emp";
    // Database credentials
    static final String USER = "root";
    static final String PASS = "root";
    public static void main(String[] args) throws Exception
    {

        // File path is passed as parameter
        File file = new File("C:\\Users\\vishn\\Documents\\Data1.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);
    }
}
