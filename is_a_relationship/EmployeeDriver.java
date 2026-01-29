package is_a_relationship;
import java.util.Scanner;
public class EmployeeDriver {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean exit=true;
	Employee e=null;
	while(exit)
	{
		System.out.println("1.CHOOSE EMPLOYEE\t2.DISPALY EMPLOYEE DETAILS\t3EXIT");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				{
					System.out.println("1.Contract employee\t2.Permanent employee");
					int ch=sc.nextInt();
					switch(ch)
					{
						case 1:
							{
								System.out.println("Contract Employee selected!!");
								System.out.println("Enter emp id");
								int emp_id=sc.nextInt();
								System.out.println("Enter emp name");
								String emp_name=sc.next();
								System.out.println("Enter emp sal");
								double emp_sal=sc.nextDouble();
								System.out.println("Enter emp Consutancy name");
								String consultancy_name=sc.next();
								e=new ContractEmployee(emp_id,emp_name,emp_sal,consultancy_name);
								
							}
							break;
						case 2:
						{
							System.out.println("Permanent Employee selected!!");
							System.out.println("Enter emp id");
							int emp_id=sc.nextInt();
							System.out.println("Enter emp name");
							String emp_name=sc.next();
							System.out.println("Enter emp sal");
							double emp_sal=sc.nextDouble();
							System.out.println("Enter emp Company name");
							String company_name=sc.next();
							e=new PermanentEmployee(emp_id,emp_name,emp_sal,company_name);
						}
						break;
						default:
							System.out.println("Invalid Input!!");
					}
				}
				break;
			case 2:
			{
				if(e==null)
				{
					System.out.println("Employee is not selected!!");
				}
				else if(e instanceof ContractEmployee)
				{
					ContractEmployee c=(ContractEmployee)e;
					c.contractEmpDetails();
				}
				else if(e instanceof PermanentEmployee)
				{
					PermanentEmployee p=(PermanentEmployee)e;
					p.permanentEmpDetails();
				}
			}
			break;
			case 3:
			{
				exit=false;
				System.out.println("THANK YOU :)");
			}
			break;
			}
		}
	}
}
