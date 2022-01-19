package com.nit.guhun.controller;

import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.EmployeeEntity;
import com.nit.guhun.service.EmployeeService;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("query")
    public PageInfo<EmployeeEntity> query(Entity entity){
        return employeeService.query(entity);
    }
    @PostMapping("insert")
    public int insert( EmployeeEntity employeeEntity){return employeeService.insert(employeeEntity);}
    @PostMapping("update")
    public int update( EmployeeEntity employeeEntity){return employeeService.update(employeeEntity);}
    @GetMapping("delete")
    public int delete(String empId){return employeeService.delete(empId);}
    @GetMapping("select")
    public PageInfo<EmployeeEntity> select(Entity entity,EmployeeEntity employeeEntity){
        return employeeService.select(entity,employeeEntity);
    }
}
