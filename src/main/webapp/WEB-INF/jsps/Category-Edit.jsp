<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Vendor</title>
</head>
<body>
	<h1 align="center" > Update Category Information </h1>
	
	<form action="${pageContext.request.contextPath }/update-category.htm" method="post">
		<table align="center" style="color: red; font-size: 18px;">
			<tr><td> Id : </td> <td><input type="text" name="categoryId" value="${category.categoryId}" readonly="readonly"></td></tr>
			<tr><td> Name : </td> <td><input type="text" name="categoryName" value="${category.categoryName}"></td></tr>
			<tr><td>  </td> <td><input type="submit" value="Update"></td></tr>
		</table>	 
	</form>
</body>
</html>