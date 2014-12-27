package plan;
import java.sql.*;
import java.util.*;
import java.io.Serializable;
import com.opensymphony.xwork2.ActionContext;

public class jumpAction
{
	private String age;
	private String height;
	private String weight;
	private String payTime;
	private String gender;
	private String hobby;
	private String agePlan;
	private String payTimePlan;
	private String hobbyPlan;
	private String weightPlan;
	public String getAge() 
	{
		return age;
	}

	public void setAge(String age) 
	{
		this.age = age;
	}

	public String getHeight() 
	{
		return height;
	}

	public void setHeight(String height) 
	{
		this.height = height;
	}

	public String getWeight() 
	{
		return weight;
	}

	public void setWeight(String weight) 
	{
		this.weight = weight;
	}

	public String getPayTime() 
	{
		return payTime;
	}

	public void setPayTime(String payTime) 
	{
		this.payTime = payTime;
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public String getHobby() 
	{
		return hobby;
	}

	public void setHobby(String hobby) 
	{
		this.hobby = hobby;
	}

	public String getAgePlan() 
	{
		return agePlan;
	}

	public void setAgePlan(String agePlan) 
	{
		this.agePlan = agePlan;
	}

	public String getPayTimePlan() 
	{
		return payTimePlan;
	}

	public void setPayTimePlan(String payTimePlan) 
	{
		this.payTimePlan = payTimePlan;
	}

	public String getHobbyPlan() 
	{
		return hobbyPlan;
	}

	public void setHobbyPlan(String hobbyPlan) 
	{
		this.hobbyPlan = hobbyPlan;
	}

	public String getWeightPlan() {
		return weightPlan;
	}

	public void setWeightPlan(String weightPlan) 
	{
		this.weightPlan = weightPlan;
	}

	public String execute() throws Exception
	{
		try{
			String userName="",age="",height="",weight="",payTime="",gender="",hobby="";
			Map attibutes = ActionContext.getContext().getSession();
			userName = (String)attibutes.get("userName");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_hitfitness","xwomyojjnm","1imik41h0yi1kmh0hmx02l3i01yz2203ilzikmh1");
			Statement st = (Statement) con.createStatement();
			String sql2="select * from tb_info where userName=\""+userName+"\"";
			ResultSet rs = st.executeQuery(sql2);
			if(rs.next())
			{
				age=rs.getString(2);
				height=rs.getString(3);
				weight=rs.getString(4);
				payTime=rs.getString(5);
				gender=rs.getString(6);
				hobby=rs.getString(7);
			}
			float number;
			number=(float)10000*Integer.parseInt(weight)/(Integer.parseInt(height)*Integer.parseInt(height));
			System.out.println(number);
			if(Integer.parseInt(age)>45)
			{
				String sql1="select * from tb_plan where pID= '1'";
				rs = st.executeQuery(sql1);
				while(rs.next())
				{
					agePlan=rs.getString(2);
				}
				rs.close();
				return "SUCCESS";
			}
			else
			{
				if(number<18)
				{
					String sql1="select * from tb_plan where pID= '4'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						weightPlan=rs.getString(2);
					}
					rs.close();
				}
				else if(number>25)
				{
					String sql1="select * from tb_plan where pID= '2'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						weightPlan=rs.getString(2);
					}
					rs.close();
				}
				else
				{
					String sql1="select * from tb_plan where pID= '3'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						weightPlan=rs.getString(2);
					}
					rs.close();
				}
				if(payTime.equals("每周2小时以内"))
				{
					String sql1="select * from tb_plan where pID= '7'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						payTimePlan=rs.getString(2);
					}
					rs.close();
				}
				else if(payTime.equals("每周2-5小时之间"))
				{
					String sql1="select * from tb_plan where pID= '6'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						payTimePlan=rs.getString(2);
					}
					rs.close();
				}
				else
				{
					String sql1="select * from tb_plan where pID= '5'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						payTimePlan=rs.getString(2);
					}
					rs.close();
				}
				if(hobby.equals("篮球"))
				{
					String sql1="select * from tb_plan where pID= '8'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						hobbyPlan=rs.getString(2);
					}
					rs.close();
				}
				else if(hobby.equals("网球"))
				{
					String sql1="select * from tb_plan where pID= '9'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						hobbyPlan=rs.getString(2);
					}
					rs.close();
				}
				else if(hobby.equals("排球"))
				{
					String sql1="select * from tb_plan where pID= '10'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						hobbyPlan=rs.getString(2);
					}
					rs.close();
				}
				else if(hobby.equals("羽毛球"))
				{
					String sql1="select * from tb_plan where pID= '11'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						hobbyPlan=rs.getString(2);
					}
					rs.close();
				}
				else if(hobby.equals("足球"))
				{
					String sql1="select * from tb_plan where pID= '12'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						hobbyPlan=rs.getString(2);
					}
					rs.close();
				}
				else if(hobby.equals("乒乓球"))
				{
					String sql1="select * from tb_plan where pID= '13'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						hobbyPlan=rs.getString(2);
					}
					rs.close();
				}
				else if(hobby.equals("跑步"))
				{
					String sql1="select * from tb_plan where pID= '14'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						hobbyPlan=rs.getString(2);
					}
					rs.close();
				}
				else
				{
					String sql1="select * from tb_plan where pID= '15'";
					rs = st.executeQuery(sql1);
					while(rs.next())
					{
						hobbyPlan=rs.getString(2);
					}
					rs.close();
				}
			}
		}catch(SQLException e)
		{
			return null;
		}catch(ClassNotFoundException e)
		{
			return null;
		}
		return "SUCCESS";
	}
}
