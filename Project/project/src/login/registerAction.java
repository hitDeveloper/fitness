package login;
import java.sql.*;
import java.util.*;
import java.io.Serializable;
public class registerAction 
{
	private String userName;
	private String password;
	private String repassword;
	private String number;
	private String college;
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
	public String getPassword()
	{
		return this.password;
	}
	public void setRepassword(String repassword)
	{
		this.repassword=repassword;
	}
	public String getRepassword()
	{
		return this.repassword;
	}
	public void setNumber(String number)
	{
		this.number=number;
	}
	public String getNumber()
	{
		return this.number;
	}
	public void setCollege(String college)
	{
		this.college=college;
	}
	public String getCollege()
	{
		return this.college;
	}
	public String execute() throws Exception
	{
		try{
			if("".equals(userName))
			{
				information="用户名不能为空";
				return "INPUT";
			}
			if("".equals(password))
			{
				information="密码不能为空";
				return "INPUT";
			}
			if("".equals(repassword))
			{
				information="再次输入密码不能为空";
				return "INPUT";
			}
			if("".equals(number))
			{
				information="学号不能为空";
				return "INPUT";
			}
			if(!password.equals(repassword))
			{
				information="两次密码输入不一样，请重新输入";
				return "INPUT";
			}
			int count=1;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_hitfitness","xwomyojjnm","1imik41h0yi1kmh0hmx02l3i01yz2203ilzikmh1");
			String sql1="select * from tb_users";
			String sql3="select * from tb_users where username=\""+userName+"\"";
			Statement st = (Statement) con.createStatement();
			Statement st1 = (Statement) con.createStatement();
			Statement st2 = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            ResultSet rs1 = st2.executeQuery(sql3);
            if(rs1.next())
            {
            	information="用户名已存在";
            	return "INPUT";
            }
            st2.close();
            while(rs.next())
            {
            	count++;
            }
            st.close();
            String sql2="INSERT INTO tb_users(uID, username, password, number, college) VALUES ('"+count+"','"+ userName+"','" + password+"','"+number+"','"+college+"')";
            st1.executeUpdate(sql2);
        	st1.close();
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
