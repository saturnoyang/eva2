<%@ page import="java.sql.*"%>
<%@ page import="entidad.conexion"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
    String userName = request.getParameter("userName");   
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/platinum", "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    String consulta = "SELECT username, password FROM usuario " +
    					"WHERE username='" + userName + "' AND password='" +password + "'";
    conexion.log(consulta);
    rs = st.executeQuery(consulta);
    String mensaje = "Ok";
    String texto = "";
    if (rs.next()) {
        session.setAttribute("userid", userName);
        response.sendRedirect("bienvenido.jsp");
    } else {    
        texto = "Error: Clave incorrecta, <a href='index.jsp'>intentar de nuevo</a>";
        mensaje = "Error";
    }
%>
        <title><% out.println(mensaje);  %></title>
    </head>
    <body>
		<% out.println(texto);  %>
    </body>
</html>