<%-- 
    Document   : showPerson
    Created on : Aug 27, 2020, 6:04:03 PM
    Author     : ABDUL WAQAR
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="vu.PersonInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
        <style>
            table,body{
               margin-left: auto;
               margin-right: auto;
               column-width: fit-content;
               text-align: center;
                
            }
        </style>
    </head>
    <body>
        <h1>Your Searched Record is </h1>
        <table border="1" >
            <tr>
                <th>Name</th>
                <th>Contact No</th>
                <th>Address</th>
            </tr>
              <%
                    PersonInfo person =null;
                ArrayList personlist=(ArrayList)request.getAttribute("list");
                for(int i=0;i<personlist.size();i++){
                person=(PersonInfo) personlist.get(i);
                
                %>
              
                <tr>
                <td><%=person.getName()%></td>
                <td><%=person.getPhoneNum()%></td>
                <td><%=person.getAddress() %></td>
                </tr>
                <%}%>
        </table>
    </body>
</html>
