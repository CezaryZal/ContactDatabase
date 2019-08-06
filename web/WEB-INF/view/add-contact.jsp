<%--
  Created by IntelliJ IDEA.
  User: czar
  Date: 06/08/2019
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Contact</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/htmlStyle/css/style.css">

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/htmlStyle/css/add-contact-style.css">
</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>Contact Database </h2>
    </div>
</div>

<div id="container">
    <h3>Contact Database</h3>

    <form:form action="saveContact" modelAttribute="contact" method="POST">

        <!-- need to associate this data with customer id -->
        <form:hidden path="id" />

        <table>
            <tbody>
            <tr>
                <td><label>First name:</label></td>
                <td><form:input path="firstName" /></td>
            </tr>

            <tr>
                <td><label>Last name:</label></td>
                <td><form:input path="lastName" /></td>
            </tr>

            <tr>
                <td><label>Email:</label></td>
                <td><form:input path="email" /></td>
            </tr>

            <tr>
                <td><label>Phone number:</label></td>
                <td><form:input path="phoneNumber" /></td>
            </tr>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save" /></td>
            </tr>

            </tbody>
        </table>


    </form:form>

    <div style="clear; both;"></div>

    <p>
        <a href="${pageContext.request.contextPath}/contact/list">Back to List</a>
    </p>

</div>

</body>
</html>
