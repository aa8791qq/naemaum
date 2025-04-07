<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<thead>
		<tr>
			<th> empno </th>
			<th> ename </th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.empno }</td>
			<td>${dto.ename }</td>		
		</c:forEach>
		
	 </tbody>
</table>
</body>
</html>