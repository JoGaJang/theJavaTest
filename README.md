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

4. JUnit 5: [Assertion](https://github.com/JoGaJang/theJavaTest/blob/master/src/test/java/com/thejavatest/thejavatest/StudyTestAssert.java)
   ```
   import org.junit.jupiter.api.Assertions.*
   ```

   - assertEqulas(expected, actual)         : 실제 값이 기대한 값과 같은지 확인
   - assertNotNull(actual)                  : 값이 null이 아닌지 확인
   - assertTrue(boolean)                    : 다음 조건이 참(true)인지 확인
   - assertAll(executables...)              : 모든 확인 구문 확인
   - assertThrows(expectedType, executable) : 예외 발생 확인
   - assertTimeout(duration, executable)    : 특정 시간 안에 실행이 완료되는지 확인   
      
     마지막 매개변수로 Supplier<String> 타입의 인스턴스를 람다 형태로 제공할 수 있다.   
     복잡한 메시지 생성해야 하는 경우 사용하면 실패한 경우에만 해당 메시지를 만들게 할 수 있다.
  

5. JUnit 5: [조건에 따라 테스트 실행하기](https://github.com/JoGaJang/theJavaTest/blob/master/src/test/java/com/thejavatest/thejavatest/StudyTestAssume.java)
   ```
   org.junit.jupiter.api.Assumptions.*
   ```
   
   - assumeTrue(조건)
   - assumingThat(조건, 테스트)
   
   @Enabled___ 와 @Disabled___
   - OnOS
   - OnJre
   - IfSystemProperty
   - IfEnvironmentVariable
   - If
