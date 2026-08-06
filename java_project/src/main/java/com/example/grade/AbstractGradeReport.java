package com.example.grade;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class AbstractGradeReport {

    protected ArrayList<HashMap<String, String>> gradeReportList; // 成績表
    protected String className; // クラス名
    protected int totalClassCount; // 授業回数

    protected AbstractGradeReport(String className, int totalClassCount) {
        this.gradeReportList = new ArrayList<>();
        this.className = className;
        this.totalClassCount = totalClassCount;
    }

    /**
     * 評価判定
     */
    public abstract String judgeGrade(String studentName, int examScore, int attendanceCount) throws Exception;

    /**
     * 入力値チェック
     */
    protected abstract boolean validateInput(String studentName, int examScore, int attendanceCount);

}
