package com.nit.guhun.controller;

import com.nit.guhun.entity.JobUserEntity;
import com.nit.guhun.entity.TaskInfoEntity;
import com.nit.guhun.service.TaskJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("task")
public class TaskJobController {
    @Autowired
    private TaskJobService service;
    @GetMapping("query")
    public List<JobUserEntity> showAllJobList(){
        return service.showAllJobList();
    }
    @GetMapping("addjob")
    public int addJob(TaskInfoEntity entity){
        return service.addJob(entity);
    }
    @GetMapping("addtask")
    public int addTask(TaskInfoEntity entity){
        return service.addTask(entity);
    }
    @GetMapping("delete")
    public int delete(Integer jobId){
        return service.delete(jobId);
    }
    @GetMapping("update")
    public int update(TaskInfoEntity entity){
        return service.update(entity);
    }
    @GetMapping("deletebytaskid")
    public int deleteByTaskId(Integer taskId){
        return service.deleteByTaskId(taskId);
    }
}
