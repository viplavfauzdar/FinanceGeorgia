<%-- 
    Document   : list
    Created on : Dec 1, 2013, 1:10:03 PM
    Author     : Viplav
--%>

<%@page import="com.viplav.financegeorgia.db.User"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listing</title>
    </head>
    <body>
        <h1>Listing</h1>
        <%
        List<User> l = (List)request.getAttribute("luser");
        for(User u: l){
            out.println("<br>" + u.getFirstName() + " " + u.getLastName() + " " + u.getUsername());
        }
        %>
    </body>
</html>
