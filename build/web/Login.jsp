<%-- 
    Document   : Login
    Created on : Oct 13, 2016, 3:43:28 PM
    Author     : Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css" />
            <link href='http://fonts.googleapis.com/css?family=Belgrano' rel='stylesheet' type='text/css'>
        <title>ĐĂNG NHẬP</title>
    </head>
    <body>
     <div id="loginpanelwrap">
  	
	<div class="loginheader">
    <div class="logintitle"><a href="#">Panelo Admin</a></div>
    </div>

         <form method="POST" action="LoginServlet">
    <div class="loginform">
        
        <div class="loginform_row">
        <label>Username:</label>
        <input type="text" class="loginform_input" name="t1" />
        </div>
        <div class="loginform_row">
        <label>Password:</label>
        <input type="password" class="loginform_input" name="t2" />
        </div>
        <div class="loginform_row">
        <input type="submit" class="loginform_submit" value="Login" />
        </div> 
        <div class="clear"></div>
    </div>
 
         </form>
</div>
    </body>
</html>
