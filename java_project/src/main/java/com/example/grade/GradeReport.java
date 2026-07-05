package com.example.grade;

import java.util.HashMap;
import java.util.Objects;

public class GradeReport extends AbstractGradeReport{

    public GradeReport(String className, int totalClassCount) {
        super(className, totalClassCount);
    }

    /**
     * 生徒の試験点数と出席回数で評価を判定して返却、成績表へ追加する
     */
    @Override
    public String judgeGrade(String studentName, int examScore, int attendanceCount) throws Exception{
        String grade = "";
        if (examScore >= 80 && attendanceCount == totalClassCount * 1) {
            grade = "A";
        } else if (examScore >= 60 && attendanceCount >= totalClassCount * 0.8) {
            grade = "B";
        } else if (examScore >= 40 && attendanceCount >= totalClassCount * 0.6) {
            grade = "C";
        } else {
            grade = "D";
        }
        //String message = "{授業名}授業の{生徒名}さんの評価は" + grade + "です。";
        String message = String.format("%s授業の%sさんの評価は%sです。", className, studentName, grade);
        return message;
    };

    /**
     * 生徒名と試験点数と出席回数を入力値チェック(単項目)する
     */
    @Override
    public boolean validateInput(String studentName, int examScore, int attendanceCount) {
        if (Objects.isNull(studentName)) {
            return false;
        }

        return true;
    };

    /**
     * 成績表を試験点数の高い順で出力する
     */
    @Override
    public void showRanking() {
        int rank = 1;
        for (HashMap<String, String> gradeReport : gradeReportList) {
            String output = String.format("順位: %s, 成績: %s", rank, gradeReport);
            System.out.println(output);
            rank++; 
        }
    };

}