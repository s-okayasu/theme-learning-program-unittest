package com.example.grade;

import org.junit.jupiter.api.Test;
import com.example.grade.AbstractGradeReport;
import static org.junit.jupiter.api.Assertions.*;

class GradeReportTest {
    @Test
    void testJudge() { 
    
        try{
            // インプット情報を定義
            String className = "数学";
            int totalClassCount = 5;
            String studentName = "山田太郎";
            int examScore = 80;
            int attendanceCount = 5;

            // 成績判定を呼び出し
            GradeReport gradeReports = new GradeReport(className, totalClassCount);
            String grade = gradeReports.judgeGrade(studentName, examScore, attendanceCount);
            assertEquals("A",grade); 
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
}
