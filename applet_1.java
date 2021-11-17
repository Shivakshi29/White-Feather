
import java.applet.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;



public class applet_1 extends Applet

{
	public void init()
	{
		Label b1=new Label("click me ");
		b1.setBounds(200,200,300,300);
		add(b1);

		Label b2=new Label("click me ");
		b2.setBounds(200,300,400,400);
		add(b2);
		
		
		try 
			{

				String url="jdbc:mysql://localhost:3306/java_data_base";
				String u_name="root";
				String pass="Meezan#2018";
			
				String que="select stu_name from student_1 where roll_no=1";
			//	String q_1="insert into student_1 (stu_name,roll_no) values('larry',4)";				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url,u_name,pass);
				
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(que);
				
				rs.next();
				String name=rs.getString(1);
			
			System.out.println("name is :"+name);
			
			
				
			}  
			
			
			catch (SQLException e1)
			{
			}

		
		
		
	}
	
	public void paint(Graphics g)
	{
		setBackground(Color.decode("#00A8A8"));
	}
}
