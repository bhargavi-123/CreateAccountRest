<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<for:form modelAttribute="my" action="success">
<table>
<%-- <tr>
<td>Employee Id</td>
<td><for:input path="empId"/></td>
</tr> --%>

<tr>
<td>First Name</td>
<td><for:input path="firstName"/></td>
<td><for:errors path="firstName"></for:errors></td>
</tr>

<tr>
<td>Last Name</td>
<td><for:input path="lastName"/></td>
<td><for:errors path="lastName"></for:errors>
</tr>

<tr>
<td>Email Id</td>
<td><for:input path="emailId"/></td>
<td><for:errors path="emailId"></for:errors>
</tr>

<tr>
<td>Phone Number</td>
<td><for:input path="phoneNo"/></td>
<td><for:errors path="phoneNo"></for:errors>
</tr>

<tr>
<td>pan Number</td>
<td><for:input path="panNum"/></td>
<td><for:errors path="panNum"></for:errors>
</tr>
<tr>
<td>Address</td>
<td><for:input path="address"/></td>
<td><for:errors path="address"></for:errors>
</tr>

<tr>
<td>Balance</td>
<td><for:input path="initialDeposit"/></td>
<td><for:errors path="initialDeposit"></for:errors>
</tr>

<tr>
<td><input type="submit" value="Create"></input></td>
</tr>
</table>
</for:form> 
</body>
</html>