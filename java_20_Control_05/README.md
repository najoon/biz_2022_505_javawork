# project MVC 패턴
* web application을 만들때 주로 적용하는 프로젝트 패키지 클래스 파일 관리 방법이다
* web application 처럼 프로젝트가 커졌을때 효율적으로 파일을 관리하고 보기 쉽도록 하는 방법이다
## controller 패키지
* 주(main) 실행 시작부분의 클래스 들이 저장되는 곳
* 용도에 따라 접두사 를 적절히 부탁하여 사용한다.
* studentController(학생정보관리), ScoerContrller (성적관리) 등과 같이 명명 한다.
* console 프로젝트에서 여기에 main()가 있다,
* controller 클래스는 다른 class 들의method 를 호출하여 역할을 분담시키고 최종결과를 표현하는 역할을 수행한다.

## Service 패키지
* controller 클래스에서 호출하는 merhod 들을 작성하는 클래스의 모음
* 용도에 따라 접두사 를 절절히 부착하여 사용한다.
* gogodanService(구구단 처리)등과 같이 명명한다.
* 여기의 클래스 들에는 main() 가 없다.
* Service 클래스는 한가지 일에 집중하도록 작성하는 것이 좋다.