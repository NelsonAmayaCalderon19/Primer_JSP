package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>HTML5 y CSS Formulario de Contacto</title>\n");
      out.write("<link href=\"css/estilos.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <!-- <form class=\"contact_form\" action=\"#\" id=\"contact_form\" runat=\"server\">\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("<li><h2>Contactos</h2><span class=\"required_notification\">Datos Requeridos</span></li>\n");
      out.write("<li><label for=\"name\">Nombre:</label><input type=\"text\" placeholder=\"Nelson Amaya\" required /></li>\n");
      out.write("<li><label for=\"email\">Email:</label><input type=\"email\" name=\"email\" placeholder=\"nelson@gmail.com\" required/><span class=\"form_hint\">Formato Correcto: \"name@dominio.com\"</span></li>\n");
      out.write("<li><label for=\"website\">Sitio Web:</label><input type=\"url\" name=\"website\" placeholder=\"http://dominio.com\" required=\"\" pattern=\"(http|https)://.+\" />\n");
      out.write("    <span class=\"form_hint\">Formato Correcto: \"http://dominio.com\"</span></li>\n");
      out.write("<li><label for=\"message\">Mensaje:</label><textarea name=\"message\" cols=\"40\" rows=\"6\" required=\"\"></textarea></li>\n");
      out.write("<li> <button class=\"submit\" type=\"submit\">Enviar Mensaje</button></li>\n");
      out.write("</ul>\n");
      out.write("</form>-->\n");
      out.write("      <div class=\"container\">\n");
      out.write("          <form class=\"contact_form\" action=\"recibir.jsp\" method=\"POST\" id=\"contact_form\" runat=\"server\">\n");
      out.write("<div>\n");
      out.write("<ul>\n");
      out.write("<li>\n");
      out.write("<h2>Contactos</h2>\n");
      out.write("<span class=\"required_notification\">* Datos requeridos</span>\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("<label for=\"name\">Nombre:</label>\n");
      out.write("<input type=\"text\" name=\"nombre\" placeholder=\"Nelson Amaya Calderon\" required />\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("<label for=\"email\">Email:</label>\n");
      out.write("<input type=\"email\" name=\"email\" placeholder=\"ejemplo@algo.com\" required />\n");
      out.write("<span class=\"form_hint\">Formato correcto: \"nombre@algo.com\"</span>\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("<label for=\"website\">Sitio web:</label>\n");
      out.write("<input type=\"url\" name=\"website\" placeholder=\"http://loquesea.com\" required pattern=\"(http|https)://.+\" />\n");
      out.write("<span class=\"form_hint\">Formato correcto: \"http://algo.com\"</span>\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("<label for=\"message\">Mensaje:</label>\n");
      out.write("<textarea name=\"message\" cols=\"40\" rows=\"6\" required></textarea>\n");
      out.write("</li>\n");
      out.write("<li>\n");
      out.write("<button class=\"submit\" type=\"submit\">Enviar mensaje</button>\n");
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("      </div>\n");
      out.write("      \n");
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
