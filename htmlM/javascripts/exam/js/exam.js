// console.log(1)

// 복습
window.addEventListener("load", function () {
    let login = document.querySelector("#login")
    console.log('login', login)
    login.addEventListener('click', function () { //!
        console.log("로그인 버튼 클릭")

        const id = document.querySelector("#id")
        console.log(id, id.value)
        const pw = document.querySelector("#pw")
        console.log(pw, pw.value)

        if (id.value == "admin" && pw.value == 1234) {
            location.href = "http://www.naver.com"
        }

        if (id.value == '') {
            console.log("id안썻어")
            document.querySelector('#login_msg').style.color = '#f00'
            document.querySelector('#login_msg').textContent = '아이디좀 넣어줘'
        } else if (pw.value == '') {
            console.log("pw안썻어")
            document.querySelector('#login_msg').style.color = '#f00'
            document.querySelector('#login_msg').textContent = '비밀번호좀 넣어줘'
        } else { 
            document.querySelector('#login_msg').textContent = ''
        }
    })

    let time = new Date()
    console.log(time)
    let iso = (time.toISOString())
    console.log(iso)
    let arrIso = iso.split('T') // 괄호실수(원인불명)
    console.log(arrIso)
    console.log(arrIso[1].split("Z")[0]) // 괄호 실수



    this.document.querySelector
})