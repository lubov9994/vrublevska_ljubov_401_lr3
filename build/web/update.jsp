<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel='stylesheet' href='//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css'>
        <link rel='stylesheet' href='//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css'>
        
        <style>
            form{
                padding: 15px 30px;
            }
            input {
                padding: 10px;
            }
        </style>
    </head>
    <body>
        <a href='http://localhost:8080/DistStydyServletDAO/'>Home page</a><br>
        <div class="container">

<%@ page import="javaee.diststudy.dao.TeacherDAO"%>
<%@ page import="javaee.diststudy.entity.Teacher"%>
<%@ page import="java.util.List"%>
   
        <h1>Table updating</h1>
       
        <table class='table-striped' style="text-align: center; width: 75%;">
    <%
            
    javaee.diststudy.dao.TeacherDAO  tdao = new TeacherDAO();
    java.util.List<javaee.diststudy.entity.Teacher> list = tdao.getAll();
        for(Teacher t : list ) {
    %>
         <tr> 
         
                <td>
                    <%=t.getFirstName()%>
                </td>
                <td>
                    <%=t.getSecondName()%>
                </td>
                <td>
                    <%=t.getLastName()%>
                </td>
                <td>
                    <%=t.getDegree()%>
                </td>
                <td>
                    <%=t.getKafedra()%>
                </td>
                <td>
                    <form action="UpdateServlet" method="GET" style="margin: 5px 0;">
                        <input type="submit" class="btn btn-info" value="update">
                        <input type="hidden" name="id_upd" value="<%=t.getId()%>">
                    </form>

                </td>
                <td>
                    <form action="UpdateServlet" method="GET">
                        <input class="btn btn-danger" type="submit" value="delete">
                        <input type="hidden" name="id_del" value="<%=t.getId()%>">
                    </form>
                </td>
                    
         </tr>
        <% } %>
        </table>
    
        </div>
        
    </body>
</html>
