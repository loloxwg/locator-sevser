package com.nit.guhun.service;

import com.nit.guhun.entity.JobUserEntity;
import com.nit.guhun.entity.TaskInfoEntity;
import com.nit.guhun.mapper.TaskInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskJobService {

    @Autowired
    private TaskInfoMapper mapper;

    public List<JobUserEntity> showAllJobList() {
        return mapper.showAllJobList();
    }

    public int addJob(TaskInfoEntity entity) {
        entity.setJob_id(mapper.addJob(entity));
        entity.setUser_id("0");
        return mapper.addTask(entity);
    }
    public int addTask(TaskInfoEntity entity) {
        return mapper.addTask(entity);
    }

    public int update(TaskInfoEntity entity) {
        return mapper.update(entity);
    }
}
