<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="testHttpMessageConverter" method="POST" enctype="multipart/form-data">
		File: <input type="file" name="file"/>
		Desc: <input type="text" name="desc"/>
		<input type="submit" value="Submit"/>
	</form>
	
	<br><br>
	
		<a href="testResponseEntity">Test ResponseEntity</a>
	<br><br>
	<a href="emps">List All Employees</a>
	<br><br>
	
	
</body>
</html>