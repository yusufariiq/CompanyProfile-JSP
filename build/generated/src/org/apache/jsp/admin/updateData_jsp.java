package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Connection.connection;

public final class updateData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String user; 

            String id, name, email, phone, department, address;
        
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
      out.write("    <title>Update Data| Agen-Z</title>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li class=\"logo\"><a href=\"#home\"><img src=\"asset/image/AGEN-Z LOGO.png\" alt=\"\" /></a></li>\n");
      out.write("                <li class=\"item button first\"><a href=\"../logout\">Log Out</a></li>\n");
      out.write("                <li class=\"item button secondary\"><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                <li class=\"toggle\"><a href=\"#\"><span class=\"fa fa-bars\"></span></a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            if(session.getAttribute("email") == null) {
                response.sendRedirect("../error/error.jsp");
            }
            else {
                user = session.getAttribute("email").toString();
            }
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            connection obj = new connection();
            obj.openConnection();
            id = request.getParameter("id");
            String sql = "SELECT * FROM registration WHERE id = ?";
            PreparedStatement pr = obj.con.prepareStatement(sql);
            pr.setString(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                    id = rs.getString(1);
                    name = rs.getString(2);
                    email = rs.getString(3);
                    phone = rs.getString(4);
                    department = rs.getString(5);
                    address = rs.getString(6);
            } else {
                out.println("Data Unavailable");
            }
            rs.close();
        
      out.write("\n");
      out.write("        <div class=\"regist-wrapper\">\n");
      out.write("        <div class=\"regist-container\">\n");
      out.write("            <div class=\"title\">Update Data</div>\n");
      out.write("            <form action=\"../update\" method=\"post\">\n");
      out.write("                <div class=\"regist-details\">\n");
      out.write("                    <input type=\"hidden\" id=\"id\" name=\"id\" value=\"");
      out.print(id);
      out.write("\" disabled/>\n");
      out.write("                    <div class=\"regist-box\">\n");
      out.write("                        <span class=\"details\" for=\"name\">Full Name</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter name\" name=\"name\" value=\"");
      out.print(name);
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"regist-box\">\n");
      out.write("                        <span class=\"details\" for=\"email\">Email</span>\n");
      out.write("                        <input type=\"email\" placeholder=\"Enter email\" name=\"email\" value=\"");
      out.print(email);
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"regist-box\">\n");
      out.write("                        <span class=\"details\" for=\"phone\">Phone number</span>\n");
      out.write("                        <input type=\"number\" placeholder=\"Enter phone number\" name=\"phone\" value=\"");
      out.print(phone);
      out.write("\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"regist-box\">\n");
      out.write("                        <span class=\"details\" for=\"department\" >Department</span>\n");
      out.write("                        <select name=\"department\" id=\"department\" name=\"department\">\n");
      out.write("                            <option value=\"");
      out.print(department);
      out.write('"');
      out.write('>');
      out.print(department);
      out.write("</option>\n");
      out.write("                            <option value=\"Production\">Production</option>\n");
      out.write("                            <option value=\"Technology\">Technology</option>\n");
      out.write("                            <option value=\"Creative\">Creative</option>\n");
      out.write("                            <option value=\"Human Resource\">Human Resource</option>\n");
      out.write("                            <option value=\"Marketing\">Marketing</option>\n");
      out.write("                            <option value=\"Finance\">Finance</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"regist-box\">\n");
      out.write("                    <span class=\"details\" for=\"address\">Address</span>\n");
      out.write("                    <textarea placeholder=\"Enter address\" name=\"address\" required>");
      out.print(address);
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"regist-back\">\n");
      out.write("                    <input type=\"submit\" value=\"Submit Data\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"regist-button\">\n");
      out.write("                    <input type=\"submit\" value=\"Submit Data\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
