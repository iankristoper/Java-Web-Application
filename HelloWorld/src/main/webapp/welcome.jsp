
<%@ page import="jakarta.servlet.http.HttpSession" %>


<%
    HttpSession sessions = request.getSession(false);
    if (session == null || session.getAttribute("user") == null) {
        response.sendRedirect("index.html");
    }
%>



<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, <%= sessions.getAttribute("user") %>!</h2>
    <a href="logoutProcess">Logout</a>
</body>
</html>
