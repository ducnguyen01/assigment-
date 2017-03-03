<%-- 
    Document   : dangky
    Created on : Oct 13, 2016, 3:50:30 PM
    Author     : Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:set var="root" value="${pageContext.request.contextPath}"/>
         <link href="register.css" rel='stylesheet' type='text/css' />
        <title>ĐĂNG KÝ</title>
    </head>
    <body>
        <div id="header">
	<div class="inHeaderLogin"></div>
</div>

<div id="loginForm">
	<div class="headLoginForm">
            <center>Register</center>
	</div>
	<div class="fieldLogin">
            <form action="AccountServlet" method="GET">
            <span style="color:red;">(*)</span>
	<label>Tên Đăng Nhập</label><br>
        <input type="text" class="login" name="user"><br><span style="color:red;">(*)</span>
	<label>Mật Khẩu :</label><br>
	<input type="password" class="login" name="pass"><br><span style="color:red;">(*)</span>
        <label>Vai Trò :</label><br>
        <input type="text" class="login" name="vaitro"><br><span style="color:red;">(*)</span>
        <label>Họ Và Tên :</label><br>
        <input type="text" class="login" name="hoten"><br><span style="color:red;">(*)</span>
         <label>Địa Chỉ :</label><br>
        <input type="text" class="login" name="diachi"><br><span style="color:red;">(*)</span>
         <label>Email :</label><br>
        <input type="text" class="login" name="email"><br><span style="color:red;">(*)</span>
         <label>SĐT :</label><br>
        <input type="text" class="login" name="sdt"><br><span style="color:red;">(*)</span>

             
                  <input type="submit"  value="dk"  name ="dk">
                 
                         
                  </form>
	</div>
</div>
    </body>
</html>
