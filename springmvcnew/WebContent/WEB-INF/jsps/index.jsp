<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>resources目录下的图片</h1>
<img alt="" src="${pageContext.request.contextPath }/resources/images/u=843697813,701477499&fm=26&gp=0.jpg" style="width:100px;height:100px;">
<br>
<h1>resources2目录下的图片</h1>
<img alt="" src="${pageContext.request.contextPath }/resources2/images/u=843697813,701477499&fm=26&gp=0.jpg" style="width:100px;height:100px;">	
	<a href="${pageContext.request.contextPath }/person/listAll.action">人员列表</a>
	<a href="${pageContext.request.contextPath }/person/listOtherAll.action">人员列表2</a>

</body>
</html>