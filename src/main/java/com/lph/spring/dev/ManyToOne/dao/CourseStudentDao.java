package com.lph.spring.dev.ManyToOne.dao;

import com.lph.spring.dev.ManyToOne.pojo.CourseStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseStudentDao extends JpaRepository<CourseStudent,Integer>, JpaSpecificationExecutor<CourseStudent> {
}
