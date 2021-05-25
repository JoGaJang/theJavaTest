package com.thejavatest.thejavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    // 2.2+ 버전의 스프링 부트 프로젝트를 만든다면 기본으로 JUnit 5 의존성 추가 됨.
    // JUit5 부터는 public을 붙이지 않아도 된다.
    @Test
    @DisplayName("스터디만들기 \uD83d\uDe31") // 실행 목록에 원하는 텍스트로 노출
    void test(){

        Study studt = new Study(-10);
    }

    /**
        기본 애노테이션
        @Test
        @BeforeAll / @AfterAll
        @BeforeEach / @AfterEach
        @Disabled
    */
    @Test
    @Disabled // 해당 테스트를 사용하고 싶지 않을 경우 @Disabled
    void test1(){
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("before Each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("after Each");
    }

}