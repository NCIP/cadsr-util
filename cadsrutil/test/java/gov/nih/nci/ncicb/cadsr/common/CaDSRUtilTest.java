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
	public void testGetProperty() {
		try {
			String prop = CaDSRUtil.getProperty("default.something");
			assertNull(prop);

			prop = CaDSRUtil.getProperty(CaDSRUtil.KEY_DEFAULT_CONTEXT_NAME);
			assertNotNull(prop);
			assertTrue("NCIP".equals(prop));
		} catch (FileNotFoundException fne) {
			//remove C:\local\content\cadsrutil\cadsrutil.properties to tiggr this exception
			fail("FileNotFoundException: " + fne.getMessage());
		} catch (IOException ioe) {
			fail("IOException: " + ioe.getMessage());
		}
	}
}