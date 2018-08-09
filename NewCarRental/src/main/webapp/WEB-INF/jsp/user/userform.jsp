<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
 <spring:url value="/user/save" var="saveURL" />
 
 <form:form action="${saveURL }" method="POST" modelAttribute="userForm">
  <form:hidden path="id"/>
  <table>
   <tr>
    <td>Firstname</td>
    <td><form:input path="Username"/></td>
   </tr>
   <tr>
    <td>Password</td>
    <td><form:password path="Password"/></td>
   </tr>
    <tr>
    <td>DOB</td>
    <td><form:input path="Dob"/></td>
   </tr>   
   
   <tr>
    <td>Gender: </td>
    <td>
     <form:radiobutton path="Gender" value="Male" /> Male
     <form:radiobutton path="Gender" value="Female" /> Female
    </td>
   </tr> 
  
   <tr>
    <td></td>
    <td><button type="submit">Save</button></td>
   </tr>
  </table>
 </form:form>
</body>
</html>