# 기본 알고리즘

## 소수 찾기 (1978번)

Math.sqrt를 이용하여 소수를 찾아보자.

```java
for (int i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0)
        return false;
}

여기서 Math.sqrt(num)은 제곱근이다.
예를 들어 4가 들어왔다면 루트 4, i = 2이므로 2로 나누어져 false가 됨.
이번엔 9가 들어왔다면 루트 9, i = 2, 3인데 3으로 나누어지므로 false.

즉, false이면 소수가 아니고 true일 때 소수로 판단하여 count를 +1 해주면 됨.
1일 때는 소수가 아니므로 제외한다.

분해합 (2231번)

입력값 N이 주어졌을 때, 어떤 수 i에 대해
i + (각 자릿수의 합) = N 이 되는 가장 작은 i (생성자) 를 찾는 문제이다.

문제 접근 방식

0부터 N-1까지의 모든 수 i를 검사한다.

각 i에 대해 sum = i + (각 자릿수의 합)을 계산한다.

만약 sum이 N과 같으면, 그 i가 N의 생성자이다.

가장 처음 찾은 생성자가 가장 작은 생성자이므로 출력하고 종료한다.

끝까지 찾지 못하면 0을 출력한다.

코드 예시
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            int number = i;
            int sum = 0;

            // 자릿수 합 구하기
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            // 분해합 확인
            if (sum + i == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}

핵심 포인트

분해합(Decomposition Sum) : i + sumDigits(i)

생성자(Constructor) : 분해합이 N이 되는 i

시간복잡도 : O(N × 자릿수)

최적화 가능 :
N의 자릿수를 d라 하면, 자릿수 합의 최대는 9×d 이므로
시작 범위를 N - 9*d 부터 탐색해도 된다.