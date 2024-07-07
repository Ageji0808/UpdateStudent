package Raisetech.Student.ManagementSystem.repository;

import Raisetech.Student.ManagementSystem.data.Student;

import Raisetech.Student.ManagementSystem.domain.StudentsDetail;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper

public interface StudentsRepository {


  @Select("SELECT * FROM student")
  List<Student> getAllStudents();

  @Insert("INSERT Into student values(#{id},#{name},#{hurigana},#{nickname},#{mailaddress},#{area},#{age},#{sex},#{remark},false)")
  void insertStudent(Student student);

  @Select("SELECT * FROM student WHERE id = #{id}")
  Student findStudentById(String id);

  @Update("UPDATE student SET name = #{name}, hurigana = #{hurigana}, nickname = #{nickname}, mailaddress = #{mailaddress}, area = #{area}, age = #{age}, sex = #{sex}, remark = #{remark} WHERE id = #{id}")
  void updateStudent(Student student);
}





