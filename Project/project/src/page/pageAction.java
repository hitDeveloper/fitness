package page;
import java.sql.*;
import java.util.*;
import java.io.Serializable;
import com.opensymphony.xwork2.ActionContext;
public class pageAction
{
	private String gymName;          //����������
	private String time;            //����ʱ��
	private String manager;		//��ϵ��
	private String telNumber;		//�绰����
	private String price;			//�۸�
	private String introduction;	//���
	private String news;            //������Ϣ
	public void setGymName(String gymName)
	{
		this.gymName=gymName;
	}
	public String getGymName()
	{
		return this.gymName;
	}
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
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_hitfitness","xwomyojjnm","1imik41h0yi1kmh0hmx02l3i01yz2203ilzikmh1");
			String sql1="select * from tb_gym where gymName=\""+gymName+"\"";
			Statement st = (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql1);
			while(rs.next())
	        {
	        	manager = rs.getString(4);
	        	time = rs.getString(5);
	        	telNumber = rs.getString(6);
	        	price = rs.getString(7);
	        	news = rs.getString(8);
	        	introduction = rs.getString(9);
	        }
            rs.close();
            rs.close();
			Map attibutes = ActionContext.getContext().getSession();
            attibutes.put("manager", manager);
            attibutes.put("time", time);
            attibutes.put("telNumber", telNumber);
            attibutes.put("price", price);
            attibutes.put("introduction", introduction);
            attibutes.put("news", news);
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
