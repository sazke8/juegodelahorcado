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
			
<h:  dataTable value="#{main2.mostrarTop10()}" var="c"
    			styleClass="order-table"
    			headerClass="order-table-header"
    			rowClasses="order-table-odd-row,order-table-even-row"
    		>
					<h:column>
						<f:facet name="header">
    		ID
    			</f:facet>
    				#{user.id}
    		</h:column>

					<h:column>
						<f:facet name="header">
    				Nombre
				</f:facet>
    				#{user.usuario}
    		</h:column>

					<h:column>
						<f:facet name="header">
    				PartidasGuardadas
				</f:facet>
    				#{user.partidasGuardadas}
    		</h:column>

					<h:column>
						<f:facet name="header">
    				PartidasGanadas
				</f:facet>
    				#{user.partidasGanadas}
    		</h:column>

<h:column>
						<f:facet name="header">
    				PartidasPerdidas
				</f:facet>
    				#{user.partidasPerdidas}
    		</h:column>

				
				
				
				</h:dataTable>

				<h:commandButton value="volver" action="regresa"></h:commandButton>
		</h:form>
	</f:view>
</body>
</html>