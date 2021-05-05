package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class API_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            #customer>table,th,td,tr{\n");
      out.write("                border: 1px black solid;\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("            #customer>table{\n");
      out.write("                margin:  0 auto;\n");
      out.write("            }\n");
      out.write("            .button{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            .title{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"title\">\n");
      out.write("            <h1>Customer List In Store</h1>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"customer\">\n");
      out.write("            <div class=\"button\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-lg btn-primary\" onclick=\"loadDoc()\">Load</button>            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        function loadDoc() {\n");
      out.write("            var xhttp = new XMLHttpRequest();\n");
      out.write("            var table = \"<table class='table table-striped'><th class='table-primary'>Name</th><th class='table-primary'>Job Title</th><th class='table-primary'>Birthday</th><th class='table-primary'>Marial Status</th><th class='table-primary'>Gender</th><th class='table-primary'>Hire Date</th>\"\n");
      out.write("            var data;\n");
      out.write("            xhttp.onreadystatechange = function () {\n");
      out.write("                if (this.readyState == 4 && this.status == 200) {\n");
      out.write("                    var customers = this.responseXML;\n");
      out.write("                    var x = customers.getElementsByTagName(\"customer\");\n");
      out.write("                    for (var i = 0; i < x.length; i++) {\n");
      out.write("                        table += \"<tr><td>\";\n");
      out.write("                        table += x[i].getElementsByTagName(\"name\")[0].childNodes[0].nodeValue;\n");
      out.write("                        table += \"</td><td>\"\n");
      out.write("                        table += x[i].getElementsByTagName(\"jobtitle\")[0].childNodes[0].nodeValue;\n");
      out.write("                        table += \"</td><td>\"\n");
      out.write("                        table += x[i].getElementsByTagName(\"birthday\")[0].childNodes[0].nodeValue;\n");
      out.write("                        table += \"</td><td>\"\n");
      out.write("                        if (x[i].getElementsByTagName(\"marialStatus\")[0].childNodes[0].nodeValue == 'S') {\n");
      out.write("                            table += 'Single';\n");
      out.write("                        }\n");
      out.write("                        if (x[i].getElementsByTagName(\"marialStatus\")[0].childNodes[0].nodeValue == 'M') {\n");
      out.write("                            table += 'Married';\n");
      out.write("                        }\n");
      out.write("                        table += \"</td><td>\"\n");
      out.write("                        table += x[i].getElementsByTagName(\"gender\")[0].childNodes[0].nodeValue == 'M' ? 'Male' : 'Female';\n");
      out.write("                        table += \"</td><td>\"\n");
      out.write("                        table += x[i].getElementsByTagName(\"hireDate\")[0].childNodes[0].nodeValue;\n");
      out.write("                        table += \"</td></tr>\"\n");
      out.write("                    }\n");
      out.write("                    table += \"</table>\"\n");
      out.write("                    document.getElementById(\"customer\").innerHTML = table;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            xhttp.open(\"GET\", \"http://localhost:8084/FakeAPIForXML/customers\", true);\n");
      out.write("            xhttp.send();\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
