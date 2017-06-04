<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Project</title>
</head>
<body>

	<h2>Add Project Data</h2>
		<form:form method="POST" action="/sdnext/save.html">
	   		<table>
			    <tr>
			        <td><form:label path="id">Project ID:</form:label></td>
			        <td><form:input path="id" value="${project.id}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="name">Project Name:</form:label></td>
			        <td><form:input path="name" value="${project.name}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="age">Project Age:</form:label></td>
			        <td><form:input path="age" value="${project.category}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="salary">Project Salary:</form:label></td>
			        <td><form:input path="salary" value="${project.status}"/></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		
</body>
</html>