package Student;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Userchoice  {

	Scanner sc=new Scanner(System.in);
	
	int SearchOption()
	{
		System.out.println("1. Search By Id ");
		System.out.println("2. Search By Name ");
		System.out.println("3. Search By Department ");
		
		System.out.println("-=-=-  Enter Your Choice -=-=-");
		int userchoice=sc.nextInt();
		
		return userchoice;
	}
	}
