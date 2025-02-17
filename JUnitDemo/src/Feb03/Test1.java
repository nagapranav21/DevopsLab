package Feb03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		TestCase obj1=new TestCase();
		int output_f=obj1.square(2);
		assertEquals(4,output_f);
	}

}
