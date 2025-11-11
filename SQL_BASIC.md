## 🧠 SQL 기초 문법 정리
### 📌 SELECT (조회)
SELECT 컬럼명 FROM 테이블명;

전체 조회 → SELECT * FROM 테이블명;

별칭 지정 → SELECT 컬럼명 AS 별칭 FROM 테이블명;

### 🔍 WHERE (조건)
SELECT * FROM 테이블명 WHERE 컬럼명 = '값';


### ⚖️ 비교 연산자

| 연산자 | 의미 |
|--------|------|
| = | 같다 |
| != 또는 <> | 다르다 |
| >, <, >=, <= | 비교 |
| BETWEEN a AND b | 범위 |
| IN (a, b, c) | 여러 값 중 하나 |
| LIKE '%문자%' | 패턴 검색 |

---

### 🧮 집계 함수 (Aggregate Functions)

| 함수 | 설명 |
|------|------|
| COUNT() | 개수 |
| SUM() | 합계 |
| AVG() | 평균 |
| MAX() | 최댓값 |
| MIN() | 최솟값 |
SELECT AVG(DAILY_FEE) AS 평균요금 FROM CAR;

### 📏 ORDER BY (정렬)
SELECT * FROM CAR ORDER BY DAILY_FEE DESC;   
ASC: 오름차순 (기본)   
DESC: 내림차순

### 🧱 INSERT / UPDATE / DELETE
INSERT INTO 테이블명 (컬럼1, 컬럼2) VALUES ('값1', '값2');
UPDATE 테이블명 SET 컬럼명='값' WHERE 조건;
DELETE FROM 테이블명 WHERE 조건;

### 💡 ROUND (반올림)
SELECT ROUND(AVG(DAILY_FEE), 0) AS AVERAGE_FEE
FROM CAR
WHERE CAR_TYPE = 'SUV';