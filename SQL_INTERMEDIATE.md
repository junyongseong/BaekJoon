## 🧭 SQL 중급 문법 정리
### 🎯 GROUP BY / HAVING
SELECT 컬럼명, AVG(DAILY_FEE)
FROM CAR
GROUP BY 컬럼명
HAVING AVG(DAILY_FEE) > 20000;


GROUP BY: 그룹화

HAVING: 그룹 조건 (WHERE보다 나중에 실행)

### 🔗 JOIN (테이블 연결)
### 🔗 JOIN 종류

| 종류 | 설명 |
|------|------|
| INNER JOIN | 양쪽 테이블 모두 존재하는 행만 |
| LEFT JOIN | 왼쪽 기준, 오른쪽 없으면 NULL |
| RIGHT JOIN | 오른쪽 기준, 왼쪽 없으면 NULL |

---

### 💡 예시

```sql
SELECT A.USER_ID, B.ORDER_DATE
FROM USER A
INNER JOIN ORDER B ON A.USER_ID = B.USER_ID;
```

### 📦 SUBQUERY (서브쿼리)
SELECT NAME, DAILY_FEE
FROM CAR
WHERE DAILY_FEE > (SELECT AVG(DAILY_FEE) FROM CAR);


→ 서브쿼리 결과를 조건으로 사용 가능

### 🔁 CASE WHEN (조건문)
SELECT NAME,
CASE
WHEN SCORE >= 90 THEN 'A'
WHEN SCORE >= 80 THEN 'B'
ELSE 'C'
END AS GRADE
FROM STUDENT;

### 🧰 DISTINCT (중복 제거)
SELECT DISTINCT CAR_TYPE FROM CAR;

### 🔥 LIMIT (결과 제한)
SELECT * FROM CAR ORDER BY DAILY_FEE DESC LIMIT 5;