# 간단한 함수들

##### st.countTokens() : 위의 공백을 기준으로 몇 개인지 셀 수 있음

##### charAt : String 타입의 문자열을 특정 문자(char 타입)로 변환할 때 사용함

##### toCharArray : 문자열 전체를 문자 배열(char[])로 변환할 때 사용함

        String S = "HellO";

        // charAt 예시 : 특정 인덱스의 문자만 가져올 때
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

✅ HashMap
```
Map<String, Integer> map = new HashMap<>();
map.put("apple", 3);
map.get("apple"); // 3
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
자료구조	        정렬	중복	순서	특징
HashSet	        ❌	❌	 ❌	가장 빠름
TreeSet	        ✅      ❌	 ❌	자동 정렬
HashMap	        ❌	 Key❌	 ❌	Key-Value 저장
ArrayList	❌	 ✅	 ✅	순서 유지
Collections.sort✅	  -	 -	리스트 정렬

⚙️ 정리:
빠르게 찾을 땐 HashSet,
자동 정렬 원하면 TreeSet,
순서 유지하려면 List,
정렬은 Collections.sort(),
키-값 저장은 HashMap.
