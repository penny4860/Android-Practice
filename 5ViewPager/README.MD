
## View Pager

* 안드로이드 앱에서 각 Tab을 swap으로 이동하는 기능
* Main Activity
	* 각각의 Tab을 객체로 보유
	* Tab을 Fragment 로 구현

### 구현방법

#### 1. 각 Tab을 Fragment로 추가 

* 아래의 2개가 자동으로 추가됨
	* 리소스 파일
		* UI를 디자인
	* 클래스 파일

#### 2. MainActivity 리소스

* MainActivity 리소스에서 viewPager를 추가

#### 3. MainActivity 클래스

* 리소스에서 추가해준 viewPager 객체를 생성
	* findViewById()
* Fragment 객체를 생성
	* 각각의 fragment class의 instance를 생성
* Adaptor 객체 생성
	* fragment객체를 viewPager가 이해할 수 있게 변환하는 역할
	* adaptor객체에 fragment객체를 전달
* viewPager의 adaptor를 지정	


