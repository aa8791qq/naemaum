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
	//form
	<table border="1">
		<tr>
			<th>ename</th>
			<td><input type="text" id="ename"></td>
		</tr>
		<tr>
			<th>sal</th>
			<td><input type="text" id="sal"></td>
		</tr>
		<tr>
			<th>comm</th>
			<td><input type="text" id="comm"></td>
		</tr>
		<tr>
			<th>hiredate</th>
			<td><input type="date" id="hiredate"></td>
		</tr>
		<tr>
			<th>deptno</th>
			<td><input type="text" id="deptno"></td>
		</tr>
		<tr>
			<th>job</th>
			<td><input type="text" id="job"></td>
		</tr>
		<tr>
			<th>mgr</th>
			<td><input type="text" id="mgr"></td>
		</tr>
	</table>
	// form
	<input type="submit" id="join" value="등록하기"> //a태그

	<script>
// 	const empno = '${dto.empno}'
	document.querySelector("#join").addEventListener("click", function(event){
 		event.preventDefault(); // 원래기능 삭제

 		let param = {
 			ename: document.querySelector("#ename").value,
 			sal : document.querySelector("#sal").value,
 			comm : document.querySelector("#comm").value,
 			hiredate : document.querySelector("#hiredate").value,
 			mgr : document.querySelector("#mgr").value
 		}
 		
 		if(param.ename.trim().length == 0){
 			alert('이름은 필수입니다.')
 		} else if(param.mgr.trim().length == 0){
 			alert('상사(mgr)는 필수입니다.')
 		} else if(isNaN(param.sal)){
 			alert('숫자만 적어주세요.')
 		}

		// fetch
 		fetch('insertEmp', {
 			method : 'POST', headers : {
 				'Content-Type' : 'application/json'
 			},
 			body : JSON.stringify(param)
 		}).then(function(resp){
 			return resp.json()
 		}).then((data)=>{
 			console.log(data)
 			//if
 		}).catch((err)=>{
 			console.error('error : ', err)
 		})
	})
 		
 		//promise 강의( 다 놓침 )
 		//promise는 resolve()또는 reject()가 실행될때 까지 기달려준다.
//  		function test(){
//  			return new promise ( function (resolve, reject) {
//  	 			setTimeout( functiom(){
//  	 				if(a == 10){
//  	 					a = 20
//  	 					resolve()	
//  	 				} else{
//  	 					reject()
//  	 				}
//  	 			}, 1000 )
//  	 		})
//  			console.log(1) // 먼저 실행해버림
// //  		let p = test()
//  	 		p.then( function (data) {
//  	 			console.log(data)
//  	 		} )
//  	 		p.catch ( function (data){
//  	 			console.log(data)
//  	 		} )
//  		}}
 		
 		
//  		let p = new promise ( function (resolve, reject) {
//  			setTimeout( functiom(){
//  				if(a == 10){
//  					a = 20
//  					resolve()	
//  				} else{
//  					reject()
//  				}
//  			}, 1000 )
//  		})
//  		p.then( function (data) {
//  			console.log(data)
//  		} )
//  		p.catch ( function (data){
//  			console.log(data)
//  		} )
 		
//  	})


// async function async_await(){
// 	await new promise ( function (resolve, reject) {
// 	setTimeout( function(){
// 		if(a == 10){
// 			a = 20
// 			resolve(a)
// 		} else {
// 			reject('errrrrrrrrr')
// 		}
// 	}, 1000 )
// })
// 	// 위엒 끝날때까지 기다렸다가 이거 실행함
// 		console.log(1)
// 	}
</script>
</body>
</html>