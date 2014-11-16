package back;
import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;
public class backAction extends ActionSupport
{
	private String gymName;			//体育馆名
	private String time;            //开放时间
	private String usedNumber;			//场地已使用数
	private String totalNumber;		//场地总数
	private String adminName;		//联系人
	private String telNumber;		//电话号码
	private String price;			//价格
	private String introduction;	//简介
	private String news;            //比赛消息
	private String information;		//错误信息
	public void setAdminName(String adminName)
	{
		this.adminName=adminName;
	}
	public String getAdminName()
	{
		return this.adminName;
	}
	public void setNews(String news)
	{
		this.news=news;
	}
	public String getNews()
	{
		return this.news;
	}
	public void setGymName(String gymName)
	{
		this.gymName=gymName;
	}
	public String getGymName()
	{
		return this.gymName;
	}
	public void setTime(String time)
	{
		this.time=time;
	}
	public String getTime()
	{
		return this.time;
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
	public void setInformation(String information)
	{
		this.information=information;
	}
	public String getInformation()
	{
		return this.information;
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
	public void setIntroduction(String introduction)
	{
		this.introduction=introduction;
	}
	public String getIntroduction()
	{
		return this.introduction;
	}
	public void validate()
	{
		if("".equals(gymName))
		{
			this.addActionError("场馆名不能为空，请参考示例填写");
		}
		else if("".equals(time))
		{
			this.addActionError("开放时间不能为空");
		}
		else if("".equals(usedNumber))
		{
			this.addActionError("场地使用数不能为空，请参考示例填写");
		}
		else if("".equals(totalNumber))
		{
			this.addActionError("场地总数不能为空，请参考示例填写");
		}
		else if("".equals(adminName))
		{
			this.addActionError("联系人不能为空，请参考示例填写");
		}
		else if("".equals(telNumber))
		{
			this.addActionError("电话号码不能为空，请参考示例填写");
		}
		else if("".equals(price))
		{
			this.addActionError("价格不能为空，请参考示例填写");
		}
		else if("".equals(introduction))
		{
			this.addActionError("介绍不能为空");
		}
	}
	public String execute() throws Exception
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1191834709");
			String sql1="select * from tb_admin";
			Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            while(rs.next())
            {
            	
            }
            st.close();
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
