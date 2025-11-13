# 간단한 함수들

##### st.countTokens() : 위의 공백을 기준으로 몇 개인지 셀 수 있음

##### charAt : String 타입의 문자열을 특정 문자(char 타입)로 변환할 때 사용함

##### toCharArray : 문자열 전체를 문자 배열(char[])로 변환할 때 사용함

        String S = "HellO";

        <!-- // charAt 예시 : 특정 인덱스의 문자만 가져올 때 -->
        char one = S.charAt(1);
        System.out.println(one);
        // 'e'
        // S.charAt(1)-'0' //숫자로 변환

        // toCharArray 예시 : 문자열을 문자 배열로 변환해 전체 순회할 때
        char[] arr = S.toCharArray();
        for (char c : arr) {
            System.out.print(c + " ");
        }
        // 출력: H e l l O

Character.isUpperCase() 혹은 isLowerCase()
문자값이 대소문자인지 확인
Character.toUpperCase() 혹은 Character.toLowerCase()
문자값을 대문자로 변환 혹은 소문자로 변환

##### Math.pow(n,p) :자바에서 사용하는 제곱근 n의 p제곱

Ex) Math.pow(4, 3)= 4^3 =64

## ✅ HashSet

```java
Set<String> set = new HashSet<>();
set.add("apple");           // 추가
set.contains("apple");      //
```

존재 여부 true/false
중복 없음
순서 유지 안 함
탐색 빠름 (O(1))

✅ TreeSet

```
Set<String> set = new TreeSet<>();
set.add("banana");
set.add("apple");
System.out.println(set); // [apple, banana]
```

자동 정렬 (사전순)
중복 없음
탐색 O(log n)

안에 있는 요소들은 이렇게 뺴넨다

```
for(int i :set){
        bw.write(i+"\n");
    }
```

✅ HashMap

```
Map<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.get("apple"); // 3
//이거 할때 존재하지 않으면 NULL반환(17219번)
//.toString()이나 .equals()하면 바로  NULLPOintException 널포 터짐
//방지하려면 아래처럼
String pw = map.get("naver.com");
if (pw != null) {
    System.out.println(pw);
} else {
    System.out.println("해당 사이트 없음!");
}
```

Key-Value 쌍 저장
Key 중복 불가
순서 없음

✅ ArrayList

```
List<String> list = new ArrayList<>();
list.add("A");
list.get(0);
list.size();
```

순서 있음
중복 허용
인덱스로 접근 가능

✅ Collections.sort()

```
Collections.sort(list);
```

List를 오름차순 정렬
내부적으로 Comparable 기준 사용

⚡ 요약표
자료구조 정렬 중복 순서 특징
HashSet ❌ ❌ ❌ 가장 빠름
TreeSet ✅ ❌ ❌ 자동 정렬
HashMap ❌ Key❌ ❌ Key-Value 저장
ArrayList ❌ ✅ ✅ 순서 유지
Collections.sort✅ - - 리스트 정렬

⚙️ 정리:
빠르게 찾을 땐 HashSet,
자동 정렬 원하면 TreeSet,
순서 유지하려면 List,
정렬은 Collections.sort(),
키-값 저장은 HashMap.

### ⚙️ Arrays.sort() vs Collections.sort() 정리

| 구분                    | Arrays.sort()                                  | Collections.sort()                                 |
| ----------------------- | ---------------------------------------------- | -------------------------------------------------- |
| 정렬 대상               | 배열 (int[], String[], Object[])               | 리스트 (ArrayList, LinkedList 등)                  |
| 내부 알고리즘           | 원시타입: Dual-Pivot Quicksort / 객체: Timsort | 내부적으로 Arrays.sort() 호출 (Timsort)            |
| 정렬 기준               | Comparable 인터페이스 기준 (기본 오름차순)     | Comparable 또는 Comparator                         |
| 안정 정렬 (Stable Sort) | 원시타입: 불안정 / 객체: 안정                  | ✅ 안정 정렬                                       |
| 성능                    | 배열 직접 접근 → 약간 더 빠름                  | 리스트 → 배열 변환 후 정렬 → 약간 느림             |
| 내림차순 정렬           | Arrays.sort(arr, Collections.reverseOrder())   | Collections.sort(list, Collections.reverseOrder()) |

                          int[] 불가 → Integer[] 변환 필요

| 구분                  | Arrays.sort()            | Collections.sort()                      |
| --------------------- | ------------------------ | --------------------------------------- |
| Java 8 이상 대체 문법 | -                        | list.sort(Comparator.naturalOrder())    |
| 특징 요약             | 배열 전용, 원시타입 포함 | 리스트용, 내부적으로 Arrays.sort() 호출 |

### ⚙️ Comparable vs Comparator

| 구분           | Comparable                                          | Comparator                                                                         |
| -------------- | --------------------------------------------------- | ---------------------------------------------------------------------------------- |
| 패키지         | java.lang                                           | java.util                                                                          |
| 정의 방식      | 클래스 내부에서 implements Comparable<T>            | 외부에서 별도의 비교자(객체)로 정의                                                |
| 메서드         | int compareTo(T o)                                  | int compare(T o1, T o2)                                                            |
| 기본 목적      | 기본 정렬 기준을 정의할 때                          | 임시 혹은 커스텀 정렬 기준을 적용할 때                                             |
| 정렬 적용 방법 | Collections.sort(list) / Arrays.sort(arr) 자동 적용 | Collections.sort(list, comparator) / Arrays.sort(arr, comparator) 명시적 전달 필요 |
| 사용 예시      | 객체 스스로 정렬 기준을 가짐                        | 외부에서 기준을 바꿔줄 수 있음                                                     |

### 🔄 오름차순 / 내림차순(역순) 정리표

| 데이터 타입            | 오름차순 정렬                                     | 내림차순 정렬 (역순)                                         |
| ---------------------- | ------------------------------------------------- | ------------------------------------------------------------ |
| 배열 (int[])           | Arrays.sort(arr);                                 | ❌ 직접 불가 → Integer[] 변환 필요                           |
| 배열 (Integer[])       | Arrays.sort(arr);                                 | Arrays.sort(arr, Collections.reverseOrder());                |
| 리스트 (List<Integer>) | Collections.sort(list);                           | Collections.sort(list, Collections.reverseOrder());          |
| Java 8 이상            | list.sort(Comparator.naturalOrder());             | list.sort(Comparator.reverseOrder());                        |
| 커스텀 기준 정렬       | list.sort(Comparator.comparing(Student::getAge)); | list.sort(Comparator.comparing(Student::getAge).reversed()); |

🧠 한 줄 정리

📈 배열 정렬 → Arrays.sort()
📋 리스트 정렬 → Collections.sort()
🧠 Java 8 이상 → **list.sort()**로 끝내는 게 제일 깔끔

예시 비교

```
// 배열 정렬
int[] nums = {5, 2, 8, 1};
Arrays.sort(nums); // [1, 2, 5, 8]

// 리스트 정렬
List<Integer> list = new ArrayList<>(List.of(5, 2, 8, 1));
Collections.sort(list); // [1, 2, 5, 8]

// 내림차순
Collections.sort(list, Collections.reverseOrder()); // [8, 5, 2, 1]
```

```
Comparable 예시 (클래스 내부 정의)
class Student implements Comparable<Student> {
    int age;
    String name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age; // 나이 오름차순 정렬
    }
}

List<Student> list = new ArrayList<>();
list.add(new Student("루카", 27));
list.add(new Student("민준", 25));
Collections.sort(list); // ✅ compareTo 자동 적용
```

📈 출력 결과
→ [민준(25), 루카(27)]

```
✅ Comparator 예시 (외부 정의)
List<Student> list = new ArrayList<>();
list.add(new Student("루카", 27));
list.add(new Student("민준", 25));

// 이름 기준 오름차순 정렬
Collections.sort(list, new Comparator<Student>() {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
});
```

📈 결과
→ [루카(27), 민준(25)]
