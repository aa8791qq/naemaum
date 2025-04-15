<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.side {
	border: 1px solid red;
	display: inline-block;
	with: 20%
}

.content {
	border: 1px solid red;
	display: inline-block;
	with: 78%;
	vertical-align: top;
}
</style>
</head>
<body>
<%--
	<%@ import
	<jsp:include page=""
 --%>
	<!-- header -->
	<div>
		<!-- 	헤더 -->
		<tiles:insertAttribute name="header" />
	</div>
	<!-- main -->
	<div>
		<!-- side -->
		<div class="side">
			사이드<br>애교
			<tiles:insertAttribute name="side" />
		</div>
		<!-- content -->
		<div class="content">컨텐츠</div>
		<tiles:insertAttribute name="content" />
	</div>
	<!-- footer -->
	<div>푸터</div>
	<tiles:insertAttribute name="footer" />

</body>
</html>