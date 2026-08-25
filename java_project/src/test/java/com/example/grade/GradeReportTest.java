package com.example.grade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.grade.AbstractGradeReport;
import static org.junit.jupiter.api.Assertions.*;

class GradeReportTest {
    String className;
    int totalClassCount;
    String studentName;
    @BeforeEach
    public void setUp() {
        className = "数学";
        totalClassCount = 5;
        studentName = "山田太郎";
    }

    @Test
    void testGredeReport_A() { 
    
        try{
            // インプット情報を定義
            int examScore = 80;
            int attendanceCount = 5;

            // 成績判定を呼び出し
            GradeReport gradeReports = new GradeReport(className, totalClassCount);
            String grade = gradeReports.judgeGrade(studentName, examScore, attendanceCount);
            assertEquals("数学授業の山田太郎さんの評価はAです。",grade); 
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }

    @Test
    void testGredeReport_B() { 
    
        try{
            // インプット情報を定義
            String className = "数学";
            int totalClassCount = 5;
            String studentName = "山田太郎";
            int examScore = 60;
            int attendanceCount = 4;

            // 成績判定を呼び出し
            GradeReport gradeReports = new GradeReport(className, totalClassCount);
            String grade = gradeReports.judgeGrade(studentName, examScore, attendanceCount);
            assertEquals("数学授業の山田太郎さんの評価はBです。",grade); 
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }

    @Test
    void testGredeReport_C() { 
    
        try{
            // インプット情報を定義
            String className = "数学";
            int totalClassCount = 5;
            String studentName = "山田太郎";
            int examScore = 40;
            int attendanceCount = 3;

            // 成績判定を呼び出し
            GradeReport gradeReports = new GradeReport(className, totalClassCount);
            String grade = gradeReports.judgeGrade(studentName, examScore, attendanceCount);
            assertEquals("数学授業の山田太郎さんの評価はCです。",grade); 
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }

    @Test
    void testGredeReport_D() { 
    
        try{
            // インプット情報を定義
            String className = "数学";
            int totalClassCount = 5;
            String studentName = "山田太郎";
            int examScore = 39;
            int attendanceCount = 2;

            // 成績判定を呼び出し
            GradeReport gradeReports = new GradeReport(className, totalClassCount);
            String grade = gradeReports.judgeGrade(studentName, examScore, attendanceCount);
            assertEquals("数学授業の山田太郎さんの評価はDです。",grade); 
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }


    @Test
    void testValidateInput_True() { 
    
        try{
            // インプット情報を定義
            String className = "数学";
            int totalClassCount = 5;
            String studentName = "山田太郎";
            int examScore = 80;
            int attendanceCount = 5;

            // 入力値チェック(単項目)を呼び出し
            GradeReport gradeReports = new GradeReport(className, totalClassCount);
            boolean validationResult = gradeReports.validateInput(studentName, examScore, attendanceCount);
            assertTrue(validationResult);

        } catch (Exception e) {
            e.printStackTrace();
        }    
    }

    @Test
    void testValidateInput_False() { 
    
        try{
            // インプット情報を定義
            String className = "数学";
            int totalClassCount = 5;
            String studentName = null;
            int examScore = 80;
            int attendanceCount = 5;

            // 入力値チェック(単項目)を呼び出し
            GradeReport gradeReports = new GradeReport(className, totalClassCount);
            boolean validationResult = gradeReports.validateInput(studentName, examScore, attendanceCount);
            assertFalse(validationResult);

        } catch (Exception e) {
            e.printStackTrace();
        }    
    }

}
