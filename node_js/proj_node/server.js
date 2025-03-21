const express = require('express')

const app = express()

const port = 3000;

app.listen(port, function(){
    console.log('나만의 서버', port, ' 오픈~')
})

function hello(req, resp){
    console.log('hello 함수 실행')
}

app.get('/hello', hello)

app.get('/world', function(req, resp){
    console.log('req.query.age', req.query.age)
})

app.get('/echo', function(req, resp){
    const id = req.query.id
    resp.send(id)
})

app.get('/echo_json', function(req, resp){
    const json = {
        a:1,
        b:2
    }
    resp.send(json)
})

