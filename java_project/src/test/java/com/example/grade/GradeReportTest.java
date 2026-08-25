package com.example.grade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeReportTest {

    private GradeReport gradeReport;

    @BeforeEach
    void setUp() {
        gradeReport = new GradeReport("数学", 5);
    }

    @Test
    void testJudge() {
        String result = gradeReport.judgeGrade("山田太郎", 80, 5);
        System.out.println(result);
    }
}
