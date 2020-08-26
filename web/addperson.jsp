<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Record</title>
        <style>
            
            body{
     
                font-family: sans-serif;
                font-size: 25px;
                font-style: oblique;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h1>Add New Record</h1>
        
        <form action="controller" method="post">
            <input type="text" name="pname" placeholder="Enter Name">
            <br>
            <input type="text" name="address" value="" placeholder="Address" />
            <br>
            <input type="text" name="phone" placeholder="Phone No"/>
            <br>
            <input type="submit" value="add" name="action">
            
        </form>
    </body>
</html>
