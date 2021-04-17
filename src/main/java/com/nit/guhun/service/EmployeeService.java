package com.nit.guhun.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.EmployeeEntity;
import com.nit.guhun.mapper.EmployeeEntityMapper;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeEntityMapper employeeEntityMapper;
    public int insert(EmployeeEntity employeeEntity){
        return employeeEntityMapper.insertSelective(employeeEntity);
    }
    public int delete(String empId){
        return employeeEntityMapper.deleteByPrimaryKey(empId);
    }
    public int update(EmployeeEntity employeeEntity){
        return employeeEntityMapper.updateByPrimaryKeySelective(employeeEntity);
    }
    public PageInfo<EmployeeEntity> select(Entity entity,EmployeeEntity employeeEntity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<EmployeeEntity> list = employeeEntityMapper.selectByEntity(employeeEntity);
        PageInfo<EmployeeEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    public PageInfo<EmployeeEntity> query(Entity entity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<EmployeeEntity> list = employeeEntityMapper.query();
        PageInfo<EmployeeEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
