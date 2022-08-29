# 상수와 리터럴
### 상수 선언하기

<br>

* 프로그램에서는 변하지 않는 수도 필요합니다. 예를 들면 원의 넓이를 구할 때 원주율을 3.14로 정했다면 이 값은 변하지 않는 값이되어야 합니다.
* 이렇게 변하지 않는 값을 상수(constant)라고 합니다.
* 자바에서 상수는 다음처름 final 예약어를 사용해 선언합니다.

<br>

~~~java
final double PI = 3.14;
final int MAX_NUM = 50;
~~~

<br>

* 상수 이름은 대문자를 주로 사용하고, 여러 단어를 연결하는 경우에 _기호를 사용하면 보기 좋습니다.
* 한 번 선언한 상수는 변하지 않기 때문에 선언과 동시에 값을 지정하는 것이 좋습니다.
* 가끔은 선언만 하고 사용하기 전에 값을 지정하기도 합니다.

<br>

~~~java
package selfstudy

public class Tstory8 {
	public static void main(String[] args) {
		final int MAX_NUM = 100; // 선언과 동시에 초기화
		final int MIN_NUM;
		
		// 사용하기 전에 초기화, 초기화 하지 않으면 오류 발생
		MIN_NUM = 0; 
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000; // 오류 발생, 상수는 값을 변경할 수 없음
	}
}

실행결과
100
0
~~~

<br>

* 리터럴(literal)이란 프로그램에서 사용하는 모든 숫자, 문자, 논리값(true, false)을 일컫는 말입니다.

<br>

~~~java
char ch = 'A';
int num = 10;
final double PI = 3.14;
~~~

<br>

* 상기 코드에서 사용한 'A', 10, 3.14와 같은 문자와 숫자를 '리터럴' 혹은 리터럴 상수 라고 합니다.
* 리터럴은 변수나 상수 값으로 대입할 수 있습니다.
* 리터럴은 프로그램이 시작할 때 시스템에 같이 로딩되어 특정 메모리 공간인 상수 풀(constant pool)에 놓입니다. 예를 들어 int num=3; 문장에서 값 3이 메모리 공간 어딘가에 존재해야 num 변수에 그 값을 복사할 수 있습니다.
* 즉, 숫자가 변수에 대입되는 과정은 일단 숫자 값이 어딘가 메모리에 쓰여 있고 이 값이 다시 변수 메모리에 복사되는 것입니다.

# 형변환
### 형 변환이란?
<br>
* 정수와 실수는 컴퓨터 내부에서 표현되는 방식이 전혀 다릅니다. 따라서 정수와 실수를 더한다고 할 때 그대로 연산을 수행할 수 없고 하나의 자료형으로 통일한 후 연산을 해야 합니다. 이때 형 변환(type conversion)이 이루어집니다.

<br>

~~~java
int n = 10; // int형 변수 n에 정수 값 10을 대입
double d = n; // int 형 변수 n의 값을 double형 변수 d에 대입
~~~

<br>

* 위 문장에서 변수 n은 int형 이고 변수 dnum은 double형 입니다. 형 변환이란 이렇게 각 변수의 자료형이 다를 때 자료형을 같게 바꾸는 것을 말합니다.
* 형변환은 크게 묵시적 형변환(자동 형 변환)과 명시적 형변환(강제 형 변환) 두 가지로 구별해서 생각할 수 있습니다.

<br>

 형변환의 기본 원칙

 <br>

* 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어진다.
덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이루어진다.

 <br>

* 위 그림에서 화살표 방향과 반대로 형 변환을 하려면 강제로 변환해야 합니다.
* long형이 8바이트 이고 float형이 4바이트 인데 자동 형 변환이 되는 이유는 실수가 정수보다 표현 범위가 더 넓고 정밀하기 때문입니다.
* 화살표 방향으로 형 변환이 이뤄질 때는 자료 손실이 없지만, 그 반대의 경우에는 자료 손실이 발생할 수 있습니다.

 <br>

묵시적 형변환

 <br>

* 바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우

~~~java
byte b = 10;
int i = b; // byte형 변수 b 값을 int형 변수 i에 대입함
~~~

<br>

* 덜 정밀한 자료형에서 더 정밀한 자료형으로 대입하는 경우

* 두 변수의 크기가 같은 4바이트라도 float형이 더 정밀하게 데이터를 표현할 수 있으므로 실수형인 float로 변환됩니다.

~~~java
int i2 = 20;
float f = i2;
~~~

<br>

* 연산중에 자동 변환되는 경우

<br>

* 바이트 크기가 작은 수에서 큰 수로, 덜 정밀한 수에서 더 정밀한 수로 자료형이 변환되는 경우에 자동 형 변환이 일어납니다.

~~~java
int i = 20;
float f = i;
double d;
d = f + i;
~~~

~~~java
package selfstudy;

public class Tstory9 {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // byte형 값이 int형 변수로 대입됨
		
		System.out.println(b);
		System.out.println(i);
		
		int i2 = 20;
		float f = i2; // int형 값이 float형 변수로 대입됨 
		
		System.out.println(i);
		System.out.println(f);
		
		double d;
		d = f + i;
		System.out.println(d);
	}
}

실행결과
10
10
10
20.0
30.0
~~~

### 명시적 형변환

* 바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우

* 표현할 수 있는 범위를 넘는 경우에는 자료 손실이 발생할 수 있습니다.

~~~java
int i = 1000;
byte b = (byte)i; // -24
int i = 10;
byte b = (byte)i; // 강제로 형을 바꾸려면 바꿀 형을 괄호를 써서 명시해야 함

~~~


* 더 정밀한 자료형에서 덜 정밀한 자료형으로 대입하는 경우

* 실수 자료형에서 정수 자료형으로 값이 대입되는 경우에도 역시 형 변환을 명시적으로 해주어야 합니다.

~~~java
double d = 3.14;
int i2 = (int)d; // 실수 자료형 double을 정수 자료형 int로 형 변환
~~~

<br>

* 연산 중 형변환

<br>

~~~java
package selfstudy;

public class Tstory10 {
	public static void main(String[] args) {
		double d1 = 1.2;
		float f2 = 0.9F;
		
		int i3 = (int)d1 + (int)f2; // 두 실수가 각각 형변환되어 더해짐
		int i4 = (int)(d1 + f2); // 두 실수의 합이 먼저 계산되고 형 변환됨
		System.out.println(i3);
		System.out.println(iN);
	}
}

실행결과
1
2
~~~