package com.example;

import com.example.grade.GradeReport;

public class Main {

    //@SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
            System.out.println("=== 成績表プログラム 開始 ===");

            // インプット情報を定義
            String className = "数学";
            int totalClassCount = 5;
            String studentName = "高岡";
            int examScore = 100;
            int attendanceCount = 4;

            // 成績判定を呼び出し
            GradeReport gradeReports = new GradeReport(className, totalClassCount);
            boolean result = gradeReports.validateInput(studentName, examScore, attendanceCount);

        if (result == true) {
            String grade = gradeReports.judgeGrade(studentName, examScore, attendanceCount);            
            System.out.println(grade); 
        } else {
            System.out.println("氏名を入力");
        }

            System.out.println("=== 成績表プログラム 終了 ===");            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}