
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!
  String[] colors = {"Green", "yellow", "Black", "Red", "pink"};
%>
<html>
<head>
<title>Spring4 MVC</title>
</head>
<body>
<h1>${msg}</h1>
<h2>User Id: ${userId}</h2>	
<h2>Location : ${location}</h2>	
<h2>DummyTest : ${dummyTest}</h2>	
<%@ page import="java.util.Date" %>
<h3>Hi Robert</h3><br>
<strong>Current Time is</strong>: <%=new Date() %>	
<H1>List of colors</H1>
    <TABLE BORDER="1" align="center" bgcolor="#E8FDFF"
     weight="50%" height="40%">
      <TH>Color Name:</TH>
      <% for (int i=0; i<colors.length; i++) { %>
        <TR><TD bgcolor="<%=colors[i] %>">
     <font color="white"><%= colors[i]%></font></TD></TR>
      <% } %>
    </TABLE>
</body>
</html>