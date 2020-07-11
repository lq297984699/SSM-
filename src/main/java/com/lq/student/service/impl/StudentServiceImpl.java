package com.lq.student.service.impl;

import com.lq.student.dao.StudentDao;
import com.lq.student.entity.Student;
import com.lq.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student findByUserName(String username) {
        return studentDao.findByUserName(username);
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int edit(Student student) {
        return studentDao.edit(student);
    }

    @Override
    public int delete(String ids) {
        return studentDao.delete(ids);
    }

    @Override
    public List<Student> findList(Map<String, Object> queryMap) {
        return studentDao.findList(queryMap);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public int getTotal(Map<String, Object> queryMap) {
        return 0;
    }
}
