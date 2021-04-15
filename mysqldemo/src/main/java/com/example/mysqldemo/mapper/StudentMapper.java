package com.example.mysqldemo.mapper;

import com.example.mysqldemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.annotation.Inherited;
import java.util.List;

/**
 * @author Administrator
 */
@Repository(value = "asd")
@Mapper
public interface StudentMapper {
    List<Student> selectList(Student student);
}
