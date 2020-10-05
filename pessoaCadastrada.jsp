<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PessoasCastradas</title>
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
		email: ${Pessoas.email}<br>
		nome: ${Pessoas.nome}<br>
		telefone ${Pessoas.telefone}<br>
		<br>
	</c:if>
	
	
	
	
</body>
</html>