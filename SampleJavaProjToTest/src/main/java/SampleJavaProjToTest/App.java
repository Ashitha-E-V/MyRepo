package SampleJavaProjToTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void sayHello()
    {
    	CallDisney cd = new CallDisney();
        System.out.println( "Hello " + cd.calDis());
        callWalt(cd);
    }
    
    public static String callWalt(CallDisney cd) {
    	return "Hello " + cd.calWalt();
    }
    
    public static int returnOne() {
		return 1;
    	
    }
}
