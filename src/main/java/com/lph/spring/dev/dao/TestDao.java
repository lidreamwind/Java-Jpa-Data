package com.lph.spring.dev.dao;


import com.lph.spring.dev.entity.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TestDao extends JpaRepository<TestTable,String> {
    @Query(value = "select * from test",nativeQuery = true)
    List<Object> getResult();
}
