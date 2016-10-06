<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>untitled</title>
</head>
<body>
  <html:link page="/Login.do">
    <bean:message key="link.Login"/>
  </html:link>
  <br/>
      <html:errors />
      <html:form action="Login">
            <table  cellspacing="2" cellpadding="1" border="1" width="40%">
              <tr>
                  <td>UserId</td>
                  <td>
                    <html:text property="userId" maxlength="10" />
                  </td>
              </tr>
              <tr>
                  <td>Password</td>
                  <td>
                    <html:password property="password" maxlength="8" />
                  </td>
              </tr>
            </table>
            <p>
              <html:submit title="Submit" value="Submit" />
            </p>
      </html:form>  
</body>
</html>
