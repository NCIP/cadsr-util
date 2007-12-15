/**
 * Log
 *
 * This interface is a wrapper for the commons Log class to allow the 
 * application to be independent of any underlying logging package
 *
 * @release 3.0
 * @author: <a href=�mailto:jane.jiang@oracle.com�>Jane Jiang</a>
 * @date: 8/16/2005
 * @version: $Id: Log.java,v 1.1 2007-12-15 21:24:06 hegdes Exp $
 */
package gov.nih.nci.ncicb.cadsr.util.logging;

public interface Log  {
    public boolean isDebugEnabled();

    public void trace(Object message);
    public void trace(Object message, Throwable t);
    
    public void info(Object message);
    public void info(Object message, Throwable t);

    public void debug(Object message);
    public void debug(Object message, Throwable t);

    public void warn(Object message);
    public void warn(Object message, Throwable t);

    public void error(Object message);
    public void error(Object message, Throwable t);

    public void fatal(Object message);
    public void fatal(Object message, Throwable t);

}