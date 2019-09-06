package jdbc.dbUrlTester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jdbc.ui.InterfaceController;


public class Tester {

	private static InterfaceController controller ;

    public void setController(InterfaceController controller) {
        this.controller = controller ;
    }
    
	public static String newDbConnection(String dbhost, String username, String password, String dbtype) {
		String metadata = null;
		
		/* try {
	            Class.forName(getdbdriver(dbtype));
	            controller.appendLog("jdbc driver loaded successfully");
	        }
	        catch (ClassNotFoundException e) {
	        	controller.appendLog("jdbc driver loading failed");
	        	controller.appendLog(e.getMessage());
	            return null;
	        }
		*/
		try (Connection conn = DriverManager.getConnection(
				dbhost, username, password)	){
			if(conn != null){
				controller.appendLog("JDBC Connection successful");
			}
			metadata = conn.getMetaData().toString();
		} catch (SQLException e) {
			System.out.println("Cannot create database connection");
			e.printStackTrace();
		}
		return metadata;
	}
	
	
	private static String getdbdriver(String dbtype) {
		
		String dbdriver = null;
		
		switch (dbtype) {
		case "MySQL":
			return "com.mysql.cj.jdbc.Driver";
		case "Oracle":
			return "oracle.jdbc.driver.OracleDriver";	
		case "DB2":
			return "com.ibm.db2.jdbc.app.DB2Driver";	
		case "Sybase":
			return "com.sybase.jdbc.SybDriver";	
		case "Teradata":
			return "com.teradata.jdbc.TeraDriver";	
		case "Microsoft SQL Server":
			return  "com.microsoft.sqlserver.jdbc.SQLServerDriver";	
		case "PostgreSQL":
			return "org.postgresql.Driver";	
		
		default :
			return  "Error in dbtype";
		}
		
	}
	
}
