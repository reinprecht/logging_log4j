import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloWorld {

	private final static Logger logger = Logger.getLogger("TestLogger");

	public void doABasicTest() {
		logger.debug("This is a debug message");
		logger.info("This is a info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		logger.fatal("This is a fatal message");
	}

	public void doAnAdvancedTest() {
		logger.info("Dann mal los.");

		try {
			((Object) null).toString();
		} catch (Exception e) {
			logger.error("oh oh", e);
		}
	}

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		BasicConfigurator.configure();
		//hw.doABasicTest();
		hw.doAnAdvancedTest();
	}
	
	public void test(){
		System.out.println("Test");
	}

}
