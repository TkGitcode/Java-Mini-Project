package Student;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/** 
* @Author -- TkGitcode
*/
public class StudentDetails extends Userchoice
{
	ArrayList<Integer> StudentId=new ArrayList<Integer>();
	ArrayList<String> StudentName=new ArrayList<String>();
	ArrayList<String> Department=new ArrayList<String>();
	
	protected int Studentid;
	protected String StudentName1;
	protected String StudentDepartment;
	
	void UserOption()
	{
		System.out.println("---------------------Choose a Option------------------------------------");
		System.out.println("1. Create  an Student ");
		System.out.println("2. List Student details ");
		System.out.println("3. Search Student details ");
		System.out.println("4. Edit Student details");
		System.out.println("5. Delete Student details ");
		System.out.println("6. Exit ");
	}
	void UserInput()
	{
		try
		{
		System.out.println("Enter Student Id");
		Studentid=sc.nextInt();
		System.out.println("Enter Student Name");
		StudentName1=sc.next();
		System.out.println("Enter Student Department");
		StudentDepartment=sc.next();
		SetStudentDetails(Studentid,StudentName1,StudentDepartment);
		}catch(InputMismatchException e)
		{
			System.out.println(e+" You Enterd Invalid Input");
			
		}
	}
	void SetStudentDetails(int StId,String StdName,String StdDep)
	{
		int flag=0;
		for(int i=0;i<StudentId.size();i++)
		{
			if(StudentId.get(i)==StId)
			{
				flag=1;
				System.err.println("You Entered a Duplicate Id, The id is already in list of Student");
			}
		}
		if(flag==0)
		{
		StudentId.add(StId);
		StudentName.add(StdName);
		Department.add(StdDep);
		}
			
	}
	void DisplayDetails()
	{
		
		System.out.print("---------------------Student Details-----------------------------------");
		System.out.println();
		for(int i=0;i<StudentId.size();i++)
		{
		System.out.print(" Student Id : ");
		System.out.print(StudentId.get(i));
		System.out.print("  ||  ");
		System.out.print("  Student Name : ");
		System.out.print(StudentName.get(i));
		System.out.print("  ||  ");
		System.out.print("   Department : ");
		System.out.print(Department.get(i));
		System.out.print("  || ");
		System.out.println();
		}
		
	}
	void SerachAstudentDetails(int SearchBy)
	{
		int i=0;
		int flag=0;
		if(SearchBy==1)
		{
			System.out.println("Enter a Student Id to Search ");
			 int SearchingId=sc.nextInt();
		for( i=0;i<StudentId.size();i++)
		{
			if(StudentId.get(i)==SearchingId)
			{
			flag=1;
			System.out.println("---------------------Your Searched Details-------------------------------");
			System.out.print(" Student Id : ");
			System.out.print(StudentId.get(i));
			System.out.print("  ||  ");
			System.out.print("  Student Name : ");
			System.out.print(StudentName.get(i));
			System.out.print("  ||  ");
			System.out.print("   Department : ");
			System.out.print(Department.get(i));
			System.out.print("  || ");
			System.out.println();
			break;
			}
		}
		}
		if(SearchBy==2)
		{
			System.out.println("Enter a StudentName ");
			String EnterName=sc.next();
			for( i=0;i<StudentId.size();i++)
			{
				
				if(EnterName.equals(StudentName.get(i)))
				{
				flag=1;
				System.out.println("---------------------Your Searched Details-------------------------------");
				System.out.print(" Student Id : ");
				System.out.print(StudentId.get(i));
				System.out.print("  ||  ");
				System.out.print("  Student Name : ");
				System.out.print(StudentName.get(i));
				System.out.print("  ||  ");
				System.out.print("   Department : ");
				System.out.print(Department.get(i));
				System.out.print("  || ");
				System.out.println();
				}
		}
		}
			if(SearchBy==3)
			{
				System.out.println("Enter a Department ");
				String EnterDep=sc.next();
				for( i=0;i<StudentId.size();i++)
				{
					
					if(EnterDep.equals(Department.get(i)))
					{
					flag=1;
					System.out.println("---------------------Your Searched Details-------------------------------");
					System.out.print(" Student Id : ");
					System.out.print(StudentId.get(i));
					System.out.print("  ||  ");
					System.out.print("  Student Name : ");
					System.out.print(StudentName.get(i));
					System.out.print("  ||  ");
					System.out.print("   Department : ");
					System.out.print(Department.get(i));
					System.out.print("  || ");
					System.out.println();
					}
			}
//			if(flag==0)
//			{
//				System.out.println("There is No Result Found by Your Searching Id,You Still Need to continue Y/N : ");
//				String retry=sc.next();
//				if(retry.equals("Y") || retry.equals("y"))
//				{
//				System.out.println("Enter again you StudentId : ");
//				int newid=sc.nextInt();
//				SerachAstudentDetails(newid);
//				break;
//				}
//				else if(retry.equals("n")||retry.equals("N"))
//					break;
//			}
				
		}
		if(flag==0)
		{
			System.err.println("No Result found for Given Id");
		}
		
	}
	
	void EditStudentDetails(int EditingId)
	{
		try
		{
		int flag=0;
		for( int i=0;i<StudentId.size();i++)
		{
			if(StudentId.get(i)==EditingId)
			{
				System.out.println("Click 1 to Edit Student Name, 2 to StudentDepartment Name, for both Enter 3");
				int choice=sc.nextInt();
				if(choice==1)
				{
					System.out.println("Enter a StudentName to Change ");
					String Newname=sc.next();
				     StudentName.set(i,Newname);
				     System.out.println("StudentName Changed Successfully ");
				     flag=1;
				     break;
				}
				if(choice==2)
				{
					System.out.println("Enter a DepartmentName to Change ");
					String Newname=sc.next();
					Department.set(i,Newname);
					System.out.println("DepartmentName Changed Successfully ");
					flag=1;
					break;
				}
				if(choice==3)
				{
					System.out.println("Enter a StudentName to Change ");
					String Newname=sc.next();
					System.out.println("Enter a DepartmentName to Change ");
					String Newname1=sc.next();
				     StudentName.set(i,Newname);
				     Department.set(i,Newname1);
				     System.out.println("Both are Changed Successfully ");
				     flag=1;
				     break;
				}
				if(choice>=4)
				{
					System.err.println("You Entered Wrong Option");
					break;
				}
					
			}
			
		}
		if(flag==0)
			System.err.println("No Student for Given Id");
		}catch(InputMismatchException e)
		{
			System.out.println(e+" You Entered invalid Input");
		}
	}
	void DeletDetails(int Deletebyid)
	{
		int flag=0;
		for(int i=0;i<StudentId.size();i++)
		{
			if(StudentId.get(i)==Deletebyid)
			{
				StudentName.remove(i);
				Department.remove(i);
				StudentId.remove(i);
				flag=1;
				break;
			}			
		}
		if(flag==1)
		{
			System.err.println("Successfully Deleted");

		}
		else
		System.err.println("Wrong StudentId");
	}
}
