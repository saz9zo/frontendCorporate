/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2020-03-19 12:40:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.mountblue.DisplayContactData;
import java.util.List;
import org.mountblue.QueryPojo;
import javax.servlet.http.HttpSession;
import com.google.gson.Gson;

public final class displayData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1584621584000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1584621584000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.servlet.http.HttpSession");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.google.gson.Gson");
    _jspx_imports_classes.add("org.mountblue.QueryPojo");
    _jspx_imports_classes.add("org.mountblue.DisplayContactData");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/displaydata.css\">\n");
      out.write("    <title>display</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("     ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/header.css\">\n");
      out.write("    <title></title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("      \n");
      out.write("  <header class = \"header_desktop\">\n");
      out.write("    <img src=\"insure-landing-page-master/images/logo.svg\">\n");
      out.write("    <div id=\"nav\">\n");
      out.write("        <ul id= \"header_nav_list\">\n");
      out.write("            <li ><a href=\"#\" class = \"nav_list\">HOW WE WORK</a></li>\n");
      out.write("            <li ><a href=\"#\" class = \"nav_list\">BLOG</a></li>\n");
      out.write("            <li ><a href=\"#\" class = \"nav_list\">ACCOUNT</a></li>\n");
      out.write("            <li ><a href=\"#\" class = \"view_plans\" id= \"view_plans_header\">VIEW PLANS</a></li>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("        </ul> \n");
      out.write("    </div> \n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<header class=\"header_mobile\">\n");
      out.write("    <img src=\"insure-landing-page-master/images/logo.svg\">\n");
      out.write("    <div id=\"nav_mobile\">\n");
      out.write("        <ul id= \"header_nav_list_mobile\">\n");
      out.write("            <li ><a href=\"#\" class = \"nav_list_mobile\">HOW WE WORK</a></li>\n");
      out.write("            <li ><a href=\"#\" class = \"nav_list_mobile\">BLOG</a></li>\n");
      out.write("            <li ><a href=\"#\" class = \"nav_list_mobile\">ACCOUNT</a></li>\n");
      out.write("            <li ><a href=\"#\" class = \"nav_list_mobile\" >VIEW PLANS</a></li>\n");
      out.write("            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"375\" height=\"218\"><g fill=\"none\" fill-rule=\"evenodd\" stroke=\"#96A9C6\"><path d=\"M309.564 41.343C213.876 11.406 115.487-38.526 14.757 52.675c-100.73 91.202-164.058 171.093-123.163 274.463 40.896 103.37 207.827 38.985 256.33 131.373 48.503 92.388-58.069 176.237-12.123 258.462 45.945 82.225 81.274 134.924 228.927 82.643 147.654-52.282 134.04-185.308 246.324-263.207 112.283-77.898 233.767-194.516 67.05-402.604C511.383-74.283 405.25 71.28 309.563 41.343z\"/><path d=\"M321.902 90.672c-77.983-24.314-158.17-64.869-240.262 9.205C-.454 173.95-52.065 238.837-18.736 322.794c33.33 83.956 169.376 31.663 208.905 106.7 39.529 75.037-47.325 143.14-9.88 209.922C217.732 706.2 246.524 749 366.86 706.538c120.335-42.463 109.24-150.506 200.75-213.775 91.509-63.269 190.516-157.985 54.644-326.993C486.382-3.238 399.885 114.986 321.902 90.672z\"/><path d=\"M344.947 122.546c-63.103-19.824-127.99-52.889-194.418 7.504-66.43 60.393-108.193 113.297-81.223 181.748s137.057 25.816 169.044 86.995c31.986 61.178-38.296 116.703-7.996 171.152 30.3 54.449 53.599 89.346 150.973 54.725 97.374-34.62 88.396-122.71 162.445-174.293 74.048-51.584 154.164-128.808 44.218-266.603C478.043 45.98 408.05 142.37 344.947 122.546z\"/><path d=\"M368.21 162.166c-50.939-15.88-103.316-42.369-156.94 6.012-53.623 48.382-87.336 90.763-65.565 145.6 21.77 54.836 110.636 20.68 136.457 69.691 25.82 49.01-30.913 93.492-6.454 137.111 24.459 43.62 43.266 71.576 121.87 43.841 78.603-27.734 71.355-98.303 131.13-139.628 59.774-41.324 124.445-103.188 35.693-213.576-88.752-110.388-145.252-33.17-196.19-49.05z\"/><path d=\"M373.18 187.232c-41.598-12.997-84.371-34.675-128.162 4.92-43.79 39.594-71.321 74.28-53.543 119.157 17.779 44.877 90.35 16.925 111.435 57.035 21.086 40.11-25.244 76.513-5.27 112.21 19.974 35.698 35.332 58.577 99.522 35.88 64.19-22.699 58.272-80.452 107.085-114.27 48.814-33.82 101.627-84.45 29.149-174.79-72.478-90.34-118.617-27.146-160.216-40.142z\"/><path d=\"M384.992 205.895c-33.778-10.551-68.51-28.15-104.069 3.994-35.558 32.143-57.914 60.3-43.477 96.731 14.436 36.432 73.365 13.74 90.486 46.3 17.122 32.562-20.498 62.114-4.28 91.093 16.22 28.98 28.691 47.552 80.814 29.127 52.123-18.426 47.317-65.31 86.954-92.765 39.637-27.454 82.522-68.555 23.67-141.893-58.853-73.338-96.32-22.037-130.098-32.587z\"/></g></svg>   \n");
      out.write("        </ul> \n");
      out.write("        <button class=\"hamburger-button\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"32\" height=\"32\"><g fill=\"none\" fill-rule=\"evenodd\"><path fill=\"#FFF\" stroke=\"#2C2830\" stroke-width=\"1.5\" d=\"M.75.75h30.5v30.5H.75z\"/><g fill=\"#2C2830\"><path d=\"M8 10h16v1.5H8zM8 15h16v1.5H8zM8 20h16v1.5H8z\"/></g></g></svg></button>    \n");
      out.write("        <button class=\"close\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"32\" height=\"32\"><g fill=\"none\" fill-rule=\"evenodd\"><path fill=\"#FFF\" stroke=\"#2C2830\" stroke-width=\"1.5\" d=\"M.75.75h30.5v30.5H.75z\"/><g fill=\"#2C2830\"><path d=\"M10.873 9.563l11.314 11.314-1.06 1.06L9.813 10.623z\"/><path d=\"M9.813 20.877L21.127 9.563l1.06 1.06-11.314 11.314z\"/></g></g></svg></button>\n");
      out.write("    </div> \n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("     <form action=\"logout\" id=\"logout\" method=\"get\">\n");
      out.write("         <input type=\"submit\" value=\"logout\">\n");
      out.write("     </form>\n");
      out.write("\n");
      out.write("    ");

        response.setHeader ("cache-control","no-cache,no-store,must-revalidate");  //http 1.1
        response.setHeader("Pragma","no-cache");  //http 1.0
        response.setHeader("Expires","0");        //proxies
        if(session.getAttribute("username")== null) {
            response.sendRedirect("adminLogin.jsp");
        }
    
      out.write("\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <table id=\"displaydata\">\n");
      out.write("            <tr>\n");
      out.write("                <th>name</th>\n");
      out.write("                <th>email</th>\n");
      out.write("                <th>phone</th>\n");
      out.write("                <th>query</th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("    <title>footer</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <footer>\n");
      out.write("        <img id=\"footer_image\"  src=\"insure-landing-page-master/images/bg-pattern-footer-desktop.svg\">\n");
      out.write("        <img id=\"footer_image_mobile\" src=\"insure-landing-page-master/images/bg-pattern-footer-mobile.svg\">\n");
      out.write("        <div id =\"social_links\">\n");
      out.write("            <img id= \"footer_logo\" src=\"insure-landing-page-master/images/logo.svg\">\n");
      out.write("\n");
      out.write("                 <div id = \"links\">                                \n");
      out.write("                <a href=\"#\"><svg class=\"social\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"#837D88\" >\n");
      out.write("                    <path d=\"M22.675 0H1.325C.593 0 0 .593 0 1.325v21.351C0 23.407.593 24 1.325 24H12.82v-9.294H9.692v-3.622h3.128V8.413c0-3.1 1.893-4.788 \n");
      out.write("                    4.659-4.788 1.325 0 2.463.099 2.795.143v3.24l-1.918.001c-1.504 0-1.795.715-1.795 1.763v2.313h3.587l-.467\n");
      out.write("                     3.622h-3.12V24h6.116c.73 0  1.323-.593 1.323-1.325V1.325C24 .593 23.407 0 22.675 0z\"/></svg></a>\n");
      out.write("               \n");
      out.write("                     <a href=\"#\"><svg class=\"social\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"20\" fill=\"#837D88\">\n");
      out.write("                    <path  d=\"M24 2.557a9.83 9.83 0 01-2.828.775A4.932 4.932 0 0023.337.608a9.864 9.864 0 \n");
      out.write("                    01-3.127 1.195A4.916 4.916 0 0016.616.248c-3.179 0-5.515 2.966-4.797 6.045A13.978 13.978\n");
      out.write("                     0 011.671 1.149a4.93 4.93 0 001.523 6.574 4.903 4.903 0 01-2.229-.616c-.054 2.281 1.581\n");
      out.write("                      4.415 3.949 4.89a4.935 4.935 0 01-2.224.084 4.928 4.928 0 004.6 3.419A9.9 9.9 0 010\n");
      out.write("                       17.54a13.94 13.94 0 007.548 2.212c9.142 0 14.307-7.721 13.995-14.646A10.025 10.025 \n");
      out.write("                       0 0024 2.557z\"/></svg></a>\n");
      out.write("\n");
      out.write("                <a href=\"#\"><svg class= \"social\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"#837D88\">\n");
      out.write("                    <path  d=\"M12 0C5.373 0 0 5.372 0 12c0 5.084 3.163 9.426 7.627 11.174-.105-.949-.2-2.405.042-3.441.218-.937 \n");
      out.write("                    1.407-5.965 1.407-5.965s-.359-.719-.359-1.782c0-1.668.967-2.914 2.171-2.914 1.023 0 1.518.769 1.518 \n");
      out.write("                    1.69 0 1.029-.655 2.568-.994 3.995-.283 1.194.599 2.169 1.777 2.169 2.133 0 3.772-2.249 3.772-5.495 \n");
      out.write("                    0-2.873-2.064-4.882-5.012-4.882-3.414 0-5.418 2.561-5.418 5.207 0 1.031.397 2.138.893 2.738a.36.36 0\n");
      out.write("                     01.083.345l-.333 1.36c-.053.22-.174.267-.402.161-1.499-.698-2.436-2.889-2.436-4.649 0-3.785 2.75-7.262 \n");
      out.write("                     7.929-7.262 4.163 0 7.398 2.967 7.398 6.931 0 4.136-2.607 7.464-6.227 7.464-1.216 0-2.359-.631-2.75-1.378l-.748\n");
      out.write("                      2.853c-.271 1.043-1.002 2.35-1.492 3.146C9.57 23.812 10.763 24 12 24c6.627 0 12-5.373\n");
      out.write("                       12-12 0-6.628-5.373-12-12-12z\"/></svg></a>\n");
      out.write("               \n");
      out.write("                <a href=\"#\"><svg class=\"social\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\"  fill=\"#837D88\">\n");
      out.write("                    <path d=\"M12 2.163c3.204 0 3.584.012 4.85.07 3.252.148 4.771 1.691 4.919 4.919.058 1.265.069 1.645.069 \n");
      out.write("                    4.849 0 3.205-.012 3.584-.069 4.849-.149 3.225-1.664 4.771-4.919 4.919-1.266.058-1.644.07-4.85.07-3.204\n");
      out.write("                     0-3.584-.012-4.849-.07-3.26-.149-4.771-1.699-4.919-4.92-.058-1.265-.07-1.644-.07-4.849 0-3.204.013-3.583.07-4.849.149-3.227\n");
      out.write("                      1.664-4.771 4.919-4.919 1.266-.057 1.645-.069 4.849-.069zM12 0C8.741 0 8.333.014 7.053.072 2.695.272.273\n");
      out.write("                       2.69.073 7.052.014 8.333 0 8.741 0 12c0 3.259.014 3.668.072 4.948.2 4.358 2.618 6.78 6.98 6.98C8.333 \n");
      out.write("                       23.986 8.741 24 12 24c3.259 0 3.668-.014 4.948-.072 4.354-.2 6.782-2.618\n");
      out.write("                        6.979-6.98.059-1.28.073-1.689.073-4.948 0-3.259-.014-3.667-.072-4.947-.196-4.354-2.617-6.78-6.979-6.98C15.668.014 15.259 0 12 0zm0 \n");
      out.write("                        5.838a6.162 6.162 0 100 12.324 6.162 6.162 0 000-12.324zM12 16a4 4 0 110-8 4 4 0 010 8zm6.406-11.845a1.44\n");
      out.write("                         1.44 0 100 2.881 1.44 1.44 0 000-2.881z\"/></svg></a>\n");
      out.write("                 </div>\n");
      out.write("        </div>\n");
      out.write("           <hr>\n");
      out.write("        <div id=\"useful_footer_links\">\n");
      out.write("           \n");
      out.write("              <div class = \"footer_links_all\">\n");
      out.write("                  <label>OUR COMPANY</label>\n");
      out.write("                  \n");
      out.write("                      <a class=\"footer_links\" href=\"#\">HOW WE WORK</a>\n");
      out.write("                      <a class=\"footer_links\" href=\"#\">WHY INSURE?</a>\n");
      out.write("                      <a class=\"footer_links\" href=\"#\">VIEW PLANS</a>\n");
      out.write("                      <a class=\"footer_links\" href=\"#\">REVIEWS</a>\n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("              <div class= \"footer_links_all\">\n");
      out.write("                <label>HELP ME</label>\n");
      out.write("    \n");
      out.write("                    <a class=\"footer_links\" href=\"#\">FAQ</a>\n");
      out.write("                    <a class=\"footer_links\" href=\"#\">PRIVACY POLICY</a>\n");
      out.write("                    <a class=\"footer_links\" href=\"#\">TERMS OF USE</a>\n");
      out.write("                    <a class=\"footer_links\" href=\"#\">COOKIES</a>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <div class= \"footer_links_all\">\n");
      out.write("                <label>CONTACTS</label>\n");
      out.write("                    <a href=\"contactUs.jsp\" class = \"footer_links\">CONTACT US</a>\n");
      out.write("                    <a class=\"footer_links\" href=\"#\">SALES</a>\n");
      out.write("                    <a class=\"footer_links\" href=\"#\">SUPPORT</a>\n");
      out.write("                    <a class=\"footer_links\" href=\"#\">LIVE CHAT</a>\n");
      out.write("              </div>\n");
      out.write("              <div class= \"footer_links_all\">\n");
      out.write("                <label>OTHERS</label>\n");
      out.write("            \n");
      out.write("                    <a class=\"footer_links\" href=\"#\">CAREERS</a>\n");
      out.write("                    <a class=\"footer_links\" href=\"#\">PRESS</a>\n");
      out.write("                    <a class=\"footer_links\" href=\"#\">LICIENSE</a>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    document.body.onload = function (){\n");
      out.write("       let displaytable = document.getElementById('displaydata');\n");
      out.write("        let xhttp = new XMLHttpRequest();\n");
      out.write("        xhttp.onreadystatechange = function () {\n");
      out.write("        if (this.readyState == 4 && this.status == 200) { \n");
      out.write("           let jsonarray =  JSON.parse(xhttp.responseText);\n");
      out.write("           for(json of jsonarray) {\n");
      out.write("             let row = document.createElement('tr');\n");
      out.write("             let entity1 = document.createElement('td');\n");
      out.write("             let entity2 = document.createElement('td');\n");
      out.write("             let entity3 = document.createElement('td');\n");
      out.write("             let entity4 = document.createElement('td');\n");
      out.write("             entity1.textContent= json.name;\n");
      out.write("             entity2.textContent = json.email;\n");
      out.write("             entity3.textContent = json.phone;\n");
      out.write("             entity4.textContent = json.query;\n");
      out.write("\n");
      out.write("             row.appendChild(entity1);\n");
      out.write("             row.appendChild(entity2);\n");
      out.write("             row.appendChild(entity3);\n");
      out.write("             row.appendChild(entity4);\n");
      out.write("             displaytable.appendChild(row);\n");
      out.write("          }       \n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    xhttp.open(\"GET\",\"displaycontent\",true);\n");
      out.write("    xhttp.send();\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
