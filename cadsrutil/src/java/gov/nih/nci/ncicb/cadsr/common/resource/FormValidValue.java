/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.resource;

import java.util.List;

public interface FormValidValue extends FormElement,Orderable,Instructionable {
  public String getValueIdseq();
  public void setValueIdseq(String idseq);

  public Question getQuestion();
  public void setQuestion(Question term);

  public String getVpIdseq();
  public void setVpIdseq(String vpIdseq);


  public Object clone() throws CloneNotSupportedException ;

  public String getShortMeaning();
  public void setShortMeaning(String shortMeaning);

  //added for making value meaning an administered components;
  public String getFormValueMeaningText();
  public void setFormValueMeaningText(String vmText);
  public String getFormValueMeaningIdVersion();
  public void setFormValueMeaningIdVersion(String IdVersion);
  public String getFormValueMeaningDesc();
  public void setFormValueMeaningDesc(String desc);
  
   public void setValueMeaning(ValueMeaning valueMeaning);
   public ValueMeaning getValueMeaning();
}