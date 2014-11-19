package back;
import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionContext;
public class backAction
{
	private String time;            //开放时间
	private String usedNumber;			//场地已使用数
	private String totalNumber;		//场地总数
	private String manager;		//联系人
	private String telNumber;		//电话号码
	private String price;			//价格
	private String introduction;	//简介
	private String news;            //比赛消息
	private String information;		//错误信息
	public void setManager(String manager)
	{
		this.manager=manager;
	}
	public String getManager()
	{
		return this.manager;
	}
	public void setNews(String news)
	{
		this.news=news;
	}
	public String getNews()
	{
		return this.news;
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
	public String execute() throws Exception 
	{
		try{
			Map attibutes = ActionContext.getContext().getSession();
			String gymName=null;
            gymName=(String)attibutes.get("gymName");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1191834709");
			String sql1="update tb_gym set usedNumber=\""+usedNumber+"\",totalNumber=\""+totalNumber+"\",manager=\""+manager+"\",time=\""+time+"\",telNumber=\""+telNumber+"\",price=\""+price+"\",news=\""+news+"\",introduction=\""+introduction+"\" where gymName = \""+gymName+"\"";
			Statement st = (Statement) con.createStatement();
            st.executeUpdate(sql1);
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
