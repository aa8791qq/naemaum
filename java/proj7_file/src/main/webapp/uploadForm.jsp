<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	파일첨부 : method는 꼭 post여야함
	enctype은 원래 한글 깨짐 방지에 사용하는 속성.
	파일첨부시 enctype = "multipart/form-data"를 써야함
	accept-charset을 이용할 수 있음(한글깨짐방지)
-->
<form method = "post" action="upload.do" enctype = "multipart/form-data">
	제목 : <input type="text" name = "title"><br>
	내용 : <textarea rows="10" cols="50" name = "content"></textarea><br>
	첨푸파일 : <input type = "file" name = file1><br>
	<input type = "submit" value = "등록"><br>
	<br>
	<img src = "http://localhost:7500/proj7_file/download.do?filename=1741155347744_img_20220620090125_5f3e3a1c.png">
</form>
</body>
</html>