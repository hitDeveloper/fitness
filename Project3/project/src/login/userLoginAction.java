package login;
import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionContext;
public class userLoginAction{
	private String userName;
	private String adminName;
	private String password;
	private String information="";
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
			String sql3="select * from tb_admin where adminName=\""+adminName+"\"";
			if("".equals(password))
			{
				information="���벻��Ϊ��";
				return "INPUT";
			}
			else if(("".equals(userName))&&("".equals(adminName)))
			{
				information="�˺Ų���Ϊ��";
				return "INPUT";
			}
			else if(!"".equals(userName))
			{
				Statement st = (Statement) con.createStatement();
	            ResultSet rs = st.executeQuery(sql1);
	            if(!rs.next())
	            {
	            	rs.close();
	            	information="�û������������";
	            	return "INPUT";
	            }
			}
			else if(!"".equals(adminName))
			{
				Statement st = (Statement) con.createStatement();
	            ResultSet rs = st.executeQuery(sql2);
	            String gymName=null;
	            if(!rs.next())
	            {
	            	rs.close();
	            	information="�ù���Ա������";
	            	return "INPUT";
	            }
	            rs.close();
	            rs=st.executeQuery(sql3);
	            while(rs.next())
		        {
		        	gymName = rs.getString(4);
		        }
	            Map attibutes = ActionContext.getContext().getSession();
	            attibutes.put("gymName", gymName);
	            return "NONE";
			}
		}catch(SQLException e)
		{
			return "INPUT";
		}catch(ClassNotFoundException e)
		{
			return "INPUT";
		}
		Map attibutes = ActionContext.getContext().getSession();
		attibutes.put("userName", userName);
		return "SUCCESS";
	}
}