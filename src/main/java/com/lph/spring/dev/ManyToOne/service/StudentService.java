package com.lph.spring.dev.ManyToOne.service;

import com.lph.spring.dev.ManyToOne.dao.SutdentDao;
import com.lph.spring.dev.ManyToOne.pojo.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private SutdentDao sutdentDao;

    public List<StudentEntity> findAllStudent() {
        return sutdentDao.findAll();
    }
}
