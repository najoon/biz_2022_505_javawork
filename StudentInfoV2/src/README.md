# 학생정보 프로젝트

* 학생정보를 키보드로 입력받아 student.txt 파일에 저장하기
* 프로젝트가 시작되면 student.txt 파일에서 학생정보를 읽어서ㅗ
list 에 담아두기
* 이후에 새로 입력된 학생정보를 리스트에 추가한 후 student.txt 저장하기
## 학생정보 저장하기 위하여
* StudentVO 를 생성하기
* LIst<StudentVO> 타입의 변수를 선언하기
* 프로젝트가 시작될때 syrdent.txt 를 읽어서 list 에 담아두기

* 이후에 키보드로 학생정보를 입력박은 후 list 에 추가하기
* list 에 담긴 데이터를 Student.txt 에전체 저장
## StudentVO 생성하기
* 학번, 이름. 학과. 학년 , 전화번호 데이터를 관리하기 위해서
클래스를 선언하기

* 학년만 int 로 선언하고 나머지는 String 형으로 선언

## student.txt 파일에 가상의 데이터 생성하기

* 데이터는 학번:이름:학과:학년:전화번호 의 형태로 저장한다

## PrintStream 을 사용한 Console 출력과 FileWeiter
* Console 출력에 사용하는 System.out 은 printStream 의 하위 클래스이다.
* Console 에 출력하는 System.out 대신 파일이름을 매개변수로 받는 
printStream 객체를 생성하면 print() 매서드를 사용하여
Console 에 출력하는 것과 같은 방법으로 txet 파일을 생성, 저장할수 있다.