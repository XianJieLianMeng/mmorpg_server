package com.flgame;
import com.flgame.logtest.TestLogger;

public class Main
{
   public static void main(String[] args)
   {
	    //System.out.printf("HelloWorld");  
	    TestLogger logger = new TestLogger();
	    logger.TestLog4jLogger();
	    logger.TestSlfLog4jLogger();
   }
}