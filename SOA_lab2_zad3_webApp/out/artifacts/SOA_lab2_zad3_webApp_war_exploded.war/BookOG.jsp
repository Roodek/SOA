<%@ page import="java.util.Vector" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17.03.2019
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BoG</title>


</head>
<body>
<h1>Zostaw Komentarz</h1>
<br/>
<form action="BookOG.jsp" method="post">
    Imię: <input type="text" name="name">
    <br/>
    email: <input type="text" name="email">
    <br/>
    Komentarz <input type="text" name="comment">
    <br/>
    <input type="submit" value="Wyślij" >
    <br/>
    <%
        Vector<String[]> vector = (Vector<String[]>) session.getAttribute("datavector");
        if(vector == null){
            session.setAttribute("datavector", new Vector<String[]>());
            vector = (Vector<String[]>) session.getAttribute("datavector");
        }
        String[] data = {request.getParameter("name"),request.getParameter("email"), request.getParameter("comment")};


        %>
        <%if(data[0]!=null && data[1]!=null && data[2]!=null) {
            vector.add(data);

        }%>
        <%
        if(vector.size()!=0){
            for (String[] i : vector){%>
                <tr>
                   // <td> <%=i[0]+" - " +i[1] %> : <br/> <%=i[2]%> <br/></td>
                </tr>
            <%}
        }%>



</form>

</body>
</html>
