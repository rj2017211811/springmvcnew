<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tbody>
		
			<tr><td>photo</td><td>id</td>
			<td>name</td><td>修改</td><td>删除</td></tr>
		    
			<c:forEach var="person" items="${personList }">
			<tr><td><img alt="" src="${pageContext.request.contextPath }/${person.photoPath }" style="width:30px;height:30px;"> </td>
				<td>${person.id }</td>
			<td>${person.name }</td>
			<td><a href="${pageContext.request.contextPath }/person/toupdate.action?id=${person.id }">修改</a></td>
			<td><a href="${pageContext.request.contextPath }/person/delete.action?id=${person.id }">删除</a></td>		
			</tr>
			</c:forEach>
		</tbody>
	
	</table>
	<a href="${pageContext.request.contextPath }/person/toAdd.action">添加</a>
</body>
</html>