<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 15.03.2019
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <h1>To jest moja pierwsza apka</h1>
    <p> wyswietlam tekst </p>

    <%
      Date tmp = new Date();
      out.print("<h2>" + tmp.toString() + "</h2>");
    %>

  </body>
</html>
