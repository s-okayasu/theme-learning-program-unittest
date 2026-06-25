package com.example;

import com.example.grade.GradeReport;

public class Main {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
            System.out.println("=== 成績表プログラム 開始 ===");

            // インプット情報を定義
            String className = "数学";
            int totalClassCount = 5;
            String studentName = null;
            int examScore = 150;
            int attendanceCount = 4;

            boolean result = validateInput(studentName, examScore, attendanceCount);
            System.out.println(result); 

            // 成績判定を呼び出し
            GradeReport gradeReports = new GradeReport(className, totalClassCount);
            String grade = gradeReports.judgeGrade(studentName, examScore, attendanceCount);            

            System.out.println(grade); 

            System.out.println("=== 成績表プログラム 終了 ===");            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}