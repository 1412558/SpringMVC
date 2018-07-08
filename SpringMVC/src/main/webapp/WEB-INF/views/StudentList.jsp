<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

<title>Student Management Screen</title>
</head>
<body>
Hello ${name}
	<div align="center">
		<h1>Employee List</h1>
		
		<table border="1">
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Action</th>

			<c:forEach var="stu" items="${listStudent}">
				<tr ${stu.id}>
					<td>${stu.name}</td>
					<td>${stu.email}</td>
					<td>${stu.address}</td>
					<td>${stu.telephone}</td>
					<td><a href="editStudent?id=${stu.id}">Edit</a> | <a
						href="deleteStudent?id=${stu.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<h4>
			New Student Register <a href="newStudent">here</a>
		</h4>
	</div>
</body>
</html>