<%-- 
    Document   : Sanpham
    Created on : Oct 28, 2016, 3:31:17 PM
    Author     : Nguyen
--%>

<%@page import="dao.CategoryDAO"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
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
        <form action="ServletSP" method="get">
           <center>
		<table width="95%" border="0" >
			
			<tr><td><b>Mã Sản Phẩm</b></td><td>
                             
                               
                                <input type="type" class="" name="Ma_sp" id="maloai" name="Ma_sp" value="<%=model.ServletSP.masp%>"><input type="submit" value="Tìm" onclick="ac0()"></td>
				
                             
			</td></tr>
                        <tr><td><b>Tên Sản Phẩm</b></td><td>
                                <input type="text" class="panjang" name="Ten_sp" value="<%=model.ServletSP.tensp%>"</td></tr>
			
			 <tr><td><b>Mô Tả</b></td><td>
                                <input type="text" class="panjang" name="Mo_ta" value="<%=model.ServletSP.mota%>"</td></tr>	
			</td></tr>
			 <tr><td><b>Số Lượng</b></td><td>
                                <input type="text" class="panjang" name="So_luong" value="<%=model.ServletSP.soluong%>"</td></tr>	
			</td></tr>
                         <tr><td><b>Đơn Giá</b></td><td>
                                <input type="text" class="panjang" name="Don_gia" value="<%=model.ServletSP.dongia%>"</td></tr>	
			</td></tr>
                        <tr><td><b>Hình Ảnh</b></td><td>
                                <input type="text" class="panjang" name="Hinh_anh" value="<%=model.ServletSP.hinhanh%>"</td></tr>	
			</td></tr>
                         <tr><td><b>Nhà Sản Xuất</b></td><td>
                                <input type="text" class="panjang" name="Nha_sx" value="<%=model.ServletSP.nhasx%>"</td></tr>	
                          <tr><td><b>Mã Loại</b></td><td>
                                <input type="text" class="panjang" name="Ma_loai" value="<%=model.ServletSP.maloai%>"</td></tr>	
			</td></tr>
			</td></tr>
			<tr><td>
                               
                             <td height="40"><input type="submit" value="Thêm" onclick="ac1()" >  <input type="submit" value=" Sửa " onclick="ac2()">  <input type="submit" value=" Xóa " onclick="ac3()"></td>
			</td></tr>
                         <input type="text" value="" style="display: none" id="ac" name="ac"> 
                </table>
                        </center> 
       </form>
    </body>
</html>
