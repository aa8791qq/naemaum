<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
				<th>empno</th>
				<th>ename</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${ not empty list }">
				<c:forEach var="dto" items="${list}" varStatus="loop">
					<tr>
						<td>${dto.empno}</td>
						<td><a href="detailEmp?empno=${dto.empno}">${dto.ename}</a></td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${ empty list }">
				<tr>
					<td colspan=2>조회 내용이 없습니다</td>
				</tr>
			</c:if>
		</tbody>
	</table>
	<a href="emp1111"><input type="submit" id="insert" value="등록하기"></a>

</body>
</html>