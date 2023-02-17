<%-- 
    Document   : add-product
    Created on : Feb 17, 2023, 8:36:44 PM
    Author     : leducphi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Product </h1>
        <form action="add" method="post">
            <label>ID</label>
            <input type="text" name="pid">
            <br/>
            <label>Name</label>
            <input type="text" name="pname" >
            <br/>
            <label>Price</label>
            <input type="text" name="pprice" >
            <br/>
            <label>Quantity</label>
            <input type="text" name="pquantity">
            <br/>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
