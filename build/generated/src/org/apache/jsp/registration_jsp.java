package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"asset/css/styles.css\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>  \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("        integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\"\n");
      out.write("        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Poppins:ital,wght@0,200;0,300;0,400;0,500;0,700;0,800;0,900;1,200;1,300;1,400;1,500;1,700;1,800;1,900&display=swap\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Script & Jquery -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\" integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"asset/js/script.js\"></script>\n");
      out.write("    <script src=\"sweetalert2.all.min.js\"></script>\n");
      out.write("    <title>Company Profile | Group 7 | 2SE4</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Start Header -->\n");
      out.write("    <nav>\n");
      out.write("        <ul class=\"menu\">\n");
      out.write("            <li class=\"logo\"><a href=\"#home\"><img src=\"asset/image/AGEN-Z LOGO.png\" alt=\"\" /></a></li>\n");
      out.write("            <li class=\"item\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"company.jsp\">Company</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("            <li class=\"item button first\"><a href=\"login.jsp\">Login</a></li>\n");
      out.write("            <li class=\"item button secondary\"><a href=\"registration.jsp\">Sign Up</a></li>\n");
      out.write("            <li class=\"toggle\"><a href=\"#\"><span class=\"fa fa-bars\"></span></a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <!-- End Header -->\n");
      out.write("    \n");
      out.write("    <input type=\"hidden\" id=\"status\" value=\"");
      out.print( request.getAttribute("status"));
      out.write("\">\n");
      out.write("    \n");
      out.write("     <div class=\"signup-section\">\n");
      out.write("         <div class=\"signup-wrapper\">\n");
      out.write("            <h2>Sign Up</h2>\n");
      out.write("            <form method=\"post\" action=\"signup\">\n");
      out.write("              <div class=\"signup-box\">\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your name\" name=\"name\" id=\"name\" required>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"signup-box\">\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your email\" name=\"email\" id=\"email\" required>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"signup-box\">\n");
      out.write("                <input type=\"number\" placeholder=\"Enter your phone number\" name=\"number\" id=\"number\" required>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"signup-box\">\n");
      out.write("                <input type=\"password\" placeholder=\"Create password\" name=\"password\" id=\"password\" required>\n");
      out.write("              </div>\n");
      out.write("               <div class=\"signup-box\"  onchange=\"return comparePassword()\";>\n");
      out.write("                <input type=\"password\" placeholder=\"Confirm password\" name=\"password2\" id=\"password2\" required>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"signup-box button\">\n");
      out.write("                <input type=\"submit\" value=\"Register Now\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Already have an account? <a href=\"login.jsp\">Login now</a></h3>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("     </div>\n");
      out.write("    <!--Footer-->\n");
      out.write("    <footer>\n");
      out.write("        <h1>AGEN-Z</h1>\n");
      out.write("        <p>&copy; 2022 All Right Reserved</p>\n");
      out.write("    </footer>\n");
      out.write("    <script type=\"text/>javascript\">\n");
      out.write("        var status = document.getElementById(\"status\");\n");
      out.write("        if(status == \"success\"){\n");
      out.write("            Swal.fire({\n");
      out.write("                icon: 'success',\n");
      out.write("                title: 'Your work has been saved',\n");
      out.write("                showConfirmButton: false,\n");
      out.write("                timer: 2000\n");
      out.write("            })\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
