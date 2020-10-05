<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consultar pessoas</title>
</head>
<body>

	<c:if test="${not empty Pessoas.email}">
		A Pessoa ${Pessoas.email} foi cadastrado com sucesso!
		<br>
		
	</c:if>
	
	<c:if test="${empty Pessoas.email}">
		Pessoa não cadastrada!
				
	</c:if>
    <c:if test="${empty Pessoas.nome}">
		${Pessoas.email}
		${Pessoas.nome}
		${Pessoas.telefone}
		<br>
	</c:if>



</body>
</html>