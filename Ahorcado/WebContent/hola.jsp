<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head> 
<body>  
	
	<f:view>
		<h:form>
			<h:panelGrid columns="3">
			<h:outputText value="#{msg.Sesion }"></h:outputText>
				<h:outputText value="#{msg.Usuario}" ></h:outputText>
				<h:inputText required="true" id="user" value="#{loginBean.username }"></h:inputText>
				<h:message  for="pass" showSummary="true" style="color:red" ></h:message>
				<h:outputText value="#{msg.Password}" id="passw"></h:outputText>
				<h:inputSecret required="true"  id="pass" value="#{loginBean.password }"></h:inputSecret>
				<h:message for="user" showSummary="true" style="color:red"></h:message>
				<h:inputHidden>

				</h:inputHidden>
				<h:commandButton value="#{msg.entra }" action="login"></h:commandButton>
			
      <h:panelGrid columns="2">
		<h:outputText value="#{msg.Lengua}"></h:outputText> 
		<h:selectOneMenu value="#{language.localeCode}" onchange="submit()"
			valueChangeListener="#{language.countryLocaleCodeChanged}">
   			<f:selectItems value="#{language.countriesInMap}" /> 
   		</h:selectOneMenu>
   		</h:panelGrid>
 
	</h:panelGrid>
			
			
			
		</h:form>
	</f:view>
</body>
</html>