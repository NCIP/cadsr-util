/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.persistence.bc4j;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class DeCdeIdViewRowImpl extends ViewRowImpl  {


  public static final int ACIDSEQ = 0;
  public static final int MINCDEID = 1;
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public DeCdeIdViewRowImpl() {
  }

  /**
   * 
   * Gets DeCdeId entity object.
   */
  public DeCdeIdImpl getDeCdeId() {
    return (DeCdeIdImpl)getEntity(0);
  }

  /**
   * 
   * Gets the attribute value for AC_IDSEQ using the alias name AcIdseq
   */
  public String getAcIdseq() {
    return (String)getAttributeInternal(ACIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for AC_IDSEQ using the alias name AcIdseq
   */
  public void setAcIdseq(String value) {
    setAttributeInternal(ACIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for MIN_CDE_ID using the alias name MinCdeId
   */
  public Number getMinCdeId() {
    return (Number)getAttributeInternal(MINCDEID);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for MIN_CDE_ID using the alias name MinCdeId
   */
  public void setMinCdeId(Number value) {
    setAttributeInternal(MINCDEID, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case ACIDSEQ:
        return getAcIdseq();
      case MINCDEID:
        return getMinCdeId();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case ACIDSEQ:
        setAcIdseq((String)value);
        return;
      case MINCDEID:
        setMinCdeId((Number)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }
}