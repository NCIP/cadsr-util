/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.persistence.bc4j;

import gov.nih.nci.ncicb.cadsr.common.dto.bc4j.BC4JContextTransferObject;


import gov.nih.nci.ncicb.cadsr.common.resource.Context;
import gov.nih.nci.ncicb.cadsr.common.resource.Form;

import java.util.ArrayList;
import java.util.List;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;


//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
public class ModulesViewRowImpl extends ViewRowImpl {
  public static final int QCIDSEQ = 0;
  public static final int VERSION = 1;
  public static final int QTLNAME = 2;
  public static final int CONTEIDSEQ = 3;
  public static final int ASLNAME = 4;
  public static final int PREFERREDNAME = 5;
  public static final int PREFERREDDEFINITION = 6;
  public static final int LONGNAME = 7;
  public static final int LATESTVERSIONIND = 8;
  public static final int DELETEDIND = 9;
  public static final int DNCRFIDSEQ = 10;
  public static final int QRIDSEQ = 11;
  public static final int PQCIDSEQ = 12;
  public static final int CQCIDSEQ = 13;
  public static final int DISPLAYORDER = 14;
  public static final int RLNAME = 15;
  public static final int FORM = 16;
  public static final int CONTEXT = 17;
  public static final int QUESTIONS = 18;
  public static final int MODULEQUESTIONRECS = 19;

  /**
   * This is the default constructor (do not remove)
   */
  public ModulesViewRowImpl() {
  }

  /**
   * Gets mod entity object.
   */
  public QuestContentsExtImpl getmod() {
    return (QuestContentsExtImpl) getEntity(0);
  }

  /**
   * Gets qr entity object.
   */
  public QcRecsExtImpl getqr() {
    return (QcRecsExtImpl) getEntity(1);
  }

  /**
   * Gets the attribute value for QC_IDSEQ using the alias name QcIdseq
   */
  public String getQcIdseq() {
    return (String) getAttributeInternal(QCIDSEQ);
  }

  /**
   * Sets <code>value</code> as attribute value for QC_IDSEQ using the alias
   * name QcIdseq
   */
  public void setQcIdseq(String value) {
    setAttributeInternal(QCIDSEQ, value);
  }

  /**
   * Gets the attribute value for VERSION using the alias name Version
   */
  public Number getVersion() {
    return (Number) getAttributeInternal(VERSION);
  }

  /**
   * Sets <code>value</code> as attribute value for VERSION using the alias
   * name Version
   */
  public void setVersion(Number value) {
    setAttributeInternal(VERSION, value);
  }

  /**
   * Gets the attribute value for QTL_NAME using the alias name QtlName
   */
  public String getQtlName() {
    return (String) getAttributeInternal(QTLNAME);
  }

  /**
   * Sets <code>value</code> as attribute value for QTL_NAME using the alias
   * name QtlName
   */
  public void setQtlName(String value) {
    setAttributeInternal(QTLNAME, value);
  }

  /**
   * Gets the attribute value for CONTE_IDSEQ using the alias name ConteIdseq
   */
  public String getConteIdseq() {
    return (String) getAttributeInternal(CONTEIDSEQ);
  }

  /**
   * Sets <code>value</code> as attribute value for CONTE_IDSEQ using the alias
   * name ConteIdseq
   */
  public void setConteIdseq(String value) {
    setAttributeInternal(CONTEIDSEQ, value);
  }

  /**
   * Gets the attribute value for ASL_NAME using the alias name AslName
   */
  public String getAslName() {
    return (String) getAttributeInternal(ASLNAME);
  }

  /**
   * Sets <code>value</code> as attribute value for ASL_NAME using the alias
   * name AslName
   */
  public void setAslName(String value) {
    setAttributeInternal(ASLNAME, value);
  }

  /**
   * Gets the attribute value for PREFERRED_NAME using the alias name
   * PreferredName
   */
  public String getPreferredName() {
    return (String) getAttributeInternal(PREFERREDNAME);
  }

  /**
   * Sets <code>value</code> as attribute value for PREFERRED_NAME using the
   * alias name PreferredName
   */
  public void setPreferredName(String value) {
    setAttributeInternal(PREFERREDNAME, value);
  }

  /**
   * Gets the attribute value for PREFERRED_DEFINITION using the alias name
   * PreferredDefinition
   */
  public String getPreferredDefinition() {
    return (String) getAttributeInternal(PREFERREDDEFINITION);
  }

  /**
   * Sets <code>value</code> as attribute value for PREFERRED_DEFINITION using
   * the alias name PreferredDefinition
   */
  public void setPreferredDefinition(String value) {
    setAttributeInternal(PREFERREDDEFINITION, value);
  }

  /**
   * Gets the attribute value for LONG_NAME using the alias name LongName
   */
  public String getLongName() {
    return (String) getAttributeInternal(LONGNAME);
  }

  /**
   * Sets <code>value</code> as attribute value for LONG_NAME using the alias
   * name LongName
   */
  public void setLongName(String value) {
    setAttributeInternal(LONGNAME, value);
  }

  /**
   * Gets the attribute value for LATEST_VERSION_IND using the alias name
   * LatestVersionInd
   */
  public String getLatestVersionInd() {
    return (String) getAttributeInternal(LATESTVERSIONIND);
  }

  /**
   * Sets <code>value</code> as attribute value for LATEST_VERSION_IND using
   * the alias name LatestVersionInd
   */
  public void setLatestVersionInd(String value) {
    setAttributeInternal(LATESTVERSIONIND, value);
  }

  /**
   * Gets the attribute value for DELETED_IND using the alias name DeletedInd
   */
  public String getDeletedInd() {
    return (String) getAttributeInternal(DELETEDIND);
  }

  /**
   * Sets <code>value</code> as attribute value for DELETED_IND using the alias
   * name DeletedInd
   */
  public void setDeletedInd(String value) {
    setAttributeInternal(DELETEDIND, value);
  }

  /**
   * Gets the attribute value for QR_IDSEQ using the alias name QrIdseq
   */
  public String getQrIdseq() {
    return (String) getAttributeInternal(QRIDSEQ);
  }

  /**
   * Sets <code>value</code> as attribute value for QR_IDSEQ using the alias
   * name QrIdseq
   */
  public void setQrIdseq(String value) {
    setAttributeInternal(QRIDSEQ, value);
  }

  /**
   * Gets the attribute value for P_QC_IDSEQ using the alias name PQcIdseq
   */
  public String getPQcIdseq() {
    return (String) getAttributeInternal(PQCIDSEQ);
  }

  /**
   * Sets <code>value</code> as attribute value for P_QC_IDSEQ using the alias
   * name PQcIdseq
   */
  public void setPQcIdseq(String value) {
    setAttributeInternal(PQCIDSEQ, value);
  }

  /**
   * Gets the attribute value for C_QC_IDSEQ using the alias name CQcIdseq
   */
  public String getCQcIdseq() {
    return (String) getAttributeInternal(CQCIDSEQ);
  }

  /**
   * Sets <code>value</code> as attribute value for C_QC_IDSEQ using the alias
   * name CQcIdseq
   */
  public void setCQcIdseq(String value) {
    setAttributeInternal(CQCIDSEQ, value);
  }

  /**
   * Gets the attribute value for DISPLAY_ORDER using the alias name
   * DisplayOrder
   */
  public Number getDisplayOrder() {
    return (Number) getAttributeInternal(DISPLAYORDER);
  }

  /**
   * Sets <code>value</code> as attribute value for DISPLAY_ORDER using the
   * alias name DisplayOrder
   */
  public void setDisplayOrder(Number value) {
    setAttributeInternal(DISPLAYORDER, value);
  }

  /**
   * Gets the attribute value for RL_NAME using the alias name RlName
   */
  public String getRlName() {
    return (String) getAttributeInternal(RLNAME);
  }

  /**
   * Sets <code>value</code> as attribute value for RL_NAME using the alias
   * name RlName
   */
  public void setRlName(String value) {
    setAttributeInternal(RLNAME, value);
  }

  //  Generated method. Do not modify.
  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef)
    throws Exception {
    switch (index)
      {
      case QCIDSEQ:
        return getQcIdseq();
      case VERSION:
        return getVersion();
      case QTLNAME:
        return getQtlName();
      case CONTEIDSEQ:
        return getConteIdseq();
      case ASLNAME:
        return getAslName();
      case PREFERREDNAME:
        return getPreferredName();
      case PREFERREDDEFINITION:
        return getPreferredDefinition();
      case LONGNAME:
        return getLongName();
      case LATESTVERSIONIND:
        return getLatestVersionInd();
      case DELETEDIND:
        return getDeletedInd();
      case DNCRFIDSEQ:
        return getDnCrfIdseq();
      case QRIDSEQ:
        return getQrIdseq();
      case PQCIDSEQ:
        return getPQcIdseq();
      case CQCIDSEQ:
        return getCQcIdseq();
      case DISPLAYORDER:
        return getDisplayOrder();
      case RLNAME:
        return getRlName();
      case QUESTIONS:
        return getQuestions();
      case MODULEQUESTIONRECS:
        return getModuleQuestionRecs();
      case FORM:
        return getForm();
      case CONTEXT:
        return getContext();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }

  //  Generated method. Do not modify.
  protected void setAttrInvokeAccessor(
    int index, Object value, AttributeDefImpl attrDef)
    throws Exception {
    switch (index)
      {
      case VERSION:
        setVersion((Number)value);
        return;
      case QTLNAME:
        setQtlName((String)value);
        return;
      case CONTEIDSEQ:
        setConteIdseq((String)value);
        return;
      case ASLNAME:
        setAslName((String)value);
        return;
      case PREFERREDNAME:
        setPreferredName((String)value);
        return;
      case PREFERREDDEFINITION:
        setPreferredDefinition((String)value);
        return;
      case LONGNAME:
        setLongName((String)value);
        return;
      case LATESTVERSIONIND:
        setLatestVersionInd((String)value);
        return;
      case DELETEDIND:
        setDeletedInd((String)value);
        return;
      case DNCRFIDSEQ:
        setDnCrfIdseq((String)value);
        return;
      case QRIDSEQ:
        setQrIdseq((String)value);
        return;
      case PQCIDSEQ:
        setPQcIdseq((String)value);
        return;
      case CQCIDSEQ:
        setCQcIdseq((String)value);
        return;
      case DISPLAYORDER:
        setDisplayOrder((Number)value);
        return;
      case RLNAME:
        setRlName((String)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }

  /**
   * Gets the attribute value for DN_CRF_IDSEQ using the alias name DnCrfIdseq
   */
  public String getDnCrfIdseq() {
    return (String) getAttributeInternal(DNCRFIDSEQ);
  }

  /**
   * Sets <code>value</code> as attribute value for DN_CRF_IDSEQ using the
   * alias name DnCrfIdseq
   */
  public void setDnCrfIdseq(String value) {
    setAttributeInternal(DNCRFIDSEQ, value);
  }

  /**
   * Gets the associated <code>Row</code> using master-detail link Form
   */
  public oracle.jbo.Row getForm() {
    return (oracle.jbo.Row) getAttributeInternal(FORM);
  }

  /**
   * Gets the associated <code>RowIterator</code> using master-detail link
   * Questions
   */
  public oracle.jbo.RowIterator getQuestions() {
    return (oracle.jbo.RowIterator) getAttributeInternal(QUESTIONS);
  }

  /**
   * Gets the associated <code>RowIterator</code> using master-detail link
   * ModuleQuestionRecs
   */
  public oracle.jbo.RowIterator getModuleQuestionRecs() {
    return (oracle.jbo.RowIterator) getAttributeInternal(MODULEQUESTIONRECS);
  }

 /** public Form getFormTransferObject() {
    return null //new BC4JFormTransferObject((FormsViewRowImpl) getForm());
  }
**/
/**
  public List getQuestionTranferObjects() {
    List terms = new ArrayList(25);
    oracle.jbo.RowIterator quesRows = getQuestions();

    while (quesRows.hasNext()) {
      terms.add(
        new BC4JQuestionTransferObject((QuestionsViewRowImpl) quesRows.next()));
    }

    return terms;
  }
  
  **/

  /**
   * 
   * Gets the associated <code>Row</code> using master-detail link Context
   */
  public oracle.jbo.Row getContext() {
    return (oracle.jbo.Row)getAttributeInternal(CONTEXT);
  }

/**
  public Context getContextTransferObject() {
    Context conte =
      new BC4JContextTransferObject((ContextsViewRowImpl) getContext());

    return conte;
  }
  **/
}
