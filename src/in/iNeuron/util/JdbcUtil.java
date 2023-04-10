package in.iNeuron.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class JdbcUtil {
	
	
	private JdbcUtil() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Use HiakriCp for connection pooling
	public static Connection getJdbcConnection() throws SQLException,IOException {
		 HikariConfig config=new HikariConfig("src\\\\in\\\\iNeuron\\\\properties\\\\db.properties");
		 HikariDataSource dataSource=new HikariDataSource(config);
		 
		Connection connection=dataSource.getConnection();
		return connection;
	}
	
	@SuppressWarnings("unused")
	public static Connection physicalConnection() throws SQLException, IOException {
		FileInputStream fis=new FileInputStream("src\\in\\iNeuron\\properties\\db.properties"); 
		Properties properties=new Properties();
		properties.load(fis);
		String url=properties.getProperty("url");
		String username=properties.getProperty("user");
		String password=properties.getProperty("password");
		
		Connection connection=DriverManager.getConnection(url, username, password);
		
		return connection;
		
	}
}
