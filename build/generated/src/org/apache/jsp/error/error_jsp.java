package org.apache.jsp.error;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>404 NOT FOUND</title>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css?family=Ruda:400,700');\n");
      out.write("        #header, #outer-wrapper, #post-wrapper, #sidebar-wrapper, #content-wrapper, #footer-wrapper, #wrapper, .ignielToTop {display:none}\n");
      out.write("        body,html {overflow:hidden; margin:0; padding:0; width:100%; min-height:100vh}\n");
      out.write("        body {background:#f7f7f7; color:#1d1d1d}\n");
      out.write("        #agenz404 {background:#eceeee; text-align:center; margin:auto; font-weight:700; font-size:45px; font-family:'Ruda',sans-serif; position:fixed; width:100%; height:100%; line-height:1.25em; z-index:9999;}\n");
      out.write("        #agenz404 #error-text {position:relative; font-size:40px; color:rgb(6, 6, 6); top:50%; right:50%; transform:translate(50%,-50%);}\n");
      out.write("        #agenz404 #error-text a {color:#1d1d1d; text-decoration:none}\n");
      out.write("        #agenz404 #error-text p {margin:0!important; letter-spacing:.5px;}\n");
      out.write("        #agenz404 #error-text span {color:#000000;font-size:100px;}\n");
      out.write("        #agenz404 #error-text a.back {background:#1d1d1d;color:#f7f7f7;padding:10px 20px;font-size:20px;-webkit-transform:scale(1);-moz-transform:scale(1);transform:scale(1);transition:all 0.5s ease-out;}\n");
      out.write("        #agenz404 #error-text a.back:hover {background:#333;color:#f7f7f7;}\n");
      out.write("        #agenz404 #error-text a.back:active {-webkit-transform:scale(0.9);-moz-transform:scale(0.9);transform:scale(0.9);background:#333;color:#fff;border:double #eceeee;}\n");
      out.write("        \n");
      out.write("        @media only screen and (max-width:640px){\n");
      out.write("          #agenz404 #error-text {font-size:20px;}\n");
      out.write("          #agenz404 #error-text span {font-size:60px;}\n");
      out.write("          #agenz404 #error-text a.back {padding:5px 10px;font-size:15px;}\n");
      out.write("          #agenz404 #error-text a.back:hover, #agenz404 #error-text a.back:active {border:0;}\n");
      out.write("        }\n");
      out.write("      </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div id='agenz404'>\n");
      out.write("    <div id='error-text'>\n");
      out.write("      <span>404</span>\n");
      out.write("      <p>WEBSITE NOT FOUND!</p>\n");
      out.write("      <p><a class='back' href='../login.jsp'>Back To Home </a></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</b:if>\n");
      out.write("</body>\n");
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
