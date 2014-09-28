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
<h:form>
<h:outputFormat value="#{msg['welcome.jsf']}"></h:outputFormat>
<h:outputText value="#{loginBean.username }"></h:outputText>
<h:outputText value=""></h:outputText>

<br/>
<h:panelGrid columns="2">
 
		Language : 
		<h:selectOneMenu value="#{language.localeCode}" onchange="submit()"
			valueChangeListener="#{language.countryLocaleCodeChanged}">
   			<f:selectItems value="#{language.countriesInMap}" /> 
   		</h:selectOneMenu>
 
	</h:panelGrid>
 


<h:commandLink value="logout" action="logout"></h:commandLink>
</h:form>
</f:view>
</body>
</html> 