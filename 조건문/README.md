# 조건문

조건문이란?

<br>

* 조건문이란 주어진 조건에 따라 다른 문장을 선택할 수 있도록 프로그래밍 하는 것

* if문과 if-else문

<br>

~~~java
if (조건식) {
	수행문; // 조건식이 참일 경우 이 문장을 수행 
}
~~~

<br>

조건문의 가장 단순한 형식

<br>

* 주어진 조건식이 '참'일 경우에 중괄호 안에 있는 문장을 수행합니다.
* 조건식에는 결과가 참, 거짓으로 판별되는 식이나, 참, 거짓의 값을 가진 변수, 상수를 사용할 수 있습니다.
* 연산의 결과가 참, 거짓이 되는 관계 연산자를 자주 사용합니다.
* 조건식을 만족하는 경우와 만족하지 않는 경우를 모두 나나탤 때는 if-else문을 사용합니다.
else문에는 조건식을 사용하지 않습니다.

~~~java
int grade = 95;
if (grade >= 95) {  // grade 값이 95이상이면 
	System.out.println("A학점 입니다.");  // 이 문장을 수행함
}
조건식을 만족하는 경우와 만족하지 않는 경우를 모두 나나탤 때는 if-else문을 사용합니다.
else문에는 조건식을 사용하지 않습니다.
if (조건식) {
	수행문1: // 조건식이 참일 경우에 이 문장을 수향
} 
else {
	수행문2 : // 조건식이 거짓일 경우에 이 문장을 수행
}
~~~

 
<br>

~~~java
int grade = 95;
if (grade >= 95) {  // grade 값이 95이상이면 
	System.out.println("A학점 입니다.");  // 이 문장을 수행함
}
else {
S	ystem.out.println("A학점이 아닙니다.");
}
~~~

~~~java
if-else if-else 문
하나의 상황에 조건이 여러 개인 경우는 if-else if-else문으로 표현할 수 있습니다.
if (조건식2) {
	수행문1: // 조건식1이 참일 경우에 수행함
} else if (조건식2) {
	수행문2; // 조건식2가 참일 경우에 수행함
} else if (조건식3) {
	수행문3; // 조건식3이 참일 경우에 수행함
} else {
	수행문4; // 위의 조건이 모두 해당하지 않는 경우에 수행함
}

수행문5;  // if-else if-else문이 끝난 후에 수행함
~~~

~~~java
package selfstudy

public class IfEx1{
	public static void main(String[] args) {
		int age = 0;
		int fare;
		
		if (age < 13) {
			fare = 500;
			System.out.println("어린이입니다.");
		}  else if (age < 20) {
			fare = 1000;
			System.out.println("중, 고등학생입니다.");
		} else {
			fare = 1400;
			System.out.println("일반인입니다.");
		}
		System.out.println("버스 요금은 " + fare + "원 입니다.");
	}
}

실행결과
어린이입니다.
버스 요금은 500원 입니다.
~~~

### switch-case문

* 조건문을 구현할 때 if 문을 사용하면 번거로운 경우가 있습니다.
* switch-case문은 주로 조건이 하나의 변수 값이나 상수 값으로 구분되는 경우 사용합니다.
* 조건식의 결과가 정수 또는 문자열 값이고 그 값에 따라 수행되는 경우가 각각 다른 경우에는 switch-case 문으로 구헝하는 것이 코드도 깔끔하고 가독성도 좋습니다.
* case문에는 여러 문장이 있어도 {}를 여러 번 사용하지 않습니다.

<br>

* if-else if-else

<br>

~~~java
if (rank ==1) {
	medalColor = 'G';
} else if (rank == 2) {
	medalColor = 'S';
} else if (rank == 3) {
	medalColor = 'B';
} else {
	medalColor = 'A';
}
~~~
 
<br>

* switch-case

~~~java
switch(rank) {
	case 1: medalColor = 'G';
		break;
	case 2: medalColor = 'S';
		break;
	case 3: medalColor = 'B';
		break;
	default : medalColor = 'A';
}
switch(조건) {
	case 값1: 수행문1;
		break;
	case 값2: 수행문2;
		break; 
	case 값3: 수행문3;
		break;
	default: 수행문4;
}
~~~

<br>

~~~java
package selfstudy;

public class SwitchCase1 {
	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
			case 1: medalColor = 'G';
				break;
			case 2: medalColor = 'S';
				break;
			case 3: medalColor = 'B';
				break;
			default : 
					medalColor = 'A';
		}
		
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
	}
}

실행결과
1등 메달의 색깔은 G 입니다.
~~~

<br>


* case문 동시에 사용하기

~~~java
case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31;
	break;
case 4: case 6: case 9: case 11: day = 30;
	break;
case 2: day = 28;
	break;

~~~

<br>

switch-case문에서 break의 역할

<br>

* break문은 switch-case문의 수행을 멈추고 빠져나가도록 합니다.
* break를 쓰지 않으면 다음 break를 만날때까지 다음 case 부분이 실행됩니다.
case문에 문자열 사용하기

>JDK1.7부터는 switch-case문의 case값에 정수 값 뿐 아니라 문자열도 사용할 수 있습니다.
이전에는 문자열을 사용할 수 없었기 때문에 문자열을 비교하는 equals()메서드라는 것을 이용해야 했습니다.
JDK1.7 이전


~~~java
if (medal.equals("Gold")) {
	...
}
 
package selfstudy;

public class SwitchCase2 {
	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
			case "Gold":
				System.out.println("금메달입니다.");
				break;
			case "Silver":
				System.out.println("은메달입니다.");
				break;
			case "Bronze":
				System.out.println("동메달입니다.");
				break;
			default : 
				System.out.println("메달이 없습니다.");
		}
	}
}


실행결과
1등 메달의 색깔은 G 입니다.
~~~