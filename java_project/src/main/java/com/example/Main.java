package com.example;

import java.util.Scanner;

import com.example.grade.GradeReport;

public class Main {

    //@SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
            System.out.println("=== 成績表プログラム 開始 ===");

            Scanner scanner = new Scanner(System.in);
            System.out.print("授業名を入力してください: ");
            String className = scanner.nextLine();
            System.out.print("総授業数を入力してください: ");
            int totalClassCount = Integer.parseInt(scanner.nextLine());
            System.out.print("生徒名を入力してください: ");
            String studentName = scanner.nextLine();
            System.out.print("試験点数を入力してください: ");
            int examScore = Integer.parseInt(scanner.nextLine());
            System.out.print("出席回数を入力してください: ");
            int attendanceCount = Integer.parseInt(scanner.nextLine());

            GradeReport gradeReports = new GradeReport(className, totalClassCount);
            boolean result = gradeReports.validateInput(studentName, examScore, attendanceCount);

            if (result) {
                String grade = gradeReports.judgeGrade(studentName, examScore, attendanceCount);
                System.out.println("========================================");
                System.out.println("成績結果: " + grade);
                System.out.println("========================================");
            } else {
                System.out.println("========================================");
                System.out.println("入力値チェック: 異常");
                System.out.println("========================================");
            }

            System.out.println("=== 成績表プログラム 終了 ===");
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("========================================");
            System.out.println("数値を正しく入力してください。");
            System.out.println("========================================");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}