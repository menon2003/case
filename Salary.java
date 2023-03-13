import java.util.Scanner;
/**
 * 
 * @author Nunzio Barreto
 *
 */
public class Salary {
	/**
	 *  this is scanner
	 */

	Scanner sc=new Scanner(System.in);
	
	/**
	 * 
	 * @return net salary
	 */
	public double Net_salary()
	{
		/**
		 *  variable declaration
		 */
		double DA,GS,Income_tax,netsalary,HRA;
		int basic_salary;
		/**
		 * input
		 */
		System.out.println("enter the basic salary");
		basic_salary=sc.nextInt();
		HRA=basic_salary*0.10;
		DA=basic_salary * 0.73;		
		GS=basic_salary+DA+HRA;
		Income_tax=GS*0.30;
		/**
		 * net salary calculation
		 */
		netsalary=GS-Income_tax;
		return netsalary;	
	}	
}
