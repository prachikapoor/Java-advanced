<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="userinfo" class="registartionpackage.register1"></jsp:useBean> 
<jsp:setProperty property="*" name="userinfo"/> 



<jsp:getProperty property="username" name="userinfo"/><br> 
<jsp:getProperty property="password" name="userinfo"/><br> 
<jsp:getProperty property="age" name="userinfo" /><br>




<a href="login.jsp">Login Here</a>
</body>
</html>