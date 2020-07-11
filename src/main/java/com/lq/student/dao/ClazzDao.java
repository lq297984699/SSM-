package com.lq.student.dao;

import com.lq.student.entity.Clazz;
import com.lq.student.entity.Grade;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ClazzDao {
    public int add(Clazz clazz);
    public int edit(Clazz clazz);
    public int delete(String ids);
    public List<Clazz> findList(Map<String, Object> queryMap);
    public List<Clazz> findAll();
    public int getTotal(Map<String, Object> queryMap);
}
