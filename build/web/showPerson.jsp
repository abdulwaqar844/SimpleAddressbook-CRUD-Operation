<%-- 
    Document   : showPerson
    Created on : Aug 27, 2020, 6:04:03 PM
    Author     : ABDUL WAQAR
--%>

<%@page import="vu.PersonInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
    </head>
    <body>
        <h1>Your Searched Record is </h1>
        <table border="1" >
            <tr>
                <th>Name</th>
                <th>Contact No</th>
                <th>Address</th>
            </tr>
            <tbody>
                <%
             String oo=request.getParameter("object");
                %>
                
                
                
                <tr><%=oo%></tr>
                <tr></tr>
                <tr></tr>
            </tbody>
        </table>
    </body>
</html>
