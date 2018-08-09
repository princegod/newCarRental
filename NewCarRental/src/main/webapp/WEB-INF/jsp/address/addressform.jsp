<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <spring:url value="/address/save" var="saveURL" />
 
 <form:form action="${saveURL }" method="POST" modelAttribute="addressForm">
  <form:hidden path="id"/>
  <table>
   <tr>
    <td>Mobile No</td>
    <td><form:input path="Mobile"/></td>
   </tr>
   <tr>
    <td>Password</td>
    <td><form:input path="Street"/></td>
   </tr>
    <tr>
    <td>City</td>
    <td><form:input path="city"/></td>
   </tr>   
   
    <tr>
    <td>State</td>
    <td><form:input path="State"/></td>
   </tr>
    <tr>
    <td>Country</td>
    <td><form:input path="country"/></td>
   </tr>
    <tr>
    <td>Pincode</td>
    <td><form:input path="pincode"/></td>
   </tr>
  
   <tr>
    <td>Email</td>
    <td><form:input path="Email"/></td>
   </tr>
   <tr>
    <td></td>
    <td><button type="submit">Save</button></td>
   </tr>
  </table>
 </form:form>
</body>
</body>
</html>