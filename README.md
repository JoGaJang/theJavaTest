# 더 자바, “애플리케이션을 테스트하는 다양한 방법” 

1. JUnit 5: 소개
   - 자바 개발자가 가장 많이 사용하는 테스팅 프레임워크.
     (https://www.jetbrains.com/lp/devecosystem-2019/java/)

2. JUnit 5: 시작하기
   - 스프링 부트 프로젝트 만들기
     2.2+ 버전의 스프링 부트 프로젝트를 만든다면 기본으로 JUnit 5 의존성 추가 됨.

   - 기본 애노테이션([TestCode](https://github.com/JoGaJang/theJavaTest/blob/master/src/test/java/com/thejavatest/thejavatest/StudyTest.java))
   
     @Test
     @BeforeAll / @AfterAll
     @BeforeEach / @AfterEach
     @Disabled
  
3. JUnit 5: 테스트 이름 표시하기
    - @DisplayNameGeneration
    Method와 Class 레퍼런스를 사용해서 테스트 이름을 표기하는 방법 설정.
    (@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)와 같이 선언)
      
    - @DisplayName
      어떤 테스트인지 테스트 이름을 보다 쉽게 표현할 수 있는 방법을 제공하는 애노테이션
      @DisplayName("스터디만들기 \uD83d\uDe31")와 같이 선언, @DisplayNameGeneration 보다 우선 순위가 높다.
