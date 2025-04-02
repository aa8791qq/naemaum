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
			<tr>
				<th>ename</th>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<th>sal</th>
				<td><input type="text" name="sal""></td>
			</tr>
			<tr>
				<th>comm</th>
				<td><input type="text" name="comm""></td>
			</tr>
			<tr>
				<th>hiredate</th>
				<td><input type="date" name="hiredate"></td>
			</tr>
			<tr>
				<th>deptno</th>
				<td><input type="text" name="deptno"></td>
			</tr>
			<tr>
				<th>job</th>
				<td><input type="text" name="job"></td>
			</tr>
			<tr>
				<th>mgr</th>
				<td><input type="text" name="mgr"></td>
			</tr>
		</table>
		<input type="submit" value = "등록하기">
		
		<script>
// 	const empno = '${dto.empno}'
	document.querySelector("#modify").addEventListener("click", function(event){
 		event.preventDefault();
//		document.querySelector("#form").submit()

 		let param = {
 			empno: empno,
 			ename: ename,
 			...
 		}

 		// ajax
 		const xhr = XMLHttpRequest()
 		xhr.open('put', 'emp')
 		xhr.setReqeustHeader('Content-Type', 'application/json')
 		xhr.send( JSON.stringify(param) )
 		xhr.onload = function(){
 			if(xhr.responseText == '1'){
 				alert('수정 완료')
 				location.href = 'emp'
 			} else {
 				alert('수정 실패')
 			}
 		}
 	})
</script>
</body>
</html>