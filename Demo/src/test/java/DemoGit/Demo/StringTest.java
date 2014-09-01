package DemoGit.Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import DemoGit.Demo.StringFunction;

public class StringTest 
{
		//Declaring Static variable
		static String s1;
		static String s2;
		
		//Initializing value of Strings.
		
		@BeforeClass
		public void startTest()
		{
			s1 = "one" ;
			s2 = "two";
		}
		
		//Test Concatenation
		@Test
		public void testConcatenate()
		{
			String result = new StringFunction().concatenate(s1, s2);
			AssertJUnit.assertEquals("onetwo", result);
		}
		
		//Test equality
		@Test 
		public void testEqualsMethod()
		{
			boolean b=new StringFunction().EqualsMethod(s1,s2);
			AssertJUnit.assertEquals(true,b);
		}
		
		//Test SubString
		@Test
		public void testSubStringMethod()
		{
			String s=new StringFunction().SubStringMethod(s1);
			AssertJUnit.assertEquals("on",s);
		}
		
		//Test Lower case String
		@Test
		public void testToLowerCaseMethod()
		{
			String s=new StringFunction().ToLowerCaseMethod(s1);
			AssertJUnit.assertEquals("one",s);
		}
}
