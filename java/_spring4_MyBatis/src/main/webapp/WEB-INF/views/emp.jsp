<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록 | emp 관리 시스템</title>
</head>
<body>

	<header>
		Logo
		<nav>emp 관리 > 회원목록</nav>
	</header>

	<main>

		<a herf="insertEmp">등록</a><br>
		<input type = "text" id = "filter" name = "filterC">
		<button type = "button">검색</button>
		<section>
			<article>
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
			</article>
		</section>
		<a href="insertEmp"><input type="submit" id="insert" value="등록하기"></a>
	</main>
</body>
</html>