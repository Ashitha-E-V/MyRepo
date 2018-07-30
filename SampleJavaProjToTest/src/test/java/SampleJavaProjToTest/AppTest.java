package SampleJavaProjToTest;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@BeforeClass
	public static void beforeTest() {
		System.out.println("Initiating Test!");
	}
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAppString()
    {
    	CallDisney cd = new CallDisney();
    	String str = App.callWalt(cd);
        assert("Hello Walt Disney!".equals(str));
        if ("Hello Walt Disney!".equals(str)) {
    		System.out.println("testAppString test has passed!");
    	}
    	else {
    		System.out.println("testAppString test has failed!");
    	}
    	
    }
    
    @Test
    public void testAppInteger() throws Exception{
    	int i = App.returnOne();
    	if (i != 1) {
    		throw (new Exception());
    	}
    	assert(i == 1);
    }
}
