package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"ddimgtooltip.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("    \t<div class=\"header\">\n");
      out.write("            <table width=\"20%\" border=\"0\" cellpadding=\"4\" cellspacing=\"0\" align=\"right float:left;\">\n");
      out.write("                <tbody>\n");
      out.write("                  <tr style=\"color: #FFF; text-align: center;\">\n");
      out.write("                    <td><a href=\"#\">Giới thiệu</a></td>\n");
      out.write("                    <td > | </td>\n");
      out.write("                    <td><a href=\"#\">Liên hệ</a></td>\n");
      out.write("                    <td>|</td>\n");
      out.write("                    <td><a href=\"#\">Liên kết</a></td>\n");
      out.write("                    <td>|</td>\n");
      out.write("                  </tr>\n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("            <div class=\"trang chu\">\n");
      out.write("           <img src=\"images/fpt.png\" width=\"298\" height=\"90\" alt=\"trang chu\\\" /></div>\n");
      out.write("            <strong><div class=\"menu_bottom\">\n");
      out.write("            <table width=\"56%\" border=\"0\" cellspacing=\"4\" cellpadding=\"0\" align:\"right\" style=\"float:right\">\n");
      out.write("              <tr style=\"text-align:center;\">\n");
      out.write("                    <td height=\"30\"><a href=\"index.jsp\">TRANG CHỦ</a></td>\n");
      out.write("                    <td><a href=\"Login.jsp\">QUẢN TRỊ</a></td>\n");
      out.write("                <td><a href=\"Login.jsp\">ĐĂNG NHẬP</a></td>\n");
      out.write("              </tr>\n");
      out.write("            </table>\n");
      out.write("        </div></strong>\n");
      out.write("        </div>\n");
      out.write("       <body style=\"padding:0px; margin:0px; background-color:#fff;font-family:Arial, sans-serif\">\n");
      out.write("\n");
      out.write("    <!-- #region Jssor Slider Begin -->\n");
      out.write("\n");
      out.write("    <!-- Generated by Jssor Slider Maker. -->\n");
      out.write("    <!-- This demo works with jquery library -->\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.9.1.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jssor.slider.mini.js\"></script>\n");
      out.write("    <!-- use jssor.slider.debug.js instead for debug -->\n");
      out.write("    <script>\n");
      out.write("        jQuery(document).ready(function ($) {\n");
      out.write("            \n");
      out.write("            var jssor_1_SlideshowTransitions = [\n");
      out.write("              {$Duration:1200,$Opacity:2}\n");
      out.write("            ];\n");
      out.write("            \n");
      out.write("            var jssor_1_options = {\n");
      out.write("              $AutoPlay: true,\n");
      out.write("              $SlideshowOptions: {\n");
      out.write("                $Class: $JssorSlideshowRunner$,\n");
      out.write("                $Transitions: jssor_1_SlideshowTransitions,\n");
      out.write("                $TransitionsOrder: 1\n");
      out.write("              },\n");
      out.write("              $ArrowNavigatorOptions: {\n");
      out.write("                $Class: $JssorArrowNavigator$\n");
      out.write("              },\n");
      out.write("              $BulletNavigatorOptions: {\n");
      out.write("                $Class: $JssorBulletNavigator$\n");
      out.write("              }\n");
      out.write("            };\n");
      out.write("            \n");
      out.write("            var jssor_1_slider = new $JssorSlider$(\"jssor_1\", jssor_1_options);\n");
      out.write("            \n");
      out.write("            //responsive code begin\n");
      out.write("            //you can remove responsive code if you don't want the slider scales while window resizing\n");
      out.write("            function ScaleSlider() {\n");
      out.write("                var refSize = jssor_1_slider.$Elmt.parentNode.clientWidth;\n");
      out.write("                if (refSize) {\n");
      out.write("                    refSize = Math.min(refSize, 600);\n");
      out.write("                    jssor_1_slider.$ScaleWidth(refSize);\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    window.setTimeout(ScaleSlider, 30);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            ScaleSlider();\n");
      out.write("            $(window).bind(\"load\", ScaleSlider);\n");
      out.write("            $(window).bind(\"resize\", ScaleSlider);\n");
      out.write("            $(window).bind(\"orientationchange\", ScaleSlider);\n");
      out.write("            //responsive code end\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        /* jssor slider bullet navigator skin 05 css */\n");
      out.write("        /*\n");
      out.write("        .jssorb05 div           (normal)\n");
      out.write("        .jssorb05 div:hover     (normal mouseover)\n");
      out.write("        .jssorb05 .av           (active)\n");
      out.write("        .jssorb05 .av:hover     (active mouseover)\n");
      out.write("        .jssorb05 .dn           (mousedown)\n");
      out.write("        */\n");
      out.write("        .jssorb05 {\n");
      out.write("            position: absolute;\n");
      out.write("        }\n");
      out.write("        .jssorb05 div, .jssorb05 div:hover, .jssorb05 .av {\n");
      out.write("            position: absolute;\n");
      out.write("            /* size of bullet elment */\n");
      out.write("            width: 16px;\n");
      out.write("            height: 16px;\n");
      out.write("            background: url('img/b05.png') no-repeat;\n");
      out.write("            overflow: hidden;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .jssorb05 div { background-position: -7px -7px; }\n");
      out.write("        .jssorb05 div:hover, .jssorb05 .av:hover { background-position: -37px -7px; }\n");
      out.write("        .jssorb05 .av { background-position: -67px -7px; }\n");
      out.write("        .jssorb05 .dn, .jssorb05 .dn:hover { background-position: -97px -7px; }\n");
      out.write("\n");
      out.write("        /* jssor slider arrow navigator skin 12 css */\n");
      out.write("        /*\n");
      out.write("        .jssora12l                  (normal)\n");
      out.write("        .jssora12r                  (normal)\n");
      out.write("        .jssora12l:hover            (normal mouseover)\n");
      out.write("        .jssora12r:hover            (normal mouseover)\n");
      out.write("        .jssora12l.jssora12ldn      (mousedown)\n");
      out.write("        .jssora12r.jssora12rdn      (mousedown)\n");
      out.write("        */\n");
      out.write("        .jssora12l, .jssora12r {\n");
      out.write("            display: block;\n");
      out.write("            position: absolute;\n");
      out.write("            /* size of arrow element */\n");
      out.write("            width: 30px;\n");
      out.write("            height: 46px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            background: url('img/a12.png') no-repeat;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("        .jssora12l { background-position: -16px -37px; }\n");
      out.write("        .jssora12r { background-position: -75px -37px; }\n");
      out.write("        .jssora12l:hover { background-position: -136px -37px; }\n");
      out.write("        .jssora12r:hover { background-position: -195px -37px; }\n");
      out.write("        .jssora12l.jssora12ldn { background-position: -256px -37px; }\n");
      out.write("        .jssora12r.jssora12rdn { background-position: -315px -37px; }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"jssor_1\" style=\"position: relative; margin: 0 auto; top: 0px; left: 0px; width: 600px; height: 300px; overflow: hidden; visibility: hidden;\">\n");
      out.write("        <!-- Loading Screen -->\n");
      out.write("        <div data-u=\"loading\" style=\"position: absolute; top: 0px; left: 0px;\">\n");
      out.write("            <div style=\"filter: alpha(opacity=70); opacity: 0.7; position: absolute; display: block; top: 0px; left: 0px; width: 100%; height: 100%;\"></div>\n");
      out.write("            <div style=\"position:absolute;display:block;background:url('img/loading.gif') no-repeat center center;top:0px;left:0px;width:100%;height:100%;\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div data-u=\"slides\" style=\"cursor: default; position: relative; top: 0px; left: 0px; width: 600px; height: 300px; overflow: hidden;\">\n");
      out.write("            <div data-p=\"112.50\" style=\"display: none;\">\n");
      out.write("                <img data-u=\"image\" src=\"images/slider1.jpg\" />\n");
      out.write("            </div>\n");
      out.write("            <div data-p=\"112.50\" style=\"display: none;\">\n");
      out.write("                <img data-u=\"image\" src=\"images/slider2.jpg\" />\n");
      out.write("            </div>\n");
      out.write("            <div data-p=\"112.50\" style=\"display: none;\">\n");
      out.write("                <img data-u=\"image\" src=\"images/siler3.jpg\" />\n");
      out.write("            </div>\n");
      out.write("            <div data-p=\"112.50\" style=\"display: none;\">\n");
      out.write("                <img data-u=\"image\" src=\"images/slider4.jpg\" />\n");
      out.write("            </div>\n");
      out.write("            <a data-u=\"ad\" href=\"http://www.jssor.com\" style=\"display:none\">jQuery Slider</a>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <!-- Bullet Navigator -->\n");
      out.write("        <div data-u=\"navigator\" class=\"jssorb05\" style=\"bottom:16px;right:16px;\" data-autocenter=\"1\">\n");
      out.write("            <!-- bullet navigator item prototype -->\n");
      out.write("            <div data-u=\"prototype\" style=\"width:16px;height:16px;\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Arrow Navigator -->\n");
      out.write("        <span data-u=\"arrowleft\" class=\"jssora12l\" style=\"top:0px;left:0px;width:30px;height:46px;\" data-autocenter=\"2\"></span>\n");
      out.write("        <span data-u=\"arrowright\" class=\"jssora12r\" style=\"top:0px;right:0px;width:30px;height:46px;\" data-autocenter=\"2\"></span>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("        \t<div class=\"content_top\">\n");
      out.write("            <div class=\"content_top1\"><table width=\"320\" height=\"39\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("              <tr>\n");
      out.write("                  <td width=\"59\"><img src=\"images/icon dd.gif\" width=\"54\" height=\"40\" alt=\"icon dd\" /></td> \n");
      out.write("                  <td width=\"379\"><a href=\"#\"><strong>MOTOROLA</strong></a></td>\n");
      out.write("              </tr>\n");
      out.write("              </table>\n");
      out.write("              <h3><strong>Motorola</strong></h3>\n");
      out.write("              <a href=\"#\" target=\"_blank\" \"><img src=\"images/motorola.jpg\" width=\"321\" height=\"90\" /></a></p>\n");
      out.write("              <p>......... </p>\n");
      out.write("              <table width=\"50\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\n");
      out.write("                <tr>\n");
      out.write("                  <td><b>xem chi tiết</b></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content_top2\">\n");
      out.write("            <table width=\"320\" height=\"39\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("              <tr>\n");
      out.write("                  <td width=\"59\"><img src=\"images/icon banphim.gif\" width=\"54\" height=\"40\" alt=\"maytinh\" /></td> \n");
      out.write("                  <td width=\"379\"><a href=\"#\"><strong>Iphone 7</strong></a></td>\n");
      out.write("              </tr>\n");
      out.write("              </table>\n");
      out.write("              <h3><strong>Điện thoại IPHONE 7 16GB</strong></h3>\n");
      out.write("             <a href=\"#\" target=\"_blank\" \"><img src=\"images/iphone6.jpg\" width=\"321\" height=\"90\" /></a></p>\n");
      out.write("              <p>iPhone 7 là một phiên bản iPhone màn hình lớn, nhưng nó không chỉ đơn thuần là lớn\n");
      out.write("                  hơn về kích thước mà còn tốt hơn về mọi mặt.  </p>\n");
      out.write("              <table width=\"50\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\n");
      out.write("                <tr>\n");
      out.write("                  <td><b>xem chi tiết</b></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("        \t<div class=\"content_top2\">\n");
      out.write("              <table width=\"320\" height=\"39\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("              <tr>\n");
      out.write("                  <td width=\"59\"><img src=\"images/icon maytinh.gif\" width=\"54\" height=\"40\" alt=\"game\" /></td> \n");
      out.write("                  <td width=\"379\"><a href=\"#\"><strong>NOKIA</strong></a></td>\n");
      out.write("              </tr>\n");
      out.write("              </table>\n");
      out.write("              <h3><strong>Nokia 1280</strong></h3>\n");
      out.write("             <a href=\"#\" target=\"_blank\" \"><img src=\"images/Nokia 1280.jpg\" width=\"321\" height=\"90\" /></a></p>\n");
      out.write("              <p>Công suất 40Watts, Loa Subwoofer Down-firing âm trầm đánh thẳng xuống phía dưới.\n");
      out.write("              Có nút điều chỉnh âm lượng, bass, Loa vệ tinh sử dụng công nghệ FDD.\n");
      out.write("              Hỗ trợ 1 đường vào tín hiếu RCA và 2 đường vào là jack 3,5\"</p>\n");
      out.write("              <table width=\"50\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\n");
      out.write("                <tr>\n");
      out.write("                  <td><b>xem chi tiết</b></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"content_top1\"><table width=\"320\" height=\"39\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("              <tr>\n");
      out.write("                  <td width=\"59\"><img src=\"images/icon dd.gif\" width=\"54\" height=\"40\" alt=\"icon dd\" /></td> \n");
      out.write("                  <td width=\"379\"><a href=\"#\"><strong>Google phone</strong></a></td>\n");
      out.write("              </tr>\n");
      out.write("              </table>\n");
      out.write("              <h3><strong>Google phone</strong></h3>\n");
      out.write("              <a href=\"\" target=\"_blank\" \"><img src=\"images/Google phone.jpg\" width=\"321\" height=\"90\" /></a></p>\n");
      out.write("              <p> Sở hữu cấu hình mạnh mẽ hàng đầu hiện nay, \n");
      out.write("                  với bộ vi xử lý Snapdragon 821 mới nhất của Qualcomm,\n");
      out.write("                  4GB bộ nhớ RAM, cùng với nền tảng Android 7.1 mới nhất với giao diện do Google phát triển, \n");
      out.write("                  không quá ngạc nhiên khi bộ đôi Pixel hoạt động cực kỳ mượt mà.</p>\n");
      out.write("              <table width=\"50\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\n");
      out.write("                <tr>\n");
      out.write("                  <td><b>xem chi tiết</b></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"content_top2\"><table width=\"320\" height=\"39\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("              <tr>\n");
      out.write("                  <td width=\"59\"><img src=\"images/icon dd.gif\" width=\"54\" height=\"40\" alt=\"icon dd\" /></td> \n");
      out.write("                  <td width=\"379\"><a href=\"#\"><strong>Samsung</strong></a></td>\n");
      out.write("              </tr>\n");
      out.write("              </table>\n");
      out.write("              <h3><strong>Samsung S7 Edge</strong></h3>\n");
      out.write("              <a href=\"\" target=\"_blank\" \"><img src=\"images/Samsung S7 Edge.jpg\" width=\"321\" height=\"90\" /></a></p>\n");
      out.write("              <p> Samsung Galaxy S7e là một lựa chọn Android rất tuyệt, nhất là khi giá của nó thấp hơn đáng kể so với Samsung \n");
      out.write("                  Galaxy S6e của năm ngoái trong khi hoàn thiện hơn và nhiều tính năng hơn. Rõ ràng, Galaxy S7e cùng hệ cộng sinh \n");
      out.write("                  Gear, cùng các dịch vụ hữu ích như Galaxy Gift sẽ rất thành công.</p>\n");
      out.write("              <table width=\"50\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\n");
      out.write("                <tr>\n");
      out.write("                  <td><b>xem chi tiết</b></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"content_top2\"><table width=\"320\" height=\"39\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("              <tr>\n");
      out.write("                  <td width=\"59\"><img src=\"images/icon dd.gif\" width=\"54\" height=\"40\" alt=\"icon dd\" /></td> \n");
      out.write("                  <td width=\"379\"><a href=\"#\"><strong>HTC</strong></a></td>\n");
      out.write("              </tr>\n");
      out.write("              </table>\n");
      out.write("              <h3><strong>HTC</strong></h3>\n");
      out.write("              <a href=\"\" target=\"_blank\" \"><img src=\"images/HTC.jpg\" width=\"321\" height=\"90\" /></a></p>\n");
      out.write("              <p> Sở hữu cấu hình mạnh mẽ hàng đầu hiện nay, \n");
      out.write("                  với bộ vi xử lý Snapdragon 821 mới nhất của Qualcomm,\n");
      out.write("                  4GB bộ nhớ RAM, cùng với nền tảng Android 7.1 mới nhất với giao diện do Google phát triển, \n");
      out.write("                  không quá ngạc nhiên khi bộ đôi Pixel hoạt động cực kỳ mượt mà.</p>\n");
      out.write("              <table width=\"50\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\n");
      out.write("                <tr>\n");
      out.write("                  <td><b>xem chi tiết</b></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"content_top1\"><table width=\"320\" height=\"39\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("              <tr>\n");
      out.write("                  <td width=\"59\"><img src=\"images/icon dd.gif\" width=\"54\" height=\"40\" alt=\"icon dd\" /></td> \n");
      out.write("                  <td width=\"379\"><a href=\"#\"><strong>SONY</strong></a></td>\n");
      out.write("              </tr>\n");
      out.write("              </table>\n");
      out.write("              <h3><strong>Sony Z5</strong></h3>\n");
      out.write("              <a href=\"\" target=\"_blank\" \"><img src=\"images/Sony Z5.png\" width=\"321\" height=\"90\" /></a></p>\n");
      out.write("              <p> Sở hữu cấu hình mạnh mẽ hàng đầu hiện nay, với bộ vi xử lý Snapdragon 821 mới nhất của Qualcomm\n");
      out.write("                  , 4GB bộ nhớ RAM, cùng với nền tảng Android 7.1 mới nhất với giao diện do Google phát triển, không quá \n");
      out.write("                  ngạc nhiên khi bộ đôi Pixel hoạt động cực kỳ mượt mà, ngay cả với những tác vụ đòi hỏi cấu hình mạnh. .</p>\n");
      out.write("              <table width=\"50\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\n");
      out.write("                <tr>\n");
      out.write("                  <td><b>xem chi tiết</b></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"content_top2\"><table width=\"320\" height=\"39\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("              <tr>\n");
      out.write("                  <td width=\"59\"><img src=\"images/icon dd.gif\" width=\"54\" height=\"40\" alt=\"icon dd\" /></td> \n");
      out.write("                  <td width=\"379\"><a href=\"#\"><strong>NOKIA</strong></a></td>\n");
      out.write("              </tr>\n");
      out.write("              </table>\n");
      out.write("              <h3><strong>Nokia 8730</strong></h3>\n");
      out.write("              <a href=\"\" target=\"_blank\" \"><img src=\"images/Nokia.jpg\" width=\"321\" height=\"90\" /></a></p>\n");
      out.write("              <p> Sở hữu cấu hình mạnh mẽ hàng đầu hiện nay, với bộ vi xử lý Snapdragon\n");
      out.write("                  821 mới n động cực kỳ mượt mà, ngay cả với những tác vụ đòi hỏi cấu hình mạnh.\n");
      out.write("                  Theo biên tập viên của trang công nghệ TheVerge.</p>\n");
      out.write("              <table width=\"50\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\n");
      out.write("                <tr>\n");
      out.write("                  <td><b>xem chi tiết</b></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"content_top2\"><table width=\"320\" height=\"39\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("              <tr>\n");
      out.write("                  <td width=\"59\"><img src=\"images/icon dd.gif\" width=\"54\" height=\"40\" alt=\"icon dd\" /></td> \n");
      out.write("                  <td width=\"379\"><a href=\"#\"><strong>ZenPhone</strong></a></td>\n");
      out.write("              </tr>\n");
      out.write("              </table>\n");
      out.write("              <h3><strong>Zenphone3</strong></h3>\n");
      out.write("              <a href=\"\" target=\"_blank\" \"><img src=\"images/Zenphone 3.jpg\" width=\"321\" height=\"90\" /></a></p>\n");
      out.write("              <p> Sở hữu cấu hình mạnh mẽ hàng đầu hiện nay, với bộ vi xử lý Snapdragon 821 mới nhất của Qualcomm,\n");
      out.write("                  4GB bộ nhớ RAM, cùng với nền tảng Android 7.1 mới nhất với giao diện do Google phát triển,\n");
      out.write("                  không quá ngạc nhiên khi bộ đôi Pixel hoạt động cực kỳ mượt mà.</p>\n");
      out.write("              <table width=\"50\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\n");
      out.write("                <tr>\n");
      out.write("                  <td><b>xem chi tiết</b></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"content_top1\"><table width=\"320\" height=\"39\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("              <tr>\n");
      out.write("                  <td width=\"59\"><img src=\"images/icon dd.gif\" width=\"54\" height=\"40\" alt=\"icon dd\" /></td> \n");
      out.write("                  <td width=\"379\"><a href=\"#\"><strong>IPhone</strong></a></td>\n");
      out.write("              </tr>\n");
      out.write("              </table>\n");
      out.write("              <h3><strong>Iphone 3</strong></h3>\n");
      out.write("              <a href=\"\" target=\"_blank\" \"><img src=\"images/iphone 3.jpg\" width=\"321\" height=\"90\" /></a></p>\n");
      out.write("              <p> Sở hữu cấu hình mạnh mẽ hàng đầu hiện nay, với bộ vi xử lý Snapdragon 821\n");
      out.write("                  mới nhất của Qualcomm, 4GB bộ nhớ RAM, cùng với nền tảng Android 7.1 mới nhất với giao diện\n");
      out.write("                  do Google phát triển, không quá ngạc nhiên khi bộ đôi Pixel hoạt động cực kỳ mượt mà,.</p>\n");
      out.write("              <table width=\"50\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\n");
      out.write("                <tr>\n");
      out.write("                  <td><b>xem chi tiết</b></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("          <div class=\"content_bottom\">\n");
      out.write("           \t<div class=\"content_bottom_left\">\n");
      out.write("              <table width=\"300\" height=\"70\" border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                  <tr>\n");
      out.write("                    <td width=\"43\"><img src=\"images/chat.png\" width=\"40\" height=\"36\" alt=\"ho tro truc tuyen\" /></td>\n");
      out.write("                    <td width=\"257\">HỖ TRỢ TRỰC TUYẾN</td>\n");
      out.write("                  </tr>\n");
      out.write("            \t  <tr>\n");
      out.write("            \t    <td>&nbsp;</td>\n");
      out.write("            \t    <td colspan=\"4\" class=\"ht-name\">Bộ phận kinh doanh</td>\n");
      out.write("          \t    </tr>\n");
      out.write("          \t  </table>\n");
      out.write("              <table width=\"300px\" style=\"float:left\">\n");
      out.write("              <tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"280px\" style=\"font-size:12px\" ><blockquote>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <p>Nguyễn Văn Ba</p>\n");
      out.write("\t\t\t\t\t\t\t\t    </blockquote></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/yahoo.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/sky.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/dienthoai.png\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"280px\" style=\"font-size:12px\"><blockquote>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <p>Nguyễn Vũ Thùy Chi</p>\n");
      out.write("\t\t\t\t\t\t\t\t    </blockquote></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/yahoo.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/sky.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/dienthoai.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"280px\" style=\"font-size:12px\"><blockquote>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <p>Hoàng Hoa Anh Đức</p>\n");
      out.write("\t\t\t\t\t\t\t\t    </blockquote></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/yahoo.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/sky.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/dienthoai.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("              </table>\n");
      out.write("              <table width=\"300px\" style=\"float:left\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("                                    <td width=\"31\">&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"257\" colspan=\"4\" class=\"ht-name\">Bộ Phận chăm sóc khách hàng</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("              </table>\n");
      out.write("\t\t\t  <table width=\"300px\" style=\"float:left\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"203\" style=\"font-size:12px\"><blockquote>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <p><span>Nguyễn Hữu Thái Hóa</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t    </blockquote></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"24\" class=\"icon\"><img src=\"images/yahoo.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"26\" class=\"icon\"><img src=\"images/sky.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"27\" class=\"icon\"><img src=\"images/dienthoai.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"font-size:12px\"><blockquote>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <p><span>Trần Mạnh Anh Đức</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t    </blockquote></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/yahoo.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/sky.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/dienthoai.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"font-size:12px\"><blockquote>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <p><span>Nguyễn Thị Hoa Mai</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t    </blockquote></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/yahoo.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/sky.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"icon\"><img src=\"images/dienthoai.png\" /></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t  </table>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("              <div class=\"content_bottom_right\">\n");
      out.write("              <img src=\"images/5s.jpg\" width=\"700\" height=\"150\"/>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"new-text-title\">\n");
      out.write("                                                            <img src=\"images/oppo f1s.jpg\" width=\"100\" height=\"100\"/>GIỚI THIỆU SẢN PHẨM MỚI\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"new-ct\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"new-ct-ct\">\n");
      out.write("\t\t\t\t\t\t\t\t  <p>Cảm ứng 3D Touch\n");
      out.write(" \n");
      out.write("Chiếc iPhone đầu tiên đã giới thiệu với thế giới về công nghệ cảm ứng đa điểm Multi-Touch. Cảm ứng đa điểm tạo ra cuộc cách mạng về các thiết bị màn hình cảm ứng. Tuy nhiên, iPhone 6s lại đánh dấu một kỷ nguyên mới khi là chiếc smartphone đầu tiên sở hữu công nghệ 3D Touch. 3D Touch cho phép bạn làm những điều mà bạn chưa bao giờ làm được trước đây. Ngoài việc phản hồi khi bạn chạm vào màn hình, nó còn cảm nhận được lực nhấn của bạn, cho phép bạn làm mọi việc một cách nhanh chóng, đơn giản và chuyên nghiệp hơn. Tùy vào thao tác chạm hay nhấn, 3D Touch trên iPhone 6s sẽ cung cấp cho bạn các phản hồi khác nhau dựa vào các cơ chế hoàn toàn mới. </p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"new-ct\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"new-ct-ct\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Camera 12MP, quay phim 4K, Live Photos\n");
      out.write(" \n");
      out.write("Camera của mọi thế hệ iPhone đều được người dùng rất yêu thích, và giờ đây trên iPhone 6s, camera còn có những nâng cấp đầy mạnh mẽ. Với việc độ phân giải được nâng lên 12MP, camera iPhone 6s cho khả năng chụp ảnh rất chuyên nghiệp, sắc nét, hình ảnh chi tiết. Không chỉ chụp ảnh xuất sắc, giờ đây iPhone 6s còn có thể quay được video 4K, gấp 4 lần độ phân giải của video Full HD 1080p trước đây. Cả chụp ảnh và quay phim đều tuyệt vời, bạn sẽ làm được rất nhiều điều trên camera iPhone 6s.</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">(C)2013, Trang web phục vụ việc thực hành của sinh viên FPT Polytechnic<br />Nghiêm cấm sử dụng với mục đích kinh doanh\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("<script type=\"text/javascript\" src=\"ddimgtooltip.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
