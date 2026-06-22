from typing import Dict
from grade.abstract_grade_report import AbstractGradeReport


class GradeReportSample(AbstractGradeReport):

    def __init__(self, class_name: str, total_class_count: int):
        super().__init__(class_name, total_class_count)

    def judge_grade(
        self,
        student_name: str,
        exam_score: int,
        attendance_count: int
    ) -> Dict[str, str]:
        """
        生徒の試験点数と出席回数で評価を判定して返却、成績表へ追加する
        """
        grade_report: Dict[str, str] = {
            "生徒名": student_name,
            "試験点数": str(exam_score),
            "出席回数": str(attendance_count),
            "評価": "A"
        }

        self.grade_reports.append(grade_report)
        return "A"

    def validate_input(
        self,
        student_name: str,
        exam_score: int,
        attendance_count: int
    ) -> bool:
        """
        生徒名と試験点数と出席回数を入力値チェック(単項目)する
        """
        return True

    def show_ranking(self) -> None:
        """
        成績表を試験点数の高い順で出力する
        """
        rank = 1
        for grade_report in self.grade_reports:
            output = f"順位: {rank}, 成績: {grade_report}"
            print(output)
            rank += 1
