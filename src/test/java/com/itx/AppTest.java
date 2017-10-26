package com.itx;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 * Unit test for simple App.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp2()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp3()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp4()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp5()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp6()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testAppj()
    {
        assertTrue( true );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp9()
    {
        assertEquals("Numbers are different", 0, 1);
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
