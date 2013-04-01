<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%-- Adicione essa taglib para usar as tags do Struts --%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="Hello">
            <s:textfield name="nomeUsuario" label="Seu nome" />
            <s:submit />
        </s:form>
        
        <s:if test="nomeUsuario != null"> <s:property value="nomeUsuario" /> </s:if>
    </body>
</html>