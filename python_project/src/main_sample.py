from grade.grade_report_sample import GradeReportSample

def main():
    try:
        print("=== 成績表プログラム 開始 ===")
        
        # 入力値を定義
        class_name = "数学"
        total_class_count = 5
        student_name = "山田太郎"
        exam_score = 80
        attendance_count = 5

        # 成績判定を呼び出し
        grade_report_sample = GradeReportSample(class_name, total_class_count)
        grade_report_sample.judge_grade(student_name, exam_score, attendance_count)
        grade_report_sample.judge_grade(student_name, exam_score, attendance_count)

        # 順位表を表示
        grade_report_sample.show_ranking()

        print("=== 成績表プログラム 終了 ===")
    except Exception as e:
        e.print_stack()


if __name__ == "__main__":
    main()
