<%-- 
    Document   : edit-product
    Created on : Feb 17, 2023, 7:59:22 PM
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
        <h1>Edit Product ID : ${product.getId()}</h1>
        <form action="edit" method="post">
            <input type="hidden" value="${product.getId()}" name="pid">
            <label>Name</label>
            <input type="text" name="pname" value="${product.getName()}">
            <br/>
            <label>Price</label>
            <input type="text" name="pprice" value="${product.getPrice()}">
            <br/>
            <label>Quantity</label>
            <input type="text" name="pquantity" value="${product.getQuantity()}">
            <br/>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
