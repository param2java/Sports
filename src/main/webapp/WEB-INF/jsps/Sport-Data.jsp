<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Sport</title>
</head>
<body>

	<h2 align="center">List Of Sport</h2>
	<table width="300" border="1" align="center">
		<tr align="center" style="color: red; font-size: 18px;">
			<th>Id</th>
			<th>Name</th>
			<th>Category ID</th>
		</tr>
		<c:forEach items="${sportList}" var="sport">
			<tr align="center" >
				<td><a
					href="${pageContext.request.contextPath}/edit-sport.htm?sportId=${sport.sportId}">
						<c:out value="${sport.sportId}" />
				</a></td>
				<td><c:out value="${sport.sportName}" /></td>
				<td><c:out value="${sport.categoryId}" /></td>
				<td><a
					href="${pageContext.request.contextPath}/delete-sport.htm?sportId=${sport.sportId}"><img
						src="${pageContext.request.contextPath }/images/delete.png"
						width="20px" height="20px" /></a></td>
			</tr>
		</c:forEach>
	</table>
	<p align="center" style="color:red">${msg}</p>
</body>
</html>