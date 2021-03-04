package com.nit.guhun.mapper;

import com.nit.guhun.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeEntityMapper {
    int deleteByPrimaryKey(String empId);

    int insertSelective(EmployeeEntity record);

    List<EmployeeEntity> selectByEntity(EmployeeEntity record);

    int updateByPrimaryKeySelective(EmployeeEntity record);

    List<EmployeeEntity> query();
}