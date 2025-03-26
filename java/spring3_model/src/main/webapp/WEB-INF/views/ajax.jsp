<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	window.addEventListener('load', function(){
		const btn = document.querySelector('#btn')
		btn.addEventListener('click', function(){
			console.log("함정카드 발동!")
			
			//get
// 			const xhr = new XMLHttpRequest()
// 			xhr.open('get', 'ive/login.do')
// 			xhr.send()
// 			xhr.onload = function(){
// 				console.log(xhr.responseText)
// 			}
			
			//post
			let data = {
					id : "abdcd"
			}
			console.log(data)
			console.log(""+data)
			console.log(JSON.stringify(data))
			
			const xhr = new XMLHttpRequest()
// 			xhr.open('post', 'ajax1') //json 양식
// 			xhr.open('post', 'ajax2') //ajax 글씨
// 			xhr.open('post', 'ajax3') //json 형태의 글씨
			xhr.open('post', 'ajax4') //json 형태의 글씨 배열
			
			xhr.setRequestHeader('Content-Type', 'application/json')
			xhr.send(JSON.stringify(data))
			
			console.log(xhr.responseText)
			xhr.onload = function(){
				console.log(xhr.responseText)
			}
		})
	})
</script>
</head>
<body>
	ajax.jsp<br>
	<button type = "button" id="btn">아잉</button>
</body>
</html>