package com.example.grade;

import java.util.HashMap;

public class GradeReport extends AbstractGradeReport{

    public GradeReport(String className, int totalClassCount) {
        super(className, totalClassCount);
    }

    /**
     * 生徒の試験点数と出席回数で評価を判定して返却、成績表へ追加する
     */
    @Override
    public String judgeGrade(String studentName, int examScore, int attendanceCount) throws Exception{
        // HashMap<String, String> gradeReport = new HashMap<>();
        // gradeReport.put("生徒名", studentName);
        // gradeReport.put("試験点数", String.valueOf(examScore));
        // gradeReport.put("出席回数", String.valueOf(attendanceCount));
        // gradeReport.put("評価", "A");
        // gradeReportList.add(gradeReport);
        if(examScore >= 85 && attendanceCount >= 5){
            return "A";
        }else{
            return "B";
        }
        
    };

    /**
     * 生徒名と試験点数と出席回数を入力値チェック(単項目)する
     */
    @Override
    protected boolean validateInput(String studentName, int examScore, int attendanceCount) {
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