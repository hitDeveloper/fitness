package login;
import java.sql.*;
import java.util.*;
public class register 
{
	private String userName;
	private String password;
	private String sex;
	private String length;
	private String weight;
	private String excerciseAim;
	private String age;
	private String grade;
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
	public void setSex(String sex)
	{
		this.sex=sex;
	}
	public String getSex()
	{
		return this.sex;
	}
	public void setLength(String length)
	{
		this.length=length;
	}
	public String getLength()
	{
		return this.length;
	}
	public void setWeight(String weight)
	{
		this.weight=weight;
	}
	public String getweight()
	{
		return this.weight;
	}
	public void setExcerciseAim(String excerciseAim)
	{
		this.excerciseAim=excerciseAim;
	}
	public String getExcerciseAim()
	{
		return this.excerciseAim;
	}
	public void setAge(String age)
	{
		this.age=age;
	}
	public String getAge()
	{
		return this.age;
	}
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	public String getGrade()
	{
		return this.grade;
	}
	public String execute() throws Exception
	{
		try{
			int count=1;
			String date;
			int y,m,d;
			Calendar cal=Calendar.getInstance();
			y=cal.get(Calendar.YEAR);
			m=cal.get(Calendar.MONTH);
			d=cal.get(Calendar.DATE);
			date=y+" "+m+" "+d;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1191834709");
			String sql1="select * from tb_users";
			Statement st = (Statement) con.createStatement();
			Statement st1 = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            if(rs.next())
            {
            	count++;
            }
            st.close();
            System.out.println(3);
            String sql2="INSERT INTO tb_users(uID, username, password, grade, age, gender, height, weight, excericeAim) VALUES ('"+count+"','"+ userName+"','" + password+"','"+grade+"','"+age+"','"+sex+"','"+length+"','"+weight+"','"+excerciseAim+"')";
            st1.executeUpdate(sql2);
        	st1.close();
		}catch(SQLException e)
		{
			System.out.println(1);
			return "INPUT";
		}catch(ClassNotFoundException e)
		{
			System.out.println(1);
			return "INPUT";
		}
		return "SUCCESS";
	}
}
