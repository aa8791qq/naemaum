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
	<form method="get" action="detailEmp">
		<table border="1">
			<tr>
				<th>empno</th>
				<td><input type="text" name="empno" value="${dto.empno}"></td>
			</tr>
			<tr>
				<th>ename</th>
				<td><input type="text" name="ename" value="${dto.ename}"></td>
			</tr>
			<tr>
				<th>sal</th>
				<td><input type="text" name="sal" value="${dto.sal}"></td>
			</tr>
			<tr>
				<th>comm</th>
				<td><input type="text" name="comm" value="${dto.comm}"></td>
			</tr>
			<tr>
				<th>hiredate</th>
				<td><input type="date" name="hiredate" value="${dto.hiredate}"></td>
			</tr>
			<tr>
				<th>deptno</th>
				<td><input type="text" name="deptno" value="${dto.deptno}"></td>
			</tr>
			<tr>
				<th>job</th>
				<td><input type="text" name="job" value="${dto.job}"></td>
			</tr>
			<tr>
				<th>mgr</th>
				<td><input type="text" name="mgr" value="${dto.mgr}"></td>
			</tr>
		</table>
		<button type="submit" id="insert">등록하기</button>
	</form>
</body>
</html>