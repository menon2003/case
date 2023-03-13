import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalaryTest {

	@Test
	public void Net_salary() {
		Salary test=new Salary();
		double result=test.Net_salary();
		assertEquals(64050,result);
	}

}
