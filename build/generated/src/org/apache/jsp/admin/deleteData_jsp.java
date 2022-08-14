package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deleteData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Styles -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"asset/css/styleDelete.css\">\n");
      out.write("    <title>Delete Data | Agen-Z</title>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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

            String id = request.getParameter("id");
        
      out.write("      \n");
      out.write("        <section class=\"main-content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8 col-md-6 offset-sm-2 offset-md-3 mt-3\">\n");
      out.write("                        <div class=\"info-card info-card--danger bg-white text-center mb-4 rounded-lg\">\n");
      out.write("                            <div class=\"info-card_icon mx-auto mb-4 d-flex justify-content-center align-items-center position-relative\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-trash\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <form method=\"get\" action=\"../delete\">\n");
      out.write("                                <h2 class=\"mb-4\"> <b>Do you really want to delete this file ?</b> </h2>\n");
      out.write("\t\t\t\t<div class=\"mb-4\">Once deleted cannot be recovered. Here something is being deleted.</div>\n");
      out.write("                                <div class=\"d-flex\">\n");
      out.write("                                    <input type=\"hidden\" id=\"id\" name=\"id\" value=\"");
      out.print(id);
      out.write("\"/>\n");
      out.write("                                    <a href=\"viewData.jsp\" class=\"btn btn-secondary w-50 mr-1\">Cancel</a>\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-danger w-50 ml-1\" value=\"Delete\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("\t</section>\n");
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
