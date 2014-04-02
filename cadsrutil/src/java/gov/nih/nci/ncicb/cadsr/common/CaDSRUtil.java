package gov.nih.nci.ncicb.cadsr.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CaDSRUtil {
	
	//Key to use if the path to cadsrutil property file is set as system property
	protected static String KEY_CADSR_PROPERTIES_PATH = "gov.nih.nci.cadsrutil.properties";
	
	protected static String DEFAULT_PROPERTY_FILE_PATH = "/local/content/cadsrutil/cadsrutil.properties";
	
	//Key to retrieve the actually default context name
	protected static final String KEY_DEFAULT_CONTEXT_NAME = "default.context.name";

	/**
	 * Get the default context name from cadsrutil.properties
	 * <br><br>
	 * Search path for this file: <br>
	 *   1) System property with key "gov.nih.nci.cadsrutil.properties" <br>
	 *   2) At "/local/content/cadsrutil/cadsrutil.properies"
	 *  
	 * @return default context name
	 * @throws IOException if unable to find the properties file
	 */
	public static String getDefaultContextName() 
			throws IOException {
 
		return CaDSRUtil.getProperty(CaDSRUtil.KEY_DEFAULT_CONTEXT_NAME);

	}
	
	/**
	 * Get a property value from the config file:
	 *   /local/content/cadsrutil/cadsrutil.properties
	 * @param key
	 * @return
	 * @throws IOException if unable to find the properties file
	 */
	public static String getProperty(String key) 
			throws IOException {
		
		String path = System.getProperty(KEY_CADSR_PROPERTIES_PATH);
		if (path == null || path.length() == 0)
			path = DEFAULT_PROPERTY_FILE_PATH;
		
		Properties properties = loadPropertiesFromFile(path);
		String contextName = properties.getProperty(key);
		
		if (contextName == null || contextName.length() == 0)
			throw new IOException("Unable to find the default context name from file: \"" + path + "\"");

		return contextName;
	}
	
	protected static Properties loadPropertiesFromFile(String pathname) 
	throws IOException {
		
		Properties properties = new Properties();
		if (pathname == null || pathname.length() == 0)
			return properties;

		FileInputStream in = null;
		in = new FileInputStream(pathname);
		
		if (in != null) {	
			properties.load(in);
			in.close();  
		}
		
		return properties;
	}

}
