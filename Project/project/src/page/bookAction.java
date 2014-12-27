package page;
import java.sql.*;
import java.util.*;
import java.io.*;
import com.opensymphony.xwork2.ActionContext;

public class bookAction
{
	private String gymName;
	private String usedNumber;			//场地已使用数
	private String totalNumber;		//场地总数
	private String telNumber;		//电话号码
	private String price;			//价格
	private String booktime;
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
	public void setUsedNumber(String usedNumber)
	{
		this.usedNumber=usedNumber;
	}
	public String getUsedNumber()
	{
		return this.usedNumber;
	}
	public void setTotalNumber(String totalNumber)
	{
		this.totalNumber=totalNumber;
	}
	public String getTotalNumber()
	{
		return this.totalNumber;
	}
	public void setTelNumber(String telNumber)
	{
		this.telNumber=telNumber;
	}
	public String getTelNumber()
	{
		return this.telNumber;
	}
	public void setPrice(String price)
	{
		this.price=price;
	}
	public String getPrice()
	{
		return this.price;
	}
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
			info[] information=new info[14];
			int i=0;
			for(i=0;i<14;i++)
				information[i]=new info();
			i=0;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_hitfitness","xwomyojjnm","1imik41h0yi1kmh0hmx02l3i01yz2203ilzikmh1");
			String sql1="select * from tb_gym";
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql1);
			while(rs.next())
	        {
				information[i].gymName = rs.getString(1);
				information[i].Number = rs.getString(2)+"/"+rs.getString(3);
				information[i].telNumber = rs.getString(6);
				information[i].price = rs.getString(7);
				i++;
	        }
			attibutes.put("information", information);
            rs.close();
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
class info implements Serializable
{
	public String gymName;
	public String Number;
	public String telNumber;
	public String price;
}
