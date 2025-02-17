package Feb03;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitProject {

	@Test
	public void test() {
		System.out.println("Check the string");
		String str="Check the string";
		assertEquals("Check the string",str);
	}

}
