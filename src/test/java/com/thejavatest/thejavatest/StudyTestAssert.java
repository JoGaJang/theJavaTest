package com.thejavatest.thejavatest;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTestAssert {

    /*JUnit 5: Assertion*/
    @Test
    void TestAssert(){
        Study study = new Study(-10);

        // All로 묶어 여러 건에 대한 테스트를 동시 실행 할 있다.
        assertAll(
                () -> assertNotNull(study), // NULL 인지 체크
                () -> assertEquals(StudyState.DREFT, study.getStudyState(), ()-> "Study를 처음 만들면 DREFT 상태가 되어야 한다."),
            //                     기대하는값,          결과값,                  에러에 대한 메시지(new Supplier -> Lambda ()-> )
            /**
             * 실행값
             * org.opentest4j.AssertionFailedError: Study를 처음 만들면 DREFT 상태가 되어야 한다. ==>
             * Expected :DREFT
             * Actual   :null
             */

                () -> assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야 한다.")
        );


        // AssertTrows
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> new Study(-10));

        assertEquals("limit은 0보다 커야 한다", exception.getMessage());

    }

    @Test
    void TestAssertTimeout(){
        // AssertTimeout
        assertTimeout(Duration.ofSeconds(10), ()-> {
            new Study(10);
            Thread.sleep(300);
        });
    }

}