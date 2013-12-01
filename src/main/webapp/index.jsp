<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
        <h1>Test</h1>
        <form>
            First Name: <input type="text" id="firstName" name="firstName">
            <br>Last Name: <input type="text" id="lastName" name="lastName">
            <br>Username: <input type="text" id="username" name="username">
            <br><input type="submit">
        </form>
        <%
        System.out.println("Console output");
        %>
    </body>
</html>
