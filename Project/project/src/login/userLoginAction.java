package login;
import java.sql.*;
public class userLoginAction{
	private String userName;
	private String adminName;
	private String password;
	private String information;
	public String getInformation()
	{
		return this.information;
	}
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	public String getUserName()
	{
		return this.userName;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public void setAdminName(String adminName){
		this.adminName=adminName;
	}
	public String execute() throws Exception
	{
		try{
			password=password.replace(", ", "");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1191834709");
			String sql1="select * from tb_users where username=\""+userName+"\" and password=\""+password+"\"";
			String sql2="select * from tb_admin where adminName=\""+adminName+"\" and password=\""+password+"\"";
			if("".equals(password))
			{
				information="密码不能为空";
				return "INPUT";
			}
			else if(("".equals(userName))&&("".equals(adminName)))
			{
				return "INPUT";
			}
			else if(!"".equals(userName))
			{
				Statement st = (Statement) con.createStatement();
	            ResultSet rs = st.executeQuery(sql1);
	            if(!rs.next())
	            {
	            	rs.close();
	            	information="用户名或密码错误";
	            	return "INPUT";
	            }
			}
			else if(!"".equals(adminName))
			{
				Statement st = (Statement) con.createStatement();
	            ResultSet rs = st.executeQuery(sql2);
	            if(!rs.next())
	            {
	            	rs.close();
	            	information="管理员名或密码错误";
	            	return "INPUT";
	            }
	            return "NONE";
			}
		}catch(SQLException e)
		{
			return "INPUT";
		}catch(ClassNotFoundException e)
		{
			return "INPUT";
		}
		return "SUCCESS";
	}
}
