<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="javax.naming.*"%>
<%@ page import="javax.rmi.*"%>
<%@ page import="com.jdevbook.chap6.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>Date JSP CLient</title>
</head>
<body>
The Date and Time is:
<%
      Context context =  new InitialContext();
      DateEJBHome dateEJBHome = (DateEJBHome)
        PortableRemoteObject.narrow(context.lookup("DateEJB"), DateEJBHome.class);
      DateEJB dateEJB;
      dateEJB = dateEJBHome.create();
      out.println(dateEJB.getCurrentTime()); 
%>
</body>
</html>
