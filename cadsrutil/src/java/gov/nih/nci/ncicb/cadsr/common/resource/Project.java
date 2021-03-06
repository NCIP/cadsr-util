/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.resource;
import java.util.List;

public interface Project 
{
  public String getName();
  public void setName(String name);

  public String getId();
  public void setId(String name);  
  
  public List getChildren();
  public void setChildren(List subProjects);
  public void addChild(Project subProject);
  
  public void setPackages(List packages);
  public List getPackages();
  public void addPackage(OCRPackage ocrPackage);

}