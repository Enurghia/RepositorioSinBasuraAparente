package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
 String nombre_personaje = "Joshe";
   String Nivel = "69";
   String Exp = "-10";
   String Pokemonedas = "3";

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Perfil</title>\n");
      out.write("        <link href=\"CSS/pagina.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("        <img src=\"https://fontmeme.com/permalink/190125/cdd3d9c68e05fca2e7c519691f72f3cd.png\" alt=\"fuente-pokemon\" border=\"0\">\n");
      out.write("        </div>\n");
      out.write("        <div id=\"personaje\" align=\"left\" style=\"background-color:skyblue; width:25%;\">\n");
      out.write("            <div align=\"center\">\n");
      out.write("            <h2>");
      out.print(nombre_personaje);
      out.write("</h2><br>\n");
      out.write("        <img src=\"Iconos/personaje.png\" width=\"100\" height=\"166\">\n");
      out.write("        <br>\n");
      out.write("        Nivel:");
      out.print(Nivel);
      out.write("<br>\n");
      out.write("        Exp:");
      out.print(Exp);
      out.write("<br>\n");
      out.write("        Pokemonedas:");
      out.print(Pokemonedas);
      out.write("<br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"pokemones\" align=\"center\" style=\"background-color:greenyellow; width:25%;\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <font size=\"6\">Pokemones</font>\n");
      out.write("        <a href=\"pokedex.jsp\"><img src=\"Iconos/pokedex_ico.png\" width=\"60\" height=\"60\"></a>\n");
      out.write("        <br>\n");
      out.write("        <a href=\"squirtle.jsp\"><img src=\"Iconos/Squirtle.jpg\" width=\"60\" height=\"60\" border=\"2px\" id=\"poke1\"></a>\n");
      out.write("        <a href=\"bulbasaur.jsp\"><img src=\"Iconos/Bulbasaur.jpg\" width=\"60\" height=\"60\" border=\"2px\" id=\"poke2\"></a>\n");
      out.write("        <a href=\"charmander.jsp\"><img src=\"Iconos/charmander.jpg\" width=\"60\" height=\"60\" border=\"2px\" id=\"poke3\"></a>\n");
      out.write("        <br>\n");
      out.write("        <font size=\"6\">Medallas</font>\n");
      out.write("        <br>\n");
      out.write("        <img src=\"Iconos/medalla1.png\" width=\"60\" height=\"60\">\n");
      out.write("        <img src=\"Iconos/medalla2.png\" width=\"60\" height=\"60\">\n");
      out.write("        <img src=\"Iconos/medalla3.png\" width=\"60\" height=\"60\">\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        </div>\n");
      out.write("        <div align=\"center\" id=\"opciones\">\n");
      out.write("        <a href=\"salir.jsp\"><img src=\"https://fontmeme.com/permalink/190125/78758a24caa3460432d012965af22750.png\" alt=\"fuente-pokemon\" border=\"0\"></a>\n");
      out.write("        <a href=\"jugar.jsp\"><img src=\"https://fontmeme.com/permalink/190125/b491790f3625bbb0847e75f553cfdca1.png\" alt=\"fuente-pokemon\" border=\"0\"></a>\n");
      out.write("        <a href=\"Bazar.jsp\"><img src=\"https://fontmeme.com/permalink/190125/551bbc07a485011e311e610b2079aca1.png\" alt=\"fuente-pokemon\" border=\"0\"></a>\n");
      out.write("        <a href=\"configuracion.jsp\"><img src=\"https://fontmeme.com/permalink/190125/daf6d4535e123fe2c82fdf5d4b1bfafc.png\" alt=\"fuente-pokemon\" border=\"0\"></a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
