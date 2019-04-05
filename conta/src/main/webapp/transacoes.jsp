<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "html://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Conta Bancaria</title>
</head>
<body>

	Olá ${conta.titular}!<br>
	Conta: ${conta.id} Saldo: ${conta.saldo}<br>
	
	Qual transacao deseja fazer?
	
	<form action="transacoes">
    <label><input type="radio" name="Saque"> Saque</label>
    <label><input type="radio" name="Deposito"> Deposito</label><br>
     Valor: <input type="text" name="valor"><br>    
	<input type="submit"><br>
	</form>
	
</body>
</html>