package Raisetech.Student.ManagementSystem.data;


import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Insert;

@Getter
@Setter

public class Student {

  private String id;
  private String name;
  private String hurigana;
  private String nickname;
  private String mailaddress;
  private String area;
  private int age;
  private String sex;
  private String remark;
  private boolean isDeleted;


  public Student() {this.id = UUID.randomUUID().toString();}


  public Student(String name) {
    this.id = UUID.randomUUID().toString();
    this.name = name;}


}