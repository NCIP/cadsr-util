/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.persistence.bc4j;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Date;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class AcRegistrationsViewRowImpl extends ViewRowImpl  {


  public static final int ARIDSEQ = 0;
  public static final int ACIDSEQ = 1;
  public static final int ORGIDSEQ = 2;
  public static final int SUBIDSEQ = 3;
  public static final int REGISIDSEQ = 4;
  public static final int REGISTRATIONSTATUS = 5;
  public static final int UNRESOLVEDISSUE = 6;
  public static final int ORIGIN = 7;
  public static final int LASTCHANGE = 8;
  public static final int DATAIDENTIFIER = 9;
  public static final int VERSIONIDENTIFIER = 10;
  public static final int IRDI = 11;
  public static final int DATECREATED = 12;
  public static final int CREATEDBY = 13;
  public static final int DATEMODIFIED = 14;
  public static final int MODIFIEDBY = 15;
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public AcRegistrationsViewRowImpl() {
  }

  /**
   * 
   * Gets AcRegistrations entity object.
   */
  public AcRegistrationsImpl getAcRegistrations() {
    return (AcRegistrationsImpl)getEntity(0);
  }

  /**
   * 
   * Gets the attribute value for AR_IDSEQ using the alias name ArIdseq
   */
  public String getArIdseq() {
    return (String)getAttributeInternal(ARIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for AR_IDSEQ using the alias name ArIdseq
   */
  public void setArIdseq(String value) {
    setAttributeInternal(ARIDSEQ, value);
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
   * Gets the attribute value for ORG_IDSEQ using the alias name OrgIdseq
   */
  public String getOrgIdseq() {
    return (String)getAttributeInternal(ORGIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for ORG_IDSEQ using the alias name OrgIdseq
   */
  public void setOrgIdseq(String value) {
    setAttributeInternal(ORGIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for SUB_IDSEQ using the alias name SubIdseq
   */
  public String getSubIdseq() {
    return (String)getAttributeInternal(SUBIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for SUB_IDSEQ using the alias name SubIdseq
   */
  public void setSubIdseq(String value) {
    setAttributeInternal(SUBIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for REGIS_IDSEQ using the alias name RegisIdseq
   */
  public String getRegisIdseq() {
    return (String)getAttributeInternal(REGISIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for REGIS_IDSEQ using the alias name RegisIdseq
   */
  public void setRegisIdseq(String value) {
    setAttributeInternal(REGISIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for REGISTRATION_STATUS using the alias name RegistrationStatus
   */
  public String getRegistrationStatus() {
    return (String)getAttributeInternal(REGISTRATIONSTATUS);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for REGISTRATION_STATUS using the alias name RegistrationStatus
   */
  public void setRegistrationStatus(String value) {
    setAttributeInternal(REGISTRATIONSTATUS, value);
  }

  /**
   * 
   * Gets the attribute value for UNRESOLVED_ISSUE using the alias name UnresolvedIssue
   */
  public String getUnresolvedIssue() {
    return (String)getAttributeInternal(UNRESOLVEDISSUE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for UNRESOLVED_ISSUE using the alias name UnresolvedIssue
   */
  public void setUnresolvedIssue(String value) {
    setAttributeInternal(UNRESOLVEDISSUE, value);
  }

  /**
   * 
   * Gets the attribute value for ORIGIN using the alias name Origin
   */
  public String getOrigin() {
    return (String)getAttributeInternal(ORIGIN);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for ORIGIN using the alias name Origin
   */
  public void setOrigin(String value) {
    setAttributeInternal(ORIGIN, value);
  }

  /**
   * 
   * Gets the attribute value for LAST_CHANGE using the alias name LastChange
   */
  public String getLastChange() {
    return (String)getAttributeInternal(LASTCHANGE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LAST_CHANGE using the alias name LastChange
   */
  public void setLastChange(String value) {
    setAttributeInternal(LASTCHANGE, value);
  }

  /**
   * 
   * Gets the attribute value for DATA_IDENTIFIER using the alias name DataIdentifier
   */
  public String getDataIdentifier() {
    return (String)getAttributeInternal(DATAIDENTIFIER);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DATA_IDENTIFIER using the alias name DataIdentifier
   */
  public void setDataIdentifier(String value) {
    setAttributeInternal(DATAIDENTIFIER, value);
  }

  /**
   * 
   * Gets the attribute value for VERSION_IDENTIFIER using the alias name VersionIdentifier
   */
  public String getVersionIdentifier() {
    return (String)getAttributeInternal(VERSIONIDENTIFIER);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for VERSION_IDENTIFIER using the alias name VersionIdentifier
   */
  public void setVersionIdentifier(String value) {
    setAttributeInternal(VERSIONIDENTIFIER, value);
  }

  /**
   * 
   * Gets the attribute value for IRDI using the alias name Irdi
   */
  public String getIrdi() {
    return (String)getAttributeInternal(IRDI);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for IRDI using the alias name Irdi
   */
  public void setIrdi(String value) {
    setAttributeInternal(IRDI, value);
  }

  /**
   * 
   * Gets the attribute value for DATE_CREATED using the alias name DateCreated
   */
  public Date getDateCreated() {
    return (Date)getAttributeInternal(DATECREATED);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DATE_CREATED using the alias name DateCreated
   */
  public void setDateCreated(Date value) {
    setAttributeInternal(DATECREATED, value);
  }

  /**
   * 
   * Gets the attribute value for CREATED_BY using the alias name CreatedBy
   */
  public String getCreatedBy() {
    return (String)getAttributeInternal(CREATEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy
   */
  public void setCreatedBy(String value) {
    setAttributeInternal(CREATEDBY, value);
  }

  /**
   * 
   * Gets the attribute value for DATE_MODIFIED using the alias name DateModified
   */
  public Date getDateModified() {
    return (Date)getAttributeInternal(DATEMODIFIED);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DATE_MODIFIED using the alias name DateModified
   */
  public void setDateModified(Date value) {
    setAttributeInternal(DATEMODIFIED, value);
  }

  /**
   * 
   * Gets the attribute value for MODIFIED_BY using the alias name ModifiedBy
   */
  public String getModifiedBy() {
    return (String)getAttributeInternal(MODIFIEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for MODIFIED_BY using the alias name ModifiedBy
   */
  public void setModifiedBy(String value) {
    setAttributeInternal(MODIFIEDBY, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case ARIDSEQ:
        return getArIdseq();
      case ACIDSEQ:
        return getAcIdseq();
      case ORGIDSEQ:
        return getOrgIdseq();
      case SUBIDSEQ:
        return getSubIdseq();
      case REGISIDSEQ:
        return getRegisIdseq();
      case REGISTRATIONSTATUS:
        return getRegistrationStatus();
      case UNRESOLVEDISSUE:
        return getUnresolvedIssue();
      case ORIGIN:
        return getOrigin();
      case LASTCHANGE:
        return getLastChange();
      case DATAIDENTIFIER:
        return getDataIdentifier();
      case VERSIONIDENTIFIER:
        return getVersionIdentifier();
      case IRDI:
        return getIrdi();
      case DATECREATED:
        return getDateCreated();
      case CREATEDBY:
        return getCreatedBy();
      case DATEMODIFIED:
        return getDateModified();
      case MODIFIEDBY:
        return getModifiedBy();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case ARIDSEQ:
        setArIdseq((String)value);
        return;
      case ACIDSEQ:
        setAcIdseq((String)value);
        return;
      case ORGIDSEQ:
        setOrgIdseq((String)value);
        return;
      case SUBIDSEQ:
        setSubIdseq((String)value);
        return;
      case REGISIDSEQ:
        setRegisIdseq((String)value);
        return;
      case REGISTRATIONSTATUS:
        setRegistrationStatus((String)value);
        return;
      case UNRESOLVEDISSUE:
        setUnresolvedIssue((String)value);
        return;
      case ORIGIN:
        setOrigin((String)value);
        return;
      case LASTCHANGE:
        setLastChange((String)value);
        return;
      case DATAIDENTIFIER:
        setDataIdentifier((String)value);
        return;
      case VERSIONIDENTIFIER:
        setVersionIdentifier((String)value);
        return;
      case IRDI:
        setIrdi((String)value);
        return;
      case DATECREATED:
        setDateCreated((Date)value);
        return;
      case CREATEDBY:
        setCreatedBy((String)value);
        return;
      case DATEMODIFIED:
        setDateModified((Date)value);
        return;
      case MODIFIEDBY:
        setModifiedBy((String)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }
}