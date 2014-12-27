package login;
import java.sql.*;
import java.util.*;
import java.io.Serializable;
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
			Connection con = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_hitfitness","xwomyojjnm","1imik41h0yi1kmh0hmx02l3i01yz2203ilzikmh1");
			String sql1="select * from tb_users where username=\""+userName+"\" and password=\""+password+"\"";
			String sql2="select * from tb_admin where adminName=\""+adminName+"\" and password=\""+password+"\"";
			String sql3="select * from tb_admin where adminName=\""+adminName+"\"";
			String age=null;
			String sql5="select * from tb_info where userName=\""+userName+"\"";
			System.out.println(userName);
			if("".equals(password))
			{
				information="密码不能为空";
				return "INPUT";
			}
			else if(("".equals(userName))&&("".equals(adminName)))
			{
				information="账号不能为空";
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
	            rs=st.executeQuery(sql5);
	            if(rs.next())
	            {
	            	 Map attibutes = ActionContext.getContext().getSession();
	            	 attibutes.put("age", rs.getString(2));
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
	            	information="该管理员不存在";
	            	return "INPUT";
	            }
	            rs.close();
	            rs=st.executeQuery(sql3);
	            while(rs.next())
		        {
		        	gymName = rs.getString(4);
		        }
	            rs.close();
	            String sql4="select * from tb_gym where gymName=\""+gymName+"\"";
	            String usedNumber=null,totalNumber=null,manager=null,time=null,telNumber=null,price=null;
	            String introduction=null,news=null;
	            rs=st.executeQuery(sql4);
	            while(rs.next())
		        {
		        	usedNumber = rs.getString(2);
		        	totalNumber = rs.getString(3);
		        	manager = rs.getString(4);
		        	time = rs.getString(5);
		        	telNumber = rs.getString(6);
		        	price = rs.getString(7);
		        	introduction = rs.getString(9);
		        	news = rs.getString(8);
		        }
	            rs.close();
	            Map attibutes = ActionContext.getContext().getSession();
	            attibutes.put("gymName", gymName);
	            attibutes.put("usedNumber", usedNumber);
	            attibutes.put("totalNumber", totalNumber);
	            attibutes.put("manager", manager);
	            attibutes.put("time", time);
	            attibutes.put("telNumber", telNumber);
	            attibutes.put("price", price);
	            attibutes.put("introduction", introduction);
	            attibutes.put("news", news);
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
		attibutes.put("adminName", adminName);
		return "SUCCESS";
	}
}
