package Raisetech.Student.ManagementSystem.service;

import Raisetech.Student.ManagementSystem.data.Student;
import Raisetech.Student.ManagementSystem.data.StudentsCourses;
import Raisetech.Student.ManagementSystem.domain.StudentsDetail;
import Raisetech.Student.ManagementSystem.repository.StudentsCoursesRepository;
import Raisetech.Student.ManagementSystem.repository.StudentsRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentsService {

  private StudentsRepository studentsRepository;
  private StudentsCoursesRepository studentsCoursesRepository;

  @Autowired
  public StudentsService(StudentsRepository studentsRepository,
      StudentsCoursesRepository studentsCoursesRepository) {
    this.studentsRepository = studentsRepository;
    this.studentsCoursesRepository = studentsCoursesRepository;

  }

  @Transactional
  public Student insertStudent(Student student) {
    student.setId(UUID.randomUUID().toString());
    studentsRepository.insertStudent(student);
    return student;
  }

  public List<Student> searchStudentList() {
    return studentsRepository.getAllStudents();
  }

  public StudentsDetail findStudentById(String id) {
    Student student = studentsRepository.findStudentById(id);
    List<StudentsCourses> courses = studentsCoursesRepository.findCoursesByStudentId(id);
    return new StudentsDetail(student, courses);
  }

  @Transactional
  public StudentsCourses insertStudentsCourses(StudentsCourses studentsCourses) {
    studentsCourses.setCourseID(UUID.randomUUID().toString());
    studentsCoursesRepository.insertStudentsCourses(studentsCourses);
    return studentsCourses;
  }

  public List<StudentsCourses> searchStudentsCoursesList() {
    return studentsCoursesRepository.getAllStudentsCourses();
  }

  @Transactional
  public void updateStudent(Student student) {
    studentsRepository.updateStudent(student);
  }

  @Transactional
  public void updateStudentsCourses(StudentsCourses studentsCourses) {
    studentsCoursesRepository.updateStudentsCourses(studentsCourses);
  }
}

