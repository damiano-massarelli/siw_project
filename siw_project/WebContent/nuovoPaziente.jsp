<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="style.css">


<title>Nuovo Paziente</title>
</head>
<body>
	<div class="container">
		

		<form action="nuovoPaziente" method="post">
			<div class="form-group thumbnail single-form">
				<c:if test="${success == true}">
					<div class="alert alert-success fade in">
						<a href="#" class="close" data-dismiss="alert">&times;</a>
						<p>Paziente registrato con successo! <span class="glyphicon glyphicon-ok"></span></p>
					</div>
				</c:if>
			
				<h4>Nuovo Paziente</h4>
				<div class = "text-danger">${nomeError} </div>
				Nome: <input type="text" class="form-control" name="nome"
					value="${param['nome']}"></input>
					
				<div class = "text-danger">${cognomeError} </div>
				Cognome: <input type="text"
					class="form-control" name="cognome" value="${param['cognome']}"></input>
					
				<div class = "text-danger">${emailError} </div>
				Email: <input type="email" class="form-control" name="email"
					value="${param['email']}"></input>
					
				<div class = "text-danger">${passwordError} </div>
				Password: <input type="password"
					name="password" class="form-control"></input>
					
				<button type="submit" class="submit-button btn btn-primary">Registra paziente</button>
			</div>
		</form>
	</div>

</body>
</html>