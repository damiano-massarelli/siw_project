<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="../style.css">

<!-- Per responsiveness 
	width=device-width specifica che la larghezza della pagina deve seguire la larghezza dello schermo del device
	initial-scale=1 setta lo zoom iniziale -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuova Tipologia</title>

<script type="text/javascript">
	var prerequisito = [];
	$(document).ready( function() {
		$("#inserisciTipologia").click( function() {
			var html = $("#riepilogo").html();
			html += "<li>"+$("#pre-name").val()+":"+$("#pre-value").val()+"</li>";
			console.log(html);
			$("#riepilogo").html(html);
		});
	});

</script>

</head>
<body>
	<div class="container">
		<div class="col-sm-6 col-sm-offset-3">
			<form action="aaa" method="get">
			<div class="form-group thumbnail">
				Codice:
				<input type="text" class="form-control" name="codice"></input>
				Nome:
				<input type="text" class="form-control" name="nome"></input>
				Descrizione:
				<textarea class="form-control" rows="5" name="descrizione"></textarea>
				Costo:
				<input type="number" class="form-control" name="costo"></input>
				
				<div class="row">
					<div class="col-sm-4">
						Nome:
						<input type="text" class="form-control" id="pre-name"></input>
					</div>
					<div class="col-sm-4">
						Valore:
						<input type="text" class="form-control" id="pre-value"></input>
					</div>
					<div class="col-sm-4">
						Inserisci:
						<button type="button" class="btn btn-default submit-button" id="inserisciTipologia"><span class="glyphicon glyphicon-chevron-right"></span></button>
					</div>
					
				</div>
				<ul id="riepilogo">
						
				</ul>
				<button type="submit" class="btn btn-primary submit-button ">inserisci</button>
			</div>
			</form>
		</div>
	</div>

</body>
</html>