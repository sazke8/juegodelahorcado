<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
aqui se registran jugadores nuevos
<h:form>
<h:panelGrid columns="3">
<h:outputLabel for="txtNombre" value="Nombre del jugador nuevo:"/>
<h:inputText id="txtNombre" label="Nombre" required="true" value="#{usuario.nombre}"/>
<h:message for="txtNombre"/>


<h:commandButton id="btnEnviar" value="Enviar" action="envio"/>

</h:panelGrid>
</h:form>
<h:form>
<h:commandButton value="volver" action="regresa"></h:commandButton>
</h:form>
</f:view>
</body>
</html>