package com.flgame.logtest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {

	private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(getClass());
	private Logger logger2 = LoggerFactory.getLogger("slf4jxxx");
	
	public TestLogger()
	{
		//Marker fatal = MarkerFactory.getMarker("FATAL");
	    //this.logger2 = LoggerFactory.getLogger("aLogger");
	}
	
	public void TestLog4jLogger() {
		this.logger.info("Hello World logger"); //info 重要信息
		this.logger.debug("debug"); //调试使用不重要信息
		this.logger.error("error");//错误，警告
	}

	public void TestSlfLog4jLogger()
	{
		this.logger2.info("info test");
		this.logger2.debug("debug test");
	}
}
