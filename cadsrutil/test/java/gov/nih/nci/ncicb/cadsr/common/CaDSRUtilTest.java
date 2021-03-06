package gov.nih.nci.ncicb.cadsr.common;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class CaDSRUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLoadPropertyFile() {
		
		String pathName = "cadsrutil/test/data/cadsrutil.properties";

		try {
			Properties props = CaDSRUtil.loadPropertiesFromFile(pathName);
			assertNotNull(props);
			assertTrue("NCIP".equals((String)props.get(CaDSRUtil.KEY_DEFAULT_CONTEXT_NAME)));
		} catch (IOException ioe) {
			fail(ioe.getMessage());
		}
	}

	@Test
	public void testLoadPropertyFileNullPath() {
		
		String pathName = null;;

		try {
			Properties props = CaDSRUtil.loadPropertiesFromFile(pathName);
			assertNotNull(props);
			assertTrue(props.size() == 0);
		} catch (IOException ioe) {
			fail(ioe.getMessage());
		}
	}
	
	@Test
	public void testLoadPropertyFileWrongPath() {
		
		String pathName = "cadsrutil/test/data/cadsr.properties";

		try {
			Properties props = CaDSRUtil.loadPropertiesFromFile(pathName);
			fail("Should have thrown an exception");
		} catch (IOException ioe) {
			String error = ioe.getMessage();
			assertTrue(error.length() > 0);
		}
	}
	
	@Test 
	public void testGetPropertyWithoutSystemPropertySet() {
		try {
			String prop = CaDSRUtil.getProperty(CaDSRUtil.KEY_DEFAULT_CONTEXT_NAME);
			
			fail("System property not set. Should have thrown an exception.");
			assertNotNull(prop);
			assertTrue("NCIP".equals(prop));
		}  catch (IOException ioe) {
			assertTrue(ioe.getMessage().length() > 0);
		}
	}
	
	@Test 
	public void testGetPropertyWithWrongKey() {
		try {
			String prop = CaDSRUtil.getProperty("default.something");
		} catch (IOException ioe) {
			assertTrue(ioe.getMessage().length() > 0);
		}
	}
	
	@Test
	public void testGetPropertyFromSystemProperties() {
		Properties props = System.getProperties();
		props.setProperty("gov.nih.nci.cadsrutil.properties", "c://temp/cadsrutil.properties");
		
		try {
			String prop = CaDSRUtil.getProperty(CaDSRUtil.KEY_DEFAULT_CONTEXT_NAME);
			assertNotNull(prop);
			assertTrue(prop.equals("SYTest"));
			props.remove("gov.nih.nci.cadsrutil.properties");
		} catch (IOException ioe) {
			props.remove("gov.nih.nci.cadsrutil.properties");
			fail(ioe.getMessage());
		}
	}
	
	@Test 
	public void testGetPropertyReturnsCachedValue() {
		
		Properties props = System.getProperties();
		props.setProperty("gov.nih.nci.cadsrutil.properties", "c://temp/cadsrutil.properties");
		
		try {
			String prop = CaDSRUtil.getDefaultContextName();
			assertNotNull(prop);
			assertTrue("SYTest".equals(prop));
			
			assertNotNull(CaDSRUtil.defaultContextName);
			assertTrue(CaDSRUtil.defaultContextName.length() > 0);
			
			//Remove system property and the default context name should be returned from cache
			props.remove("gov.nih.nci.cadsrutil.properties");
			prop = CaDSRUtil.getDefaultContextName();
			
			assertNotNull(CaDSRUtil.defaultContextName);
			assertTrue(CaDSRUtil.defaultContextName.length() > 0);
			assertTrue("SYTest".equals(prop));
		}  catch (IOException ioe) {
			fail(ioe.getMessage());
		}
	}
	
	@Test
	public void testGetDefaultContextNameNoCache() {
		Properties props = System.getProperties();
		props.setProperty("gov.nih.nci.cadsrutil.properties", "c://temp/cadsrutil.properties");
		
		try {
			String prop = CaDSRUtil.getProperty(CaDSRUtil.KEY_DEFAULT_CONTEXT_NAME);
			assertNotNull(prop);
			assertTrue(prop.equals("SYTest"));
			props.remove("gov.nih.nci.cadsrutil.properties");
		} catch (IOException ioe) {
			props.remove("gov.nih.nci.cadsrutil.properties");
			fail(ioe.getMessage());
		}
	}
}
