package SampleJavaProjToTest;

public class CallDisney {

	public String calDis() {
		return "Disney!";
	}
	
	public String calWalt() {
		return "Walt " + this.calDis();
	}
	
}
