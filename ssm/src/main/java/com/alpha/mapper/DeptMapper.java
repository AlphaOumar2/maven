package com.alpha.mapper;

import com.alpha.model.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DeptMapper
{
    List<Dept> selectAllDept();

    void createDept(Dept dept);

    void updateDept(Map<String,String> map);

    Dept selectDept(String id);
}