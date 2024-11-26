---01
select empno, ename,
replace(empno,substr(empno,3,4),'**')
from emp
order by empno desc;

---02
select ename, empno, e.deptno, d.deptno, dname, loc from emp e, dept d
where e.deptno=d.deptno
order by dname asc;