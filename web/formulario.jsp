<%-- 
    Document   : formulario
    Created on : 24/03/2020, 02:57:41 PM
    Author     : NELSON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HTML5 y CSS Formulario de Contacto</title>
<link href="css/estilos.css" rel="stylesheet">
    </head>
    <body>
     <div class="container">
          <form class="contact_form" action="recibir.jsp" method="POST" id="contact_form" runat="server">
<div>
<ul>
<li>
<h2>Contactos</h2>
<span class="required_notification">* Datos requeridos</span>
</li>
<li>
<label for="name">Nombre:</label>
<input type="text" name="nombre" placeholder="Nelson Amaya Calderon" required />
</li>
<li>
<label for="email">Email:</label>
<input type="email" name="email" placeholder="ejemplo@algo.com" required />
<span class="form_hint">Formato correcto: "nombre@algo.com"</span>
</li>
<li>
<label for="website">Sitio web:</label>
<input type="url" name="website" placeholder="http://loquesea.com" required pattern="(http|https)://.+" />
<span class="form_hint">Formato correcto: "http://algo.com"</span>
</li>
<li>
<label for="message">Mensaje:</label>
<textarea name="message" cols="40" rows="6" required></textarea>
</li>
<li>
<button class="submit" type="submit">Enviar mensaje</button>
</li>
</ul>
</div>
</form>
      </div>
      
    </body>
</html>
