package es.unavarra.gpi2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
		String prueba = "Hello World!";
        assertTrue( prueba.equals(App.obtenerHola()));
    }
}
