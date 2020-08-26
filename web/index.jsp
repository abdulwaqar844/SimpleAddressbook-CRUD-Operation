<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Address Book</title>
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
        <h1>Welcome To Address Book</h1>
        <a href=controller?action=addperson>Add Person</a>
        <br>
        <a href=controller?action=searchperson> Search Person</a>
        

    </body>
</html>
