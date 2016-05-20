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
					<form action="login">
					
						Indirizzo email: <input type="email" class="form-control"
							name="email" value="${param['email']}"></input>
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