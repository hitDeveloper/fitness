package page;
import java.sql.*;
import java.util.*;

import com.opensymphony.xwork2.ActionContext;
public class orderAction
{
	private String gymName;
	private String booktime;
	private String information;
	public String getInformation()
	{
		return this.information;
	}
	public void setBooktime(String booktime)
	{
		this.booktime=booktime;
	}
	public String getBooktime()
	{
		return this.booktime;
	}
	public void setGymName(String gymName)
	{
		this.gymName=gymName;
	}
	public String getGymName()
	{
		return this.gymName;
	}
	public String execute() throws Exception 
	{
		try{
			Map attibutes = ActionContext.getContext().getSession();
			String userName = null;
			int number=0;
			String usedNumber=null,totalNumber=null;
			userName = (String)attibutes.get("userName");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1191834709");
			String sql2="select * from tb_gym where gymName=\""+gymName+"\"";
			Statement st = (Statement) con.createStatement();
			Statement st1 = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql2);
			while(rs.next())
			{
				usedNumber=rs.getString(2);
				totalNumber=rs.getString(3);
			}
			rs.close();
			number=Integer.parseInt(totalNumber)-Integer.parseInt(usedNumber);
			if(number<=0)
			{
				information="您想要预定的场馆已满，建议其他场馆";
				return "INPUT";
			}
			number=Integer.parseInt(usedNumber)+1;
			usedNumber=Integer.toString(number);
			String sql3="update tb_gym set usedNumber=\""+usedNumber+"\" where gymName = \""+gymName+"\"";
			st.executeUpdate(sql3);
			String sql1="INSERT INTO tb_book(gymName, userName, booktime) VALUES ('"+gymName+"','"+ userName+"','" + booktime+"')";
			st.close();
			st1.executeUpdate(sql1);
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
