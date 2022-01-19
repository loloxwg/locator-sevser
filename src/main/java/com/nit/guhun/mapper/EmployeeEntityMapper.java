package com.nit.guhun.mapper;

import com.nit.guhun.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeEntityMapper {
    int deleteByPrimaryKey(String empId);

    int insertSelective(EmployeeEntity record);

    List<EmployeeEntity> selectByEntity(EmployeeEntity record);

    int updateByPrimaryKeySelective(EmployeeEntity record);

    List<EmployeeEntity> query();
}