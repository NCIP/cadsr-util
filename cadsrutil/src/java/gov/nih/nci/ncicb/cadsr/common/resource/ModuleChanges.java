/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.resource;
import java.io.Serializable;
import java.util.List;

public interface ModuleChanges extends Serializable
{

  public String getModuleId();
  public void setModuleId(String moduleId);
  
  public InstructionChanges getInstructionChanges();
  public void setInstructionChanges(InstructionChanges changes);
  
  public List getNewQuestions();
  public void setNewQuestions(List newQuestions);
  
  public List getUpdatedQuestions();
  public void setUpdatedQuestions(List updatedQuestions);
  
  public List getDeletedQuestions();
  public void setDeletedQuestions(List deletedQuestions);  
  
  public Module getUpdatedModule();
  public void setUpdatedModule(Module updatedModule);
  
  public boolean isEmpty();
}