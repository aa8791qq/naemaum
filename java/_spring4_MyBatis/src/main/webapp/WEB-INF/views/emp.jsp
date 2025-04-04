<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="kr.or.human.dto.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록 | Emp관리시스템</title>
</head>
<body>

	<header>
		Logo
		<nav>Emp관리시스템 > 회원 목록</nav>
	</header>
	<main>
		<a href="joinEmp">등록</a><br>
		<form method="get" action="emp">
			<select name="type">
				<option value="ename">ename</option>
				<option value="sal">sal(이상)</option>
				<option value="ej">ename + job</option>
			</select> <input type="text" id="search" name="keyword" value="${dto.ename }">
			<button type="submit">검색</button>
		</form>
		<section>
			<article>
				<form method="get" action="emp">
					<table border="1">
						<thead>
							<tr>
								<th>선택</th>
								<th>empno</th>
								<th>ename</th>
								<th>sal</th>
							</tr>
						</thead>
						<tbody>
							<c:if test="${ not empty list }">
								<c:forEach var="dto" items="${list}" varStatus="loop">
									<tr>
										<td><input type="checkbox" name="empnos"
											value="${dto.empno }"></td>
										<td>${dto.sempno}</td>
										<td><a href="detailEmp?empno=${dto.empno}">${dto.ename}</a></td>
										<td>${dto.sal}</td>
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
				</form>
			</article>
		</section>
		<div>

			<!-- 다 놓침 -->
			<%
			// 모델에 담은건 request에서 꺼낼 수 잇다.
			// ??????
			Map map = (Map)request.getAttribute("map");
			EmpDTO empDTO = (EmpDTO)request.getAttribute("dto");
			System.out.println(map);
			
			int total = (Integer)map.get("count");
			int pageNo = empDTO.getPage();
			int viewCount = empDTO.getViewCount();
			
			double lastPage = Math.ceil((double)total / viewCount);
			int groupCount = 5; // 한번에 보여줄 페이지갯수
			int groupPosition = (int)Math.ceil((double)pageNo / groupCount);
			int begin = ((groupPosition-1) * groupCount) + 1;
			int end = groupPosition * groupCount;
		%>
		
		<c:if test "<%= begin == 1 %>">[이전]</c:if>
		
		&lt; [이전] <a href = "emp?page=<%= begin - 1 %>"></a>

			<c:forEach var="i" begin="<%= begin %>" end="<%= end %>">
				<c:if test="${i == dto.page}">
					<c:set var="calzz" value="bold" />
				</c:if>
				<a href="emp?page=${ i }" class = "${clazz}"> ${ i }</a>
			</c:forEach>
		
		
		<c:if test "<%= end == lastPage %>">[다음]</c:if>
		
		<c:if test "<%= end != lastPage %>">[다음]
		&gt; [다음] <a href = "<%= end - 1 %>"></a>
		</c:if>
		
			<script>
			
		</script>


			<!-- 			<a href = "emp?page=2">2</a> -->
			<!-- 			<a href = "emp?page=3">3</a> -->
		</div>
	</main>
</body>
</html>