<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Record</title>
    </head>
    <body>
        <h1>Enter Record to Search</h1>
        <form  action="controller" method="get">
            <input type="text" name="searchrecord" placeholder="Enter name to search">
            <input type="submit" name="action" value="search">
        </form>
    </body>
</html>
