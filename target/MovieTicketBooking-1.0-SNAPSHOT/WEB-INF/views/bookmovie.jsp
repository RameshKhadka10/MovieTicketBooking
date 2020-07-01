<%-- 
    Document   : bookmovie
    Created on : Feb 7, 2020, 7:47:49 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rk Movies</title>
    </head>
    <body>
        <c:forEach  items="${movielist}" var="m">
            <h1>Title: ${m[0]}</h1>
            <h1>Director: <c:out value = "${m[2]}"/> </h1>
            <h1>Cast: <c:out value = "${m[1]}"/></h1>
        </c:forEach>
    </body>
    
    
</html>