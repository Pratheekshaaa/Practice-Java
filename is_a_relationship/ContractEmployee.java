package is_a_relationship;

public class ContractEmployee extends Employee {
	String consultancy_name;

	ContractEmployee(int emp_id,String emp_name,double emp_sal,String consultancy_name)
	{
		super(emp_id,emp_name,emp_sal);
		this.consultancy_name=consultancy_name;
	}
	public void contractEmpDetails()
	{
		System.out.println("=====CONTRACT EMPLOYEE DETAILS=====");
		System.out.println("    ID="+super.emp_id);
		System.out.println("    NAME="+super.emp_name);
		System.out.println("    SALARY="+super.emp_sal);
		System.out.println("    CONSULTANCY NAME="+consultancy_name);
	}
}
