<%-- 
    Document   : Loaisanpham
    Created on : Oct 28, 2016, 3:31:55 PM
    Author     : Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            String error = "";
            if (request.getParameter("error")!=null) {
                    error = (String) request.getParameter("error");
                }
            
            
            %>
            <script>
                        function ac0() {
                            var a0 = 0;
                            document.getElementById("ac").value = a0;

                        }
                        function ac1() {
                            var a1 = 1;
                            document.getElementById("ac").value = a1;
                        }
                        function ac2() {
                            var a2 = 2;
                            document.getElementById("ac").value = a2;
                        }
                        function ac3() {
                            var a3 = 3;
                            document.getElementById("ac").value = a3;
                        }
                      
                    </script>
        <form action="ServletLSP" method="post">
		
	
		<table width="95%">
			
			<tr><td><b>Mã Loại</b></td><td>
                             
                               
                                <input type="type" class="" name="maloai" id="maloai" name="maloai" value="<%=model.ServletLSP.Maloai%>"><input type="submit" value="Tìm" onclick="ac0()"></td>
				
                             
			</td></tr>
                        <tr><td><b>Tên Loại</b></td><td>
                                <input type="text" class="panjang" name="tenloai" value="<%=model.ServletLSP.Tenloai %>"</td></tr>
			
				
			</td></tr>
			
			<tr><td>
                               
                             <td height="40"><input type="submit" value="Thêm" onclick="ac1()" >  <input type="submit" value=" Sửa " onclick="ac2()">  <input type="submit" value=" Xóa " onclick="ac3()"></td>
			</td></tr>
                         <input type="text" value="" style="display: none" id="ac" name="ac"> 
                </table>
                    
                  </form>
    </body>
</html>
