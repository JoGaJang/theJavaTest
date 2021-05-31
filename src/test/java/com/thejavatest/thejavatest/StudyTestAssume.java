package com.thejavatest.thejavatest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTestAssume {

    /*JUnit 5: Assume*/
    @Test
    @DisplayName("스터디만들기 \uD83d\uDe31") // 실행 목록에 원하는 텍스트로 노출
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "local") // <- assumeTrue 대체
    void create_new_study(){

        String test_env = System.getenv("TEST_ENV"); // 테스트 실행환경
        System.out.println(test_env);

        // 테스트 환경이 LOCAL일 경우 실행 된다.
        assumeTrue("LOCAL".equalsIgnoreCase(test_env)); // 대소문자 구분 제한 없음(equalsIgnoreCase)

        Study studt = new Study(-10);
    }

    @Test
    @DisplayName("스터디만들기") // 실행 목록에 원하는 텍스트로 노출
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "woniky")
    void create_new_study_again(){
        System.out.println("create1");
    }

}