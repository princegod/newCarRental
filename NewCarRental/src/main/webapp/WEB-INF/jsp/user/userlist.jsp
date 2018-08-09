<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
</head>
<body>
 <spring:url value="/user/add" var="addURL" />
 <a href="${addURL }">Add new User </a>
 
 <spring:url value="/address/form" var="addURL"></spring:url>
 <a href="${addURL }">Add new Address </a>
 
 <table width="100%" border="1">
  <tr>
   <td>ID</td>
   <td>Username</td>
   <td>Password</td>
   <td>DOB</td>
   <td>Gender</td>
   <td colspan="2">Action</td>
  </tr>  
  <c:forEach items="${list }" var="user" >
   <tr>
    <td>${user.id }</td>
    <td>${user.username }</td>
    <td>${user.password }</td>
    <td>${user.dob }</td>
    <td>${user.gender }</td>
    <td>
     <spring:url value="/user/update/${user.id }" var="updateURL" />
     <a href="${updateURL }">Update</a>
    </td>
    
    <td>
    <spring:url value="/address/addAddress/${user.id }" var="addURL"/>
    <a href="${addURL }">Add address</a>
    </td>
    
    <td>
     <spring:url value="/user/delete/${user.id }" var="deleteURL" />
     <a href="${deleteURL }">Delete</a>
    </td>
   </tr>
  </c:forEach>
 </table>
</body>
</html>