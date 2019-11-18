package com.lph.spring.dev.ManyToOne.pojo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue
    @Column(name =  "student_id")
    private Integer studentId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

    //studentId是实体类中的属性，mappedBy不能和@JoinTable一起
    @OneToMany(targetEntity = CourseStudent.class,mappedBy = "studentId",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<CourseStudent> courseStudent ;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<CourseStudent> getCourseStudent() {
        return courseStudent;
    }

    public void setCourseStudent(List<CourseStudent> courseStudent) {
        this.courseStudent = courseStudent;
    }
}
