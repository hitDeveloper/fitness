package page;
import com.opensymphony.xwork2.ActionContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class checkAction 
{
	public String execute() throws Exception 
	{
		try{
			Map attibutes = ActionContext.getContext().getSession();
			String userName = null;
			userName = (String)attibutes.get("userName");
			if(userName==null)
			{
				return "NONE";
			}
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1191834709");
		}catch(SQLException e)
		{
			return null;
		}catch(ClassNotFoundException e)
		{
			return null;
		}
		return null;
	}
}