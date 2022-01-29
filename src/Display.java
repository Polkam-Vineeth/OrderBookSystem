import java.sql.*;
import java.util.*;
public class Display {

public static void main(String[] args) {
		Connection conn=null;
		java.sql.PreparedStatement stmnt=null;
		Scanner sc=new Scanner(System.in);
		int eid,esal,i;
		String ename,ejob;
		try {
		  Class.forName("com.mysql.jdbc.Driver");
		  conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		  do {
		  System.out.println("Select the operation to be done\n 1.Insert 2.Delete 3.Update 4.Display 5.Read 6.Quit");
		  int n=sc.nextInt();
		  switch(n) {
		  case 1:	
		        System.out.println("Enter name,id,salary,designation of employee");
		        
		        ename=sc.next();
		        eid=sc.nextInt();
		        ejob=sc.next();
		        esal=sc.nextInt();
		        String ephno=sc.next();
		        stmnt=conn.prepareStatement("insert into employee(name,id,job,salary,phno) values(?,?,?,?,?)");
		        stmnt.setString(1,ename);
		        stmnt.setInt(2,eid);
		        stmnt.setString(3,ejob);
		        stmnt.setInt(4, esal);
		        stmnt.setString(5, ephno);
		        i=stmnt.executeUpdate();
		        System.out.println("Records Inserted Successfully: "+i);
		        break;
		  case 2:
		        System.out.println("Enter Id of employee to be deleted");
		        eid=sc.nextInt();
		        stmnt=conn.prepareStatement("delete from employee where id=?");
		        stmnt.setInt(1, eid);
		        i=stmnt.executeUpdate();
		        System.out.println("Records deleted Successfully: "+i);
		        break;
		  case 3:
		        System.out.println("Enter Id of employee to be updated");
		        eid=sc.nextInt();
		        System.out.println("Enter new Salary of employee");
		        esal=sc.nextInt();
		
		        stmnt=conn.prepareStatement("update employee set salary=? where id=?");
		        stmnt.setInt(1,esal);
		        stmnt.setInt(2,eid);
		        i=stmnt.executeUpdate();
		        System.out.println("Records updated Successfully: "+i);
		        break;
		  case 4:
		        stmnt=conn.prepareStatement("select * from users");
		        ResultSet rs=stmnt.executeQuery();
		        while(rs.next()) {
		        
		        System.out.println("Employee Name : "+rs.getString(1));
		        System.out.println("Employee ID : "+rs.getInt(2));
		        System.out.println("Employee Designation : "+rs.getString(3));
		        System.out.println("Employee Salary : "+rs.getInt(4));
		        System.out.println("Employee PHno : "+rs.getString(5));
		        System.out.println("-------***-------");
		        }
		        break;
		  case 5:
		        System.out.println("Enter id of employee to be read");
		        eid=sc.nextInt();
		        stmnt=conn.prepareStatement("select * from employee where id=?");
		        stmnt.setInt(1, eid);
		        ResultSet rs2=stmnt.executeQuery();
		        if(rs2.next()) {
		        	
		        	System.out.println("Employee Name : "+rs2.getString(1));
			        System.out.println("Employee ID : "+rs2.getInt(2));
			        System.out.println("Employee Designation : "+rs2.getString(3));
			        System.out.println("Employee Salary : "+rs2.getInt(4));
			        System.out.println("Employee PHno : "+rs2.getString(5));
			        
		          System.out.println("-------***-------");
		        }
		        else
		          System.out.println("No Record found");
		        break;
		  case 6:
		        System.exit(0);
		        break;
		  default:
		        System.out.println("Try Again");
		  }
		  }
		  while(true);
		  }
		  catch(Exception e) {
		      System.out.println(e);
		  }
		sc.close();
		}
}