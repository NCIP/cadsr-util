/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.lov;

/**
 * A Bean class.
 * <P>
 * @author Oracle Corporation
 * @version: $Id: ValueDomainsLOVBean.java,v 1.3 2008-04-18 19:06:49 hegdes Exp $
 */
import gov.nih.nci.ncicb.cadsr.common.util.*;
import gov.nih.nci.ncicb.cadsr.common.util.logging.Log;
import gov.nih.nci.ncicb.cadsr.common.util.logging.LogFactory;

import java.sql.*;

import javax.servlet.http.*;
//import healthtoolkit.beans.dbservice.*;
//import healthtoolkit.utils.*;

public class ValueDomainsLOVBean extends Object {
  private static Log log = LogFactory.getLog(ValueDomainsLOVBean.class.getName());

  private String[] searchName;
  private String[] displayName;
  private String[] jspParm;
  private String[] sqlStmtParm;
  //private DBBroker dBBroker = null;
  private CommonLOVBean clb;
  private String targetJsp = "valueDomainsLOV.jsp";
  private String whereClause = "";
  private String searchStr = "";
  private boolean isContextSpecific = false;

  public ValueDomainsLOVBean(HttpServletRequest request
                            //,DBLAccess dblAccess
                            ,DBUtil dbUtil
                            ,String additionalWhere
                             ){

    try {
      searchStr = request.getParameter("SEARCH");
      if (searchStr ==null) searchStr ="";
      String searchWhere = "";
      String newSearchStr = "";
      if (!searchStr.equals("")) {
        newSearchStr = StringReplace.strReplace(searchStr,"*","%");
        //Release 3.0, TT#1178
        newSearchStr = StringReplace.strReplace(newSearchStr,"'","''");
        searchWhere = " and   (upper(vd.long_name) like upper ( '"+newSearchStr+"') " +
                      " OR upper(vd.preferred_name) like upper ( '"+newSearchStr+"')) "
                      ;
      }
      if (request.getParameter("chkContext") == null){
        /*whereClause = " and   (upper (nvl(vd.long_name,'%')) like upper ( '%"+searchStr+"%') " +
                      " OR upper (nvl(vd.preferred_name,'%')) like upper ( '%"+searchStr+"%')) "
                      ;*/
          whereClause = searchWhere;
      }
      else {
        /*whereClause = " and   (upper (nvl(vd.long_name,'%')) like upper ( '%"+searchStr+"%') " +
                      " OR upper (nvl(vd.preferred_name,'%')) like upper ( '%"+searchStr+"%')) "+
                      additionalWhere;*/
        whereClause = searchWhere+additionalWhere;
        isContextSpecific = true;
      }
      //dBBroker = dblAccess.getDBBroker();

      // pass the following parameters to CommonListCntrlBean
      String[] searchParm ={"vd.long_name","Keyword"};
      String[] jspLinkParm={ "vd.vd_idseq","P_ID"};
      String[] displayParm={"vd.preferred_name","Short Name" ,
                            "vd.long_name","Long Name",
                            "vd_conte.name","Context",
                            "vd.asl_name","Workflow Status",
                            "vd.preferred_definition","Definition",
                            "vd.version", "Version"};
      String[] sqlStmtParm = new String[2];
      sqlStmtParm[0] = " from sbr.value_domains_view vd, sbr.contexts_view vd_conte " +
                           " where vd.conte_idseq = vd_conte.conte_idseq " +
                           //" and vd.deleted_ind = 'No' " +  this is done in the view
                           " and vd.asl_name not in ('RETIRED PHASED OUT','RETIRED DELETED') " + whereClause;
      sqlStmtParm[1] = " order by vd.preferred_name ";
      int[] lovPassbackCols = {0};

      clb = new CommonLOVBean(
        request,
        //dBBroker,
        dbUtil,
        searchParm,
        jspLinkParm,
        displayParm,
        sqlStmtParm,
        false,
        lovPassbackCols );

      clb.setCompressFlag(false); // set compress flag
      clb.setLinkCol(0);          // set detail page link column, 0-> first; 1->second
      clb.setDetailReq_Type("value_domains"); //set req_type for detail page
      clb.setShowRowNum(40);
      //clb.setPerformQueryToFalse();
      clb.setJsId(request.getParameter("idVar"));
      clb.setJsName(request.getParameter("nameVar"));
      if (isContextSpecific)
        clb.setExtraURLInfo("&performQuery=false&ckhContext=yes");
      else
        clb.setExtraURLInfo("&performQuery=false");
    }
    catch( SQLException e){
      //this.dBBroker = dBBroker;
      log.error("exception: ", e);
    }
  }

  public CommonLOVBean getCommonLOVBean() {
    return this.clb;
  }

  public String getJsp() {
    return targetJsp;
  }
  public boolean getIsContextSpecific(){
    return isContextSpecific;
  }

}
