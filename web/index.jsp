<%--
  Created by IntelliJ IDEA.
  User: czar
  Date: 02/08/2019
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<% response.sendRedirect("contact/list"); %>--%>
<html>
  <head>
    <title>Contact Database</title>
  </head>
  <body>

  If you want see your contact database, click button.
  <br>
  <input type="button" value="List contacts"
         onclick="window.location.href='contact/list'; "
  style="background-color: chocolate;
         border: 1px solid #666;
         border-radius: 5px;
         font-size: 12px;
         font-weight: bold;
         width: 120px;
         padding: 5px 10px;
         margin-top: 10px;"
  />
  </body>
</html>
