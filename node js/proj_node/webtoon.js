const {chromium} = require('playwright')

async function getWebtoon(){
    const browser = await chromium.launch({
        headless : false // true
    });

    const ctx = await browser.newContext()
    const page = await ctx.newPage();
    await page.goto('https://comic.naver.com/index')
    
    // input에 글쓰기
    //await page.fill('css', 'admin//쓰고 싶은글씨')


    // click이벤트
    // await page.click('css')

    await page.waitForSelector('#container')
    const ul = await page.$('#container ul')
    
    // chatcpt (if문 필수) --> 안하면 페딩만 나옴
    if (ul) {
        const html = await ul.innerHTML(); // ✅ 여기서 await 꼭 필요
        console.log(html); // 진짜 HTML 출력
    } else {
        console.log('ul 요소를 찾지 못했어요.');
    }

    await page.screenshot({path : 'a.png'})

    await browser.close()
}

getWebtoon() // 밖에서 한번 호출