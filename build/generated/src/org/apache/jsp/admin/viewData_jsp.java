package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Connection.connection;

public final class viewData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String user; 
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
      out.write("    <title>Team | Agen-Z</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("        ");

            if(session.getAttribute("email") == null) {
                response.sendRedirect("../error/error.jsp");
            }
            else {
                user = session.getAttribute("email").toString();
            }
    
      out.write("\n");
      out.write("    <!-- Start Header -->\n");
      out.write("    <nav>\n");
      out.write("        <ul class=\"menu\">\n");
      out.write("            <li class=\"logo\"><a href=\"#home\"><img src=\"asset/image/AGEN-Z LOGO.png\" alt=\"\" /></a></li>\n");
      out.write("            <li class=\"item button first\"><a href=\"../logout\">Log Out</a></li>\n");
      out.write("            <li class=\"item button secondary\"><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("            <li class=\"toggle\"><a href=\"#\"><span class=\"fa fa-bars\"></span></a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <!-- End Header -->\n");
      out.write("    \n");
      out.write("    ");

        if(request.getParameter("delete") != null) {
            int delete = Integer.parseInt(request.getParameter("delete"));
            if(delete == 1) {
                out.println("<b>Data berhasil dihapus</b>");
            }
            else {
                out.println("<b>Data Gagal dihapus</b>");
            }
        }  
        
        if(request.getParameter("update") != null) {
            int update = Integer.parseInt(request.getParameter("update"));
                if(update == 1) {
                    out.println("<b>Data berhasil diubah</b>");
            }
            else {
                out.println("<b>Data Gagal diubah</b>");
            }
        }    
    
      out.write("\n");
      out.write("    <main class=\"tables\">\n");
      out.write("        <table>\n");
      out.write("            <caption>Data Employee</caption>\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th scope=\"col\">ID</th>\n");
      out.write("                <th scope=\"col\">Name</th>\n");
      out.write("                <th scope=\"col\">Email</th>\n");
      out.write("                <th scope=\"col\">Phone</th>\n");
      out.write("                <th scope=\"col\">Department</th>\n");
      out.write("                <th scope=\"col\">Address</th>\n");
      out.write("                <th scope=\"col\">Action</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    try {
                          String id = "";
                          connection obj = new connection();
                          obj.openConnection();
                          String sql = "SELECT id, name, email, phone, department, address from registration";
                          PreparedStatement pr = obj.con.prepareStatement(sql);
                          ResultSet rs = pr.executeQuery(sql);
                          while (rs.next()) { 
                              id = rs.getString(1);
                              out.println("<tr>");
                              out.println("<td data-label='ID'>" + id + "</td>");
                              out.println("<td data-label='Name'>" + rs.getString(2) + "</td>");
                              out.println("<td data-label='Email'>" + rs.getString(3) + "</td>");
                              out.println("<td data-label='Phone'>" + rs.getString(4) + "</td>");
                              out.println("<td data-label='Department'>" + rs.getString(5) + "</td>");
                              out.println("<td data-label='Address'>" + rs.getString(6) + "</td>");
                              out.println("<td data-label='Action'><a href='detailData.jsp?id="+id+"' class='view' title='View' data-toggle='tooltip'><i class='material-icons'>&#xE417;</i></a>"
                              + "<a href='updateData.jsp?id="+id+"' class='edit' title='Edit' data-toggle='tooltip'><i class='material-icons'>&#xE254;</i></a>"
                              + "<a href='deleteData.jsp?id="+id+"' class='delete' title='Delete' data-toggle='tooltip'><i class='material-icons'>&#xE872;</i></a></td>");
                              out.println("</tr>");
                          }
                        } catch (Exception e) {
                            out.println(e.getMessage());
                        }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("      </div>\n");
      out.write("          \n");
      out.write("    <!--Footer-->\n");
      out.write("    <footer>\n");
      out.write("        <h1>AGEN-Z</h1>\n");
      out.write("        <p>&copy; 2022 All Right Reserved</p>\n");
      out.write("    </footer>\n");
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
