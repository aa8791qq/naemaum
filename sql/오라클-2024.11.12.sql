--11.12
select * from emp; /* 내용물 */
desc emp; /* 구조 */

select * from dept; /* 코드 조회*/
desc dept;

select * from salgrade; /* 연봉 조회*/
desc salgrade;

select 
    empno, ename, deptno /* 사원번호, 사원이름, 코드조회*/
from
    emp;
    
select
    empno, ename, sal /* 사원번호, 사원이름, 연봉 조회*/
from
    emp;
    
select deptno /* 코드만 조회*/
from emp;

select 
    distinct deptno /* 코드 중복제거*/
from emp;

select 
    distinct job /* 직업 중복제거*/
from emp;

select
    distinct job, deptno /* 코드, 직업 중복제거 */
from emp;

select /* 별칭 */
    ename,
    sal,
    sal*12+comm,
    comm
from emp; 

select /* 콜럼 별칭 */
    ename,
    sal,
    sal*12+comm as 연봉,
    comm
from emp;

select /* 콜럼 별칭(쌍따음표 포함) */
    ename,
    sal,
    sal*12+comm as "올해 연봉",
    comm
from emp;

select * from emp; /* 전부 조회*/

select * from emp /* 정렬(오름차순) */
order by sal;

select * from emp /* 정렬(오름차순) */
order by sal asc;

select * from emp /* 정렬(내림차순) */
order by sal desc;

select * from emp  /* 정렬(오름차순) */
order by ename asc;

select * from emp /* 정렬(내림차순) */
order by ename desc;

select * from emp /* 정렬(오름차순) */
order by comm asc;

select * from emp /* 정렬(내림차순) */
order by comm desc;

select * from emp /* 정렬(오름차순) */
order by job asc;

select * from emp /* 2개이상 정렬(오름차순) */
order by job, sal;

select job from emp /* job 정렬(오름차순) */
order by job, sal;

-- p92
/* 문제3 */
select * from emp
order by
    deptno desc, ename asc;

/* 문제2 */
select
    distinct job
from emp;


select * from emp /* 부서번호 필터 후 출력 */
where deptno = 30;

--p95
/* 1분복습 */
select * from emp
where empno = 7782;

--p97 실습
select * from emp
    where
        deptno = 30
        and
        job = 'SALESMAN';
    
select * from emp
    where
        deptno = 30
        or
        job = 'SALESMAN';

select * from emp 
    where
        deptno = 30
        and
        job = 'CLERK';

select * from emp    
    where
        deptno = 30
        or
        job = 'CLERK';
        
-- 98~99p 1분복습
select * from emp /* 그리고 */
    where
        empno = 7499
        and 
        deptno = 30;

select * from emp  /* 또는 */
    where
        deptno = 20
        or
        job = 'SALESMAN';

--별도실습(복합조건)
select * from emp
    where
        ename = 'WARD'
        or
        job = 'CLERK'
        or
        deptno = 20;
        
select * from emp
    where
        ename = 'WARD'
        or
        job = 'CLERK'
        and
        deptno = 20;
        
select * from emp /* 비교연산자 */
    where sal > 3000;
    
select * from emp /* 비교연산자 */
    where sal <= 2000;
    
select * from emp /* 비교연산자 + 정렬 */
    where sal <= 2000
    order by sal;
    
 -- 102p 1분복습
    select * from emp
        where
            sal >=2500
            and
            job = 'ANALYST';
            
            
--어제 복습(11.12)
--봉급이 2천이상 3천미만 사원 출력
select * from emp
    where
        sal>=2000
        and
        sal<3000;

--11.13
-- 104p 실습
 select * from emp
    where
        sal !=3000; /* 등가표시 != */
    
select * from emp
    where 
        sal <> 3000; /* 등가표시 <> */
        
--- 문제
--1. 부서번호가 20이 아닌 목록
select * from emp
    where
        deptno <> 20
    order by deptno;
        
--2. 부서번호가 20도 아니고 10도 아닌 목록
select * from emp
    where
        deptno = 30
        and
        deptno <> 10;
        
--3. 부서번호가 30이면서 봉급 2000 이하
select * from emp
    where
        deptno = 30
        and
        sal <= 2000
    order by
        sal;
        
select * from emp
    where
        not sal = 3000 /* not */
    order by
        sal;
        
-- 응용 2000미만 또는 3000 이상
select * from emp
    where
        not sal >2000 /* = sal < 2000 */
    or
        sal>=3000;
        
-- 응용 2000미만 또는 3000 이상 아닌거 ()로 묶은 방식
select * from emp
    where
        not (sal >2000
    and /* not를 적용시킬경우 = or */
        sal>=3000);
        
select * from emp /* or 여러개 */
    where
        job = 'MANAGER'
    or
        job = 'SALESMAN'
    or
        job = 'CLERK'
    order by job;
    
select * from emp /* in */
    where
        job in ('MANAGER', 'SALESMAN', 'CLERK')
        order by job;
        
    select * from emp /* or 여러개, not */
    where not
        (job = 'MANAGER'
    or
        job = 'SALESMAN'
    or
        job = 'CLERK')
    order by job;
        
select * from emp /* not in */
    where
        job not in ('MANAGER', 'SALESMAN', 'CLERK')
        order by job;
        
--복습
select * from emp /* 부서번호 10, 20 */
    where
        deptno in (10, 20)
        order by deptno;
        
select * from emp /* 부서번호 10, 20 아닌사람 */
    where
        deptno not in (10, 20)
        order by deptno;
        
select * from emp /* between */
    where
        sal between 2000 and 3000; /* sal >=2000 and sal <= 3000 */
        
select * from emp /* not between */
    where
        sal not between 2000 and 3000; /* sal <=2000 and sal >= 3000 */

select * from emp /* like, ?% */
    where
        ename like 'S%';
        
select * from emp /* like, _% */
    where
        ename like '_L%';
        
응용
select * from emp /* like, %? */
    where
        ename like '%K';
        
select * from emp /* like, %?% */
    where
        ename like '%A%';
        
select * from emp /* not like, %?% */
    where
        ename not like '%A%';
        
select * from emp /* like, ____, 4글자만 */
    where
        ename like '____';
        
select * from emp /* like, %?%  and */
    where
        ename like '%S%'
    and
        mgr between 7700 and 7799;
        
--복습
select * from emp /* like, %?% */
    where
        ename like '%AM%';
        
--다른거
select * from emp /* 와일드카드 이해안감! */
    where
        ename like 'A\_A' escape '!';
        
--null
select * from emp /* null 조회 제외 */
    where
        comm <= 400;
        
select * from emp  /* null 조회안됨 */
    where
        comm = NULL;
        
select * from emp  /* null 조회0 */
    where
        comm is null;
        
select * from emp  /* null 제외한 값 조회 */
    where
        comm is not null;
    
/* comm에 수식삽입, null 수식제외 추출 */
select
    comm, comm+10
from 
    emp
where
    comm is not null;
    
select * from emp /*대장 찾기 */
    where
        mgr is null;

/* union () */
select * from (
select * from emp
    where
        deptno = 10
    union
select * from emp
    where
        deptno = 20)
    order by DEPTNO; /* 예습쿼리 */

select empno, ename, sal, deptno
    from
        emp
    where
        deptno = 10
    union /* error 갯수 불일치 */
select empno, ename, sal
    from
        emp
    where
        deptno = 20;
        
select empno, ename, sal, deptno
    from
        emp
    where
        deptno = 10
    union /* error 타입 불일치 */
select ename, empno, deptno, sal
    from
        emp
    where
        deptno = 20;
        
select * from emp
    where
        deptno = 10
    union /* 중복자료 재외 */
select * from emp
    where
        deptno = 10;
        
select * from emp
    where
        deptno = 10
    union all/* 중복자료 포함(모든 한줄에 내용이 중복되는 경우) */
select * from emp
    where
        deptno = 10;
        
--125~126p 문제
--문제1
select * from emp
    where
        ename like '%S';

--문제2
select
    empno, ename, job, sal, deptno
from emp
    where
        deptno =30
    and
        job = 'SALESMAN';
        
--문제3-1(=를 삽입하지 말아야 하는데 했음 그러나 결과값이 같음)
select
    empno, ename, job, sal, deptno
from emp
    where
        deptno in (20, 30)
    and
        sal >2000;
        
--UNION 방식
select
    empno, ename, job, sal, deptno
from emp
    where
        deptno in (20)
    and
        sal >2000
UNION ALL
select
    empno, ename, job, sal, deptno
from emp
    where
        deptno in (30)
    and
        sal >2000;
        
--INTERSECT 방식(간결해졌으지만 낭비)
select * from emp
    where
        deptno in (20, 30)
    INTERSECT
select * from emp
    where
        sal >2000;

--문제3-2
select empno, ename, job, sal, deptno from emp
    where
        deptno between 20 and 30
    and
        sal >=2000;
        
--문제4(조건을 추가적으로 인식 못해서 틀림)
select * from emp
    where
        NOT (SAL >=2000 AND SAL <=3000);
        --sal not between 2000 and 3000
        
--문제5
select ename, empno, sal, deptno from emp
    where
        deptno =30
    and
        ename like '%E%'
    and
        sal not between 1000 and 2000;

--문제6(막힘)
select * from emp
    where
        comm is null /* ---- 맞음 */
    AND /* 상사가 있다는 조건을 이해하지 못함 */
        mgr IS NOT NULL
    AND
        job IN ('MANGER', 'CLERK')
    AND
        ENAME NOT LIKE '_L%';

---원리 설명   
select '아잉' from emp;
select * from dual; /*연습테이블*/

--upper
select upper('abc')
    from dual; /*연습테이블*/
    
select upper(ename)
    from emp; /*실습*/
    
--lower
select lower('SDFJSJ')
    from dual; /*연습테이블*/
    
select lower(ename)
    from emp; /*실습*/

select upper (lower(ename)) from emp; /*응용*/

/* 대소문자구분없이*/
select * from emp
where
    ename like '%A%' or ename like '%a%';
    
select * from emp
    where
        lower(ename) like '%a%';

--length
select ename, length(ename) from emp;

select length('abc'), length('한글') from dual;

select ename, length(ename) from emp
    where
        length(ename) >= 5;
    
--length, lengthb 비교
select length('한'), lengthb('한') from dual; /* 한글은 3바이트! */

--substr, 함수
select '123456', /*값*/
    substr('123456', 3, 2) /*함수(값, 시작하는 곳, 추출양)*/
from dual;
        
select '123456', /* 복습 */
    substr('123456', 2, 3)
from dual;
        
select
    job, substr(job, 1,2),
    job, substr(job, 3,3),
    job, substr(job, 4),
    length(substr(job, 4)),
    job, substr(job, 4,100),
    job, substr(job, 444,100), /*글자수가 넘어가면 안됨*/
    job, substr(job, -3,2 )/* 음수 */
    job, substr(job, -3 )/* 음수 */
from emp;

select '010-1234-5678' as replace_before,
    replace('010-1234-5678', '-', ' ') as replace_1,
    replace('010-1234-5678', '-') as replace_2 /* 3번째가 없어도 상관없다) */
from dual;

select
    replace(ename, 'A', '아잉')
from emp;

--Q1 : ename에서 앞에 두글자만 출력(조건을 이해못함)
select ename,
    substr(ename,1,2)
from emp;
--Q2 : ename에서 앞에 두글자만 별처리 /* ,필수   , replace 쓸때 원본데이터 기입 필수 */
select ename,
    substr(ename,1,2), /* 저함수를 쓰고나서 as "앞에 두글자" */
    replace(ename,substr(ename,1,2),'**')
from emp;
--Q3 : ename의 반절에 해당하는 길이를 출력, ename의 앞에 반을 모두 **로 처리, 뒤에 반을 모두 **로 처리
/* 0 */
select ename,
    length(ename)/2 /* ()닫고 사칙연산쓰기*/
from emp;

/* 1 틀린거->괄호 문제*, 코드작성이 틀림/ 
select ename,
    replace((length(ename)/2), (substr(ename,length(ename)/2), '**'))
from emp;

select ename,
    replace (
        ename,
            substar(ename, 1, (length(ename)/2), '*')
from emp;
/* 변환해야 하니 replace,
    첫번째 - 대상(ename),
    두번째 -원본의 절반에 해당하는 글씨 모두 확보
        (substr(ename, 시작위치(처음부터 1), 자를 갯수(length(ename)/2) 세번째 '*'*/
/*정답 */
select ename,
    replace (
        ename,
            substr(ename, 1, length(ename)/2), '*')
from emp;

/*2*/
select ename,
    replace (
        ename,
            substr(ename, -length(ename)/2), '*') /*마이너스라서 끝에 있는 값으로부터 시작하여 값을 찾고 *로 바꾸기 */
from emp;

/*2 다른방법 */
select ename,
    replace (
        ename,
            substr(ename, 1, length(ename)/2+1), '*') /* 1번 답과 차이를 원리분석 및 이해해야함!!! 출력차이를 비교*/
from emp;

/* 비교 */ ---차이점 +1때문에 밀리는 것임.
select ename,
    replace (
        ename,
            substr(ename, 1, length(ename)/2+1), '*'), /*  */
    replace (
        ename,
            substr(ename, 1, length(ename)/2), '*')
from emp;

--lpad, rpad
select 'Oracle',
    lpad('Oracle', 10, '#'),
    rpad('Oracle', 10, '*'),
    lpad('Oracle', 10),
    rpad('Oracle', 10),
    lpad('Oracle', 10) as lpad2,
    rpad('Oracle', 10) as rpad2
from dual;

select
    rpad('971225-', 14, '*'),
    rpad('010-1234-', 13, '*')
from dual;

/* 실습 */ --이름을 6자리로 만들고 나머지의 빈자리를 오른쪽 정렬하여 *표를 채운다, 이름 글자수의 2배로 채우기
select
    rpad(ename, 6, '*'),
    lpad(ename, length(ename) * 2, '*')
from emp;

/* 문제 */
--1. 뒤 4자리를 *로 바꾸자(replace 함수 제외), 함수 substr 인지 못함
select
    rpad('010-5174-8791', length('010-5174-8791'), '*')
from emp;

/* 정답 */
select
    length('010-5174-8791') as "자릿수",
    substr('010-5174-8791', 1, length('010-5174-8791')-4) as "잘린글씨",
    rpad(
        substr('010-5174-8791', 1, length('010-5174-8791')-4),
        length('010-5174-8791'), '*')
from emp;

--2. 사원의 이름을 앞에 두글자만 보이게하고 나머지를 *로 표시(값이 변경되도 무관하게)----> 해결했으나 다시 풀어봐야됨(복습필수)
select ename,
    length(ename),
    substr(ename, 1, length(ename)),
    rpad(
        substr(ename, 1, 2), length(ename) ,'*') /* substr 함수의 3번째 인수랑 length함수를 바꿔 입력함) */
from emp;

--정답
/*
    전략구성
    1. 두글자는 보이게
    2. 나머지 *로 보이게(*로 보일 갯수를 지정(원본길이만큼)
        rpad(첫두글자, 전체길이, *)
*/
select ename,
    rpad(
        substr(ename, 1, 2),
        length(ename), '*')
from emp;

--3. 사원의 이름을 앞에 앞글자만 *로 표시------> (복습필수) >>> 오답(substr 값을 바꾸고 rpad를 lpad로 바꿔야함) >>> 이해부족(어제 푼것이 맞았음)
--오답(원쿼리)--->찾는중
select ename,
    length(ename),
    substr(ename, 1, length(ename)),
    lpad(
        substr(ename, 1,1), length(ename), '*') --SMITH
from emp;

select ename,
    length(ename),
    rpad(
        substr(ename, 1,1), length(ename), '*') --SMITH
from emp;

--수정후 오류
select ename,
    length(ename),
    substr(ename, 1, length(ename)),
    lpad(
        substr(ename, 1,1), length(ename), '*') --SMITH
from emp;

select ename,
    length(ename),
    rpad(
        substr(ename, 1,1), length(ename), '*') --SMITH
from emp;

--오답수정
select ename,
    length(ename),
    substr(ename, 1, length(ename)),
    lpad(
        substr(ename, 2), length(ename), '*') --SMITH
from emp;

select ename,
    length(ename),
    lpad(
        substr(ename, 2), length(ename), '*') --SMITH
from emp;

--정답
/*
    전략구성
    1.앞글자 하나라는 것은 두번째부터 끝까지 글씨를 살린다.
    2.lpad(두번째부터 끝까지, 전체길이, *)
*/

select ename,
    lpad(
        substr(ename, 2),
        length(ename), '*')
from emp;

--4(심) job 대상으로 20자크기의 공간에서 가운데 정렬(풀이중)----> 도저히 불가...
select job,
    length(job),
        rpad(
            rpad(
                substr(job, 0, length(job) / 2), '*'),
            lpad(
                substr(job, 0, length(job) / 2), '*'))
from emp;

--정답
/*
    가운데 정렬이란 ? 앞과 뒤의 동일한 공백이 있으면 됨
    *********************
    ********ward********
    글자갯수를 어떻게 알았느냐....
    MARTIN-->length, 20개고정 ---> 20-6=14/2=7, ( 20-4=16 ), *******MARTIN*******
    뒷글자를 다른걸로 치환해서 하면 좋은거
*/

select job,
    lpad(
        job, (20-length(job)) /2 /*별표의 갯수*/ + length(job) /* 문자갯수 */, '*'),
     rpad(
        job, (20-length(job)) /2 /*별표의 갯수*/ + length(job) /* 문자갯수 */, '*'),
    rpad(
        lpad(
        job, (20-length(job)) /2 /*별표의 갯수*/ + length(job) /* 문자갯수 */, '*'), 20, '*') /* lpad를 놓쳤다! */
from emp;
        
--다른방법(복습필요)
select
    rpad(
        lpad(substr(job, 0, length(job)/2), 10, '*'), 20(/* }} */,
    rpad
        (substr(job, length(job)/2+1), 10, '*'))
    from emp;

-- 중복값 제거 방식
select job,
        lpad(
            job, (20-length(job)) /2 /*별표의 갯수*/ + length(job) /* 문자갯수 */, '*'),
select job,
        rpad(
            job, (20-length(job)) /2 /*별표의 갯수*/ + length(job) /* 문자갯수 */, '*')
from emp;

--concat, trim 함수
select empno, ename, 
    concat(empno, ename)
from emp;

select empno, ename,
    concat(empno, concat(' : ', ename))
from emp;

select empno || ' : ' || ename
from emp;

select     '      a    b    c           d            ', /* 앞뒤 공백문자 제거, 값 사이의 공백은 제거하지 않음 */
    trim('      a    b    c           d            ')
from dual;

--숫자함수
select
    round(1234.5678),
    round(1234.5678, 1), /*올려버림(소수점첫째자리에서)*/
    round(1234.5678, -1) /*올려버림(정수첫째자리에서)*/
from dual;

select
    trunc(1234.5678),
    trunc(1234.5678, 1), /*버림(소수점첫째자리에서)*/
    trunc(1234.5678, -1), /*버림(정수첫째자리에서)*/
    trunc(-1234.5678, -1) /*floor와 비교하기 위한 것 음수!*/
from dual;

select
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14)
from dual;

select --?(부가설명 필요)
    mod(15, 6)
from dual;

--date --?(부가설명 필요)
select
    sysdate,
    sysdate -1,
    sysdate +1
from dual;
/* 지금 오라클이 설치된 장치의 시간이 나온다
설정에 따라 출력값이 날짜의 일부만 나올 수도 있음
강사 pc의 어리크은 9시간 차이 남*/

select sysdate,
     add_months(sysdate, 1)
from dual;

select hiredate,
    add_months(hiredate, 120)
from emp;

--자료형 변환 함수(부가설명필요)
select empno,
    empno + '500' "empno + 500", /* 컬럼에 +를 적으면 모두 숫자로 변경해서 적용 */
    empno || '500' "empno + 500" /* ||를 적으면 모두 문자로 변경해서 적용 */
from emp;

select sysdate,
    to_char(sysdate, 'yyyy/mm/dd/dy hh24:mi:ss') /* 한글로 출력하고 싶다면 쌍따옴표로 입력할것(한글부분만) */
from dual;

select
    to_date('2018-07-14', 'yyyy/mm/dd')
from dual;

/*심화*/ ---- 복습 필요
select /*시간, 년도 양식 표시 */
    to_char(
    to_date('2018-07-14 15:55', 'yyyy-mm-dd hh24:mi'), 'yyyy-mm-dd hh24:mi')
from dual;

select /* 날짜 계산 */
    to_date('2018-07-14', 'yyyy/mm/dd') - to_date('2018-07-17', 'yyyy/mm/dd')
from dual;

select /* 오류 ---> 시간형식이 맞지 않아서 */
    to_date('2024/11/16', 'yyyy/mm/dd hh24') - to_date('2024/11/15 18', 'yyyy/mm/dd hh24')
from dual;

select /* _기호 누락 */
    to_date('2024/11/15', 'yyyy/mm/dd') - to_date('2024/11/11', 'yyyy/mm/dd')
from dual;

select * from emp
    where hiredate > to_date('1981/06/01', 'yyyy/mm/dd');
    
select /* 괄호여는 거 실수 */
    round((to_date('2025/05/02', 'yyyy-mm-dd') - sysdate)*5/7)
from dual;

--nvl
select sal, comm, sal+comm,
    nvl(comm, 0),
    sal+nvl(comm, 0)
from emp;

select empno, ename, comm,
    nvl2(comm, 'o', 'x'),
    nvl2(comm, sal*12+comm, sal*12)
from emp;

--decode
select job, sal,
    decode(job,
        'MANAGER', sal * 1.1,
        'SALESMAN', sal * 1.05,
        'ANALYSY', sal,
        'CLERK', sal * 1.2,
        sal * 1.03) as UPSAL
from emp;

--이름하고 추가수당, 봉급, 봉급+추가수당.. decode(???)
select ename, sal, comm,
    sal + nvl(comm, 0), --nvl
    sal + decode (comm, null, 0 ,comm) --decode !???
from emp;

--case 문( , 기호 넣지 말것)
select
    case job
        when 'MANAGER' then sal * 1.1
        when 'SALESMAN' then sal * 1.05
        when 'ANALYSY' then sal
        when 'CLERK' then sal * 1.2
        else sal * 1.03
    end as UPSAL
from emp;

select empno, ename, comm,
    case
        when comm is null then '해당사항 없음'
        when comm = 0 then '수당없음'
        when comm > 0 then '수당 : ' || comm
    end
from emp;

--문제 comm이 null인 경우 'n/a' 출력
--null이 아닌경우 comm 출력
select
    case
        when comm is null then 'N/A'
        when comm is not null then ' ' || comm --오류 발생 방치 차원에서 || 삽입(when 변수에 있는 형태가 다 같아야됨), then 안에 case가 또 들어갈 수 있음
        else ' ' || comm --마지막으로만 넣을 수 있는 것 (when comm is not 이랑 같음)
    end
from emp;

q2. -- 나온 값을 대체 문자로 지정하지 못하고 다 써야함)
select empno, ename, sal,
    trunc(sal / 21.5, 2) as day_pay,
    round(sal / 21.5 / 8, 1) as time_pay
from emp;

q4. -- 문자로 바꾸는 작업 필수(to_char=else 위치에서 한번만), substr랑 열데이터를 중복으로 쓰면 안됨, case 중복x, 9999 형식으로 to_char 함수를 넣을 필요가 없음
select empno, ename, mgr,
    case 
        when mgr is null then '0000'
        when substr(mgr, 1, 2) = 75 then '5555'
        when substr(mgr, 1, 2) = 76 then '6666'
        when substr(mgr, 1, 2) = 77 then '7777'
        when substr(mgr, 1, 2) = 78 then '8888'
        else to_char(mgr)
    end
from emp;

-----in 처리법(q4)--> 코드 압축 및 간단코딩
---- 두번째 글자가 5,6,7,8일때 처리하게 하기(선순위)-->length로 처리하는 방법도 있음
select empno, ename, mgr,
    case 
        when mgr is null then '0000'
        when substr(mgr, 2, 1) in ('5', '6', '7', '8')
        then lpad(substr(mgr, 2, 1), length(mgr) /*고정값 사용가능*/, substr(mgr, 2, 1))
        else '' || mgr
    end
from emp;

---- else처리법(q4)
select empno, ename, mgr,
    case 
        when mgr is null then '0000'
        else
            case
                when substr(mgr, 1, 2) = 75 then '5555'
                when substr(mgr, 1, 2) = 76 then '6666'
                when substr(mgr, 1, 2) = 77 then '7777'
                when substr(mgr, 1, 2) = 78 then '8888'
                else to_char(mgr)
            end
    end
from emp;

---like 처리법----> like 앞에 행값 넣어주기, like에서 문자인식으로 해주기
select empno, ename, mgr,
    case 
        when mgr is null then '0000'
        when mgr like '75%' then '5555'
        when mgr like '76%' then '6666'
        when mgr like '77%' then '7777'
        when mgr like '78%' then '8888'
        else to_char(mgr)
    end
from emp;

---nvl방식 ---> substr 함수 필수(분석!!)
select empno, ename, mgr,
    case substr(mgr, 1, 2)
        when '75' then '5555'
        when '76' then '6666'
        when '77' then '7777'
        when '78' then '8888'
        else nvl(to_char(mgr), '0000')
    end
from emp;

--- sum /여기부분부터 다시 설명들어야 함 */
select sum(comm) from emp;
select sum(sal) from emp;
select sum*sal + nvl(comm, 0) /*물어봐야 됨 */
from emp;

select count(*) /*물어봐야 됨 */
from emp;

select count(*), count(sal), count(comm) /*물어봐야 됨, count병도 끄레이..., 한개의 값만 기입 가능, */
from emp;

select count(*) from emp
where deptno = 30;

select max(Sal), max(ename), min(sal), min(hiredate), min(comm)
from emp;

/* 이름에 A가 포함된 사람의 수는? */
select count(*) from emp
where ename '%A%';

select * from emp
where ename '%A%';
-----------------

-- 최대연봉을 받는 사람의 모든정보표시
select max(Sal) from emp;
select * from emp;
/* where에서는 다중행 함수를 사용할 수 없다.
select * form emp
    where sal = max(sal); */
    
--avg
select avg(sal) from emp;

---group by ?(출력할 수 있는 값(종류)이 뭐가 있는지)
select '10', sum(sal), avg(sal) from emp where deptno = 10
    union all
select '20' sum(sal), avg(sal) from emp where deptno = 20
    union all
select '30' sum(sal), avg(sal) from emp where deptno = 30;

select deptno, avg(sal), sum(sal), count(*)
    from emp
group by deptno;

/* where 함수에서는 count, avg 등을 못 쓴다.(집계함수 파트)
select max(Sal) * from emp
where count(*)>2
group by deptno; */

--having
select deptno, job, avg(Sal) from emp
group by deptno, job
    having avg(sal) >=2000
        order by deptno, job;
        
select deptno, job, avg(Sal) from emp
group by deptno, job
    having deptno = 20
        order by deptno, job;
        
/*
having : group by에서만 사용
where에서 표현할 수 있는 건 가급적 where에서 사용하는 것이 좋다.
집계합수를 조건으로 주고 싶을떼 사용한다.
*/

--순서
select job, count(*) /* 5 */
from emp /* 1 */
where sal > 1000 /* 2 */ /* cnt > 3 X */
group by job /* 3 */
having count(*) >= 3 /* 4 */
order by job; /* 6 */ /* cnt > 3 0 */


--194p 1분복습
select deptno, job, avg(Sal)
    from emp
    group by deptno, job /* 부서별, 직책별 */
        having avg(sal) >= 500 /*where X */
    order by deptno, job;
    
--212p q1
select
    deptno, floor(avg(sal) /* floor를 많이 씀 (trunc는 음수는 올라가고, 양수는 내려간다) */, 0), max(sal), min(sal), count(*) /*자동 null 제외한 경우에는 count안에 *가 들어가야됨 */ 
from emp
group by deptno;  /* group by에 넣은것만 표시됨 */

--212p q2 /* group by -> having 순이 맞다.)
select job, count(*)
    from emp
    having count(*) >=3
group by job;


/* 1981년에 입사한 사원 중에서 급여가 가장 낮은 사원의 정보를 모두 조회하세요(급여만 보이게로 수정) */
--- 1981년 입사(글씨가 81인 사람만 추출, 1981년도에 태어난 사람 추출)
select min(sal) from emp
where /*between 방식과 동일함 */
    hiredate >= to_date('1981-01-01', 'yyyy-mm-dd')
    and
    hiredate <= to_date('1981-12-31', 'yyyy-mm-dd');
    
-- to_char
select min(sal) from emp
where
    to_char(hiredate, 'yyyy') ='1981';
    
--like
select min(sal) from emp
where
    hiredate like '%81%';

/* 각 부서별로 급여가 가장 높은 사원과 가장 낮은 사원의 급여 차이를 조회하세요 */ /*단순문제(내가 생각한 방식이랑 같음..ㅠ) */
select
    deptno, max(sal) - min(sal)
from emp
group by deptno;

--dept 테이블
select * from dept;

--join(최소 조건 수 : 테이블 수 - 1)
select * from emp, dept
order by empno;

select * from emp, dept
    where emp.deptno = dept.deptno
order by empno;

--테이블 별칭(select 문에서는 as를 삽입하면 안됨)
select * from emp E,  dept D
    where E.deptno = D.deptno
order by empno;

--ename 출력시 ==========================
select ename, e.deptno
from emp e, dept d
where e.deptno = d.deptno
order by empno;

--ename, deptno 출력시(중복데이터! 주 테이블에 별칭을 줘야됨)
select ename, e.deptno
from emp E,  dept D
    where E.deptno = D.deptno
order by empno;

---*표시시(컬럼이 있다면 *를 쓸 수 없음, 테이블 + *)
select ename, e.deptno, *
from emp E,  dept D
    where E.deptno = D.deptno
order by empno;

--salgrade 테이블
select * from salgrade;
select * from emp;

select e.ename, e.sal, s.grade
from emp e, salgrade s
    where
        e.sal >= s.losal
        and
        e.sal <= s.hisal;

----다중 조인
select e.ename, e.mgr, c.ename, c.empno
from emp E, emp C
    where E.mgr = C.empno;

--is null 널값인지 여부확인만 함
select e1.ename, e1.mgr, e2.ename, e2.empno
from emp e1, emp e2
    where e1.mgr = e2.empno;

--상사의 상사
select e1.ename, e1.mgr, e2.ename, e2.empno, e2.mgr, e3.ename, e3.empno
from emp e1, emp e2, emp e3
    where
        e1.mgr = e2.empno
    and
        e2.mgr = e3.empno;
        
--외부조인
--e1 king빠진걸 삽입
select e1.ename, e1.mgr, e2.ename, e2.empno, e2.mgr
from emp e1, emp e2
    where
        e1.mgr = e2.empno(+);

--e1 부하직원이 아예 없는 사람 삽입
select e1.ename, e1.mgr, e2.ename, e2.empno, e2.mgr
from emp e1, emp e2
    where
        e1.mgr(+) = e2.empno;
        
--sql-99의 조인
--using 둘다 같은 컬럼명을 사용하는 경우만 쓸 수 있음.
select * from emp
    join dept using(deptno);

--테이블 조인 조건을 on으로 분리시킨다.
select * from emp e join dept d on (e.deptno = d.deptno)
    where sal <= 3000;

select * from emp e1 join emp e2 on (e1.mgr = e2.empno); /*using은 ()의 조건을 못씀--테이블명이 다르므로), 좌우 바뀌어도 값이 같음 null값 제외 */

select * from emp e1
    left outer join emp e2 on (e1.mgr = e2.empno); /* 핵심데이터를 앞에다가 넣는다. */

--세개이상 결합
select * from emp e1
    left outer join emp e2 on (e1.mgr = e2.empno)
    left outer join emp e3 on (e2.mgr = e3.empno);

-- q1(,)
-- 오답
select e.sal, e.deptno, d.deptno, e.ename, e.empno from emp e, dept d
    where
        e.sal >= 2000;

---- 정답
select e.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
    where
    e.deptno = d.deptno
    and
    sal > 2000
order by deptno;
    
select * from emp;
select * from dept;

--q2(using)
select deptno, d.dname, floor(avg(sal)), max(sal), min(sal), count(*)
from emp e join dept d using(deptno)
group by deptno, d.dname;

--q3
select d.deptno, d.dname, e.empno, e.job, e.sal
from dept d left outer join emp e on(d.deptno = e.deptno)
order by d.deptno;

--q4 : 사원번호, 이름, 부서명, 급여등급 출력 : 14줄
--오답(테이블값 입력을 실수함)
select e.empno, e.ename, d.dname, s.grade
    from emp e 
        join dept d on(e.deptno=d.deptno) --->e.empno=d.deptno 불성립인지 연구!
        join salgrade s
            on(
                e.sal >= s.losal
                and
                e.sal <= s.hisal);

---정답
select e.empno, e.ename, d.dname, s.grade
from emp e, dept d, salgrade s
    where
        e.deptno = d.deptno
    and
        e.sal between s.losal and s.hisal;
/* from emp e
left outer join dept d on (e.deptno = d.deptno)
left outer join salgrade s on(e.sal between s.local and s.hisal)
*/

---q5 : 상사보다 월급이 높은 사원의 이름, 급여, 상사이름, 상사급여.
select e1.ename, e1.sal, e2.ename, e2.sal
    from emp e1
left outer join emp e2 on(e1.mgr = e2.empno)
    where e1.sal > e2.sal;

select * from emp;
select * from dept;
select * from salgrade;

--- 차집합
select *
    from dept d left outer join emp e on(d.deptno = e.deptno)
where e.deptno is null;

select ename, sal from emp
    where sal > (select sal from emp where ename = 'JONES');
    
--blake보다 높은 연봉을 받는 사람들
select ename, sal from emp
    where sal >= (select sal from emp where ename = 'BLAKE');

--jones랑 같은 직업을 가진 사람들
select ename, job from emp
    where job = (select job from emp where ename = 'JONES');

--서브쿼리
select e.empno, e.ename, e.job, e.sal, d.deptno, d.dname, d.loc
    from emp e, dept d
where e.deptno = d.deptno
    and e.deptno =20
    and e.sal > (select avg(sal) from emp);
    
select * from emp
where sal = (select max(sal) from emp);

select deptno, max(sal) from emp
group by deptno;

--in
select * from emp
    where sal
    in(select max(sal) from emp
        group by deptno);

--from        
select * from
    (select empno, deptno, ename from emp
    where deptno = 10);

--where에 rownum를 쓸수 없음(해결책)????xxxx
select *
    from(
        select rownum /* =sysdate */, emp.* from emp)
    where rownum  = 3; 
    
---쌤꺼-------------- (해결책?)
select *
    from (
        select rownum as rnum, emp.* 
        from emp
)
    where rnum = 3;
---------------

select rownum , emp.*
    from emp
    order by ename;

select rn, emp.* --오류(정렬후 넘버링)-->>처음 정답을 모르겠음
    from (
        select row_number() over(order by ename) as rn, emp.*
        from emp
        );
        
    ----정답
select rownum as rnum, a.*
    from (
    select * from emp
    order by ename
) a;

select job, count(*) from emp
    group by job
    having count(*) >=3;

---- having 대체 where 쓰는법   ----------------------------------------->    
select * from
    (
    select job, count(*) cnt from emp
    group by job
    )
where cnt >= 3;

with
    e10 as 
        (select * from emp where deptno=10)
select * from e10;

--q1.
select e.job, e.empno, e.ename, e.sal, d.deptno, d.dname
from emp e, dept d
    where
        e.sal between 1000 and 2000
            and
        e.deptno = d.deptno
            and
        e.deptno = 30
order by sal desc;

d.deptno = (select e.deptno from emp);

--정답(select에 서브쿼리가 있는 경우 한줄마다 조회해서 비효율적일 수도 있음)
select job, empno, ename, sal, deptno, dname
    from emp join dept using (deptno)
    where job = (
                    select job from emp
                    where ename = 'ALLEN'
                    )
    order by sal desc, ename;
    
--join 방식으로 다시풀기


--q2.
--1. 전체 사원의 평균 급여 화보
--2. 그것보다 높은(초과) 사람들 출력
--정답
select empno, ename, dname, hiredate, loc, sal, grade
from emp e, dept d, salgrade s
where
    e.deptno = d.deptno
    and
    e.sal >= s.losal
    and
    e.sal <= s.hisal
    and
    e.sal > (select avg(sal) from emp)
    order by sal desc, empno;
    
--내가 푼거(다시)


--q3.
/*
10번부서 사람 중에서 30번 부서에 없는 직책
30번 부서에 job들이 not in으로 10번부서에 적용한다.
*/
select * from emp where deptno = 10
union all
select * from emp where deptno = 30;

select * from emp, dept;
--정답
select empno, ename, job, e.deptno, dname, loc
from emp e
    left outer join dept d on (e.deptno = d.deptno) --분석
    where e.deptno = 10
    and
    e.job not in (select job from emp where deptno = 30);

--내가 푼거(정답 응용)
select empno, ename, job, e.deptno, dname, loc
from emp e
    left outer join dept d on (e.deptno = d.deptno) --분석
    where e.deptno = 10
    and
    e.job not in (select job from emp where deptno <> 10);

--내가 푼거


--q4.
--정답
select empno, ename, sal, grade
from emp e
    left outer join salgrade s
    on (
        e.sal >= s.losal
        and
        e.sal <= s.hisal
        )
    where e.sal >
    (
        select max(Sal) from emp where job = 'SALESMAN' /*some, all */
    );

--내가 푼거


/* 
    crud
    생성  create  c
    조회  read    r
    수정  update  u
    삭제  delete  d
    
*/
--create table
create table emp_ddl
    (
    empno   number(4),
    ename   varchar2(10),
    job     varchar2(9),
    mgr     number(4),
    hiredate    date,
    sal     number(7,2),
    comm    number(7,2),
    deptno  number(2)    
    );

desc emp_ddl;

create table dept_ddl
    as select * from dept;
    
desc dept_ddl;

create table emp_ddl_30
    as select * from emp
    where deptno=30;
    
select * from emp_ddl_30;

create table empdept_ddl
    as select
        e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm,
        d.deptno, d.dname, d.loc
from emp e, dept d
    where 1 <> 1;
    
select * from empdept_ddl;

--alter
create table emp_alter
    as select * from emp;
    
select * from emp_alter;

alter table emp_alter
    add hp varchar2(20);
    
alter table emp_alter
    rename column hp to tel;
    
select * from emp_alter;

alter table emp_alter
    modify empno number(5); /* 수정시 타입의 크기가 커지는건 가능하지만 크기가 줄어드는건 불가능함 */
    
alter table emp_alter
    modify mgr varchar2(4); /*타입변경시 내용이 모두 null일때만 가능하다 */
    
desc emp_alter;

alter table emp_alter
    drop column hp;-------->
    
select * from emp_alter;

--rename(테이블명 변경)
rename emp_alter to emp_rename;

desc emp_alter;

--truncate table
select * from emp_rename;

truncate table emp_rename;

drop table emp_alter;----------------------------->

desc emp_remame;

--insert
create table dept_temp
    as select * from dept;

insert into
    dept_temp (deptno, dname, loc)
    values(50, 'DATABASE', 'BERLIN'); /* values 값은 테이블 값 또는 타입이 일치해야한다. */
    
select * from dept_temp;

insert into dept_temp
    values(60, 'NETWORK', 'PARIS');
    
select * from dept_temp;

insert into 
    dept_temp (deptno, dname, loc)
    values(70, 'web', null);
    
insert into
    dept_Temp (deptno, loc)
    values(90, '제네바');

select * from dept_temp;

create table emp_temp
    as select * from emp
    where 1 <> 1;
    
select * from emp_temp;

insert into
    emp_temp
    (
    empno, ename, job, mgr, hiredate, sal, comm, deptno
    )
    values
    (
    2111, '이순신', 'MANAGER', 9999, to_date('07/01/2001', 'dd/mm/yyyy'), 4000, null, 20
    );
    
select * from emp_temp;

insert into --->
    emp_temp
    (
    empno, ename, job, mgr, hiredate, sal, comm, deptno
    )
    values
    (
    3111, '심청이', 'MANAGER', 9999, sysdate, 4000, null, 30
    );
    
select * from emp_temp;

insert into emp_temp --------->
select * from emp where deptno = 10;

select * from emp_temp;

create table dept_temp2
    as select * from dept;
    
select * from dept_temp2;

--update
update dept_temp2
    set loc = 'SEOUL';
    
select * from dept_temp2;

rollback;

select * from dept_temp2
where deptno = 40;

--------------------------------------->
update dept_temp2
set dname = 'DATABASE',
    loc = 'SEOUL'
where deptno = 40;

select * from dept_temp2;

select * from emp_temp;

select * from emp_temp
where sal <= 2500;

update emp_temp
set sal = sal + 50
where sal <= 2500;
select * from emp_temp;

--emp테이블을 복사한 emp_temp2에서 연봉이 1000이하인 사원 연봉을 1.3%인상 ------>
create table emp_temp2
as select * from emp;

select * from emp_temp2;

update emp_temp2
set sal = sal *(1+0.013)
where sal <= 1000;

delete from emp_temp2
where job = 'MANAGER';
select * from emp_temp2;

commit;

select * from emp_temp2;
delete from emp_temp2;

rollback;
select * from emp_temp2;

delete from emp_temp2
where deptno = 10;

create table emp_temp3
    as select * from emp;

select * from emp_temp3;

---데이터 사전
select table_name
    from user_tables;
    
---index /* 인덱스 계획 설명 f10 */
select * from user_indexes;

create index idx_emp_sal
    on emp(sal) asc;
    
select * from user_indexes; ---> 하고 select 하면 시간이 줄어든다.

select * from emp
    order by sal asc;

--강제 힌트    
select /*+ index(e) */
    *
from emp e
    order by sal asc;


select /*+ index(idx_emp_sal) */
    *
from emp
where sal = 3000
order by sal asc;

select /*+ index(e) */
    *
from emp e
where sal = 3000
order by sal asc;

select --+ index(e)
    *
from emp e
where sal = 3000
order by sal asc;
    
select * from emp_temp3;

-- empno가 입사한 순서대로 발행되는 번호라고 할때, 다음 입사자의 empno는?, 십입이를 입사시키기(?)
select max(empno+1), /* 여기까지 함 */ ename, job, mgr, hiredate, sal, comm, deptno --다음번호가 나오는 규칙을 찾으면 됨
from emp_temp3;

--정답
select max(empno)+1 from emp_temp3;

insert into emp_temp3 (empno, ename)
    values(
            ( select max(empno)+1 from emp_temp3 ), '신입이2'
            );
    
select * from emp_temp3;

--시퀀스 ------------------------>
create sequence seq_empno /* 생성 */
start with 8000 /*시작순서 지정(기본 1) */
increment by 10 /* 증감량 */
;

select seq_empno.nextval from dual; ----시퀀스 생성(증가)

select seq_empno.currval from dual; -----현재 시퀀스 값(nextval 한번도 안쓰고 사용할 수 없음)

insert into emp_temp3 (empno, ename)
    values( seq_empno.nextval, 'aing'); ---order by 필수
    
select * from emp_temp3;

drop sequence seq_empno;

--제외조건
--not null
create table table_notnull
    (
    login_id    varchar2(20) not null,
    login_pwd   varchar2(20) not null,
    tel     varchar(20)
    );
    
insert info table_notnull (login_id, login_pwd, tel)  ---- >
    values ('test_id_01', null, '010-1234-5678');

desc table_notnull;

select * from user_constraints;

insert into table_notnull (login_id, login_pwd, tel)  ---- >
    values ('test_id_01', '1234', null);

select * from table_notnull;

/* tel에 not null 제약을 주려했더니 이미 null값이 존재해서 못하는데. 그래서 tel이 null인 값들을 일괄적으로 0으로 수정 후 제약조건을 변경해보자 */ --????
/* constraint를 통해서 삭제할 수도 있지만 modify로 해결할 수 있다 */
update table_notnull
    set tel = '0'
where tel is null;

create table table_pk
    (
    login_id    varchar2(20) primary key,
    ligin_pwd   varchar2(20) not null,
    tel     varchar2(20)
    );
    
    desc table_pk;
    select * from user_constraints;
    select * from user_indexes;

/*
    create table에서 컬럼을 정의하면 primary key를 지정하는 방식을는 딱 하나만 지정 가능하며
    만약에 두개 이상을 pk로 지정하는 경우 alter나 primary key방식을 이용한다.
*/

insert into table_pk(login_id, ligin_pwd, tel)
values('test', 'pw', '252');
insert into table_pk(login_id, ligin_pwd, tel)
values('test', 'pw', '252');

insert into table_pk(login_id, ligin_pwd, tel)
values(null, null, null);

insert into table_pk(ligin_pwd, tel)
values('pw', '252');

create table table_name
    (
    col1 varchar2(20),
    col2 varchar2(20),
    col3 varchar2(20),
    
    primary key (col1, col2), -- 복합키 지정법
--unique (col1)
    );

------------------------
insert into table_name
values ('id1', 'pw1', null);
insert into table_name
values ('id1', 'pw2', null);

select * from table_name;

create table dept_pk
    (
    deptno number(2) primary key,
    dname varchar2(14),
    loc varchar2(13)
    );
    
desc dept_pk;

create table emp_fk
    (
    empno   number(4),
    ename   varchar2(10),
    job     varchar2(9),
    mgr     number(4),
    hiredate    date,
    sal     number(7,2),
    comm    number(7,2),
    deptno  number(2) references dept_pk (deptno)
    );
    
insert into emp_fk ---> (로 원하는것을 적어야 됨)
    values (1, 'a', 10);
    
insert into dept_pk (deptno, dname, loc)
    values (1, 'aaaa', 'AAAA');

insert into emp_fk (empno, ename, deptno)
    values (100, '이름', '1');

update dept_pk --->무결성 위배(참조하는 것이 있다면 수정불가)
    set deptno = 3
    where deptno = 1;
    
insert into dept_pk (deptno, dname, loc)
    values (4, 'a4', 'A4');
    
update dept_pk --->무결성 위배(참조하는 것이 있다면 수정불가)-->쳐다보는 것이 없어야 가능하기 때문에 참조하는 것들을 아예 날려야 됨
    set deptno = 4
    where deptno = 3;
    
select * from dept_pk;

---특이 케이스
create table dept_ck (
    c1 varchar2(200),
    c2 varchar2(200),
    c3 varchar2(200),
    
    primary key (c1, c2)
);

create table emp_ck (
    a1 varchar2(200),
    a2 varchar2(200),
    a3 varchar2(200),
    
    foreign key (a2, a3) references dept_ck(c1, c2)
);

desc emp;
desc dept;