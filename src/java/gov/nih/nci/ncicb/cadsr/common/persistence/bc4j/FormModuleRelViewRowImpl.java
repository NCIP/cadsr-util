package gov.nih.nci.ncicb.cadsr.persistence.bc4j;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Number;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class FormModuleRelViewRowImpl extends ViewRowImpl  {


  public static final int QRIDSEQ = 0;
  public static final int PQCIDSEQ = 1;
  public static final int CQCIDSEQ = 2;
  public static final int DISPLAYORDER = 3;
  public static final int RLNAME = 4;
  public static final int FORM = 5;
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public FormModuleRelViewRowImpl() {
  }

  /**
   * 
   * Gets qr entity object.
   */
  public QcRecsExtImpl getqr() {
    return (QcRecsExtImpl)getEntity(0);
  }

  /**
   * 
   * Gets frm entity object.
   */
  public QuestContentsExtImpl getfrm() {
    return (QuestContentsExtImpl)getEntity(1);
  }

  /**
   * 
   * Gets the attribute value for QR_IDSEQ using the alias name QrIdseq
   */
  public String getQrIdseq() {
    return (String)getAttributeInternal(QRIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for QR_IDSEQ using the alias name QrIdseq
   */
  public void setQrIdseq(String value) {
    setAttributeInternal(QRIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for P_QC_IDSEQ using the alias name PQcIdseq
   */
  public String getPQcIdseq() {
    return (String)getAttributeInternal(PQCIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for P_QC_IDSEQ using the alias name PQcIdseq
   */
  public void setPQcIdseq(String value) {
    setAttributeInternal(PQCIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for C_QC_IDSEQ using the alias name CQcIdseq
   */
  public String getCQcIdseq() {
    return (String)getAttributeInternal(CQCIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for C_QC_IDSEQ using the alias name CQcIdseq
   */
  public void setCQcIdseq(String value) {
    setAttributeInternal(CQCIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for DISPLAY_ORDER using the alias name DisplayOrder
   */
  public Number getDisplayOrder() {
    return (Number)getAttributeInternal(DISPLAYORDER);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DISPLAY_ORDER using the alias name DisplayOrder
   */
  public void setDisplayOrder(Number value) {
    setAttributeInternal(DISPLAYORDER, value);
  }

  /**
   * 
   * Gets the attribute value for RL_NAME using the alias name RlName
   */
  public String getRlName() {
    return (String)getAttributeInternal(RLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for RL_NAME using the alias name RlName
   */
  public void setRlName(String value) {
    setAttributeInternal(RLNAME, value);
  }

















  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
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
      case FORM:
        return getForm();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
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
   * 
   * Gets the associated <code>Row</code> using master-detail link Form
   */
  public oracle.jbo.Row getForm() {
    return (oracle.jbo.Row)getAttributeInternal(FORM);
  }
}