
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="/varzeafc/usuario">
		<div class="form-group">
			<label for="login">Login</label>
			<div class="input-group">
				<span class="input-group-addon"> <i
					class="glyphicon glyphicon-unchecked"></i>
				</span>
			<input name='login' type='text' />

			</div>
		</div>
		<div class="form-group">
			<label for="senha">Senha</label>
			<div class="input-group">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-unchecked"></i></span>
				<input name='senha' type='password' />

			</div>
		</div>
		
		<div class="form-group">
			<div class="input-group">
				<span class="input-group-addon"><i
					class="glyphicon glyphicon-unchecked"></i></span>
				<input type="submit" value="OK"/>

			</div>
		</div>
	</form>
</body>
</html>