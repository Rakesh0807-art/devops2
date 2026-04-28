package pgm2;
import org.testng.Assert;

import org.testng.annotations.Test;
import pgm1.r1;

public class r2 {
	@Test
	public void testPass() {
	Assert.assertEquals(r1.display(55), "pass");
	}
	@Test
	public void testFail() {
	Assert.assertEquals(r1.display(35), "fail");
	}
	@Test
	public void testInvalid() {
	Assert.assertEquals(r1.display(-5),"invalid");
	}
}

