package is_a_relationship;

public class PermanentEmployee extends Employee {
	String company_name;
	 
	PermanentEmployee (int emp_id,String emp_name,double emp_sal,String company_name)
	{
		super(emp_id,emp_name,emp_sal);
		this.company_name=company_name;
	}
	public void permanentEmpDetails()
	{
		System.out.println("=====CONTRACT EMPLOYEE DETAILS=====");
		System.out.println("    ID="+super.emp_id);
		System.out.println("    NAME="+super.emp_name);
		System.out.println("    SALARY="+super.emp_sal);
		System.out.println("    CONSULTANCY NAME="+company_name);
	}
}
