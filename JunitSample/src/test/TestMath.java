
package test;
import main.com.Math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMath {

	Math mObject; 
	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
	
	@Before  
    public void setUp() throws Exception {  
        System.out.println("before");
        this.mObject = new Math();
    }  
	
	@Test
	public void testOneAdd() {		
		assertEquals(3, this.mObject.add(1, 2));
	}
	
	@Test
	public void testTwoAdd() {		
		assertEquals(3, this.mObject.add(1, 2));
	}
	
	@Test
	public void testOneSub() {		
		assertEquals(1, this.mObject.sub(2, 1));
	}
	
	@After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
}
