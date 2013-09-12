<%-- 
    Document   : result
    Created on : Sep 11, 2013, 11:10:58 PM
    Author     : Vinojan
--%>

<%@page import="com.mycompany.nic.Interpreter"%>
<%@page import="com.mycompany.nic.NICInterpreter"%>
<%@page import="com.mycompany.nic.exception.InvalidInterpreterException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Results of the Nic interpretation</title>
    </head>
    <body>
        <h1>Results of the Nic interpretation</h1>
        
        <%
	String nicno = request.getParameter("nicno");
		
	NICInterpreter nicinterpreter = new NICInterpreter();
	
	try {
		 Interpreter interpreter = nicinterpreter.createInterpreter(nicno);
		
                        out.println("Nic [ birthDay="+interpreter.getBirthday()+"\n");
               
                      out.println("\ngender ="+interpreter.getGender());
                      out.println(", isVoter="+interpreter.getIsVoter()+ "]");
	} catch (InvalidInterpreterException ex) {
		out.println(ex.getMessage());
	}	
%>
        
    </body>
</html>
