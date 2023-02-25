<%-- 
    Document   : sign-in
    Created on : Feb 25, 2023, 7:51:13 PM
    Author     : leducphi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sign Up</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <style>
            body
            {
                margin: 0;
                padding: 0;
                background-color:#6abadeba;
                font-family: 'Arial';
            }
            .login{
                width: 350px;
                overflow: hidden;
                margin: auto;
                margin: 20 0 0 450px;
                padding: 80px;
                background: #23463f;
                border-radius: 15px ;

            }
            h2{
                text-align: center;
                color: #277582;
                padding: 20px;
            }
            label{
                color: #08ffd1;
                font-size: 17px;
            }
            #Uname{
                width: 300px;
                height: 30px;
                border: none;
                border-radius: 3px;
                padding-left: 8px;
            }
            #Pass{
                width: 300px;
                height: 30px;
                border: none;
                border-radius: 3px;
                padding-left: 8px;

            }
            #log{
                width: 300px;
                height: 30px;
                border: none;
                border-radius: 17px;
                padding-left: 7px;
                color: blue;
                cursor: pointer;

            }
            span{
                color: white;
                font-size: 17px;
            }
            a{
                background-color: #666666;
                padding: 5px;
                border-radius: 4px;
            }
        </style>
    </head>
    <body>
        <h2>Sign Up</h2><br>
        <div class="login">
            <form id="sign-up" method="post" action="sign-up">
                
                <label><b>Full Name
                    </b>
                </label>
                <input type="text" name="txtName" id="Uname" placeholder="Full Name">
                <br><br>
                <label><b>Address
                    </b>
                </label>
                <input type="text" name="txtAddress" id="Uname" placeholder="Address">
                <br><br>
                <label><b>Phone Number
                    </b>
                </label>
                <input type="text" name="txtPhone" id="Uname" placeholder="Phone Number">
                <br><br>
                <label><b>Username
                    </b>
                </label>
                <input type="text" name="username" id="Uname" placeholder="Username">
                <br><br>
                <label><b>Password
                    </b>
                </label>
                <input type="Password" name="password" id="Pass" placeholder="Password">
                <br><br>
                <input type="submit" name="log" id="log" value="Sign Up">
                <br><br>
                <span style="color: red;">${msg}</span>
                <br><br>
                Already have an account ?<a href="<c:url value="sign-in"/>" style="text-decoration: none; color: white;">Sign In</a>
            </form>
        </div>
    </body>
</html>