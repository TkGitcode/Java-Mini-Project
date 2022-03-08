package Student;

/**
 * @Author -- TkGitcode
 */
public class DataClass {
	int StudentId;
	String StudentName;
	protected int id;
	protected String Name;

	
	public DataClass() {
		super();// Default Constructor
	}

	void setstudentData() { // Entering a Student Details
		System.out.println("Enter a Student Id");
		int id = Main.sc.nextInt();
		System.out.println("Enter a Student Name");
		String name = Main.sc.next();
		StudentId = id;
		StudentName = name;
	}

	public DataClass(int id, String Name) { // Set the value from the method setstudentData()
		this.id = id;
		this.Name = Name;
	}

	int getid() // returns a StudentId
	{
		return StudentId;
	}

	String getName() // returns a Student Name
	{
		return StudentName;
	}
    String  modifyid()
    {
    	System.out.println("Enter a Student Name");
    	String editname=Main.sc.next();
    	return editname;
    }
	int searchbyid() // Getting a Searching Id
	{
		System.out.println("Enter a student id ");
		int searchid = Main.sc.nextInt();
		return searchid;
	}
 
	int deletebyid() // Getting a deleting Id
	{
		System.out.println("Enter a student id ");
		int deleteid = Main.sc.nextInt();
		return deleteid;
	}
	
}
