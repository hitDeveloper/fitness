package back;
import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;
public class backAction extends ActionSupport
{
	private String gymName;			//��������
	private String time;            //����ʱ��
	private String usedNumber;			//������ʹ����
	private String totalNumber;		//��������
	private String adminName;		//��ϵ��
	private String telNumber;		//�绰����
	private String price;			//�۸�
	private String introduction;	//���
	private String news;            //������Ϣ
	private String information;		//������Ϣ
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
			this.addActionError("����������Ϊ�գ���ο�ʾ����д");
		}
		else if("".equals(time))
		{
			this.addActionError("����ʱ�䲻��Ϊ��");
		}
		else if("".equals(usedNumber))
		{
			this.addActionError("����ʹ��������Ϊ�գ���ο�ʾ����д");
		}
		else if("".equals(totalNumber))
		{
			this.addActionError("������������Ϊ�գ���ο�ʾ����д");
		}
		else if("".equals(adminName))
		{
			this.addActionError("��ϵ�˲���Ϊ�գ���ο�ʾ����д");
		}
		else if("".equals(telNumber))
		{
			this.addActionError("�绰���벻��Ϊ�գ���ο�ʾ����д");
		}
		else if("".equals(price))
		{
			this.addActionError("�۸���Ϊ�գ���ο�ʾ����д");
		}
		else if("".equals(introduction))
		{
			this.addActionError("���ܲ���Ϊ��");
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