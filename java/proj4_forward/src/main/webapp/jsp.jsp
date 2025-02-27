<%-- jsp주석(자바조차도 번역을 못함 --%>

<!-- 디렉티브 태그 -->
<!-- 자바로 변경되는 class에 대한 정보 -->
<%@
	page
	language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 스크립틀릿 -->
<% // 자바문법만 가능 %>

<% 
for(int i = 1; i<=9; i++){
%>
	<h1>
		<% out.write(""+ i); %>
	</h1>
<%
}
%>

</body>
</html>