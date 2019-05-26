<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Verify User</h1>


 <jsp:useBean id="snr" class="kiran.ValidateUser"/> 
          
        <%-- Set the value of the created bean using form data --%> 
        <jsp:setProperty name="snr" property="user"/> 
        <jsp:setProperty name="snr" property="pass"/> 
          
        <%-- Display the form data --%> 
        The Details Entered Are as Under<br/> 
        <p>User: <jsp:getProperty name="snr" property="user"/></p> 
        <p>Password : <jsp:getProperty name="snr" property="pass"/></p> 
          
        <%-- Validate the user using the validate() of  
             ValidateUser.java class 
        --%> 
        <%if(snr.validate("kiran", "123")){%> 
            <h1>Welcome! You are a VALID USER</h1><br/> 
        <%}else{%> 
           <h1>Error! You are an INVALID USER</h1> <br/> 
        <%}%>   
        
		
</body>
</html>