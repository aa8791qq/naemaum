<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 	<form method="post" action="upload" enctype="multipart/form-data"> -->
	<form method="post" action="uploads" enctype="multipart/form-data">

		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
<!-- 		첨부파일 : <input type="file" name="file1"><br> -->
		첨부파일 : <input type="file" name="file1" multiple="multiple"><br>
			<input type="submit" value ="등록"><br>
	</form>
</body>
</html>