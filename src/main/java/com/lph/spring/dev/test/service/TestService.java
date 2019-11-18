package com.lph.spring.dev.test.service;

import com.lph.spring.dev.test.dao.TestDao;
import com.lph.spring.dev.test.entity.TestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestDao testDao;


    public TestTable add(TestTable test) {
        return testDao.save(test);
    }
    public TestTable getById (String id) {
        return testDao.findById(id).get();
    }
    public TestTable update(TestTable testTable) {
        testDao.getResult();
        return  testDao.save(testTable);
    }
}
