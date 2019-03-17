<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 16.03.2019
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Polecane dla ciebie:</p>
<%
    ArrayList<String> list = (ArrayList<String>)request.getAttribute("marki");
    for (String i : list){%>
        <tr>
            <td>- <%=i%> </br></td>
        </tr>
    <%}%>
</body>
</html>
