package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"asset/css/style.css\">\n");
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
      out.write("    <title>Contact  |  Agen-Z</title>\n");
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
      out.write("            <li class=\"toggle\"><a href=\"#\"><span class=\"fa fa-bars\"></span></a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <!-- End Header -->\n");
      out.write("\n");
      out.write("    <section class=\"wrapper\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"text-title\">\n");
      out.write("                <h1>CONTACT US!</h1>\n");
      out.write("                <p>NEED OR WANNA KNOW MORE ABOUT US ?<p>\n");
      out.write("                <p>OR NEED FURTHER CUSTOMIZATION?</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon\">\n");
      out.write("                <a href=\"#form-area\"><i class=\"fa fa-arrow-circle-down 2\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section id=\"form-area\">\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("            <div class=\"form-content\">\n");
      out.write("              <div class=\"left-side\">\n");
      out.write("                <div class=\"address details\">\n");
      out.write("                  <i class=\"fas fa-map-marker-alt\"></i>\n");
      out.write("                  <div class=\"topic\">Address</div>\n");
      out.write("                  <div class=\"text-one\">Jl. Kyai Haji Zainul Arifin, No. 17, RT.5/RW.7, Krukut, Kec. Taman Sari, Kota Jakarta Barat, DKI Jakarta. 11140</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"phone details\">\n");
      out.write("                  <i class=\"fas fa-phone-alt\"></i>\n");
      out.write("                  <div class=\"topic\">Phone</div>\n");
      out.write("                  <div class=\"text-one\">021-7725-3350</div>\n");
      out.write("                  <div class=\"text-two\">+62 813-8080-5004</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"email details\">\n");
      out.write("                  <i class=\"fas fa-envelope\"></i>\n");
      out.write("                  <div class=\"topic\">Email</div>\n");
      out.write("                  <div class=\"text-one\">marketing@agenz.com</div>\n");
      out.write("                  <div class=\"text-two\">info.agenz@gmail.com</div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"right-side\">\n");
      out.write("                <div class=\"topic-text\">Send us a message</div>\n");
      out.write("                <p>If you have any work from me or any types of queries related to my company, you can send me message from here. It's our pleasure to help you.</p>\n");
      out.write("              <form action=\"contact\" method=\"post\">\n");
      out.write("                <div class=\"form-input-box\">\n");
      out.write("                  <input type=\"text\" id=\"name\" name=\"name\" for=\"name\" placeholder=\"Enter your name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-input-box\">\n");
      out.write("                  <input type=\"text\" id=\"email\" name=\"email\" for=\"email\" placeholder=\"Enter your email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-input-box message-box\">\n");
      out.write("                  <textarea id=\"messages\" name=\"messages\" for=\"messages\" placeholder=\"Enter your message\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-button\">\n");
      out.write("                  <input type=\"submit\" value=\"Send Now\" >\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <footer>\n");
      out.write("        <h1>AGEN-Z</h1>\n");
      out.write("        <p>&copy; 2022 All Right Reserved</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>");
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
