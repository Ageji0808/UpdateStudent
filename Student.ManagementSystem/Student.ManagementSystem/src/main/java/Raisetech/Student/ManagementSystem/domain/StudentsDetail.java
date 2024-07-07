package Raisetech.Student.ManagementSystem.domain;

import Raisetech.Student.ManagementSystem.data.Student;
import Raisetech.Student.ManagementSystem.data.StudentsCourses;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentsDetail {

  public Student student;
  public List<StudentsCourses> studentsCourses;

  public StudentsDetail() {
    this.student = new Student();
    this.studentsCourses = new ArrayList<>();
  }

  public StudentsDetail(Student student) {
    this.student = student;
    this.studentsCourses = new ArrayList<>();
  }

  public StudentsDetail(List<StudentsCourses> studentsCourses) {
    this.student = new Student();
    this.studentsCourses = studentsCourses;
  }

  public StudentsDetail(Student student, List<StudentsCourses> studentsCourses) {
    this.student = student;
    this.studentsCourses = studentsCourses;
  }
}