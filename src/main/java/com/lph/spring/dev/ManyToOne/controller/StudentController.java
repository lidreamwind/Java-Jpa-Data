package com.lph.spring.dev.ManyToOne.controller;

import com.alibaba.fastjson.JSONObject;
import com.lph.spring.dev.ManyToOne.pojo.CourseStudent;
import com.lph.spring.dev.ManyToOne.pojo.StudentEntity;
import com.lph.spring.dev.ManyToOne.service.CourseStudentService;
import com.lph.spring.dev.ManyToOne.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseStudentService courseStudentService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<StudentEntity>  findAll(){
        return studentService.findAllStudent();
    }

    @RequestMapping(value = "/many",method = RequestMethod.GET)
    public List<JSONObject>  findAllCourse(){
        List<CourseStudent> all = courseStudentService.findAll();
        List<JSONObject> re = new ArrayList<>();
        for (CourseStudent courseStudent : all) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("courseId",courseStudent.getCourseId());
            jsonObject.put("studentId",courseStudent.getStudentId());
            jsonObject.put("studentEntity",courseStudent.getStudentEntity());
            jsonObject.put("id",courseStudent.getId());
            re.add(jsonObject);
        }
        return re;
    }
}
