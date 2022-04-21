package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		String res=junit.addstring("Utkarsh Vijayvergia,","E20CSE177");
		assertEquals("Utkarsh Vijayvergia,E20CSE177",res);
	}

}
