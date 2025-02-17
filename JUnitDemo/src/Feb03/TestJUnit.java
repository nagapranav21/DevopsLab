package Feb03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit {

	String message="hello";
	MSgUnit messageUtil=new MSgUnit(message);
	@Test
	public void testPrintMessage() {
		assertEquals(message,messageUtil.printMessage());
	}

}
