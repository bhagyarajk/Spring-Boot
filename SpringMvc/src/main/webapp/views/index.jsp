<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome to spring application !!!

<form action="/SpringMvc/studentinfo" method="post">
<label for="studentId">Enter the your id : </label>
<input name="studentId" type="text" id="studentId" >
<label for="studentName">Enter your name : </label>
<input name="studentName" type="text" id="studentName">
<input type="submit">

</form>
</body>
</html>