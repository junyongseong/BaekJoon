# 간단한 함수들

st.countTokens() : 위의 공백을 기준으로 몇 개인지 셀 수 있음

charAt : String 타입의 문자열을 특정 문자(char 타입)로 변환할 때 사용함

toCharArray : 문자열 전체를 문자 배열(char[])로 변환할 때 사용함

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