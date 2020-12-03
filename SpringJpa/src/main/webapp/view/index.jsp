<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<form action="getAll"> <input type="submit" value="get All"></form>

 <br>
 ---------------------------------------------------------------
<form action="getOne">
ID<input type= "text" name="sid">
<input type="submit" value="fetch"></form>
<br>
----------------------------------------------------------------
<form action="Update">
ID<input type= "text" name="sid">
Name to be Updated<input type="text" name="sname">
<input type="submit" value="update"></form>
<br>
-----------------------------------------------------------
<form action="delete">
ID<input type= "text" name="sid">
<input type="submit" value="delete"></form>
<br>
----------------------------------------------
<form action="SaveNew">
ID<input type= "text" name="sid">
<input type="text" name="sname">
<input type="submit" value="save"></form>
<br>


</body>
</html>