<%--
  Created by IntelliJ IDEA.
  User: czar
  Date: 03/08/2019
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>List Contacts</title>

</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
</div>

<div id="container">

    <div id="content">

        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone Number</th>
            </tr>

            <c:forEach var="tempContact" items="${contacts}">

                <tr>
                    <td> ${tempContact.firstName} </td>
                    <td> ${tempContact.lastName} </td>
                    <td> ${tempContact.email} </td>
                    <td> ${tempContact.phoneNumber} </td>

                </tr>

            </c:forEach>

        </table>

    </div>

</div>

</body>

</html>
