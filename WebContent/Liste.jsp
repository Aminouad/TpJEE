<%@ page import="model.Etudiant" %>
<%@ page import="dao.Gestiondb" %>
<%@ page import="java.util.ArrayList" %>

<%@ page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <table> 
<tr>
                <td>nom</td>
                <td>prenom</td>
                <td>tel</td>
                <td>action</td>
                </tr>

        <% 
        List<Etudiant>  liste=new ArrayList<Etudiant>();
        liste=(Etudiant)request.getAttribute("list");
        for(Etudiant e:list){
        	%>
    <tr>      
        <td> <%=e.getNom()%></td>  
        <td> <%=e.getPrenom()%></td>
        <td> <%=e.getTel()%></td> 	
        <td> <%=e.getTel()%></td> 	
        <td><a href="Supp?num=<%=e.getNum()%>">supp</a></td>
        <%}%>
       </tr>
                </table>
        
           <form ACTION="Ajout" METHOD="post">
            <label for="numero">numero :</label>
            <input name="numero" id="numero"/>
            <br><br>
            <label for="prenom">prenom :</label>
            <input name="prenom" id="prenom"/>
            <br><br>
            <label for="nom">nom :</label>
            <input name="nom" id="nom"/>
            <br><br>

            <label for="tel">tel :</label>
            <input name="tel" id="tel"/>
            <br><br>
            <button type="submit">ajouter</button>

        </form>
</body>
</html>