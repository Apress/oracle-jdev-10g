<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello <bean:write name="LoginForm" property="userId"/>
</title>
</head>
<body>
  <logic:equal name="ACCESS" value="YES">
      <bean:message key="neo"/>
  </logic:equal>
    <logic:notEqual name="ACCESS" value="YES">
      <bean:message key="agent"/>
  </logic:notEqual>
</body>
</html>
