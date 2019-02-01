<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<title>User Home Page</title>
<%@page import="java.util.ArrayList,bean.UserBean" %>

</head>
<body>
<center>
<h1 ><font color="blue">${welcomemsg}</font></h1>
<h1 ><font color="red">${msg}</font></h1>
<h2><font color="red">Welcome, ${email}</font></h2>
</center>
<div class="container">
   
 <table class="table table-bordered">
 <tr><th>Name</th><th>Gender</th><th>DOB</th><th>Religion</th><th>Mother-Tongue</th><th>Caste</th><th>Country</th><th>Mobile No.</th><th>Email Id</th></tr>
 <% 
 ArrayList<UserBean> list=(ArrayList<UserBean>)request.getAttribute("LIST");
 
 %>
 
 <%
   for(UserBean ee:list)
   {
	  %>
   	 <tr>
   	<td> <%=ee.getName()%> </td>
   	<td> <%=ee.getGender()%> </td>
	<td> <%=ee.getDob()%> </td>
	 <td><%=ee.getReligion()%> </td>
	 <td><%=ee.getTongue()%> </td>
	 <td><%=ee.getCaste()%></td>
	  <td><%=ee.getCountry()%></td>
 	   <td><%=ee.getMnumber()%></td>
 	    <td><%=ee.getEmail()%></td>
	 <tr/>
	 <%
	 }
  %>
  </table></div>
  
  

</body>
</html>