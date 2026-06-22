# これで grade モジュールが見えるようになる
from grade import grade_report_sample


def test_judge():
    sample = grade_report_sample.GradeReportSample("数学", 5)
    grade = sample.judge_grade("山田太郎", 80, 5)
    assert grade == "A"
