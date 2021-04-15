package com.example.mysqldemo;

import com.example.mysqldemo.entity.Student;
import com.example.mysqldemo.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MysqldemoApplicationTests {

    @Autowired
    @Resource(name = "asd")
    private StudentMapper studentMapper;

    @Test
    void contextLoads() {
        System.out.println(1111);
    }

    @Test
    void test1(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getBean("");
        Student student = new Student();
        List<Student> list = studentMapper.selectList(student);
        System.out.println(list.size());
        list.forEach(System.out::println);
    }

}
