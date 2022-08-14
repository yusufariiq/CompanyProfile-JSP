package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Company Profile | Group 7 | 2SE4</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("        ");

            if(session.getAttribute("email") == null) {
                response.sendRedirect("admin/home.jsp");
            }
            else {
                user = session.getAttribute("email").toString();
            }
                
    
      out.write("\n");
      out.write("    <!-- Start Header -->\n");
      out.write("    <nav>\n");
      out.write("        <ul class=\"menu\">\n");
      out.write("            <li class=\"logo\"><a href=\"#home\"><img src=\"asset/image/AGEN-Z LOGO.png\" alt=\"\" /></a></li>\n");
      out.write("            <li class=\"item\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"company.jsp\">Company</a></li>\n");
      out.write("            <li class=\"item\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("            <li class=\"item button first\"><a href=\"../logout\">Log Out</a></li>\n");
      out.write("            <li class=\"item button secondary\"><a href=\"#\">Dashboard</a></li>\n");
      out.write("            <li class=\"toggle\"><a href=\"#\"><span class=\"fa fa-bars\"></span></a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <!-- End Header -->\n");
      out.write("    \n");
      out.write("    <section class=\"splash-screen\">\n");
      out.write("        <div class=\"preloader\">\n");
      out.write("            <div class=\"loading\">\n");
      out.write("                <div class=\"text\">\n");
      out.write("                    <p class=\"text-1\">AGEN - Z</p>\n");
      out.write("                    <p style=\"font-size: 13px;\">present by Group 7 - 2SE4</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <section class=\"slider\">\n");
      out.write("        <div class=\"slider\">\n");
      out.write("            <div class=\"slides\">\n");
      out.write("\n");
      out.write("                <!--radio buttons start-->\n");
      out.write("                <input type=\"radio\" name=\"radio-btn\" id=\"radio1\">\n");
      out.write("                <input type=\"radio\" name=\"radio-btn\" id=\"radio2\">\n");
      out.write("                <input type=\"radio\" name=\"radio-btn\" id=\"radio3\">\n");
      out.write("                <input type=\"radio\" name=\"radio-btn\" id=\"radio4\">\n");
      out.write("                <!--radio buttons end-->\n");
      out.write("\n");
      out.write("                <div class=\"slide first\">\n");
      out.write("                    <img class=\"img-slider\" src=\"asset/image/picture4.jpg\" alt=\"picture slide 1\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <img class=\"img-slider\" src=\"asset/image/picture2.jpeg\" alt=\"picture slide 2\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <img class=\"img-slider\" src=\"asset/image/picture3.jpg\" alt=\"picture slide 3\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"slide\">\n");
      out.write("                    <img class=\"img-slider\" src=\"asset/image/picture1.jpg\" alt=\"picture slide 4\">\n");
      out.write("                </div>\n");
      out.write("                <!-- Image Slider end -->\n");
      out.write("\n");
      out.write("                <!-- automatic navigation start-->\n");
      out.write("                <div class=\"navigation-auto\">\n");
      out.write("                    <div class=\"auto-btn1\"></div>\n");
      out.write("                    <div class=\"auto-btn2\"></div>\n");
      out.write("                    <div class=\"auto-btn3\"></div>\n");
      out.write("                    <div class=\"auto-btn4\"></div>\n");
      out.write("                </div>\n");
      out.write("                <!-- automatic navigation end-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- manual navigation start-->\n");
      out.write("            <div class=\"navigation-manual\">\n");
      out.write("                <label for=\"radio1\" class=\"manual-btn\"></label>\n");
      out.write("                <label for=\"radio2\" class=\"manual-btn\"></label>\n");
      out.write("                <label for=\"radio3\" class=\"manual-btn\"></label>\n");
      out.write("                <label for=\"radio4\" class=\"manual-btn\"></label>\n");
      out.write("            </div>\n");
      out.write("            <!-- manual navigation end-->\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("     <!--Content-->\n");
      out.write("    <section class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"column-head\">\n");
      out.write("                <h1>LETS WORK TOGETHER</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"column-head\">\n");
      out.write("                <p>SERVICE</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"column\">\n");
      out.write("                <h1>PUBLICATION</h1>\n");
      out.write("                <p>AGEN-Z as a publication media agency to spread information through informative, interactive and playful social media contents.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"column\">\n");
      out.write("                <h1>ADVERTISING</h1>\n");
      out.write("                <p>AGEN-Z functions to be e media dedicated to creating, planning, and handling advertising \n");
      out.write("                    and provides an outside point of  view to the effort of selling the client's product or services or an outside firm.</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!--Partnership-->\n");
      out.write("    <section class=\"partnership\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"column\">\n");
      out.write("                <h1>OUR CLIENTS</h1>\n");
      out.write("                <p>We understand that each brand has its own unique characteristic\n");
      out.write("                that can be developed through various methods and solutions.\n");
      out.write("                AGEN-Z is here to provide a solution.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"flex-column\">\n");
      out.write("                <div class=\"flex-row\">\n");
      out.write("                  <img class=\"box\" src=\"asset/image/dana.png\">\n");
      out.write("                  <img class=\"box\" src=\"asset/image/bobobox.png\">\n");
      out.write("                  <img class=\"box\" src=\"asset/image/Vidio.png\">\n");
      out.write("                  <img class=\"box\" src=\"asset/image/jnt.png\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"flex-row\">\n");
      out.write("                    <img class=\"box\" src=\"asset/image/disney.png\">\n");
      out.write("                    <img class=\"box\" src=\"asset/image/erigo.png\">\n");
      out.write("                    <img class=\"box\" src=\"asset/image/ajaib.png\">\n");
      out.write("                    <img class=\"box\" src=\"asset/image/Traveloka.png\">\n");
      out.write("                  </div>\n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("     <!--Footer-->\n");
      out.write("    <footer>\n");
      out.write("        <h1>AGEN-Z</h1>\n");
      out.write("        <p>&copy; 2022 All Right Reserved</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
