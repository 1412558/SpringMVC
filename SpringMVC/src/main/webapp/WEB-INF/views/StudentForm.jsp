<%--
  Created by IntelliJ IDEA.
  User: bossd
  Date: 7/8/2018
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <title>Title</title>
</head>
<body>
<h1>Manage Student</h1>
<div align="center">
    <h1>New/Edit Student</h1>
    <form:form action="saveStudent" method="post" modelAttribute="student">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Name:</td>
                <td><form:errors path="name" cssStyle="color:red;display:block"></form:errors></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:errors path="email" cssStyle="color:red;display:block"></form:errors></td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:errors path="address" cssStyle="color:red;display:block"></form:errors></td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Telephone:</td>
                <td><form:errors path="telephone" cssStyle="color:red;display:block"></form:errors></td>
                <td><form:input path="telephone" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
