<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
	<h1>Add Customer</h1>
	<form action="CustomerController" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="customerName" /></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="customerAddress" /></td>
			</tr>
			<tr>
				<td>Payment Mode :</td>
				<td><select name="paymentMode">
						<option>Cash</option>
						<option>Cheque</option>
						<option>Card</option>
				</select>
			</tr>
			<tr>
			<td colspan="2"><input type="submit" value="SaveCustomer" /></td>
			</tr>
		</table>
	</form>
	
	<br><br>
	<a href = "index.jsp">Home</a>
</body>
</html>