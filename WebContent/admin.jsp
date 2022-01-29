<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String u=request.getParameter("aname");
String p=request.getParameter("apass");
if (u.equals("saran") && p.equals("1"))
{
	response.sendRedirect("admin.html");
}
%>

</body>
</html>