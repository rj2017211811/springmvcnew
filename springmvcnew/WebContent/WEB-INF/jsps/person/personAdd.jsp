<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/person/saveOrUpdate.action" method="post" enctype="multipart/form-data">
		<table>
			<tr><th>id:</th><td><input type="text" name="id"></td></tr>
			<tr><th>name:</th><td><input type="text" name="name"></td></tr>
			<tr><th>photo</th><td><input type="file" name="photoPath"></td></tr>
			<tr><td colspan="2"><input type="submit" name="添加"></td></tr>
		
		</table>
	
	</form>
</body>
</html>