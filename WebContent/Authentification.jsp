<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>GestEtd</title>
  </head>
  <body>
      <h1 style="text-align: center">Gestion des Etds</h1>
  
    <div style="text-align: center;padding: 50px ">
      <form action="Verfication" method="get" style="padding: 50px">
        <label for="nom">nom :</label>
        <input name="nom" id="nom"/>
        <br><br>
        <label for="mp">password :</label>
        <input name="mp" id="mp"/>
        <br><br>
        <button type="submit">Login</button>

      </form>
    </div>
  </body>
</html>