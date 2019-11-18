package com.lph.spring.dev.ManyToOne.service;


import com.lph.spring.dev.ManyToOne.dao.CourseStudentDao;
import com.lph.spring.dev.ManyToOne.pojo.CourseStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseStudentService {
    @Autowired
    private CourseStudentDao courseStudentDao;

    public List<CourseStudent> findAll() {
        return courseStudentDao.findAll();
    }
}
