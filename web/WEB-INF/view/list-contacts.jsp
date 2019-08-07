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

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/htmlStyle/css/style.css" />

</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>Contact Database </h2>
    </div>
</div>

<div id="container">

    <div id="content">

        <input type="button" value="Add Contact"
               onclick="window.location.href='showFromForAdd'; return false;"
               class="add-button" />

        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Action</th>
            </tr>

            <c:forEach var="tempContact" items="${contacts}">

                <c:url var = "updateLink" value="/contact/showFormForUpdate">
                    <c:param name="contactId" value="${tempContact.id}"/>
                </c:url>

                <c:url var = "deleteLink" value="/contact/delete">
                    <c:param name="contactId" value="${tempContact.id}"/>
                </c:url>

                <tr>
                    <td> ${tempContact.firstName} </td>
                    <td> ${tempContact.lastName} </td>
                    <td> ${tempContact.email} </td>
                    <td> ${tempContact.phoneNumber} </td>

<%--     example    http://localhost:8081/ContactDatabase_war_exploded/contact/showFromForAdd?contactId=1--%>
                    <td>
                    <!-- display the update link -->
                        <a href="${updateLink}">Update</a>
                        |
                        <a href="${deleteLink}"
                        onclick="if (!(confirm('Are you sure you want to delete this contact?')))return false">Delete</a>
                    </td>
                </tr>

            </c:forEach>

        </table>

    </div>

</div>

</body>

</html>
