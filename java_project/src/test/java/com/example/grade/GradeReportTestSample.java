package com.example.grade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeReportTestSample {

    private GradeReportSample target;

    @BeforeEach
    void setUp() {
        target = new GradeReportSample("Math", 5);
    }

    @Test
    @SuppressWarnings("CallToPrintStackTrace")
    void testJudgeA() {
        try {
            assertEquals("A", target.judgeGrade("山田太郎",85, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
