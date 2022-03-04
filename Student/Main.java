package Student;
import java.util.InputMismatchException;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/

public class Main {
	   
	public static void main(String[] args) {
		try
		{
		int flag=0;
		StudentDetails d=new StudentDetails();
		Scanner sc=new Scanner(System.in);
		while(flag!=6)
		{
			d.UserOption();
			System.out.println();
			System.out.println("Enter a Option ");
			
			flag=sc.nextInt();
			
				if(flag==1)
				{
	                d.UserInput();
				}
				 if(flag==2)
				{
					d.DisplayDetails();
				}
				 if(flag==3)
				 {
					 
					 int SearchBy=d.SearchOption();
					 d.SerachAstudentDetails(SearchBy);
				 }
				 if(flag==4)
				 {
					 System.out.println("Enter a Student Id to Edit");
					 int Editbyid=sc.nextInt();
					 d.EditStudentDetails(Editbyid);
				 }
				 if(flag==5)
				 {
					 System.out.println("Enter a Student Id to Edit");
					 int Deletebyid=sc.nextInt();
					 d.DeletDetails(Deletebyid);
				 }
				 if(flag==6)
					 System.exit(0);
				 if(flag>=6)
				 {
					 System.err.println("You Entered Wrong Option,There is No Option Which You have Entered");
				 }
		}
		sc.close();
		
		}catch(InputMismatchException e)
		{
			System.err.println(e+" Please Re-Run Your Code");
		}
	}

}
