# be-no1-assignment
Kakao Tech Campus, BE, No1. assignment

## 요구사항
### 기본적이 연산을 수행하는 계산기
* 양의 정수 입력 받기
* 사칙연산 기호 입력 받기
* 연산 진행
* 'exit' 문자열을 받으면 종료
### 클래스를 적용해 기본적인 연산을 수행하는 계산기
* calculator 클래스 생성
    * 연산 메서드
    * 연산 결과 저장하는 컬렉션 필드
      * Getter Setter로 수정할 수 있게 구현
### Enum, 제네릭, 람다 & 스트림을 활용하는 계산기
* 연산자를 enum으로 관리
* 제네릭 적용
* 연산 결과 중 입력 받은 값보다 큰 결과값 들을 출력

## 구조
* App1
  * 클래스를 적용하지 않고 기본적인 연산을 수행하는 계산기
* App2
  * 클래스를 적용하고 기본적인 연산을 수행하는 계산기 (Calculator 객체를 사용함)
* Calculator
  * 정수를 가지고 연산을 하고 결과를 담고 있음
* App3
  * 제네릭을 사용하는 클래스를 사용하여 연산을 수행하는 계산기 (ArithmeticCalculator 객체를 사용함)
* ArithmeticCalculator
  * 제네릭을 사용하는 클래스
  * 결과 값은 double로 저장한다.