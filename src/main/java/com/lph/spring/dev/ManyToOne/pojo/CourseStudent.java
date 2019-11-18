package com.lph.spring.dev.ManyToOne.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "couurse_student")
public class CourseStudent {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "course_id")
    private Integer courseId;
    @Column(name = "student_id")
    private Integer studentId;

    @ManyToOne()
    @JoinColumn(name = "student_id",insertable = false,updatable = false,referencedColumnName = "student_id")
    @JsonIgnore
    private StudentEntity studentEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }
}
