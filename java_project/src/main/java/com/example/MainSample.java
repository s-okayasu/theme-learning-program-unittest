package com.example;

import com.example.grade.GradeReportSample;

public class MainSample {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
            System.out.println("=== 成績表プログラム 開始 ===");

            // インプット情報を定義
            String className = "数学";
            int totalClassCount = 5;
            String studentName = "山田太郎";
            int examScore = 80;
            int attendanceCount = 5;

            // 成績判定を呼び出し
            GradeReportSample gradeReports = new GradeReportSample(className, totalClassCount);
            gradeReports.judgeGrade(studentName, examScore, attendanceCount);
            gradeReports.judgeGrade(studentName, examScore, attendanceCount);
            

            // 順位表の中身をコンソールに出力
            gradeReports.showRanking();

            System.out.println("=== 成績表プログラム 終了 ===");            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
