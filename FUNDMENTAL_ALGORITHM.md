# 기초적인 실전 문재를 적용할 알고리즘을 공부하는 공간입니다.
## 배열, 문자열, 정렬 알고리즘같은것이 그 예시힙니다.

### 문자열 정렬(1181번)

핵심 알고리즘: Comparator를 이용한 이중 정렬 (길이 → 사전순)

문자열 배열 정렬 기준 직접 정의

compareTo()와 length()를 함께 사용한 커스텀 정렬

중복 제거 시 equals()와 인덱스 주의
```
for (int i = 0; i < N; i++) arr[i] = br.readLine();

        Arrays.sort(arr, (a, b) -> {
            if (a.length() == b.length()) return a.compareTo(b);
            return a.length() - b.length();
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');
        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
```

### 핵심 알고리즘: 폴리노미얼 롤링 해시(Polynomial Rolling Hash)
학습 포인트: Math.pow() 대신 r *= 31로 지수 처리

오버플로우 방지를 위한 mod 연산 (1234567891은 큰 소수)
(result + val * r) % MOD 구조 이해

        final int MOD = 1234567891;
        long result = 0;
        long r = 1; // 31^0

        for (int i = 0; i < L; i++) {
            int val = str.charAt(i) - 'a' + 1;
            result = (result + val * r) % MOD;
            r = (r * 31) % MOD;
        }
        System.out.println(result);
        
### 🧮 이항계수 (Binomial Coefficient, 백준 11050)
---
#### 🧠 핵심 알고리즘
> 이항계수는 “조합(Combination)”을 계산하는 기본 알고리즘.  
> 두 가지 방법으로 구현 가능:
> 1️⃣ **재귀식 (Pascal’s Triangle 공식)**  
> 2️⃣ **DP 테이블 (Bottom-Up 동적 프로그래밍)**

---

#### ⚙️ 1️⃣ 재귀식 방식 (Recursive Version)

```java
// 파스칼의 재귀식: C(n, k) = C(n-1, k-1) + C(n-1, k)
static int combinationRecursive(int n, int k) {
    if (n == k || k == 0)
        return 1;
    return combinationRecursive(n - 1, k - 1) + combinationRecursive(n - 1, k);
}
📥 입력 예시

java
코드 복사
System.out.println(combinationRecursive(5, 2)); // 10

🧩 재귀 호출 흐름
mathematica
코드 복사
C(5,2)
├─ C(4,1)
│  ├─ C(3,0) = 1
│  └─ C(3,1) = 3
│     ├─ C(2,0)=1
│     └─ C(2,1)=2
└─ C(4,2)
   ├─ C(3,1)=3
   └─ C(3,2)=3
→ 4 + 6 = 10

🧠 특징
기저 조건	n==k 또는 k==0 → 1
점화식	C(n,k) = C(n-1,k-1) + C(n-1,k)
시간복잡도	O(2ⁿ) (중복 호출 多)
장점	구조가 수학 공식 그대로라 직관적
단점	입력 커질수록 속도 느림

⚙️ 2️⃣ DP 테이블 방식 (Dynamic Programming Version)
java
// 바텀업 DP 방식
static int combinationDP(int N, int K) {
    int[][] dp = new int[N + 1][K + 1];

    for (int n = 0; n <= N; n++) {
        for (int k = 0; k <= Math.min(n, K); k++) {
            if (k == 0 || k == n)
                dp[n][k] = 1; // 가장자리 값은 항상 1
            else
                dp[n][k] = dp[n - 1][k - 1] + dp[n - 1][k];
        }
    }
    return dp[N][K];
}
📥 입력 예시
System.out.println(combinationDP(5, 2)); // 10
🧩 DP 테이블 (예: N=5, K=2)

n	k=0	k=1	k=2	k=3	k=4	k=5
0	1					
1	1	1				
2	1	2	1			
3	1	3	3	1		
4	1	4	6	4	1	
5	1	5	10	10	5	1

🧠 특징

포인트	설명
점화식	dp[n][k] = dp[n-1][k-1] + dp[n-1][k]
기저 조건	dp[n][0] = dp[n][n] = 1
시간복잡도	O(N×K)
장점	빠르고 안정적
단점	메모리 사용 O(N×K)
       
