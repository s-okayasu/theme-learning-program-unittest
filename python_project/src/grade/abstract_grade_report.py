from abc import ABC, abstractmethod
from typing import List, Dict


class AbstractGradeReport(ABC):
    def __init__(self, class_name: str, total_class_count: int):
        self.grade_reports: List[Dict[str, str]] = [] # 成績表
        self.class_name: str = class_name # クラス名
        self.total_class_count: int = total_class_count # 授業回数

    """
    評価判定
    """
    @abstractmethod
    def judge_grade(self, student_name: str, exam_score: int, attendance_count: int) -> Dict[str, str]:
        pass

    """
    入力値チェック
    """
    @abstractmethod
    def validate_input(self, student_name: str, exam_score: int, attendance_count: int) -> bool:
        pass

    """
    試験順位の表示
    """
    @abstractmethod
    def show_ranking(self) -> None:
        pass
