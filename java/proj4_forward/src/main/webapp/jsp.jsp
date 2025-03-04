<%-- jsp주석(자바조차도 번역을 못함 --%>

<!-- 디렉티브 태그 -->
<!-- 자바로 변경되는 class에 대한 정보 -->
<%@
	page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"
	import="java.util.List"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!-- page import="java.util.List -->
<!-- page import="java.util.ArrayList -->
<!-- page import="java.util.* -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 스크립틀릿 -->
	<% // 자바문법만 가능 %>

	List list = new ArrayList();
	<% 
Strimg text = request.getAsyncContext().Parameter("text");
out.print(text);

<%= text %>
	<%= request.getParameter("text") %>

	for(int i = 1; i<=9; i++){ %>
	<h1>
		<% out.write(""+ i); %>
		<% out.println(""+ i); %>
	</h1>
	<%
}
%>

	<% int a = 10;
	System.out.println("a : " +a);
%>

	<div>
		<% out.println(a); %>
	</div>
	<div>
		<%= a %>
	</div>
	<div>
		<%= "----------------" %>
	</div>

	<%!
	// 선언문(메소드 밖으로 빠짐, [필드선언, 메소드선언 가능])
	String str = "김다솜 사랑해";
	String getStr(){
		return this.str;
	}
%>
	<!-- <% /* 메소드명 */%> -->
	<!-- 메소드실행 -->
	<%-- <% 메소드명 %> --%>
	<!-- 주석 -->

	<%@
	include file="header.jsp"%>

</body>
</html>