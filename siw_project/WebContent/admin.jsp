<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clinica Chescio Rescio</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>




	<div class="container">
					<form action="loginAdmin" method = "post">
					<c:if test="${logError != null}">
							<div class="alert alert-warning fade in">
								<a href="#" class="close" data-dismiss="alert">&times;</a>
								<p>c'è un errore nella password o nell' id</p>
							</div>
						</c:if>
						Id: <input type="text" class="form-control"
							name="id" value="${param['id']}"></input> <-- non mi sembra reale sta cosa -->
						Password: <input type="password"
							name="password" class="form-control"></input>
						<div class="checkbox">
							<label><input type="checkbox" value="ok"
								name="keeploggedin">Rimani Connesso</label>
						</div>
						<button type="submit" class="submit-button btn btn-primary">Log
							in</button>

					</form>
</div>



</body>
</html>